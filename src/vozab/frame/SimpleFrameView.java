package vozab.frame;

import javax.swing.JFrame;

public class SimpleFrameView
{
	protected JFrame frame = new JFrame();///or private?


	protected SimpleFrameView(String title, int x, int y)
	{
		initUI(title, x, y);
	}
	

	protected void setVisible()
	{
		frame.setVisible(true);
	}
	

	private void initUI(String title, int x, int y)
	{
		frame.setTitle(title);
		frame.setSize(x, y);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}