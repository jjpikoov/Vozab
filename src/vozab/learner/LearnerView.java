package vozab.learner;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
		grid.gridx = 3; 
		grid.gridy = 2; 
		grid.gridheight = 1; 
		grid.gridwidth = 2; 
		pane.add(visibleLabel, grid);

		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx = 3; 
		grid.gridy = 4; 
	    grid.gridheight = 1; 
		grid.gridwidth = 2; 
		pane.add(hiddenLabel, grid);
		
		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx = 3; 
		grid.gridy = 6; 
	    grid.gridheight = 1; 
		grid.gridwidth = 2; 
		pane.add(previousButton, grid);
		
		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx = 3; 
		grid.gridy = 8; 
	    grid.gridheight = 1; 
		grid.gridwidth = 2; 
		pane.add(showButton, grid);
		
		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx = 3; 
		grid.gridy = 10; 
	    grid.gridheight = 1; 
		grid.gridwidth = 2; 
		pane.add(nextButton, grid);
		
	}
	

	private void createLabels()
	{
		Font f = new Font("serif", Font.PLAIN, 50);

		visibleLabel = new JLabel("CLICK", SwingConstants.CENTER); 
		visibleLabel.setFont(f);
		visibleLabel.setPreferredSize(new Dimension(400, 200));

		hiddenLabel = new JLabel("NEXT", SwingConstants.CENTER);
		hiddenLabel.setFont(f);
		hiddenLabel.setPreferredSize(new Dimension(400,200));
	}
	
	
	private void createButtons()
	{
		previousButton = new JButton("Previous");
		nextButton = new JButton("Next");
		showButton = new JButton("Show answer");
		
		ButtonsListener listener = new ButtonsListener(visibleLabel, hiddenLabel);
		previousButton.addActionListener(listener);
		nextButton.addActionListener(listener);
		showButton.addActionListener(listener);
	}

}
