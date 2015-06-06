package vozab.frame;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class InfoView extends SimpleFrameView
{
	private JTextArea area = new JTextArea();

	public InfoView(String title, int x, int y, String text)
	{
		super(title, x, y);
		super.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setText(text);
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
		//JTextArea area = new JTextArea();
		
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		area.setEditable(false);
				
		scroll.getViewport().add(area);
		panel.add(scroll);
		
		super.frame.add(panel);

	}
	
	
	private void setText(String text)
	{
		this.area.setText(text);
	}
}
