package vozab.controller;

import javax.swing.DefaultListModel;
import java.util.ArrayList;

public class ArraysController 
{
	protected ArrayList<String> toArrayList(DefaultListModel<String> dlistmodel)
	{
		ArrayList<String> arraylist = new ArrayList<String>();

		for (int i = 0; i < dlistmodel.size(); i++) 
		{
			arraylist.add(dlistmodel.get(i));
		}
		return arraylist;
	}

	
	protected DefaultListModel<String> toDefaultListModel(ArrayList<String> arraylist)
	{
		DefaultListModel<String> dlistmodel = new DefaultListModel<String>();

		for (int i = 0; i < arraylist.size(); i++) 
		{
			String elem = arraylist.get(i);
			dlistmodel.addElement(elem);
		}

		return dlistmodel;
	}
}