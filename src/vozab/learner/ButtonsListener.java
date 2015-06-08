package vozab.learner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ButtonsListener implements ActionListener
{
	private JLabel visibleLabel, hiddenLabel;
	private LearnerModel lm;
	
	public ButtonsListener(JLabel visibleLabel, JLabel hiddenLabel)
	{
		this.visibleLabel = visibleLabel;
		this.hiddenLabel = hiddenLabel;
		this.lm = new LearnerModel();
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Previous"))
		{
			this.visibleLabel.setText(lm.getPreviousVisible());
			this.hiddenLabel.setText("________");
		}
		else if (e.getActionCommand().equals("Next"))
		{
			this.visibleLabel.setText(lm.getNextVisible());
			this.hiddenLabel.setText("________");
		}
		else if (e.getActionCommand().equals("Show answer"))
		{
			this.hiddenLabel.setText(lm.getCurrentHidden());
		}
	}
}
