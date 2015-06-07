package vozab.learner;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

public class LearnerView extends LearnerMenuView
{
	private JLabel visibleLabel;
	private JLabel hiddenLabel;
	private JButton previousButton;
	private JButton nextButton;
	private JButton showButton;
	

	public LearnerView()
	{
		super();
		this.initUI();
	}
	
	private void initUI()
	{
		this.createLabels();
		this.createButtons();

		Container pane = super.frame.getContentPane();
		pane.setLayout(new GridBagLayout());
		GridBagConstraints grid = new GridBagConstraints();

		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx = 3; //2
		grid.gridy = 2; //2
		grid.gridheight = 1; //1
		grid.gridwidth = 2; //2
		pane.add(visibleLabel, grid);

		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx = 3; //2
		grid.gridy = 4; //4
	    grid.gridheight = 1; //1
		grid.gridwidth = 2; //2
		pane.add(hiddenLabel, grid);
		
		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx = 0; //0
		grid.gridy = 6; //6
	    grid.gridheight = 1; //1
		grid.gridwidth = 2; //2
		pane.add(previousButton, grid);
		
		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx = 2; //2
		grid.gridy = 6; //6
	    grid.gridheight = 1; //1
		grid.gridwidth = 2; //2
		pane.add(showButton, grid);
		
		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx = 4; //4
		grid.gridy = 6; //6
	    grid.gridheight = 1; //1
		grid.gridwidth = 2; //2
		pane.add(nextButton, grid);
	}
	

	private void createLabels()
	{
		Font f = new Font("serif", Font.PLAIN, 50);

		visibleLabel = new JLabel("/////");
		visibleLabel.setFont(f);
		visibleLabel.setPreferredSize(new Dimension(200, 200));

		hiddenLabel = new JLabel("_ _ _ _ _");
		hiddenLabel.setFont(f);
		hiddenLabel.setPreferredSize(new Dimension(200,200));
	}
	
	
	private void createButtons()
	{
		previousButton = new JButton("Previous");
		nextButton = new JButton("Next");
		showButton = new JButton("Show answer");
	}

	
	
	
	
	
}
