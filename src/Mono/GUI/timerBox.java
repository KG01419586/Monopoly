package Mono.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

class TimerBox extends JPanel implements MouseListener {

	private Integer timeLimit;
	private Thread timerThread;
	private JLabel timerLabel;
	private boolean hasStarted;
	private boolean isRunning;

	TimerBox(Integer tl) {
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(200, 73));
		this.setBackground(new Color(0X1a1a1a));
		this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

		Font timerFont = null;
		try {
			timerFont = Font.createFont(Font.TRUETYPE_FONT, new File("src/Mono/GUI/Font/DS-DIGIT.TTF"));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timerFont = timerFont.deriveFont(Font.BOLD, 52);
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(timerFont);

		timerLabel = new JLabel(tl + ":00");

		timerLabel.setForeground(Color.RED);
		timerLabel.setFont(timerFont);
		timerLabel.addMouseListener(this);
		setTimer(tl);
		isRunning = false;
		hasStarted = false;
		timerThread = new Thread() {
			public void run() {
				hasStarted = true;
				while (timeLimit > 0) {
					refreshTimer();
					isRunning = true;
					timeLimit--;

					try {
						timerThread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				// TODO: when time limit is reached

				hasStarted = false;
				isRunning = false;
			}
		};

		this.add(timerLabel);

	}

	// set time in minutes
	public void setTimer(int min) {
		// work with seconds
		timeLimit = min * 60;

	}

	// get time left in {min, sec}
	public Integer[] getTime() {
		Integer[] t = { timeLimit / 60, timeLimit % 60 };
		return t;

	}

	void startTimer() {
		if (!hasStarted)
			timerThread.start();
	}

	void pauseTimer() {
		timerThread.suspend();
		isRunning = false;
	}

	void resumeTimer() {
		timerThread.resume();
	}

	private void refreshTimer() {
		timerLabel.setText(getTime()[0] + ":" + getTime()[1]);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == timerLabel) {
			if (isRunning)
				pauseTimer();
			else if (!hasStarted)
				startTimer();
			else
				resumeTimer();
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == timerLabel)
			timerLabel.setBorder(BorderFactory.createLoweredBevelBorder());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == timerLabel)
			timerLabel.setBorder(null);

	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == timerLabel)
			timerLabel.setBorder(null);

	}

}
