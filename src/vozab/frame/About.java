package vozab.frame;

import javax.swing.JFrame;


public class About extends InfoView
{
	static String text = "Vozab 1.0\n\n"
			+ "Vozab - Simple java swing program to learn vocabulary\n\n"
			+ "Written by Pawel Jankowski <jjpikoov@gmail.com>";

	public About()
	{
		super("About", 300, 300, text);
		super.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
