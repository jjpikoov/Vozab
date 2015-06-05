package vozab.view;

import javax.swing.JFrame;

public class SimpleFrame
{
	private JFrame frame = new JFrame();


	public SimpleFrame(String title, int x, int y)
	{
		initUI(title, x, y);
	}
	

	public void setVisible()
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
