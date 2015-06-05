package vozab.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Database extends SimpleFrame
{
	public JList<String> recordsList; // public or private
	private DefaultListModel<String> recordsListModel;
	private JButton addButton;
	private JButton renameButton;
	private JButton deleteButton;


    public Database() 
	{
		super("Database", 400, 400);
	}

	@Override
	public void setVisible() 
	{
		initUI();
		super.setVisible();
	}
	

	public void createList(String[] records)
	{
		recordsListModel = new DefaultListModel<String>();
		
		for (String record : records) {
			recordsListModel.addElement(record);
		}
		
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
		renameButton = new JButton("Rename");
		deleteButton = new JButton("Delete");
		
		addButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String text = JOptionPane.showInputDialog("Add a new entry");
				String entry = null;
				
				if (text != null)
				{
					entry = text.trim();
				}
				else
				{
					return;
				}
				
				if(!entry.isEmpty())
				{
					//How to save it to file?
					recordsListModel.addElement(entry);

				}
				
			}
		});
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
						.addComponent(renameButton)
						.addComponent(deleteButton)
						));
		
		gl.setVerticalGroup(gl.createParallelGroup(Alignment.CENTER)
				.addComponent(scroll)
				.addGroup(gl.createSequentialGroup()
						.addComponent(addButton)
						.addComponent(renameButton)
						.addComponent(deleteButton)
						));
		
		gl.linkSize(addButton, deleteButton, renameButton);
		
		
	}
	
	
}
