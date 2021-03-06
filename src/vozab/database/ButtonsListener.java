package vozab.database;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonsListener implements ActionListener 
{
	private DefaultListModel<String> dlistmodel;
	private JList<String> recordsList;
	private JFrame frame;
	
	DatabaseModel dm = new DatabaseModel();

	public ButtonsListener(DefaultListModel<String> dlistmodel, JList<String> recordsList, JFrame frame) 
	{
		this.dlistmodel = dlistmodel;
		this.recordsList = recordsList;
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Add"))
		{

			String entry = JOptionPane.showInputDialog("Add a new entry");
			
			if (dm.isRightInput(entry) == false && entry != null)
			{
				JOptionPane.showMessageDialog(this.frame, "InputError! Please go to Help > Manual", 
						"Input Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
					
			if (entry == null)
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
			
			dm.saveRecords(records);
			DatabaseModel.UPDATED = false;

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
			String entry2 = JOptionPane.showInputDialog("Edit record", item);


			if (dm.isRightInput(entry2) == false && entry2 != null)
			{
				JOptionPane.showMessageDialog(this.frame, "InputError! Please go to Help > Manual", 
						"Input Error", JOptionPane.ERROR_MESSAGE);
				return;
			}	
			
			if (entry2 == null)
			{
				return;
			}

			if (!entry2.isEmpty())
			{
				dlistmodel.remove(index);
				dlistmodel.add(index, entry2);
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
