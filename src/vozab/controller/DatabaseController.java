package vozab.controller;




import vozab.model.DatabaseModel;
import vozab.view.Database;

public class DatabaseController 
{
	private Database dbView;
	//private DatabaseModel dbModel; //not essential right now


	public DatabaseController(Database dbView, DatabaseModel dbModel)
	{
		this.dbView = dbView;
		//this.dbModel = dbModel; //not essential right now
		dbView.createList(dbModel.getRecords());
	}
	
	public void setVisible()
	{
		dbView.setVisible();
	}
	
	public void PrintLastRecord()
	{
		System.out.println(dbView.getLastEntry());
	}
}
