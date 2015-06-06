package vozab.frame;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class About extends SimpleFrameView
{
	public About()
	{
		super("About", 300, 300);
		super.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.initUI();
	}
	
	
	public void setVisible()
	{
		super.setVisible();
	}
	

	private void initUI()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBounds(20, 20, 20, 20);
		
		JScrollPane scroll = new JScrollPane();
		JTextArea area = new JTextArea();
		
		area.setText("Vozab 1.0\n\n"
				+ "Vozab - Simple java swing program to learn vocabulary\n\n"
				+ "Written by Pawel Jankowski <jjpikoov@gmail.com>");
		
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		area.setEditable(false);
				
		scroll.getViewport().add(area);
		panel.add(scroll);
		
		super.frame.add(panel);

	}
}
