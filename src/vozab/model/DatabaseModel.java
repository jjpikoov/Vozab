package vozab.model;

import java.util.ArrayList;

public class DatabaseModel 
{
	private ArrayList<String> records;

	public DatabaseModel()
	{
		records = new ArrayList<String>();
		records.add("test");
	}

	

	public ArrayList<String> getRecords()
	{
		return this.records;
	}
}
