package vozab.frame;

import javax.swing.JFrame;

public class Manual extends InfoView
{
	static String text = "Vozab is simple swing application to learn foreign languages\n\n\n"
			+ "To add records go: File > Database\n"
			+ "The files should have format WORD SEEN;WORD HIDDEN\n"
			+ "So the words should be separated by semi-collon\n"
			+ "Remember to click SAVE button!!!\n\n\n"
			+ "Enjoy :)";

	public Manual()
	{
		super("Manual",500,300,text);
		super.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
