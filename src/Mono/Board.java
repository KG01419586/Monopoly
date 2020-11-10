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
	 private JButton cc1 = new JButton("Community Chest");
	 private JButton cc2 = new JButton("Community Chest");
	 private JButton cc3 = new JButton("Community Chest");
	 private JButton baltic = new JButton("Baltic");
	 private JButton income = new JButton("Income Tax");
	 private JButton reading = new JButton("Reading Railroad");
	 private JButton oriental =new JButton("Oriental Avenue");
	 private JButton chance1 =new JButton("Chance");
	 private JButton chance2 =new JButton("Chance");
	 private JButton chance3 =new JButton("Chance");
	 private JButton vermont=new JButton("Vermont Avenue");
	 private JButton ct=new JButton("Connecticut Avenue");
	 private JButton jail=new JButton("Jail");
	 private JButton stcharles=new JButton("St. Charles Place");
	 private JButton electric=new JButton("Electric Company");
	 private JButton state=new JButton("State Avenue");
	 private JButton virginia=new JButton("Virginia Avenue");
	 private JButton penn=new JButton("Pennsylvania Railroad");
	 private JButton stjames=new JButton("St. James Place");
	 private JButton tennesee=new JButton("Tennessee Avenue");
	 private JButton newyork=new JButton("New York Avenue");
	 private JButton free=new JButton("Free Parking");
	 private JButton kentucky=new JButton("Kentucky Avenue");
	 private JButton indiana=new JButton("Indiana Avenue");
	 private JButton illinois=new JButton("Illinois Avenue");
	 private JButton bo=new JButton("B & O Railroad");
	 private JButton atlantic=new JButton("Atlantic Avenue");
	 private JButton ventnor=new JButton("Ventnor Avenue");
	 private JButton water=new JButton("Water Works");
	 private JButton marvin=new JButton("Marvin Gardens");
	 private JButton gotojail=new JButton("Go to Jail");
	 private JButton pacific=new JButton("Pacific Avenue");
	 private JButton nc=new JButton("North Carolina Avenue");
	 private JButton pennsylvania=new JButton("Pennslyvanina Avenue");
	 private JButton shortline=new JButton("Short Line");
	 private JButton park=new JButton ("Park Place");
	 private JButton luxury=new JButton("Luxury Tax");
	 
	 
	 
	public Board() {
	   
	    frame.setVisible(true);
	    frame.setSize(1920,1080);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    map.setBackground(new Color(204,  255, 238));
	    map.setLayout(new GridBagLayout());
	    con.weightx=1.0;
	    con.weighty=1.0;
	    con.fill = GridBagConstraints.BOTH;
	    
	    con.gridx=10;
	    con.gridy=11;
	    go.setPreferredSize(new Dimension(125,150));
	    map.add(go,con);
	    
	    con.gridx=9;
	    con.gridy=11;
	    med.setPreferredSize(new Dimension(125,150));
	    map.add(med,con);
	    
	    con.gridx=10;
	    con.gridy=10;
	    boardwalk.setPreferredSize(new Dimension(125,150));
	    map.add(boardwalk,con);
	    
	    con.gridx=8;
	    con.gridy=11;
	    cc1.setPreferredSize(new Dimension(125,150));
	    map.add(cc1,con);
	    
	    con.gridx=7;
	    con.gridy=11;
	    baltic.setPreferredSize(new Dimension(125,150));
	    map.add(baltic,con);
	    
	    con.gridx=6;
	    con.gridy=11;
	    income.setPreferredSize(new Dimension(125,150));
	    map.add(income,con);
	    
	    con.gridx=5;
	    con.gridy=11;
	    reading.setPreferredSize(new Dimension(125,150));
	    map.add(reading,con);
	    
	    con.gridx=4;
	    con.gridy=11;
	    oriental.setPreferredSize(new Dimension(125,150));
	    map.add(oriental,con);
	    
	    con.gridx=3;
	    con.gridy=11;
	    chance1.setPreferredSize(new Dimension(125,150));
	    map.add(chance1,con);
	    
	    con.gridx=2;
	    con.gridy=11;
	    vermont.setPreferredSize(new Dimension(125,150));
	    map.add(vermont,con);
	    
	    con.gridx=1;
	    con.gridy=11;
	    ct.setPreferredSize(new Dimension(125,150));
	    map.add(ct,con);
	    
	    con.gridx=0;
	    con.gridy=11;
	    jail.setPreferredSize(new Dimension(125,150));
	    map.add(jail,con);
	    
	    con.gridx=0;
	    con.gridy=10;
	    stcharles.setPreferredSize(new Dimension(125,150));
	    map.add(stcharles,con);
	    
	    con.gridx=0;
	    con.gridy=9;
	    electric.setPreferredSize(new Dimension(125,150));
	    map.add(electric,con);
	    
	    con.gridx=0;
	    con.gridy=8;
	    state.setPreferredSize(new Dimension(125,150));
	    map.add(state,con);
	    
	    con.gridx=0;
	    con.gridy=7;
	    virginia.setPreferredSize(new Dimension(125,150));
	    map.add(virginia,con);
	    
	    con.gridx=0;
	    con.gridy=6;
	    penn.setPreferredSize(new Dimension(125,150));
	    map.add(penn,con);
	
	    con.gridx=0;
	    con.gridy=5;
	    stjames.setPreferredSize(new Dimension(125,150));
	    map.add(stjames,con);
	    
	    con.gridx=0;
	    con.gridy=4;
	    cc2.setPreferredSize(new Dimension(125,150));
	    map.add(cc2,con);
	    
	    con.gridx=0;
	    con.gridy=3;
	    tennesee.setPreferredSize(new Dimension(125,150));
	    map.add(tennesee,con);
	    
	    con.gridx=0;
	    con.gridy=2;
	    newyork.setPreferredSize(new Dimension(125,150));
	    map.add(newyork,con);
	    
	    con.gridx=0;
	    con.gridy=1;
	    free.setPreferredSize(new Dimension(125,150));
	    map.add(free,con);
	    
	    con.gridx=1;
	    con.gridy=1;
	    kentucky.setPreferredSize(new Dimension(125,150));
	    map.add(kentucky,con);
	    
	    con.gridx=2;
	    con.gridy=1;
	    chance2.setPreferredSize(new Dimension(125,150));
	    map.add(chance2,con);
	    
	    con.gridx=3;
	    con.gridy=1;
	    indiana.setPreferredSize(new Dimension(125,150));
	    map.add(indiana,con);
	    
	    con.gridx=4;
	    con.gridy=1;
	    illinois.setPreferredSize(new Dimension(125,150));
	    map.add(illinois,con);
	    
	    con.gridx=5;
	    con.gridy=1;
	    bo.setPreferredSize(new Dimension(125,150));
	    map.add(bo,con);
	    
	    con.gridx=6;
	    con.gridy=1;
	    atlantic.setPreferredSize(new Dimension(125,150));
	    map.add(atlantic,con);
	    
	    con.gridx=7;
	    con.gridy=1;
	    ventnor.setPreferredSize(new Dimension(125,150));
	    map.add(ventnor,con);
	    
	    con.gridx=8;
	    con.gridy=1;
	    water.setPreferredSize(new Dimension(125,150));
	    map.add(water,con);
	    
	    con.gridx=9;
	    con.gridy=1;
	    marvin.setPreferredSize(new Dimension(125,150));
	    map.add(marvin,con);
	    
	    con.gridx=10;
	    con.gridy=1;
	    gotojail.setPreferredSize(new Dimension(125,150));
	    map.add(gotojail,con);
	    
	    con.gridx=10;
	    con.gridy=2;
	    pacific.setPreferredSize(new Dimension(125,150));
	    map.add(pacific,con);
	    
	    con.gridx=10;
	    con.gridy=3;
	    nc.setPreferredSize(new Dimension(125,150));
	    map.add(nc,con);
	    
	    con.gridx=10;
	    con.gridy=4;
	    cc3.setPreferredSize(new Dimension(125,150));
	    map.add(cc3,con);
	    
	    con.gridx=10;
	    con.gridy=5;
	    pennsylvania.setPreferredSize(new Dimension(125,150));
	    map.add(pennsylvania,con);
	    
	    con.gridx=10;
	    con.gridy=6;
	    shortline.setPreferredSize(new Dimension(125,150));
	    map.add(shortline,con);
	    
	    con.gridx=10;
	    con.gridy=7;
	    chance3.setPreferredSize(new Dimension(125,150));
	    map.add(chance3,con);
	    
	    con.gridx=10;
	    con.gridy=8;
	    park.setPreferredSize(new Dimension(125,150));
	    map.add(park,con);
	    
	    con.gridx=10;
	    con.gridy=9;
	    luxury.setPreferredSize(new Dimension(125,150));
	    map.add(luxury,con);
	    
	    
	    
	    frame.add(map);
	    
	    
	}  
	
}