package vozab.controller;

import vozab.model.DatabaseModel;
import vozab.view.*;


public class Main {

	public static void main(String[] args) 
	{

		Database dbView = new Database();
		DatabaseModel dbModel = new DatabaseModel();
		DatabaseController dbController = new DatabaseController(dbView, dbModel);
		dbController.setVisible();
		dbController.printRecords();
	}

}
