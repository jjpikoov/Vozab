package vozab.database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DatabaseModel 
{
	static private ArrayList<String> RECORDS; 


	public DatabaseModel()
	{
		try
		{
			RECORDS = getRecordsFromFile(".database.txt");
		}
		catch(IOException ioe)
		{
			RECORDS = createNewRecordsFile();
		}
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
	
	
	private ArrayList<String > getRecordsFromFile(String pathToFile) throws IOException
	{
		ArrayList<String> output = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader(pathToFile));
		String str;
		
		while((str = in.readLine()) != null)
		{
			output.add(str);
		}
		in.close();

		return output;
	}
	

	private ArrayList<String> createNewRecordsFile()
	{
		ArrayList<String> output = new ArrayList<String>();

		PrintWriter writer;
		try
		{
			writer = new PrintWriter(".database.txt");
			writer.close();
		}
		catch(IOException ioe)
		{
			System.err.println(ioe.getMessage());
		}
		
		return output;
	}
}
