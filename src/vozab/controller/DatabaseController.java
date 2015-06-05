package vozab.controller;


import vozab.model.DatabaseModel;
import vozab.view.Database;

public class DatabaseController 
{
	private Database dbView;
	private DatabaseModel dbModel;


	public DatabaseController(Database dbView, DatabaseModel dbModel)
	{
		this.dbView = dbView;
		this.dbModel = dbModel;
		dbView.createList(dbModel.getRecords());
	}
	
	public void setVisible()
	{
		dbView.setVisible();
	}
}
