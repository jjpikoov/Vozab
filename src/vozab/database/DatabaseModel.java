package vozab.database;

import java.util.ArrayList;

public class DatabaseModel 
{
	private ArrayList<String> records;

	public DatabaseModel()
	{
		records = new ArrayList<String>();
	}


	public ArrayList<String> getRecords()
	{
		return this.records;
	}
}
