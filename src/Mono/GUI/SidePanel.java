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

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import Mono.Dice;


public class SidePanel extends JPanel {
	private JButton rollButton = new JButton("ROLL!");
	private int roll;
	private boolean clicked=false;
	public SidePanel() {
		this.setLayout(new BorderLayout());

		// EAST
		JPanel EAST_Panel = new JPanel();
		EAST_Panel.setLayout(new BorderLayout());

		JPanel scoreBox = new JPanel();
		JPanel currenPlayerBox = new JPanel();
		JPanel decisionBox = new JPanel();

		EAST_Panel.add(createTimerPane(50), BorderLayout.NORTH);
		EAST_Panel.add(createRollPane(), BorderLayout.SOUTH);

		this.add(EAST_Panel, BorderLayout.EAST);

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SidePanel());
		frame.pack();
		frame.setVisible(true);

	}

	private JPanel createRollPane() {
		JPanel rollBox = new JPanel();
		rollBox.setLayout(new FlowLayout());
		rollBox.setPreferredSize(new Dimension(200, 100));
		rollBox.setBackground(new Color(0X1a1a1a));
		rollBox.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		
		
		
		
		rollBox.add(rollButton);
		return rollBox;
	}

	private JPanel createTimerPane(int timeLimit) {
		return new TimerBox(timeLimit);
	}
	public int getRoll() 
	{
		
		while(clicked==false) 
		{
		    rollButton.addActionListener(new ActionListener() 
		    {
		        
		        @Override
		        public void actionPerformed(ActionEvent e) 
		        {             
		           roll = Dice.roll();
		           clicked= true;             
		        }
		    });
		}

		return roll;
	}

}
