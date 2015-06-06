package vozab.learner;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import vozab.frame.SimpleFrameView;

public class LearnerMenuView extends SimpleFrameView
{
	public LearnerMenuView() 
	{
		super("Vozab", 500, 600);
		this.initUI();
	}
	
	public void setVisible()
	{
		super.setVisible();
	}
	
	
	private void initUI()
	{
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu help = new JMenu("Help");
		JMenuItem closeMItem = new JMenuItem("Exit");
		JMenuItem databaseMItem = new JMenuItem("Database");
		JMenuItem aboutMIterm = new JMenuItem("About");
		
		file.add(databaseMItem);
		file.add(closeMItem);
		help.add(aboutMIterm);

		menubar.add(file);
		menubar.add(help);
		super.frame.setJMenuBar(menubar);
		
		MenuBarItemsListener mbil = new MenuBarItemsListener();
		closeMItem.addActionListener(mbil);
		aboutMIterm.addActionListener(mbil);
		databaseMItem.addActionListener(mbil);

		
	}
	
	
	
}
