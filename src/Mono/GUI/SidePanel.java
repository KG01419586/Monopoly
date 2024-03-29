package Mono.GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.EtchedBorder;
import javax.swing.text.JTextComponent;

import Mono.Board;
import Mono.Dice;
import Mono.Game;
import Mono.Player;
import Mono.elements;



public class SidePanel extends JPanel implements ActionListener, elements {
	public JButton rollButton = new JButton("ROLL!");
	public JButton propertyButton = new JButton("Manage Properties");
	private int roll;
	private boolean clicked=false;
	private JPanel property = new JPanel();
	private JFrame manage = new JFrame("Property Manager");
	private JPanel drop = new JPanel();
	private JComboBox<String> box = new JComboBox<String>();
	private JTextArea score = new JTextArea();
	private JPanel EAST_Panel = new JPanel();
	


	public SidePanel() {
		this.setLayout(new BorderLayout());


		propertyButton.addActionListener(this);
		// EAST
		//JPanel EAST_Panel = new JPanel();
		EAST_Panel.setLayout(new BorderLayout());
		EAST_Panel.setBackground(new Color(204,  255, 238));

		createGUI();
	    
		 score.setLineWrap(true);
	    ActionListener s = new ActionListener() 
	    {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		((JTextComponent) score).setText(Game.getScore());
	    	}
	    };
	    Timer t = new Timer(2000,s);
	    t.start();

		
		//EAST_Panel.add(createTimerPane(5), BorderLayout.NORTH);
		EAST_Panel.add(createRollPane(), BorderLayout.SOUTH);
		EAST_Panel.add(createPropertyPane(), BorderLayout.WEST);
		EAST_Panel.add(score,BorderLayout.EAST);


		this.add(EAST_Panel, BorderLayout.EAST);

	}

	/*public static void main(String[] args) {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SidePanel());
		frame.pack();
		frame.setVisible(true);

	}*/
	

	private JPanel createRollPane() {
		JPanel rollBox = new JPanel();
		rollBox.setLayout(new FlowLayout());
		rollBox.setPreferredSize(new Dimension(200, 100));
		rollBox.setBackground(new Color(0X1a1a1a));
		rollBox.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));



		rollButton.addActionListener(this);


		

		rollBox.add(rollButton);
		return rollBox;
	}
	private JPanel createPropertyPane() {
		property.setLayout(new BoxLayout(property, BoxLayout.LINE_AXIS));
		property.setPreferredSize(new Dimension(150, 100));
		property.setBackground(new Color(0X1a1a1a));
		property.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

		property.add(Box.createHorizontalGlue());
		property.add(propertyButton);
		property.add(Box.createHorizontalGlue());

		return property;
	}

	public void createTimerPane(int timeLimit) {
		EAST_Panel.add(new TimerBox(timeLimit), BorderLayout.NORTH);	
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rollButton) 
		{
			Game.roll();

		}

		if(e.getSource()==propertyButton) 
		{		        	

           Game.manageProperty();

		}
	}

	@Override
	public void createGUI() {
		JPanel scoreBox = new JPanel();
		JPanel currenPlayerBox = new JPanel();
		JPanel decisionBox = new JPanel();
		
	}

	


}