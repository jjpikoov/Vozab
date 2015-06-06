package vozab.frame;

import javax.swing.JFrame;

public class Manual extends InfoView
{
	static String text = "TO DO";

	public Manual()
	{
		super("Manual",300,300,text);
		super.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
