package Mono;

import java.awt.*;
import javax.swing.*; 

public class Board 
{  
	 private JFrame frame = new JFrame("Monopoly");
	 private JPanel map = new JPanel();
	 private GridBagConstraints con = new GridBagConstraints();
	 private JButton go = new JButton("GO");
	 private JButton med = new JButton("Mediterranean");
	 private JButton boardwalk = new JButton("Boardwalk");
	 private JButton cc = new JButton("Community Chest");
	 private JButton baltic = new JButton("Baltic");
	 private JButton income = new JButton("Income Tax");
	 private JButton reading = new JButton("Reading Railroad");
	 private JButton oriental =new JButton("Oriental Avenue");
	 private JButton chance =new JButton("Chance");
	 private JButton vermont=new JButton("Vermont Avenue");
	 private JButton ct=new JButton("Connecticut Avenue");
	 private JButton jail=new JButton("Jail");
	 
	 
	 
	public Board() {
	   
	    frame.setVisible(true);
	    frame.setSize(1200,800);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    map.setBackground(Color.red);
	    map.setLayout(new GridBagLayout());
	    
	    con.gridx=2;
	    con.gridy=2;
	    go.setPreferredSize(new Dimension(125,150));
	    map.add(go,con);
	    
	    con.gridx=1;
	    con.gridy=2;
	    med.setPreferredSize(new Dimension(125,150));
	    map.add(med,con);
	    
	    con.gridx=2;
	    con.gridy=1;
	    boardwalk.setPreferredSize(new Dimension(125,150));
	    map.add(boardwalk,con);
	    
	    frame.add(map);
	    
	    
	}  
	
}