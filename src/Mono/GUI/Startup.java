package Mono.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Mono.Game;
import Mono.elements;

public class Startup extends JFrame implements ActionListener, MouseListener, elements {

	Contenders[] contenders;

	Boolean flag = false;
	Integer numOfPlayers;
	Integer p = 0;
	Integer w = 3;
	Integer h = 3;
	JLabel RS = new JLabel("Error indicator");

	// addPlayersPane components
	JTextField p1Field = new JTextField("PLAYER 1");
	JTextField p2Field = new JTextField("PLAYER 2");
	JTextField p3Field = new JTextField("PLAYER 3");
	JTextField p4Field = new JTextField("PLAYER 4");
	JLabel p1Label = new JLabel();
	JLabel p2Label = new JLabel();
	JLabel p3Label = new JLabel();
	JLabel p4Label = new JLabel();
	JLabel p1BackLabel = new JLabel();
	JLabel p2BackLabel = new JLabel();
	JLabel p3BackLabel = new JLabel();
	JLabel p4BackLabel = new JLabel();
	ImageIcon p1ImageIcon = new ImageIcon();
	ImageIcon p2ImageIcon = new ImageIcon();
	ImageIcon p3ImageIcon = new ImageIcon();
	ImageIcon p4ImageIcon = new ImageIcon();
	JButton clearButton = new JButton("Clear");
	JButton nextButton = new JButton("Next");
	JButton addButton = new JButton();
	JButton finishButton = new JButton("Finish");

	// iconBoxPane components
	JPanel iconPane;
	JLabel i1 = new JLabel();
	JLabel i2 = new JLabel();
	//JLabel i3 = new JLabel();
	JLabel i4 = new JLabel();
	JLabel i5 = new JLabel();
	//JLabel i6 = new JLabel();
	JLabel i7 = new JLabel();
	//JLabel i8 = new JLabel();
	//ImageIcon ii1 = new ImageIcon();
	ImageIcon ii2 = new ImageIcon();
	//ImageIcon ii3 = new ImageIcon();
	ImageIcon ii4 = new ImageIcon();
	ImageIcon ii5 = new ImageIcon();
	//ImageIcon ii6 = new ImageIcon();
	ImageIcon ii7 = new ImageIcon();
	//ImageIcon ii8 = new ImageIcon();
	JComboBox<?> selectTimeLimit;
	JPanel timerPane = new JPanel();
	TimerBox timeBox;

	public void createGUI() {

		// startup frame
		new JFrame("Monopoly");
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		this.add(playersInfoPane());
		this.add(iconBoxPane());
		this.add(addPlayerPane());
		this.add(startBoxPane());
		this.setVisible(true);

	}

	private Component playersInfoPane() {
		JLayeredPane playersInfoPane = new JLayeredPane();
		playersInfoPane.setLayout(null);
		playersInfoPane.setBorder(BorderFactory.createEtchedBorder());
		playersInfoPane.setBackground(new Color(0X1a1a1a));
		playersInfoPane.setOpaque(true);
		playersInfoPane.setBounds(0, 0, 300, 300);
		playersInfoPane.hide();

		return playersInfoPane;
	}

	private Component startBoxPane() {
		JPanel startBoxPane = new JPanel();
		startBoxPane.setBorder(BorderFactory.createEtchedBorder(new Color(0X262626), new Color(0X0d0d0d)));
		startBoxPane.setBackground(new Color(0X1a1a1a));
		startBoxPane.setBounds(0, 300, 600, 61);
		return startBoxPane;
	}

