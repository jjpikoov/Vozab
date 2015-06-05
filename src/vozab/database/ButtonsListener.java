package vozab.database;

import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

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
			try
			{
				String filename = ".database.txt";
				FileWriter fw = new FileWriter(filename, false);
				
				for (int i = 0; i < dlistmodel.size(); i++) 
				{
					fw.write(dlistmodel.get(i) + "\n");
				}
				
				fw.close();
			}
			catch(IOException ioe)
			{
				System.err.println("IOException: " + ioe.getMessage());
			}
		}
		
		
		
				
	}

}
