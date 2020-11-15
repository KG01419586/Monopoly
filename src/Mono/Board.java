package Mono;

import java.awt.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*; 

public class Board extends JPanel
{  
	 private JFrame frame = new JFrame("Monopoly");
	 private JPanel map = new JPanel();
	 private JTextField prompts=new JTextField();
	 private ImageIcon mono = new ImageIcon(new ImageIcon("../T3/images/monopoly_board.jpg").getImage().getScaledInstance(1020, 1020, Image.SCALE_SMOOTH));
	 private ImageIcon house = new ImageIcon(new ImageIcon("../T3/images/house.jpg").getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
	 private ImageIcon hotel = new ImageIcon(new ImageIcon("../T3/images/hotel.jpg").getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
	 private ImageIcon boot = new ImageIcon(new ImageIcon("../T3/images/boot.png").getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
	 private ImageIcon ship = new ImageIcon(new ImageIcon("../T3/images/ship.jpg").getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
	 private ImageIcon iron = new ImageIcon(new ImageIcon("../T3/images/iron.jpg").getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
	 private ImageIcon dog = new ImageIcon(new ImageIcon("../T3/images/dog.jpg").getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
	 private JLabel label = new JLabel(mono);
	 private JButton[][] gridSpots = new JButton[48][48];  
	 
	public Board() 
	{
	   
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    map.setBackground(new Color(204,  255, 238)); 
	    setGrid();
	    map.add(label); 
	    prompts.setHorizontalAlignment(JTextField.CENTER);
	    prompts.setFont(new Font("impact",Font.PLAIN,25));
	    frame.add(map);
	    frame.add(prompts, BorderLayout.SOUTH);
	    frame.pack();
	    frame.setVisible(true);	    
	}  
	
	private void setGrid() 
	{
		label.setLayout(new GridLayout(48,48));   
	    for(int i=0; i<gridSpots.length; i++) 
	    {
	    	for(int j=0; j<gridSpots[0].length; j++) 
	    	{
	    		JButton button = new JButton();
	    		button.setContentAreaFilled(false);
	    		button.setBorderPainted(false);
	    		label.add(button);
	    		gridSpots[i][j]=button;
	    	}	
	    }
	        
	}
	
	public void updateHouses() 
	{

	}
	
	public void updatePlayerPosition() 
	{
	    /* Icon Testing / Game Prompt Testing
	     * 
	     */ 
		
		gridSpots[2][7].setIcon(boot);
	    gridSpots[2][8].setIcon(ship);
	    gridSpots[1][7].setIcon(iron);
	    gridSpots[1][8].setIcon(dog);   
	    gridSpots[5][6].setIcon(house);
	    gridSpots[5][7].setIcon(house);
	    gridSpots[5][8].setIcon(house);
	    gridSpots[5][9].setIcon(house);
	    try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    updateTextField("Rolling 3");
	    gridSpots[2][8].setIcon(null);
	    try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    gridSpots[2][12].setIcon(ship);
	    try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    gridSpots[2][12].setIcon(null);
	    gridSpots[2][16].setIcon(ship);
	    try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    gridSpots[2][16].setIcon(null);
	    gridSpots[2][20].setIcon(ship);
	    updateTextField(null);
	}
	
	public void displayRoll() 
	{
		
	}
	
	public void displayBuyHouse() 
	{
		
	}
	
	public void updateTextField(String text) 
	{
		prompts.setText(text);
	}
}