	private JLayeredPane addPlayerPane() {

		numOfPlayers = 2;
		contenders = new Contenders[4];
		contenders[0] = null;
		contenders[1] = null;
		contenders[2] = null;
		contenders[3] = null;

		JLayeredPane addPlayersPane = new JLayeredPane();
		addPlayersPane.setLayout(null);
		addPlayersPane.setBorder(BorderFactory.createEtchedBorder());
		addPlayersPane.setBackground(new Color(0X1a1a1a));
		addPlayersPane.setOpaque(true);
		addPlayersPane.setBounds(0, 0, 300, 300);

		p1Label.setSize(w * 15, h * 15);
		p2Label.setSize(w * 15, h * 15);
		p3Label.setSize(w * 15, h * 15);
		p4Label.setSize(w * 15, h * 15);

		p1Label.setLocation(w * 80, h * 2);
		p2Label.setLocation(w * 80, h * 21);
		p3Label.setLocation(w * 80, h * 39);
		p4Label.setLocation(w * 80, h * 57);

		p1Label.setBorder(BorderFactory.createRaisedBevelBorder());
		p1Label.setOpaque(true);
		p2Label.setBorder(BorderFactory.createRaisedBevelBorder());
		p2Label.setOpaque(true);
		p3Label.setBorder(BorderFactory.createRaisedBevelBorder());
		p3Label.setOpaque(true);
		p4Label.setBorder(BorderFactory.createRaisedBevelBorder());
		p4Label.setOpaque(true);

		p1Label.setBackground(addPlayersPane.getBackground());
		p2Label.setBackground(addPlayersPane.getBackground());
		p3Label.setBackground(addPlayersPane.getBackground());
		p4Label.setBackground(addPlayersPane.getBackground());

		p1ImageIcon = loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10);
		p2ImageIcon = loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10);
		p3ImageIcon = loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10);
		p4ImageIcon = loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10);

		p1Label.setIcon(p1ImageIcon);
		p2Label.setIcon(p1ImageIcon);
		p3Label.setIcon(p1ImageIcon);
		p4Label.setIcon(p1ImageIcon);

		p1Label.setHorizontalAlignment(JLabel.CENTER);
		p2Label.setHorizontalAlignment(JLabel.CENTER);
		p3Label.setHorizontalAlignment(JLabel.CENTER);
		p4Label.setHorizontalAlignment(JLabel.CENTER);

		p1Label.addMouseListener(this);
		p2Label.addMouseListener(this);
		p3Label.addMouseListener(this);
		p4Label.addMouseListener(this);

		p1BackLabel.setBackground(new Color(0X130606));
		p1BackLabel.setBounds(p1Label.getLocation().x - 1, p1Label.getLocation().y - 1, p1Label.getWidth() + 1,
				p1Label.getHeight() + 1);
		p1BackLabel.setOpaque(true);

		p2BackLabel.setBackground(new Color(0X001a00));
		p2BackLabel.setBounds(p2Label.getLocation().x - 1, p2Label.getLocation().y - 1, p2Label.getWidth() + 1,
				p2Label.getHeight() + 1);
		p2BackLabel.setOpaque(true);

		p3BackLabel.setBackground(new Color(0X000d1a));
		p3BackLabel.setBounds(p3Label.getLocation().x - 1, p3Label.getLocation().y - 1, p3Label.getWidth() + 1,
				p3Label.getHeight() + 1);
		p3BackLabel.setOpaque(true);

		p4BackLabel.setBackground(new Color(0X1a001a));
		p4BackLabel.setBounds(p4Label.getLocation().x - 1, p4Label.getLocation().y - 1, p4Label.getWidth() + 1,
				p4Label.getHeight() + 1);
		p4BackLabel.setOpaque(true);

		p1Field.setSize(w * 70, h * 8);
		p2Field.setSize(w * 70, h * 8);
		p3Field.setSize(w * 70, h * 8);
		p4Field.setSize(w * 70, h * 8);
		p1Field.setLocation(w * 5, h * 5);
		p2Field.setLocation(w * 5, h * 23);
		p3Field.setLocation(w * 5, h * 42);
		p4Field.setLocation(w * 5, h * 59);

		p1Field.setBackground(new Color(0X130606));
		p2Field.setBackground(new Color(0X01a00));
		p3Field.setBackground(new Color(0X000d1a));
		p4Field.setBackground(new Color(0X1a001a));

		p1Field.setBorder(BorderFactory.createEtchedBorder(new Color(0X260d0d), new Color(0X000000)));
		p2Field.setBorder(BorderFactory.createEtchedBorder(new Color(0X003300), new Color(0X000000)));
		p3Field.setBorder(BorderFactory.createEtchedBorder(new Color(0X001a33), new Color(0X000000)));
		p4Field.setBorder(BorderFactory.createEtchedBorder(new Color(0X330033), new Color(0X000000)));

		p1Field.setForeground(Color.WHITE);
		p2Field.setForeground(Color.WHITE);
		p3Field.setForeground(Color.WHITE);
		p4Field.setForeground(Color.WHITE);

		p1Field.addMouseListener(this);
		p2Field.addMouseListener(this);
		p3Field.addMouseListener(this);
		p4Field.addMouseListener(this);

		p3Field.hide();
		p4Field.hide();
		p3Label.hide();
		p4Label.hide();
		p3BackLabel.hide();
		p4BackLabel.hide();

		// RS: Red Start: indication for empty or duplicate fields and icons.
		RS.setSize(10, 10);
		RS.setLocation(5, 5);
		RS.setText("*");
		RS.setBackground(new Color(0X1a1a1a));
		RS.setForeground(Color.red);
		RS.setOpaque(true);
		RS.hide();
		addPlayersPane.add(RS);

		addButton.setSize(w * 15, h * 15);
		addButton.setLocation(w * 60, h * 35);
		addButton.setBackground(new Color(0X1a1a1a));
		addButton.setIcon(new ImageIcon(getClass().getResource("Img/add.png")));
		addButton.setHorizontalTextPosition(JButton.CENTER);
		addButton.setForeground(Color.lightGray);
		addButton.addActionListener(this);

		clearButton.setSize(w * 25, h * 10);
		clearButton.setLocation(w * 5, h * 84);
		clearButton.setBackground(new Color(0X1a1a1a));
		clearButton.setForeground(Color.lightGray);
		clearButton.addActionListener(this);

		nextButton.setSize(w * 25, h * 10);
		nextButton.setLocation(w * 65, h * 84);
		nextButton.setBackground(new Color(0X1a1a1a));
		nextButton.setForeground(Color.lightGray);
		nextButton.addActionListener(this);

		finishButton.setSize(w * 25, h * 10);
		finishButton.setLocation(w * 65, h * 84);
		finishButton.setBackground(new Color(0X1a1a1a));
		finishButton.setForeground(Color.lightGray);
		finishButton.addActionListener(this);
		finishButton.setEnabled(false);
		finishButton.hide();

		addPlayersPane.add(p1Label);
		addPlayersPane.add(p2Label);
		addPlayersPane.add(p3Label);
		addPlayersPane.add(p4Label);

		addPlayersPane.add(p1BackLabel);
		addPlayersPane.add(p2BackLabel);
		addPlayersPane.add(p3BackLabel);
		addPlayersPane.add(p4BackLabel);

		addPlayersPane.add(p1Field);
		addPlayersPane.add(p2Field);
		addPlayersPane.add(p3Field);
		addPlayersPane.add(p4Field);

		addPlayersPane.add(addButton);
		addPlayersPane.add(clearButton);
		addPlayersPane.add(nextButton);
		addPlayersPane.add(finishButton);
		return addPlayersPane;
	}

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	private JPanel iconBoxPane() {
		JPanel iconBoxPane = new JPanel();
		iconBoxPane.setLayout(null);
		iconBoxPane.setBorder(BorderFactory.createEtchedBorder());
		iconBoxPane.setBackground(new Color(0X1a1a1a));
		iconBoxPane.setBounds(300, 0, 300, 300);

		iconPane = new JPanel(new GridLayout(4, 2));
		iconPane.setSize(w * 42, h * 86);
		iconPane.setLocation(w * 29, h * 6);
		iconPane.setLayout(new GridLayout(4, 2));
		iconPane.setBackground(new Color(0X1a1a1a));
		iconPane.setBorder(BorderFactory.createEtchedBorder());

		i1.setSize(w * 20, h * 20);
		i2.setSize(w * 20, h * 20);
		//i3.setSize(w * 20, h * 20);
		i4.setSize(w * 20, h * 20);
		i5.setSize(w * 20, h * 20);
	//	i6.setSize(w * 20, h * 20);
		i7.setSize(w * 20, h * 20);
	//	i8.setSize(w * 20, h * 20);

	//	i1.setBorder(BorderFactory.createRaisedBevelBorder());
		i2.setBorder(BorderFactory.createRaisedBevelBorder());
	//	i3.setBorder(BorderFactory.createRaisedBevelBorder());
		i4.setBorder(BorderFactory.createRaisedBevelBorder());
		i5.setBorder(BorderFactory.createRaisedBevelBorder());
	//	i6.setBorder(BorderFactory.createRaisedBevelBorder());
		i7.setBorder(BorderFactory.createRaisedBevelBorder());
	//	i8.setBorder(BorderFactory.createRaisedBevelBorder());

//		i1.setOpaque(true);
		i2.setOpaque(true);
//		i3.setOpaque(true);
		i4.setOpaque(true);
		i5.setOpaque(true);
//		i6.setOpaque(true);
		i7.setOpaque(true);
//		i8.setOpaque(true);

//		i1.setBackground(iconBoxPane.getBackground());
		i2.setBackground(iconBoxPane.getBackground());
//		i3.setBackground(iconBoxPane.getBackground());
		i4.setBackground(iconBoxPane.getBackground());
		i5.setBackground(iconBoxPane.getBackground());
//		i6.setBackground(iconBoxPane.getBackground());
		i7.setBackground(iconBoxPane.getBackground());
//		i8.setBackground(iconBoxPane.getBackground());

	//	ii1 = loadImage("1.png", i1.getWidth() - 10, i1.getHeight() - 10);
		ii2 = loadImage("2.png", i1.getWidth() - 10, i1.getHeight() - 10);
	//	ii3 = loadImage("3.png", i1.getWidth() - 10, i1.getHeight() - 10);
		ii4 = loadImage("4.png", i1.getWidth() - 10, i1.getHeight() - 10);
		ii5 = loadImage("5.png", i1.getWidth() - 10, i1.getHeight() - 10);
//		ii6 = loadImage("6.png", i1.getWidth() - 10, i1.getHeight() - 10);
		ii7 = loadImage("7.png", i1.getWidth() - 10, i1.getHeight() - 10);
//		ii8 = loadImage("8.png", i1.getWidth() - 10, i1.getHeight() - 10);

	//	i1.setIcon(ii1);
		i2.setIcon(ii2);
//		i3.setIcon(ii3);
		i4.setIcon(ii4);
		i5.setIcon(ii5);
	//	i6.setIcon(ii6);
		i7.setIcon(ii7);
	//	i8.setIcon(ii8);

	//	i1.setHorizontalAlignment(JLabel.CENTER);
		i2.setHorizontalAlignment(JLabel.CENTER);
	//	i3.setHorizontalAlignment(JLabel.CENTER);
		i4.setHorizontalAlignment(JLabel.CENTER);
		i5.setHorizontalAlignment(JLabel.CENTER);
	//	i6.setHorizontalAlignment(JLabel.CENTER);
		i7.setHorizontalAlignment(JLabel.CENTER);
	//	i8.setHorizontalAlignment(JLabel.CENTER);

//		i1.addMouseListener(this);
		i2.addMouseListener(this);
//		i3.addMouseListener(this);
		i4.addMouseListener(this);
		i5.addMouseListener(this);
//		i6.addMouseListener(this);
		i7.addMouseListener(this);
//		i8.addMouseListener(this);

//		iconPane.add(i1);
		iconPane.add(i2);
	//	iconPane.add(i3);
		iconPane.add(i4);
		iconPane.add(i5);
//		iconPane.add(i6);
		iconPane.add(i7);
//		iconPane.add(i8);
		/*
		 * 
		 * clock & combo box
		 */
		selectTimeLimit = new JComboBox<String>(new String[] { "SELECT TIME LIMIT", "5 Minutes", "10 Minutes",
				"15 Minutes", "20 Minutes", "30 Minutes", "40 Minutes", "50 Minutes", "60 Minutes" });
		selectTimeLimit.setSize(150, 20);
		selectTimeLimit.setLocation(75, h * 40);
		selectTimeLimit.addActionListener(this);

		timeBox = new TimerBox(0);
		timeBox.nonInteractive();
		timeBox.setTimerBackgroundColor(new Color(0X0d0d0d));

		timerPane.setLayout(new BorderLayout());
		timerPane.setSize(200, 73);
		timerPane.setLocation(15 * w, 10 * h);
		timerPane.add(timeBox, BorderLayout.NORTH);

		iconPane.hide();
		selectTimeLimit.hide();
		timerPane.hide();

		iconBoxPane.add(timerPane);
		iconBoxPane.add(selectTimeLimit);
		iconBoxPane.add(iconPane);
		return iconBoxPane;
	}

	/*
	 * 
	 * Action Performed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == selectTimeLimit) {
			if (selectTimeLimit.getSelectedIndex() == 1) {
				timeBox.setTimer(5);
				finishButton.setEnabled(true);
			} else if (selectTimeLimit.getSelectedIndex() == 2) {
				timeBox.setTimer(10);
				finishButton.setEnabled(true);
			} else if (selectTimeLimit.getSelectedIndex() == 3) {
				timeBox.setTimer(15);
				finishButton.setEnabled(true);
			} else if (selectTimeLimit.getSelectedIndex() == 4) {
				timeBox.setTimer(20);
				finishButton.setEnabled(true);
			} else if (selectTimeLimit.getSelectedIndex() == 5) {
				timeBox.setTimer(30);
				finishButton.setEnabled(true);
			} else if (selectTimeLimit.getSelectedIndex() == 6) {
				timeBox.setTimer(40);
				finishButton.setEnabled(true);
			} else if (selectTimeLimit.getSelectedIndex() == 7) {
				timeBox.setTimer(50);
				finishButton.setEnabled(true);
			} else if (selectTimeLimit.getSelectedIndex() == 8) {
				timeBox.setTimer(60);
				finishButton.setEnabled(true);
			}
		}

		if (e.getSource() == addButton)

		{
			if (e.getSource() == addButton) {
				if (numOfPlayers == 3) {
					addButton.hide();
					p4Field.show();
					p4Label.show();
					p4BackLabel.show();
					numOfPlayers++;

				}
				if (numOfPlayers == 2) {
					addButton.setLocation(addButton.getLocation().x, addButton.getLocation().y + 60);
					p3Field.show();
					p3Label.show();
					p3BackLabel.show();
					numOfPlayers++;

				}

			}
		}

		if (e.getSource() == clearButton) {
			numOfPlayers = 2;
			contenders = new Contenders[4];
			contenders[0] = null;
			contenders[1] = null;
			contenders[2] = null;
			contenders[3] = null;
			p = 3;

			int counter = 4;
			addButton.setLocation(w * 60, h * 35);
			addButton.show();
			nextButton.show();
			p1Field.show();
			p2Field.show();
			p1Label.show();
			p2Label.show();
			p1BackLabel.show();
			p2BackLabel.show();

			p1Field.setText("PLAYER 1");
			p2Field.setText("PLAYER 2");
			p3Field.setText("PLAYER 3");
			p4Field.setText("PLAYER 4");
			// reset icons
			p1Label.setBackground(new Color(0X1a1a1a));
			p2Label.setBackground(new Color(0X1a1a1a));
			p3Label.setBackground(new Color(0X1a1a1a));
			p4Label.setBackground(new Color(0X1a1a1a));

			p1ImageIcon = loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10);
			p2ImageIcon = loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10);
			p3ImageIcon = loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10);
			p4ImageIcon = loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10);

			p1Label.setIcon(p1ImageIcon);
			p2Label.setIcon(p1ImageIcon);
			p3Label.setIcon(p1ImageIcon);
			p4Label.setIcon(p1ImageIcon);

			p1Label.setHorizontalAlignment(JLabel.CENTER);
			p2Label.setHorizontalAlignment(JLabel.CENTER);
			p3Label.setHorizontalAlignment(JLabel.CENTER);
			p4Label.setHorizontalAlignment(JLabel.CENTER);

			selectTimeLimit.setSelectedIndex(0);
			timeBox.setTimer(0);
			finishButton.setEnabled(false);

			p3Field.hide();
			p4Field.hide();
			p3Label.hide();
			p4Label.hide();

			p3BackLabel.hide();
			p4BackLabel.hide();

			iconPane.hide();

			finishButton.hide();
			timerPane.hide();
			selectTimeLimit.hide();

		}

		if (e.getSource() == nextButton) {
			iconPane.hide();
			RS.hide();

			/*
			 * look for empty slots
			 */
			if (p1Field.getText().trim().length() == 0 || contenders[0] == null) {
				p1Field.selectAll();
				RS.setLocation(5, 5);
				RS.show();
				return;
			} else if (p2Field.getText().trim().length() == 0 || contenders[1] == null) {
				p2Field.selectAll();
				RS.setLocation(5, 69);
				RS.show();
				return;
			} else if (p3Field.isShowing() && (p3Field.getText().trim().length() == 0 || contenders[2] == null)) {
				p3Field.selectAll();
				RS.setLocation(5, 126);
				RS.show();
				return;
			} else if (p4Field.isShowing() && (p4Field.getText().trim().length() == 0 || contenders[3] == null)) {
				p4Field.selectAll();
				RS.setLocation(5, 177);
				RS.show();
				return;
			}

			/*
			 * look for duplicate slots
			 */
			// compare p1 & p2
			if (p1Field.getText().equals(p2Field.getText())) {
				p2Field.selectAll();
				RS.setLocation(5, 69);
				RS.show();
				return;
			} else if (contenders[0].pIcon.equals(contenders[1].pIcon)) {
				p2Label.setIcon(loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10));
				p = 2;
				iconPane.show();
				RS.setLocation(5, 69);
				RS.show();
				return;
			}
			// compare p1 & p3
			if (p3Field.isShowing() && p1Field.getText().equals(p3Field.getText())) {
				p3Field.selectAll();
				RS.setLocation(5, 126);
				RS.show();
				return;
			} else if (p3Field.isShowing() && contenders[0].pIcon.equals(contenders[2].pIcon)) {
				p3Label.setIcon(loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10));
				p = 3;
				iconPane.show();
				RS.setLocation(5, 126);
				RS.show();
				return;
			}
			// compare p1 & p4
			if (p4Field.isShowing() && p1Field.getText().equals(p4Field.getText())) {
				p4Field.selectAll();
				RS.setLocation(5, 177);
				RS.show();
				return;

			} else if (p4Field.isShowing() && contenders[0].pIcon.equals(contenders[3].pIcon)) {
				p4Label.setIcon(loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10));
				p = 4;
				iconPane.show();
				RS.setLocation(5, 177);
				RS.show();
				return;
			}
			// compare p2 & p3
			if (p3Field.isShowing() && p2Field.getText().equals(p3Field.getText())) {
				p3Field.selectAll();
				RS.setLocation(5, 126);
				RS.show();
				return;
			} else if (p3Field.isShowing() && contenders[1].pIcon.equals(contenders[2].pIcon)) {
				p3Label.setIcon(loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10));
				p = 3;
				iconPane.show();
				RS.setLocation(5, 126);
				RS.show();
				return;
			}
			// compare p2 & p4
			if (p4Field.isShowing() && p2Field.getText().equals(p4Field.getText())) {
				p4Field.selectAll();
				RS.setLocation(5, 177);
				RS.show();
				return;
			} else if (p4Field.isShowing() && contenders[1].pIcon.equals(contenders[3].pIcon)) {
				p4Label.setIcon(loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10));
				p = 4;
				iconPane.show();
				RS.setLocation(5, 177);
				RS.show();
				return;
			}
			// compare p3 & p4
			if (p4Field.isShowing() && p3Field.getText().equals(p4Field.getText())) {
				p4Field.selectAll();
				RS.setLocation(5, 177);
				RS.show();
				return;
			} else if (p4Field.isShowing() && contenders[2].pIcon.equals(contenders[3].pIcon)) {
				p4Label.setIcon(loadImage("default-icon.png", p1Label.getWidth() - 10, p1Label.getHeight() - 10));
				p = 4;
				iconPane.show();
				RS.setLocation(5, 177);
				RS.show();
				return;
			}
			finishButton.show();
			selectTimeLimit.show();
			timeBox.show();
			timerPane.show();

			addButton.hide();
			nextButton.hide();

		}

		if (e.getSource() == finishButton) {
			contenders[0].pName = p1Field.getText();
			contenders[1].pName = p2Field.getText();
			if(numOfPlayers == 3) contenders[2].pName = p3Field.getText();
			if(numOfPlayers == 4) {
				contenders[2].pName = p3Field.getText();
				contenders[3].pName = p4Field.getText();
			}
			flag = true;
			System.out.println(getTimeLimit());
			this.setVisible(false);
			Game.setPlayers(contenders[0].pIcon, p1Field.getText());
			Game.setPlayers(contenders[1].pIcon, p2Field.getText());
			if (numOfPlayers ==3) {Game.setPlayers(contenders[2].pIcon, p3Field.getText());}
			if (numOfPlayers ==4) {
				Game.setPlayers(contenders[2].pIcon, p3Field.getText());
				Game.setPlayers(contenders[3].pIcon, p4Field.getText());}
			Game.showBoard(getTimeLimit());
			
		}

	}

	/*
	 * 
	 * Mouse Events
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// text fields
		if (e.getSource() == p1Field)
			p1Field.selectAll();
		if (e.getSource() == p2Field)
			p2Field.selectAll();
		if (e.getSource() == p3Field)
			p3Field.selectAll();
		if (e.getSource() == p4Field)
			p4Field.selectAll();

		// left icons
		if (e.getSource() == p1Label) {
			p = 1;
			iconPane.show();
		}
		if (e.getSource() == p2Label) {
			p = 2;
			iconPane.show();
		}
		if (e.getSource() == p3Label) {
			p = 3;
			iconPane.show();
		}
		if (e.getSource() == p4Label) {
			p = 4;
			iconPane.show();
		}

		// right icons
	/*	if (e.getSource() == i1) {
			copyImg("1.png", 45, 45);
			p = 0;
			iconPane.hide(); 
		}*/
		if (e.getSource() == i2) {
			copyImg("2.png", 45, 45);
			p = 0;
			iconPane.hide();
		}
