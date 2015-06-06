package vozab.database;

import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonsListener implements ActionListener 
{
	private DefaultListModel<String> dlistmodel;

	public ButtonsListener(DefaultListModel<String> dlistmodel) 
	{
		this.dlistmodel = dlistmodel;
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
	}
}
