package vozab.database;



public class DatabaseController extends ArraysController 
{
	private DatabaseView dbView;
	private DatabaseModel dbModel;


	public DatabaseController(DatabaseView dbView, DatabaseModel dbModel)
	{
		this.dbView = dbView;
		this.dbModel = dbModel;
		dbView.createList(this.toDefaultListModel(this.dbModel.getRecords()));
	}

	
	public void setVisible()
	{
		dbView.setVisible();
	}
}
