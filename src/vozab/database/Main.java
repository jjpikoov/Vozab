package vozab.database;



public class Main {

	public static void main(String[] args) 
	{

		DatabaseView dbView = new DatabaseView();
		DatabaseModel dbModel = new DatabaseModel();
		DatabaseController dbController = new DatabaseController(dbView, dbModel);
		dbController.setVisible();
	}

}
