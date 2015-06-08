package vozab.learner;

import java.util.ArrayList;

import vozab.database.DatabaseModel;

public class LearnerModel extends DatabaseModel
{
	private int index;
	public String current;
	public String previous;
	public String next;
	private ArrayList<String> records;

	public LearnerModel()
	{
		super();
		this.records = super.getRecords();
}
	
	public String getCurrent()
	{
		if (inScope(this.index))
		{
			return this.records.get(index);
		}
		else
		{
			if (this.index >= this.records.size())
			{
				this.index = 0;
				return this.getCurrent();
			}
			else if (this.index < 0)
			{
				index = this.records.size() - 1;
				return this.getCurrent();
			}
		}
		
		return "ERROR";
		
	}
	
	
	public String getPrevious()
	{
		this.index -= 1;
		return getCurrent();
	}
	
	public String getNext()
	{
		this.index += 1;
		return getCurrent();
	}
	

	private boolean inScope(int i)
	{
		if (i >= 0 && i < this.records.size())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
