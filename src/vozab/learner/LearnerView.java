package vozab.learner;

import java.awt.Container;

import javax.swing.GroupLayout;
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
		GroupLayout gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		gl.setAutoCreateContainerGaps(true);
		gl.setAutoCreateGaps(true);
		
		gl.setHorizontalGroup(gl.createSequentialGroup()
				.addComponent(previousButton)
				.addComponent(showButton)
				.addComponent(nextButton)
				.addGroup(gl.createParallelGroup()
						.addComponent(visibleLabel)
						.addComponent(hiddenLabel)));
		
		gl.setVerticalGroup(gl.createParallelGroup()
				.addComponent(previousButton)
				.addComponent(showButton)
				.addComponent(nextButton)
				.addGroup(gl.createSequentialGroup()
						.addComponent(visibleLabel)
						.addComponent(hiddenLabel)
						));
		gl.linkSize(previousButton, showButton, nextButton);
		gl.linkSize(visibleLabel, hiddenLabel);
		
	}
	

	private void createLabels()
	{
		visibleLabel = new JLabel("abc");
		hiddenLabel = new JLabel("def");
	}
	
	
	private void createButtons()
	{
		previousButton = new JButton("Previous");
		nextButton = new JButton("Next");
		showButton = new JButton("Show answer");
	}

	
	
	
	
	
}
