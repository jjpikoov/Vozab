package vozab.main;

import vozab.database.DatabaseModel;
import vozab.database.DatabaseView;
import vozab.learner.LearnerMenuView;



public class Main {

	public static void main(String[] args) 
	{

		//DatabaseView dbView = new DatabaseView();
		//DatabaseModel dbModel = new DatabaseModel();
		//DatabaseController dbController = new DatabaseController(dbView, dbModel);
		//dbController.setVisible();
		
		LearnerMenuView lmView = new LearnerMenuView();
		lmView.setVisible();
		
	}

}
