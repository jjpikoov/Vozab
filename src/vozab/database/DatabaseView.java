package vozab.database;

import java.awt.Container;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import vozab.frame.SimpleFrameView;

public class DatabaseView extends SimpleFrameView
{
	private JList<String> recordsList;
	private DefaultListModel<String> recordsListModel;
	private JButton addButton;
	private JButton editButton;
	private JButton deleteButton;
	private JButton saveButton;


    public DatabaseView() 
	{
		super("Database", 400, 400);
	}

	@Override
	public void setVisible() 
	{
		initUI();
		super.setVisible();
	}
	

	public void createList(DefaultListModel<String> records)
	{
		recordsListModel = records;
		
		recordsList = new JList<String>(recordsListModel);
		recordsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}

	
	public DefaultListModel<String> getRecordsListModel()
	{
		return this.recordsListModel;
	}


	private void createButtons()
	{
		addButton = new JButton("Add");
		editButton = new JButton("Edit");
		deleteButton = new JButton("Delete");
		saveButton = new JButton("Save");
		
		ButtonsListener listener = new ButtonsListener(recordsListModel);
		addButton.addActionListener(listener);
		saveButton.addActionListener(listener);
	}
	
	private void initUI()
	{
		createButtons();

		JScrollPane scroll = new JScrollPane(recordsList);
		
		Container pane = super.getContentPane();
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		gl.setAutoCreateContainerGaps(true);
		gl.setAutoCreateGaps(true);
		
		gl.setHorizontalGroup(gl.createSequentialGroup()
				.addComponent(scroll)
				.addGroup(gl.createParallelGroup()
						.addComponent(addButton)
						.addComponent(editButton)
						.addComponent(deleteButton)
						.addComponent(saveButton)
						));
		
		gl.setVerticalGroup(gl.createParallelGroup(Alignment.CENTER)
				.addComponent(scroll)
				.addGroup(gl.createSequentialGroup()
						.addComponent(addButton)
						.addComponent(editButton)
						.addComponent(deleteButton)
						.addComponent(saveButton)
						));
		
		gl.linkSize(addButton, deleteButton, editButton, saveButton);
		
		
	}
}
