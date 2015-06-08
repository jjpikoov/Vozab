package vozab.learner;

import java.util.ArrayList;

import vozab.database.DatabaseModel;

public class LearnerModel extends DatabaseModel
{
	private int index;
	private ArrayList<String> records;
	private ArrayList<String> visibleRecord;
	private ArrayList<String> hiddenRecord;
	static public boolean NODATA;

	public LearnerModel()
	{
		super();
		this.update();
		LearnerModel.NODATA = true;
	}

	
	public String getCurrentVisible()
	{
		if (this.visibleRecord.isEmpty())
		{
			LearnerModel.NODATA = true;
			return "NO DATA";
		}

		if (inScope(this.index))
		{
			LearnerModel.NODATA = false;
			return this.visibleRecord.get(index);
			
		}
		else
		{
			if (this.index >= this.visibleRecord.size())
			{
				this.index = 0;
				return this.getCurrentVisible();
			}
			else if (this.index < 0)
			{
				index = this.visibleRecord.size() - 1;
				return this.getCurrentVisible();
			}
		}
		
		return "ERROR";
		
	}
	
	
	public String getPreviousVisible()
	{
		this.index -= 1;
		return getCurrentVisible();
	}
	
	public String getNextVisible()
	{
		this.index += 1;
		return getCurrentVisible();
	}
	

	public String getCurrentHidden() 
	{
		if (this.hiddenRecord.isEmpty())
		{
			LearnerModel.NODATA = true;
			return "NO DATA";
		}


		if (inScope(this.index))
		{
			LearnerModel.NODATA = false;
			return this.hiddenRecord.get(index);
		}
		else
		{
			if (this.index >= this.hiddenRecord.size())
			{
				this.index = 0;
				return this.getCurrentHidden();
			}
			else if (this.index < 0)
			{
				index = this.hiddenRecord.size() - 1;
				return this.getCurrentHidden();
			}
		}
		
		return "ERROR";
	}
	

	public void update()
	{
		this.records = super.getRecords();
		this.splitRecords();
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
	
	
	private void splitRecords()
	{
		visibleRecord = new ArrayList<String>();
		hiddenRecord = new ArrayList<String>();

		for (int i = 0; i < this.records.size(); i++) 
		{
			String record = this.records.get(i);
			String[] splited = record.split(";");
			
			visibleRecord.add(splited[0]);
			hiddenRecord.add(splited[1]);
		}
		
	}
}
