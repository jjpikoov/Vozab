package vozab.learner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vozab.database.DatabaseController;
import vozab.database.DatabaseModel;
import vozab.database.DatabaseView;
import vozab.frame.About;

public class MenuBarItemsListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Exit"))
		{
			System.exit(0);
		}
		if(e.getActionCommand().equals("About"))
		{
			About about = new About();
			about.setVisible();
		}
		if(e.getActionCommand().equals("Database"))
		{
			DatabaseView dbView = new DatabaseView();
			DatabaseModel dbModel = new DatabaseModel();
			DatabaseController dbController = new DatabaseController(dbView, dbModel);
			dbController.setVisible();
		}

	}

}
