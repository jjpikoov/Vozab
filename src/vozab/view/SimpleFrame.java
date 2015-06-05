package vozab.view;

import java.awt.Container;

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
	
	
	protected Container getContentPane()
	{
		return frame.getContentPane();
	}
	

	private void initUI(String title, int x, int y)
	{
		frame.setTitle(title);
		frame.setSize(x, y);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}
