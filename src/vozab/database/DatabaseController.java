package vozab.database;



public class DatabaseController extends ArraysController 
{
	private DatabaseView dbView;
	//private DatabaseModel dbModel; //not essential right now


	public DatabaseController(DatabaseView dbView, DatabaseModel dbModel)
	{
		this.dbView = dbView;
	//	this.dbModel = dbModel; //not essential right now
		dbView.createList(this.toDefaultListModel(dbModel.getRecords()));
	}
	
	public void setVisible()
	{
		dbView.setVisible();
	}
}
