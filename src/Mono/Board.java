package Mono;

import java.awt.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import Mono.GUI.SidePanel; 

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
	 private SidePanel sidepanel = new SidePanel();
	 
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
	    frame.add(sidepanel, BorderLayout.EAST);
	    
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
	
	public int[] updatePlayerPosition(int roll, int[] pos) 
	{
		for(int i=0; i<roll; i++) 
		{
			try 
			{
				TimeUnit.SECONDS.sleep(1);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
//process for moving player along the top of the board
			if(pos[0]<=2 && pos[1]<=42) 
			{
				//checks for ship
				if(pos[0]%2 ==0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[1]+=4;
					gridSpots[pos[0]][pos[1]].setIcon(ship);
					continue;
					
				}
				//checks for boot
				else if(pos[0]%2==0 &&pos[1]%2!=0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[1]+=4;
					gridSpots[pos[0]][pos[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(pos[0]%2!=0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[1]+=4;
					gridSpots[pos[0]][pos[1]].setIcon(dog);
					continue;
				}
				//checks for iron
				else 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[1]+=4;
					gridSpots[pos[0]][pos[1]].setIcon(iron);
					continue;
				}
			}
			
//process for exiting Go To Jail tile
			else if(pos[0]<=2 && pos[1]>=43) 
			{
				//checks for ship
				if(pos[0]%2 ==0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]+=6;
					gridSpots[pos[0]][pos[1]].setIcon(ship);
					
				}
				//checks for boot
				else if(pos[0]%2==0 &&pos[1]%2!=0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]+=6;
					gridSpots[pos[0]][pos[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(pos[0]%2!=0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]+=6;
					gridSpots[pos[0]][pos[1]].setIcon(dog);
				}
				//checks for iron
				else 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]+=6;
					gridSpots[pos[0]][pos[1]].setIcon(iron);
				}
			}
			
//process for moving player along the right side of the board
			else if(pos[0]<=42 && pos[1]>=43) 
			{
				//checks for ship
				if(pos[0]%2 ==0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]+=4;
					gridSpots[pos[0]][pos[1]].setIcon(ship);
					
				}
				//checks for boot
				else if(pos[0]%2==0 &&pos[1]%2!=0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]+=4;
					gridSpots[pos[0]][pos[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(pos[0]%2!=0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]+=4;
					gridSpots[pos[0]][pos[1]].setIcon(dog);
				}
				//checks for iron
				else 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]+=4;
					gridSpots[pos[0]][pos[1]].setIcon(iron);
				}
			}
			
//process for moving player along the bottom of the board
			else if(pos[0]>=42 && pos[1]>=5) 
			{
				//checks for ship
				if(pos[0]%2 ==0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[1]-=4;
					gridSpots[pos[0]][pos[1]].setIcon(ship);
					
				}
				//checks for boot
				else if(pos[0]%2==0 &&pos[1]%2!=0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[1]-=4;
					gridSpots[pos[0]][pos[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(pos[0]%2!=0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[1]-=4;
					gridSpots[pos[0]][pos[1]].setIcon(dog);
				}
				//checks for iron
				else 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[1]-=4;
					gridSpots[pos[0]][pos[1]].setIcon(iron);
				}
			}
			
//process for exiting Jail Tile
			else if((pos[0]==8 || pos[0]==7) && pos[1]<=5) 
			{
				//checks for ship
				if(pos[0]%2 ==0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]-=6;
					gridSpots[pos[0]][pos[1]].setIcon(ship);
					
				}
				//checks for boot
				else if(pos[0]%2==0 &&pos[1]%2!=0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]-=6;
					gridSpots[pos[0]][pos[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(pos[0]%2!=0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]-=6;
					gridSpots[pos[0]][pos[1]].setIcon(dog);
				}
				//checks for iron
				else 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]-=6;
					gridSpots[pos[0]][pos[1]].setIcon(iron);
				}
			}
//process for moving player along the left side of the board
			else if(pos[0]>=3 && pos[1]<=4) 
			{
				//checks for ship
				if(pos[0]%2 ==0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]-=4;
					gridSpots[pos[0]][pos[1]].setIcon(ship);
					
				}
				//checks for boot
				else if(pos[0]%2==0 &&pos[1]%2!=0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]-=4;
					gridSpots[pos[0]][pos[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(pos[0]%2!=0 && pos[1]%2==0) 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]-=4;
					gridSpots[pos[0]][pos[1]].setIcon(dog);
				}
				//checks for iron
				else 
				{
					gridSpots[pos[0]][pos[1]].setIcon(null);
					pos[0]-=4;
					gridSpots[pos[0]][pos[1]].setIcon(iron);
				}
			}

		}
	    return pos;
	}
	

	
	public void displayBuyHouse() 
	{
		
	}
	
	public void updateTextField(String text) 
	{
		prompts.setText(text);
	}

	public int getRoll() 
	{
		int roll;
		roll=sidepanel.getRoll();
		updateTextField("Rolling a " + roll);
		return roll;
	}

}