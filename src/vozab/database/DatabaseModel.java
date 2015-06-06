package vozab.database;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DatabaseModel 
{
	static private ArrayList<String> RECORDS; 


	public DatabaseModel()
	{
		RECORDS = new ArrayList<String>();
	}


	public ArrayList<String> getRecords()
	{
		return DatabaseModel.RECORDS;
	}
	

	public void saveRecords(ArrayList<String> records)
	{

		DatabaseModel.RECORDS = records;

		try
		{
			String filename = ".database.txt";
			FileWriter fw = new FileWriter(filename, false);
			
			for (int i = 0; i < records.size(); i++) 
			{
				fw.write(records.get(i) + "\n");
			}
			
			fw.close();
		}
		catch(IOException ioe)
		{
			System.err.println("IOException: " + ioe.getMessage());
		}
	}
}
