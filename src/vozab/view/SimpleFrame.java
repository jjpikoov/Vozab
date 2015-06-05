package vozab.view;

import javax.swing.JFrame;

public class SimpleFrame
{
	private JFrame frame = new JFrame();


	protected SimpleFrame(String title, int x, int y)
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
