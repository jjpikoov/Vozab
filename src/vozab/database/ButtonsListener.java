package vozab.database;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;

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

		if (e.getActionCommand().equals("Add"));
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
				
	}

}
