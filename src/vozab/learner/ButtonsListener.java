package vozab.learner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import vozab.database.DatabaseModel;

public class ButtonsListener implements ActionListener 
{
	private JLabel visibleLabel, hiddenLabel;
	private LearnerModel lm;
	private JFrame frame;
	
	public ButtonsListener(JLabel visibleLabel, JLabel hiddenLabel, JFrame frame)
	{
		this.visibleLabel = visibleLabel;
		this.hiddenLabel = hiddenLabel;
		this.lm = new LearnerModel();
		this.frame = frame;
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
			this.showNoDataDialog();
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
			this.showNoDataDialog();
		}
		else if (e.getActionCommand().equals("Show answer"))
		{
			if (DatabaseModel.UPDATED == false)
			{
				lm.update();
				DatabaseModel.UPDATED = true;
			}

			this.hiddenLabel.setText(lm.getCurrentHidden());
			this.showNoDataDialog();
		}
	}
	
	
	private void showNoDataDialog()
	{
		if (LearnerModel.NODATA == true)
		{
			JOptionPane.showMessageDialog(this.frame, "Please go to: File > Database and add some entries.\n" +
                    "or go to Help > Manual.", 
					"NO DATA!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
