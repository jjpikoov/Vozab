package vozab.learner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import vozab.database.DatabaseModel;

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
			if (DatabaseModel.UPDATED == false)
			{
				lm.update();
				DatabaseModel.UPDATED = true;
			}

			this.visibleLabel.setText(lm.getPreviousVisible());
			this.hiddenLabel.setText("________");
		}
		else if (e.getActionCommand().equals("Next"))
		{
			if (DatabaseModel.UPDATED == false)
			{
				lm.update();
				DatabaseModel.UPDATED = true;
			}

			this.visibleLabel.setText(lm.getNextVisible());
			this.hiddenLabel.setText("________");
		}
		else if (e.getActionCommand().equals("Show answer"))
		{
			if (DatabaseModel.UPDATED == false)
			{
				lm.update();
				DatabaseModel.UPDATED = true;
			}

			this.hiddenLabel.setText(lm.getCurrentHidden());
		}
	}
}
