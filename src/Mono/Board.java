package Mono;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import Mono.GUI.SidePanel; 

public class Board extends JPanel 
{  
	 private JFrame frame = new JFrame("Monopoly");
	 private JFrame noProperty = new JFrame("Property");
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
	 private int numHouse[] = new int[22] ;
	 private ButtonGroup bGroup= new ButtonGroup();
	 
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
	    //frame.setVisible(true);	    
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
	
	public void updateHouses(String location, int houses) 
	{
		switch(location)
		{
			case "mediterranean":
				while(numHouse[0]<5 && houses>0) 
				{
					switch(numHouse[0]) 
					{
					case 0:
						gridSpots[42][41].setIcon(house);
						break;
					case 1:
						gridSpots[42][40].setIcon(house);
						break;
					case 2:
						gridSpots[42][39].setIcon(house);
						break;
					case 3:
						gridSpots[42][38].setIcon(house);
						break;
					case 4:
						gridSpots[42][41].setIcon(null);
						gridSpots[42][40].setIcon(null);
						gridSpots[42][39].setIcon(null);
						gridSpots[42][38].setIcon(null);
						gridSpots[42][40].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[0]++;
				}
				break;
			
			case "baltic":
				while(numHouse[1]<5 && houses>0) 
				{
					switch(numHouse[1]) 
					{
					case 0:
						gridSpots[42][33].setIcon(house);
						break;
					case 1:
						gridSpots[42][32].setIcon(house);
						break;
					case 2:
						gridSpots[42][31].setIcon(house);
						break;
					case 3:
						gridSpots[42][30].setIcon(house);
						break;
					case 4:
						gridSpots[42][33].setIcon(null);
						gridSpots[42][32].setIcon(null);
						gridSpots[42][31].setIcon(null);
						gridSpots[42][30].setIcon(null);
						gridSpots[42][32].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[1]++;
				}
				break;
			
			case "oriental":
				while(numHouse[2]<5 && houses>0) 
				{
					switch(numHouse[2]) 
					{
					case 0:
						gridSpots[42][21].setIcon(house);
						break;
					case 1:
						gridSpots[42][20].setIcon(house);
						break;
					case 2:
						gridSpots[42][19].setIcon(house);
						break;
					case 3:
						gridSpots[42][18].setIcon(house);
						break;
					case 4:
						gridSpots[42][21].setIcon(null);
						gridSpots[42][20].setIcon(null);
						gridSpots[42][19].setIcon(null);
						gridSpots[42][18].setIcon(null);
						gridSpots[42][20].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[2]++;
				}
				break;
			
			case "vermont":
				while(numHouse[3]<5 && houses>0) 
				{
					switch(numHouse[3]) 
					{
					case 0:
						gridSpots[42][13].setIcon(house);
						break;
					case 1:
						gridSpots[42][12].setIcon(house);
						break;
					case 2:
						gridSpots[42][11].setIcon(house);
						break;
					case 3:
						gridSpots[42][10].setIcon(house);
						break;
					case 4:
						gridSpots[42][13].setIcon(null);
						gridSpots[42][12].setIcon(null);
						gridSpots[42][11].setIcon(null);
						gridSpots[42][10].setIcon(null);
						gridSpots[42][12].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[3]++;
				}
				break;
			
			case "connecticut":
				while(numHouse[4]<5 && houses>0) 
				{
					switch(numHouse[4]) 
					{
					case 0:
						gridSpots[42][9].setIcon(house);
						break;
					case 1:
						gridSpots[42][8].setIcon(house);
						break;
					case 2:
						gridSpots[42][7].setIcon(house);
						break;
					case 3:
						gridSpots[42][6].setIcon(house);
						break;
					case 4:
						gridSpots[42][9].setIcon(null);
						gridSpots[42][8].setIcon(null);
						gridSpots[42][7].setIcon(null);
						gridSpots[42][6].setIcon(null);
						gridSpots[42][8].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[4]++;
				}
				break;
			
			case "st. charles":
				while(numHouse[5]<5 && houses>0) 
				{
					switch(numHouse[5]) 
					{
					case 0:
						gridSpots[41][5].setIcon(house);
						break;
					case 1:
						gridSpots[40][5].setIcon(house);
						break;
					case 2:
						gridSpots[39][5].setIcon(house);
						break;
					case 3:
						gridSpots[38][5].setIcon(house);
						break;
					case 4:
						gridSpots[41][5].setIcon(null);
						gridSpots[40][5].setIcon(null);
						gridSpots[39][5].setIcon(null);
						gridSpots[38][5].setIcon(null);
						gridSpots[40][5].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[5]++;
				}
				break;
			
			case "states":
				while(numHouse[6]<5 && houses>0) 
				{
					switch(numHouse[6]) 
					{
					case 0:
						gridSpots[33][5].setIcon(house);
						break;
					case 1:
						gridSpots[32][5].setIcon(house);
						break;
					case 2:
						gridSpots[31][5].setIcon(house);
						break;
					case 3:
						gridSpots[30][5].setIcon(house);
						break;
					case 4:
						gridSpots[33][5].setIcon(null);
						gridSpots[32][5].setIcon(null);
						gridSpots[31][5].setIcon(null);
						gridSpots[30][5].setIcon(null);
						gridSpots[32][5].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[6]++;
				}
				break;
			
			case "virginia":
				while(numHouse[7]<5 && houses>0) 
				{
					switch(numHouse[7]) 
					{
					case 0:
						gridSpots[29][5].setIcon(house);
						break;
					case 1:
						gridSpots[28][5].setIcon(house);
						break;
					case 2:
						gridSpots[27][5].setIcon(house);
						break;
					case 3:
						gridSpots[26][5].setIcon(house);
						break;
					case 4:
						gridSpots[29][5].setIcon(null);
						gridSpots[28][5].setIcon(null);
						gridSpots[27][5].setIcon(null);
						gridSpots[26][5].setIcon(null);
						gridSpots[28][5].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[7]++;
				}
				break;
			
			case "st. james":
				while(numHouse[8]<5 && houses>0) 
				{
					switch(numHouse[8]) 
					{
					case 0:
						gridSpots[21][5].setIcon(house);
						break;
					case 1:
						gridSpots[20][5].setIcon(house);
						break;
					case 2:
						gridSpots[19][5].setIcon(house);
						break;
					case 3:
						gridSpots[18][5].setIcon(house);
						break;
					case 4:
						gridSpots[21][5].setIcon(null);
						gridSpots[20][5].setIcon(null);
						gridSpots[19][5].setIcon(null);
						gridSpots[18][5].setIcon(null);
						gridSpots[20][5].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[8]++;
				}
				break;
			
			case "tennessee":
				while(numHouse[9]<5 && houses>0) 
				{
					switch(numHouse[9]) 
					{
					case 0:
						gridSpots[13][5].setIcon(house);
						break;
					case 1:
						gridSpots[12][5].setIcon(house);
						break;
					case 2:
						gridSpots[11][5].setIcon(house);
						break;
					case 3:
						gridSpots[10][5].setIcon(house);
						break;
					case 4:
						gridSpots[13][5].setIcon(null);
						gridSpots[12][5].setIcon(null);
						gridSpots[11][5].setIcon(null);
						gridSpots[10][5].setIcon(null);
						gridSpots[12][5].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[9]++;
				}
				break;
			
			case "new york":
				while(numHouse[10]<5 && houses>0) 
				{
					switch(numHouse[10]) 
					{
					case 0:
						gridSpots[9][5].setIcon(house);
						break;
					case 1:
						gridSpots[8][5].setIcon(house);
						break;
					case 2:
						gridSpots[7][5].setIcon(house);
						break;
					case 3:
						gridSpots[6][5].setIcon(house);
						break;
					case 4:
						gridSpots[9][5].setIcon(null);
						gridSpots[8][5].setIcon(null);
						gridSpots[7][5].setIcon(null);
						gridSpots[6][5].setIcon(null);
						gridSpots[8][5].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[10]++;
				}
				break;
			
			case "kentucky":
				while(numHouse[11]<5 && houses>0) 
				{
					switch(numHouse[11]) 
					{
					case 0:
						gridSpots[5][6].setIcon(house);
						break;
					case 1:
						gridSpots[5][7].setIcon(house);
						break;
					case 2:
						gridSpots[5][8].setIcon(house);
						break;
					case 3:
						gridSpots[5][9].setIcon(house);
						break;
					case 4:
						gridSpots[5][6].setIcon(null);
						gridSpots[5][7].setIcon(null);
						gridSpots[5][8].setIcon(null);
						gridSpots[5][9].setIcon(null);
						gridSpots[5][7].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[11]++;
				}
				break;
			
			case "indiana":
				while(numHouse[12]<5 && houses>0) 
				{
					switch(numHouse[12]) 
					{
					case 0:
						gridSpots[5][14].setIcon(house);
						break;
					case 1:
						gridSpots[5][15].setIcon(house);
						break;
					case 2:
						gridSpots[5][16].setIcon(house);
						break;
					case 3:
						gridSpots[5][17].setIcon(house);
						break;
					case 4:
						gridSpots[5][14].setIcon(null);
						gridSpots[5][15].setIcon(null);
						gridSpots[5][16].setIcon(null);
						gridSpots[5][17].setIcon(null);
						gridSpots[5][15].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[12]++;
				}
				
				break;
			
			case "illinois":
				while(numHouse[13]<5 && houses>0) 
				{
					switch(numHouse[13]) 
					{
					case 0:
						gridSpots[5][18].setIcon(house);
						break;
					case 1:
						gridSpots[5][19].setIcon(house);
						break;
					case 2:
						gridSpots[5][20].setIcon(house);
						break;
					case 3:
						gridSpots[5][21].setIcon(house);
						break;
					case 4:
						gridSpots[5][18].setIcon(null);
						gridSpots[5][19].setIcon(null);
						gridSpots[5][20].setIcon(null);
						gridSpots[5][21].setIcon(null);
						gridSpots[5][19].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[13]++;
				}
				break;
			
			case "atlantic":
				while(numHouse[14]<5 && houses>0) 
				{
					switch(numHouse[14]) 
					{
					case 0:
						gridSpots[5][26].setIcon(house);
						break;
					case 1:
						gridSpots[5][27].setIcon(house);
						break;
					case 2:
						gridSpots[5][28].setIcon(house);
						break;
					case 3:
						gridSpots[5][29].setIcon(house);
						break;
					case 4:
						gridSpots[5][26].setIcon(null);
						gridSpots[5][27].setIcon(null);
						gridSpots[5][28].setIcon(null);
						gridSpots[5][29].setIcon(null);
						gridSpots[5][27].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[14]++;
				}
				break;
			
			case "ventnor":
				while(numHouse[15]<5 && houses>0) 
				{
					switch(numHouse[15]) 
					{
					case 0:
						gridSpots[5][30].setIcon(house);
						break;
					case 1:
						gridSpots[5][31].setIcon(house);
						break;
					case 2:
						gridSpots[5][32].setIcon(house);
						break;
					case 3:
						gridSpots[5][33].setIcon(house);
						break;
					case 4:
						gridSpots[5][30].setIcon(null);
						gridSpots[5][31].setIcon(null);
						gridSpots[5][32].setIcon(null);
						gridSpots[5][33].setIcon(null);
						gridSpots[5][31].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[15]++;
				}
				break;
			
			case "marvin":
				while(numHouse[16]<5 && houses>0) 
				{
					switch(numHouse[16]) 
					{
					case 0:
						gridSpots[5][38].setIcon(house);
						break;
					case 1:
						gridSpots[5][39].setIcon(house);
						break;
					case 2:
						gridSpots[5][40].setIcon(house);
						break;
					case 3:
						gridSpots[5][41].setIcon(house);
						break;
					case 4:
						gridSpots[5][38].setIcon(null);
						gridSpots[5][39].setIcon(null);
						gridSpots[5][40].setIcon(null);
						gridSpots[5][41].setIcon(null);
						gridSpots[5][39].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[16]++;
				}
				break;
			
			case "pacific":
				while(numHouse[17]<5 && houses>0) 
				{
					switch(numHouse[17]) 
					{
					case 0:
						gridSpots[6][42].setIcon(house);
						break;
					case 1:
						gridSpots[7][42].setIcon(house);
						break;
					case 2:
						gridSpots[8][42].setIcon(house);
						break;
					case 3:
						gridSpots[9][42].setIcon(house);
						break;
					case 4:
						gridSpots[6][42].setIcon(null);
						gridSpots[7][42].setIcon(null);
						gridSpots[8][42].setIcon(null);
						gridSpots[9][42].setIcon(null);
						gridSpots[7][42].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[17]++;
				}
				break;
			
			case "north carolina":
				while(numHouse[18]<5 && houses>0) 
				{
					switch(numHouse[18]) 
					{
					case 0:
						gridSpots[10][42].setIcon(house);
						break;
					case 1:
						gridSpots[11][42].setIcon(house);
						break;
					case 2:
						gridSpots[12][42].setIcon(house);
						break;
					case 3:
						gridSpots[13][42].setIcon(house);
						break;
					case 4:
						gridSpots[10][42].setIcon(null);
						gridSpots[11][42].setIcon(null);
						gridSpots[12][42].setIcon(null);
						gridSpots[13][42].setIcon(null);
						gridSpots[11][42].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[18]++;
				}
				break;
			
			case "pennsylvania":
				while(numHouse[19]<5 && houses>0) 
				{
					switch(numHouse[19]) 
					{
					case 0:
						gridSpots[18][42].setIcon(house);
						break;
					case 1:
						gridSpots[19][42].setIcon(house);
						break;
					case 2:
						gridSpots[20][42].setIcon(house);
						break;
					case 3:
						gridSpots[21][42].setIcon(house);
						break;
					case 4:
						gridSpots[18][42].setIcon(null);
						gridSpots[19][42].setIcon(null);
						gridSpots[20][42].setIcon(null);
						gridSpots[21][42].setIcon(null);
						gridSpots[19][42].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[19]++;
				}
				break;
			
			case "park":
				while(numHouse[20]<5 && houses>0) 
				{
					switch(numHouse[20]) 
					{
					case 0:
						gridSpots[30][42].setIcon(house);
						break;
					case 1:
						gridSpots[31][42].setIcon(house);
						break;
					case 2:
						gridSpots[32][42].setIcon(house);
						break;
					case 3:
						gridSpots[33][42].setIcon(house);
						break;
					case 4:
						gridSpots[30][42].setIcon(null);
						gridSpots[31][42].setIcon(null);
						gridSpots[32][42].setIcon(null);
						gridSpots[33][42].setIcon(null);
						gridSpots[31][42].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[20]++;
				}
				break;
			
			case "board":
				while(numHouse[21]<5 && houses>0) 
				{
					switch(numHouse[21]) 
					{
					case 0:
						gridSpots[38][42].setIcon(house);
						break;
					case 1:
						gridSpots[39][42].setIcon(house);
						break;
					case 2:
						gridSpots[40][42].setIcon(house);
						break;
					case 3:
						gridSpots[41][42].setIcon(house);
						break;
					case 4:
						gridSpots[38][42].setIcon(null);
						gridSpots[39][42].setIcon(null);
						gridSpots[40][42].setIcon(null);
						gridSpots[41][42].setIcon(null);
						gridSpots[39][42].setIcon(hotel);
						break;
					}
					houses--;
					numHouse[21]++;
				}
				break;
		}
			
	}
	
	public Integer[] updatePlayerPosition(int roll, Integer[] integers) 

	{
		for(int i=0; i<roll; i++) 
		{

			//try 
			//{
		//		TimeUnit.SECONDS.sleep(1);
		//	} 
		//	catch (InterruptedException e) 
		//	{
		//		e.printStackTrace();
		//	}
			
//process for moving player along the top of the board
			if(integers[0]<=2 && integers[1]<=42) 
			{
				//checks for ship
				if(integers[0]%2 ==0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[1]+=4;
					gridSpots[integers[0]][integers[1]].setIcon(ship);
					continue;
					
				}
				//checks for boot
				else if(integers[0]%2==0 &&integers[1]%2!=0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[1]+=4;
					gridSpots[integers[0]][integers[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(integers[0]%2!=0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[1]+=4;
					gridSpots[integers[0]][integers[1]].setIcon(dog);
					continue;
				}
				//checks for iron
				else 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[1]+=4;
					gridSpots[integers[0]][integers[1]].setIcon(iron);
					continue;
				}
			}
			
//process for exiting Go To Jail tile
			else if(integers[0]<=2 && integers[1]>=43) 
			{
				//checks for ship
				if(integers[0]%2 ==0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]+=6;
					gridSpots[integers[0]][integers[1]].setIcon(ship);
					
				}
				//checks for boot
				else if(integers[0]%2==0 &&integers[1]%2!=0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]+=6;
					gridSpots[integers[0]][integers[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(integers[0]%2!=0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]+=6;
					gridSpots[integers[0]][integers[1]].setIcon(dog);
				}
				//checks for iron
				else 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]+=6;
					gridSpots[integers[0]][integers[1]].setIcon(iron);
				}
			}
			
//process for moving player along the right side of the board
			else if(integers[0]<=42 && integers[1]>=43) 
			{
				//checks for ship
				if(integers[0]%2 ==0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]+=4;
					gridSpots[integers[0]][integers[1]].setIcon(ship);
					
				}
				//checks for boot
				else if(integers[0]%2==0 &&integers[1]%2!=0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]+=4;
					gridSpots[integers[0]][integers[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(integers[0]%2!=0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]+=4;
					gridSpots[integers[0]][integers[1]].setIcon(dog);
				}
				//checks for iron
				else 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]+=4;
					gridSpots[integers[0]][integers[1]].setIcon(iron);
				}
			}
			
//process for moving player along the bottom of the board
			else if(integers[0]>=42 && integers[1]>=5) 
			{
				//checks for ship
				if(integers[0]%2 ==0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[1]-=4;
					gridSpots[integers[0]][integers[1]].setIcon(ship);
					
				}
				//checks for boot
				else if(integers[0]%2==0 &&integers[1]%2!=0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[1]-=4;
					gridSpots[integers[0]][integers[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(integers[0]%2!=0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[1]-=4;
					gridSpots[integers[0]][integers[1]].setIcon(dog);
				}
				//checks for iron
				else 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[1]-=4;
					gridSpots[integers[0]][integers[1]].setIcon(iron);
				}
			}
			
//process for exiting Jail Tile
			else if((integers[0]==8 || integers[0]==7) && integers[1]<=5) 
			{
				//checks for ship
				if(integers[0]%2 ==0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]-=6;
					gridSpots[integers[0]][integers[1]].setIcon(ship);
					
				}
				//checks for boot
				else if(integers[0]%2==0 &&integers[1]%2!=0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]-=6;
					gridSpots[integers[0]][integers[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(integers[0]%2!=0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]-=6;
					gridSpots[integers[0]][integers[1]].setIcon(dog);
				}
				//checks for iron
				else 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]-=6;
					gridSpots[integers[0]][integers[1]].setIcon(iron);
				}
			}
//process for moving player along the left side of the board
			else if(integers[0]>=3 && integers[1]<=4) 
			{
				//checks for ship
				if(integers[0]%2 ==0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]-=4;
					gridSpots[integers[0]][integers[1]].setIcon(ship);
					
				}
				//checks for boot
				else if(integers[0]%2==0 &&integers[1]%2!=0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]-=4;
					gridSpots[integers[0]][integers[1]].setIcon(boot);
					continue;
				}
				//checks for dog
				else if(integers[0]%2!=0 && integers[1]%2==0) 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]-=4;
					gridSpots[integers[0]][integers[1]].setIcon(dog);
				}
				//checks for iron
				else 
				{
					gridSpots[integers[0]][integers[1]].setIcon(null);
					integers[0]-=4;
					gridSpots[integers[0]][integers[1]].setIcon(iron);
				}
			}

		}
		
	    return integers;
	}
	

	public void setPlayerPosition(Integer[] position, String icon) 
	{
		switch(icon) 
		{
		case "ship":
			gridSpots[position[0]][position[1]].setIcon(ship);
			break;
		case "boot":
			gridSpots[position[0]][position[1]].setIcon(boot);
			break;
		case "iron":
			gridSpots[position[0]][position[1]].setIcon(iron);
			break;
		case "dog":
			gridSpots[position[0]][position[1]].setIcon(dog);
			break;	
		}

	}
	
 	public void displayBuyHouse(ArrayList<String> properties) 
	{
		if(properties.size()==0) {JOptionPane.showMessageDialog(noProperty, "You do not have any properties");return;}
		Object[] array= properties.toArray();
		Object[] numbers =  {1,2,3,4,"hotel"};
		int p=JOptionPane.showOptionDialog(null, "Which Property do you want to add houses/hotels to?",
				"Property Manager", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, array, array[0]);
		Arrays.fill(array,null);
		String selected = properties.get(p);
		int num=JOptionPane.showOptionDialog(null, "How many houses/hotels do you want to add",
				"Property Manager", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, numbers, numbers[0]) +1;

		updateHouses(selected,num);

		
	}
	
	public void updateTextField(String text) 
	{
		prompts.setText(text);
	}
	
	public void showBoard() 
	{
		frame.setVisible(true);
	}	
	public int getHouses(int space) 
	{
		return numHouse[space];
	}

}

