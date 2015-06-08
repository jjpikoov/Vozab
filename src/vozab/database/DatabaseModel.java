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
	static public boolean UPDATED;


	public DatabaseModel()
	{
		DatabaseModel.UPDATED = true;
		try
		{
			RECORDS = getRecordsFromFile("database.txt");
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
			String filename = "database.txt";
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
	
	
	public boolean isRightInput(String entry)
	{
		if (entry != null)
		{
			entry = entry.trim();
			
			if ((!entry.endsWith(";")) &&  this.howManySemicolons(entry) == 1 && (!entry.startsWith(";")) && entry.length() <= 19)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	
	private int howManySemicolons(String s)
	{
		int count = 0;

		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == ';')
			{
				count++;
			}
		}
		return count;
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
	

	protected ArrayList<String> createNewRecordsFile()
	{
		ArrayList<String> output = new ArrayList<String>();

		PrintWriter writer;
		try
		{
			writer = new PrintWriter("database.txt");
			writer.close();
		}
		catch(IOException ioe)
		{
			System.err.println(ioe.getMessage());
		}
		
		return output;
	}
}