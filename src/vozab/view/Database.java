package vozab.view;

import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class Database extends SimpleFrame
{
	private JList<String> recordsList;
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
		super.setVisible();
	}
	

	public void createList(String[] records)
	{
		//Maybe it could be done without DefaultListModel
		recordsListModel = new DefaultListModel<String>();
		
		for (String record : records) {
			recordsListModel.addElement(record);
		}
		
		recordsList = new JList<String>(recordsListModel);

		recordsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}
	
	
}
