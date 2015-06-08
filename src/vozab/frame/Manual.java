package vozab.frame;

import javax.swing.JFrame;

public class Manual extends InfoView
{
	static String text = "Vozab is simple swing application to learn foreign languages.\n\n\n"
			+ "Some people call it \"flashcards\". "
			+ "You can see word in one language and you should guess the translation, "
			+ "If you know the answer you can just click on SHOW ANSWER button to check if you are right, "
			+ "If you aren't or you don't remember, don't worry, next time will be better!\n\n\n"
			+ "To add records go to: File > Database.\n"
			+ "Files should be formatted with this pattern: visible_word;word_to_guess\n"
			+ "Words should be separated by semicolon(;)\n"
			+ "Remember to click SAVE button to save your database's state on hard drive!!!\n\n\n"
			+ "Enjoy :)";

	public Manual()
	{
		super("Vozab - Manual",500,300,text);
		super.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