/*		if (e.getSource() == i3) {
			copyImg("3.png", 45, 45);
			p = 0;
			iconPane.hide();
		}*/
		if (e.getSource() == i4) {
			copyImg("4.png", 45, 45);
			p = 0;
			iconPane.hide();
		}
		if (e.getSource() == i5) {
			copyImg("5.png", 45, 45);
			p = 0;
			iconPane.hide();
		}
	/*	if (e.getSource() == i6) {
			copyImg("6.png", 45, 45);
			p = 0;
			iconPane.hide();
		}*/
		if (e.getSource() == i7) {
			copyImg("7.png", 45, 45);
			p = 0;
			iconPane.hide();
		}
	/*	if (e.getSource() == i8) {
			copyImg("8.png", 45, 45);
			p = 0;
			iconPane.hide();
		}*/

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == p1Label)
			p1Label.setBorder(BorderFactory.createLoweredBevelBorder());
		if (e.getSource() == p2Label)
			p2Label.setBorder(BorderFactory.createLoweredBevelBorder());
		if (e.getSource() == p3Label)
			p3Label.setBorder(BorderFactory.createLoweredBevelBorder());
		if (e.getSource() == p4Label)
			p4Label.setBorder(BorderFactory.createLoweredBevelBorder());

	/*	if (e.getSource() == i1)
			i1.setBorder(BorderFactory.createLoweredBevelBorder());*/
		if (e.getSource() == i2)
			i2.setBorder(BorderFactory.createLoweredBevelBorder());
	/*	if (e.getSource() == i3)
			i3.setBorder(BorderFactory.createLoweredBevelBorder());*/
		if (e.getSource() == i4)
			i4.setBorder(BorderFactory.createLoweredBevelBorder());
		if (e.getSource() == i5)
			i5.setBorder(BorderFactory.createLoweredBevelBorder());
	/*	if (e.getSource() == i6)
			i6.setBorder(BorderFactory.createLoweredBevelBorder());*/
		if (e.getSource() == i7)
			i7.setBorder(BorderFactory.createLoweredBevelBorder());
	/*	if (e.getSource() == i8)
			i8.setBorder(BorderFactory.createLoweredBevelBorder());*/

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == p1Label)
			p1Label.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		if (e.getSource() == p2Label)
			p2Label.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		if (e.getSource() == p3Label)
			p3Label.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		if (e.getSource() == p4Label)
			p4Label.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

	/*	if (e.getSource() == i1)
			i1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));*/
		if (e.getSource() == i2)
			i2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
	/*	if (e.getSource() == i3)
			i3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));*/
		if (e.getSource() == i4)
			i4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		if (e.getSource() == i5)
			i5.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
	/*	if (e.getSource() == i6)
			i6.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));*/
		if (e.getSource() == i7)
			i7.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
	/*	if (e.getSource() == i8)
			i8.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));*/

	}

	@Override
	public void mouseEntered(MouseEvent e) {

		if (e.getSource() == p1Label)
			p1Label.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		if (e.getSource() == p2Label)
			p2Label.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		if (e.getSource() == p3Label)
			p3Label.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		if (e.getSource() == p4Label)
			p4Label.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

	/*	if (e.getSource() == i1)
			i1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));*/
		if (e.getSource() == i2)
			i2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
	/*	if (e.getSource() == i3)
			i3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));*/
		if (e.getSource() == i4)
			i4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		if (e.getSource() == i5)
			i5.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
	/*	if (e.getSource() == i6)
			i6.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));*/
		if (e.getSource() == i7)
			i7.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
	/*  if (e.getSource() == i8)
			i8.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));*/

	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == p1Label)
			p1Label.setBorder(BorderFactory.createRaisedBevelBorder());
		if (e.getSource() == p2Label)
			p2Label.setBorder(BorderFactory.createRaisedBevelBorder());
		if (e.getSource() == p3Label)
			p3Label.setBorder(BorderFactory.createRaisedBevelBorder());
		if (e.getSource() == p4Label)
			p4Label.setBorder(BorderFactory.createRaisedBevelBorder());

	/*	if (e.getSource() == i1)
			i1.setBorder(BorderFactory.createRaisedBevelBorder());*/
		if (e.getSource() == i2)
			i2.setBorder(BorderFactory.createRaisedBevelBorder());
	/*	if (e.getSource() == i3)
			i3.setBorder(BorderFactory.createRaisedBevelBorder());*/
		if (e.getSource() == i4)
			i4.setBorder(BorderFactory.createRaisedBevelBorder());
		if (e.getSource() == i5)
			i5.setBorder(BorderFactory.createRaisedBevelBorder());
	/*	if (e.getSource() == i6)
			i6.setBorder(BorderFactory.createRaisedBevelBorder());*/
		if (e.getSource() == i7)
			i7.setBorder(BorderFactory.createRaisedBevelBorder());
	/*	if (e.getSource() == i8)
			i8.setBorder(BorderFactory.createRaisedBevelBorder());*/

	}

	 ImageIcon loadImage(String src, Integer Width, Integer Height) {
		if (Width == 0 && Height == 0)
			return new ImageIcon(getClass().getResource("Img/" + src));
		BufferedImage img = new BufferedImage(Width, Height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = img.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		//ImageIcon mono2 = new ImageIcon(getClass().getResource("Img/"+src));
		g.drawImage(new ImageIcon(getClass().getResource("Img/" + src)).getImage(), 0, 0, Width, Height, null);
		g.dispose();
		return new ImageIcon(img);

	}

	private void copyImg(String src, Integer Width, Integer Height) {
		switch (p) {
		case 1:
			p1Label.setIcon(loadImage(src, Width, Height));
			contenders[0] = new Contenders("", src, Color.RED);
			p = 0;
			break;
		case 2:
			p2Label.setIcon(loadImage(src, Width, Height));
			contenders[1] = new Contenders("", src, Color.GREEN);
			p = 0;
			break;
		case 3:
			p3Label.setIcon(loadImage(src, Width, Height));
			contenders[2] = new Contenders("", src, Color.BLUE);
			p = 0;
			break;
		case 4:
			p4Label.setIcon(loadImage(src, Width, Height));
			contenders[3] = new Contenders("", src, Color.MAGENTA);
			p = 0;
			break;

		}

	}
	public Contenders[] getPlayers() {
		return this.contenders;
	}
	
	public  Integer getTimeLimit() {
		return Integer.parseInt(((String) (selectTimeLimit.getSelectedItem())).substring(0, 2).trim());
	}
	
	public Boolean flag() {
		return this.flag;
	}
	
	private class Contenders {
		String pName;
		String pIcon;
		Color pColor;

		Contenders(String name, String src, Color color) {
			pName = name;
			pIcon = src;
			pColor = color;
		}
	}


}
