package vozab.database;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonsListener implements ActionListener 
{
	private DefaultListModel<String> dlistmodel;
	private JList<String> recordsList;

	public ButtonsListener(DefaultListModel<String> dlistmodel, JList<String> recordsList) 
	{
		this.dlistmodel = dlistmodel;
		this.recordsList = recordsList;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Add"))
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
				dlistmodel.addElement(entry);
			}
		}
		else if (e.getActionCommand().equals("Save"))
		{
			ArraysController ac = new ArraysController();
			ArrayList<String> records = ac.toArrayList(dlistmodel);
			
			DatabaseModel dm = new DatabaseModel();
			dm.saveRecords(records);
		}
		else if (e.getActionCommand().equals("Edit"))
		{
			ListSelectionModel selmodel = recordsList.getSelectionModel();
			int index = selmodel.getMinSelectionIndex();
			if (index == -1)
			{
				return;
			}
			
			Object item = dlistmodel.getElementAt(index);
			String text = JOptionPane.showInputDialog("Edit record", item);

			String newRecord = null;
			
			if (text != null)
			{
				newRecord = text.trim();
			}
			else
			{
				return;
			}
			
			if (!newRecord.isEmpty())
			{
				dlistmodel.remove(index);
				dlistmodel.add(index, newRecord);
			}
		}
		else if (e.getActionCommand().equals("Delete"))
		{
			ListSelectionModel selmodel = recordsList.getSelectionModel();
			int index = selmodel.getMinSelectionIndex();
			if (index >= 0)
			{
				dlistmodel.remove(index);
			}
		}
	}
}
