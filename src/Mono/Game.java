package Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import Mono.GUI.Startup;

public class Game {

	private Integer numOfPlayers;
	private Timer timeLimit;
	private ArrayList<Player> players;
	public Dice dice;
	public Player currentPlayer;
	static Board board = new Board();
	private static int turn=1;
	static int pNum=0;
	static Player player1 = new Player();
	static Player player2 = new Player();
	static Player player3 = new Player();
	static Player player4 = new Player();
	static int roll;
	private static int[] tiles = new int[40];
	

	
	public Integer setTimeLimit() {
		//TODO: 
		return 0;
	}

	public void setNumOfPlayers(Integer n) {
		this.numOfPlayers = n;
	}

	public void addPlayer(Player p) {
		this.getPlayers().add(p);
	}

	public void decideTurn() {
		//TODO:
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	public void start() {
		// TODO:
	}

	public static void main(String[] args) 
	{
		
		Startup startup = new Startup(1000,1000);
		
				
	}
	public static  void showBoard() 
	{

		board.showBoard();
		
	}
	public static void roll() 
	{
		
		switch(turn) 
		{
		case 1:
			roll=Dice.roll();
			player1.setPosition(board.updatePlayerPosition(roll, player1.getPosition()));
			if((roll +player1.getTile())>40) 
			{
				JOptionPane.showMessageDialog(null, "Passed Go, Collect $200!!!");
				player1.setMoney(player1.getMoney()+200);
			}
			player1.setTile((player1.getTile()+roll)%40);
			checkTile(player1);
			//TODO land on tile checkTile()
			
			if(Dice.isDouble()) 
			{
				board.updateTextField(player1.getName()+" Rolled a " + roll+ ",    Doubles!!!");
				turn =1;
			}
			else 
			{
				board.updateTextField(player1.getName()+" Rolled a " + roll);
				turn=2;
			}
			
			break;
		case 2:
			roll=Dice.roll();
			player2.setPosition(board.updatePlayerPosition(roll, player2.getPosition()));
			if((roll +player2.getTile())>40) 
			{
				JOptionPane.showMessageDialog(null, "Passed Go, Collect $200!!!");
				player2.setMoney(player2.getMoney()+200);
			}
			player2.setTile((player2.getTile()+roll)%40);
			checkTile(player2);
			if(Dice.isDouble()) 
			{
				board.updateTextField(player2.getName()+ " Rolled a " + roll+ ",    Doubles!!!");
				turn =2;
			}
			else 
			{
				board.updateTextField(player2.getName()+" Rolled a " + roll);
				turn=3;
			}
			break;
		case 3:
			if(pNum<3) 
			{
				roll=Dice.roll();
				player1.setPosition(board.updatePlayerPosition(roll, player1.getPosition()));
				if((roll +player1.getTile())>40) 
				{
					JOptionPane.showMessageDialog(null, "Passed Go, Collect $200!!!");
					player1.setMoney(player1.getMoney()+200);
				}
				player1.setTile((player1.getTile()+roll)%40);
				checkTile(player1);
				//TODO land on tile checkTile()
				
				if(Dice.isDouble()) 
				{
					board.updateTextField(player1.getName()+" Rolled a " + roll+ ",    Doubles!!!");
					turn =1;
				}
				else 
				{
					board.updateTextField(player1.getName()+" Rolled a " + roll);
					turn=2;
				}
				
				break;
				}
			roll=Dice.roll();
			player3.setPosition(board.updatePlayerPosition(roll, player3.getPosition()));
			if((roll +player3.getTile())>40) 
			{
				JOptionPane.showMessageDialog(null, "Passed Go, Collect $200!!!");
				player3.setMoney(player3.getMoney()+200);
			}
			player3.setTile((player3.getTile()+roll)%40);
			checkTile(player3);
			if(Dice.isDouble()) 
			{
				board.updateTextField(player3.getName()+ " Rolled a " + roll+ ",    Doubles!!!");
				turn =3;
			}
			else 
			{
				board.updateTextField(player3.getName()+" Rolled a " + roll);
				turn=4;
			}
			break;
		case 4:
			if(pNum<4) 
			{
				roll=Dice.roll();
				player1.setPosition(board.updatePlayerPosition(roll, player1.getPosition()));
				if((roll +player1.getTile())>40) 
				{
					JOptionPane.showMessageDialog(null, "Passed Go, Collect $200!!!");
					player1.setMoney(player1.getMoney()+200);
				}
				player1.setTile((player1.getTile()+roll)%40);
				checkTile(player1);
				//TODO land on tile checkTile()
				
				if(Dice.isDouble()) 
				{
					board.updateTextField(player1.getName()+" Rolled a " + roll+ ",    Doubles!!!");
					turn =1;
				}
				else 
				{
					board.updateTextField(player1.getName()+" Rolled a " + roll);
					turn=2;
				}
				
				break;
				}
			roll=Dice.roll();
			player4.setPosition(board.updatePlayerPosition(roll, player4.getPosition()));
			if((roll +player4.getTile())>40) 
			{
				JOptionPane.showMessageDialog(null, "Passed Go, Collect $200!!!");
				player4.setMoney(player4.getMoney()+200);
			}
			player4.setTile((player4.getTile()+roll)%40);
			checkTile(player4);
			if(Dice.isDouble()) 
			{
				board.updateTextField(player4.getName()+ " Rolled a " + roll+ ",    Doubles!!!");
				turn =4;
			}
			else 
			{
				board.updateTextField(player4.getName()+" Rolled a " + roll);
				turn=1;
			}
			break;
		}
		
		
	}
	public static void setPlayers(String pIcon, String pName) 
	{
		pNum+=1;
		Integer[] position= new Integer[2];
		switch(pIcon) 
		{
		case "7.png":
			pIcon ="boot";
			position[0]=2;
			position[1]=7;
			break;
		case "2.png":
			pIcon ="dog";
			position[0]=1;
			position[1]=8;
			break;
		case "5.png":
			pIcon="iron";
			position[0]=1;
			position[1]=7;
			break;
		case "4.png":
			pIcon="ship";
			position[0]=2;
			position[1]=8;
			break;
		}
		switch(pNum) 
		{
		case 1:
			
			player1.setToken(pIcon);
			player1.setName(pName);
			player1.setPosition(position);
			board.setPlayerPosition(position, player1.getToken());
			player1.setPosition(board.updatePlayerPosition(19, player1.getPosition()));
			break;
		case 2:
			player2.setToken(pIcon);
			player2.setName(pName);
			player2.setPosition(position);
			board.setPlayerPosition(position, player2.getToken());
			player2.setPosition(board.updatePlayerPosition(19, player2.getPosition()));
			break;
		case 3:
			player3.setToken(pIcon);
			player3.setName(pName);
			player3.setPosition(position);
			board.setPlayerPosition(position, player3.getToken());
			player3.setPosition(board.updatePlayerPosition(19, player3.getPosition()));
			break;
		case 4: 
			player4.setToken(pIcon);
			player4.setName(pName);
			player4.setPosition(position);
			board.setPlayerPosition(position, player4.getToken());
			player4.setPosition(board.updatePlayerPosition(19, player4.getPosition()));
			break;
		}

		board.updateTextField(player1.getName()+", Your turn.");
	}

	public static void manageProperty() 

	{
		switch(turn)
		{
		case 1:
			board.displayBuyHouse(player1.getProperties());
			break;
		case 2:
			board.displayBuyHouse(player2.getProperties());
			break;
		case 3:
			board.displayBuyHouse(player3.getProperties());
			break;
		case 4:
			board.displayBuyHouse(player4.getProperties());
			break;
			
		}
	}

	public static void checkTile(Player o) 
	{
		switch(o.getTile()-1)
		{
			case 0:
				break;
			case 1:
				if(tiles[1]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Mediterranean Avenue for $60?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=60) 
						{
							o.setMoney(o.getMoney()-60);
							o.setProperties("mediterranean");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[1]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[1]!=turn) 
				{
					//pay rent
					switch(board.getHouses(0)) 
					{
					case 0:
						o.setMoney(o.getMoney()-2);
						switch(tiles[1]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+2);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+2);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+2);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+2);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-10);
						switch(tiles[1]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+10);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+10);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+10);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+10);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-30);
						switch(tiles[1]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+30);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+30);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+30);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+30);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-90);
						switch(tiles[1]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+90);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+90);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+90);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+90);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-160);
						switch(tiles[1]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+160);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+160);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+160);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+160);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-250);
						switch(tiles[1]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+250);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+250);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+250);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+250);
							break;
						}
						break;
					}
				}
				break;
			case 2:
				//community chest
				JOptionPane.showMessageDialog(null, "Community Chest!!!   (Cards not currently implemented).");
				break;
			case 3:
				if(tiles[3]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Baltic Avenue for $60?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=60) 
						{
							o.setMoney(o.getMoney()-60);
							o.setProperties("baltic");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[3]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[3]!=turn) 
				{
					//pay rent
					switch(board.getHouses(1)) 
					{
					case 0:
						o.setMoney(o.getMoney()-4);
						switch(tiles[3]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+4);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+4);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+4);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+4);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-20);
						switch(tiles[3]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+20);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+20);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+20);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+20);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-60);
						switch(tiles[3]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+60);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+60);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+60);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+60);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-180);
						switch(tiles[3]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+180);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+180);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+180);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+180);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-320);
						switch(tiles[3]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+320);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+320);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+320);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+320);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-450);
						switch(tiles[3]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+450);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+450);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+450);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+450);
							break;
						}
						break;
					}
				}
				break;
			case 4: 
				//income tax
				JOptionPane.showMessageDialog(null, "Income Tax, Pay $200.");
				o.setMoney(o.getMoney()-200);
				break;
			case 5: 
				//reading rr
				if(tiles[5]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Reading Railroad for $200?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=200) 
						{
							o.setMoney(o.getMoney()-200);
							o.setProperties("reading");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[5]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[5]!=turn)
				{
					switch(tiles[5]) 
					{
					case 1: 
						int rr=1;
						if (tiles[15]==1) {rr++;}
						if (tiles[25]==1) {rr++;}
						if (tiles[35]==1) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player1.setMoney(player1.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player1.setMoney(player1.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player1.setMoney(player1.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player1.setMoney(player1.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $200.");
							break;
							
						}
						break;
					case 2: 
						 rr=1;
						if (tiles[15]==2) {rr++;}
						if (tiles[25]==2) {rr++;}
						if (tiles[35]==2) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player2.setMoney(player2.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player2.setMoney(player2.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player2.setMoney(player2.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player2.setMoney(player2.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $200.");
							break;
							
						}
						break;
					case 3: 
						 rr=1;
						if (tiles[15]==3) {rr++;}
						if (tiles[25]==3) {rr++;}
						if (tiles[35]==3) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player3.setMoney(player3.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player3.setMoney(player3.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player3.setMoney(player3.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player3.setMoney(player3.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $200.");
							break;
							
						}
						break;
					case 4: 
					    rr=1;
						if (tiles[15]==1) {rr++;}
						if (tiles[25]==1) {rr++;}
						if (tiles[35]==1) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player4.setMoney(player4.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player4.setMoney(player4.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player4.setMoney(player4.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player4.setMoney(player4.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $200.");
							break;
							
						}
						break;
					}
				}
				break;
			case 6: 
				//oriental
				if(tiles[6]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Oriental Avenue for $100?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=100) 
						{
							o.setMoney(o.getMoney()-100);
							o.setProperties("oriental");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[6]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[6]!=turn) 
				{
					//pay rent
					switch(board.getHouses(2)) 
					{
					case 0:
						o.setMoney(o.getMoney()-6);
						switch(tiles[6]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+6);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+6);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+6);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+6);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-30);
						switch(tiles[6]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+30);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+30);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+30);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+30);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-90);
						switch(tiles[6]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+90);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+90);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+90);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+90);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-270);
						switch(tiles[6]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+270);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+270);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+270);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+270);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-400);
						switch(tiles[6]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+400);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+400);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+400);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+400);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-550);
						switch(tiles[6]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+550);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+550);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+550);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+550);
							break;
						}
						break;
					}
				}
				break;
			case 7: 
				//chance
				JOptionPane.showMessageDialog(null, "Chance!!!  (Cards not currently implemented).");
				break;
			case 8: 
				//vermont
				if(tiles[8]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Vermont Avenue for $100?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=100) 
						{
							o.setMoney(o.getMoney()-100);
							o.setProperties("vermont");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[8]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[8]!=turn) 
				{
					//pay rent
					switch(board.getHouses(3)) 
					{
					case 0:
						o.setMoney(o.getMoney()-6);
						switch(tiles[8]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+6);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+6);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+6);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+6);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-30);
						switch(tiles[8]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+30);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+30);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+30);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+30);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-90);
						switch(tiles[8]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+90);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+90);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+90);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+90);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-270);
						switch(tiles[8]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+270);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+270);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+270);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+270);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-400);
						switch(tiles[8]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+400);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+400);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+400);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+400);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-550);
						switch(tiles[8]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+550);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+550);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+550);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+550);
							break;
						}
						break;
					}
				}
				break;
			case 9: 
				//conn
				if(tiles[9]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Connecticut Avenue for $120?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=120) 
						{
							o.setMoney(o.getMoney()-120);
							o.setProperties("connecticut");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[9]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[9]!=turn) 
				{
					//pay rent
					switch(board.getHouses(4)) 
					{
					case 0:
						o.setMoney(o.getMoney()-8);
						switch(tiles[9]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+8);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+8);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+8);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+8);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-40);
						switch(tiles[9]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+40);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+40);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+40);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+40);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-100);
						switch(tiles[9]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+100);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+100);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+100);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+100);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-300);
						switch(tiles[9]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+300);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+300);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+300);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+300);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-450);
						switch(tiles[9]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+450);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+450);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+450);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+450);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-600);
						switch(tiles[9]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+600);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+600);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+600);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+600);
							break;
						}
						break;
					}
				}
				break;
			case 10:
				//jail
				JOptionPane.showMessageDialog(null, "Jail!!!   Just Visiting.");
				break;
			case 11:
				//st charles
				if(tiles[11]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy St. Charles Place for $140?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=140) 
						{
							o.setMoney(o.getMoney()-140);
							o.setProperties("st. charles");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[11]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[11]!=turn) 
				{
					//pay rent
					switch(board.getHouses(5)) 
					{
					case 0:
						o.setMoney(o.getMoney()-10);
						switch(tiles[11]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+10);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+10);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+10);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+10);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-50);
						switch(tiles[11]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+50);
							
							break;
						case 2:
							player2.setMoney(player2.getMoney()+50);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+50);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+50);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-150);
						switch(tiles[11]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+150);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+150);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+150);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+150);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-450);
						switch(tiles[11]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+450);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+450);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+450);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+450);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-625);
						switch(tiles[11]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+625);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+625);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+625);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+625);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-750);
						switch(tiles[11]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+750);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+750);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+750);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+750);
							break;
						}
					}
				}
				break;
			case 12:
				//electric
				int utilities;
				if(tiles[12]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Electric Company for $150?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=150) 
						{
							o.setMoney(o.getMoney()-150);
							o.setProperties("electric");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[12]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[12]!=turn)
				{
					switch(tiles[12]) 
					{
					case 1: 
						
						if (tiles[28]==1) 
						{
							utilities=roll*10;
						}
						else 
						{
							utilities=roll*4;
						}
						o.setMoney(o.getMoney()-utilities);
						player1.setMoney(player1.getMoney()+utilities);
						JOptionPane.showMessageDialog(null, "Electric Company.  Paid "+player1.getName()+" $"+utilities);
						break;

					case 2: 
						if (tiles[28]==1) 
						{
							utilities=roll*10;
						}
						else 
						{
							utilities=roll*4;
						}
						o.setMoney(o.getMoney()-utilities);
						player2.setMoney(player2.getMoney()+utilities);
						JOptionPane.showMessageDialog(null, "Electric Company.  Paid "+player2.getName()+" $"+utilities);
						break;
					case 3: 
						if (tiles[28]==1) 
						{
							utilities=roll*10;
						}
						else 
						{
							utilities=roll*4;
						}
						o.setMoney(o.getMoney()-utilities);
						player3.setMoney(player3.getMoney()+utilities);
						JOptionPane.showMessageDialog(null, "Electric Company.  Paid "+player3.getName()+" $"+utilities);
						break;
					case 4: 
						if (tiles[28]==1) 
						{
							utilities=roll*10;
						}
						else 
						{
							utilities=roll*4;
						}
						o.setMoney(o.getMoney()-utilities);
						player4.setMoney(player4.getMoney()+utilities);
						JOptionPane.showMessageDialog(null, "Electric Company.  Paid "+player4.getName()+" $"+utilities);
						
						break;
					}
				}
				break;
			case 13:
				//states
				if(tiles[13]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy States Avenue for $140?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=140) 
						{
							o.setMoney(o.getMoney()-140);
							o.setProperties("states");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[13]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[13]!=turn) 
				{
					//pay rent
					switch(board.getHouses(6)) 
					{
					case 0:
						o.setMoney(o.getMoney()-10);
						switch(tiles[13]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+10);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+10);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+10);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+10);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-50);
						switch(tiles[13]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+50);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+50);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+50);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+50);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-150);
						switch(tiles[13]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+150);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+150);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+150);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+150);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-450);
						switch(tiles[13]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+450);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+450);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+450);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+450);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-625);
						switch(tiles[13]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+625);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+625);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+625);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+625);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-750);
						switch(tiles[13]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+750);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+750);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+750);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+750);
							break;
						}
						break;
					}
				}
				break;
			case 14:
				//virginia
				if(tiles[14]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Virginia Avenue for $160?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=160) 
						{
							o.setMoney(o.getMoney()-160);
							o.setProperties("virginia");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[14]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[14]!=turn) 
				{
					//pay rent
					switch(board.getHouses(7)) 
					{
					case 0:
						o.setMoney(o.getMoney()-12);
						switch(tiles[14]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+12);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+12);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+12);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+12);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-60);
						switch(tiles[14]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+60);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+60);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+60);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+60);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-180);
						switch(tiles[14]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+180);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+180);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+180);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+180);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-500);
						switch(tiles[14]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+500);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+500);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+500);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+500);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-700);
						switch(tiles[14]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+700);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+700);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+700);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+700);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-900);
						switch(tiles[14]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+900);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+900);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+900);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+900);
							break;
						}
						break;
					}
				}
				break;
			case 15:
				//penn rr
				if(tiles[15]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Pennsylvania Railroad for $200?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=200) 
						{
							o.setMoney(o.getMoney()-200);
							o.setProperties("penn");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[15]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[15]!=turn)
				{
					switch(tiles[15]) 
					{
					case 1: 
						int rr=1;
						if (tiles[5]==1) {rr++;}
						if (tiles[25]==1) {rr++;}
						if (tiles[35]==1) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player1.setMoney(player1.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player1.setMoney(player1.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player1.setMoney(player1.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player1.setMoney(player1.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $200.");
							break;
							
						}
						break;
					case 2: 
						 rr=1;
						if (tiles[5]==2) {rr++;}
						if (tiles[25]==2) {rr++;}
						if (tiles[35]==2) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player2.setMoney(player2.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player2.setMoney(player2.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player2.setMoney(player2.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player2.setMoney(player2.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $200.");
							break;
							
						}
						break;
					case 3: 
						 rr=1;
						if (tiles[5]==3) {rr++;}
						if (tiles[25]==3) {rr++;}
						if (tiles[35]==3) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player3.setMoney(player3.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player3.setMoney(player3.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player3.setMoney(player3.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player3.setMoney(player3.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $200.");
							break;
							
						}
						break;
					case 4: 
					    rr=1;
						if (tiles[5]==1) {rr++;}
						if (tiles[25]==1) {rr++;}
						if (tiles[35]==1) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player4.setMoney(player4.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player4.setMoney(player4.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player4.setMoney(player4.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player4.setMoney(player4.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $200.");
							break;
							
						}
						break;
					}
				}
				break;
			case 16:
				//st james
				if(tiles[16]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy St. James Place for $180?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=180) 
						{
							o.setMoney(o.getMoney()-180);
							o.setProperties("st. james");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[16]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[16]!=turn) 
				{
					//pay rent
					switch(board.getHouses(8)) 
					{
					case 0:
						o.setMoney(o.getMoney()-14);
						switch(tiles[16]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+14);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+14);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+14);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+14);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-70);
						switch(tiles[16]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+70);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+70);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+70);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+70);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-200);
						switch(tiles[16]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+200);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+200);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+200);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+200);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-550);
						switch(tiles[16]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+550);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+550);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+550);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+550);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-750);
						switch(tiles[16]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+750);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+750);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+750);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+750);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-950);
						switch(tiles[16]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+950);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+950);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+950);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+950);
							break;
						}
						break;
					}
				}
				break;
			case 17:
				//community chest
				JOptionPane.showMessageDialog(null, "Community Chest!!!  (Cards not currently implemented).");
				break;
			case 18:
				//tennessee
				if(tiles[18]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Tennessee Avenue for $180?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=180) 
						{
							o.setMoney(o.getMoney()-180);
							o.setProperties("tennessee");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[18]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[18]!=turn) 
				{
					//pay rent
					switch(board.getHouses(9)) 
					{
					case 0:
						o.setMoney(o.getMoney()-14);
						switch(tiles[18]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+14);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+14);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+14);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+14);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-70);
						switch(tiles[18]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+70);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+70);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+70);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+70);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-200);
						switch(tiles[18]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+200);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+200);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+200);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+200);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-550);
						switch(tiles[18]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+550);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+550);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+550);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+550);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-750);
						switch(tiles[18]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+750);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+750);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+750);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+750);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-950);
						switch(tiles[18]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+950);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+950);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+950);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+950);
							break;
						}
						break;
					}
				}
				break;
			case 19:
				//new york
				if(tiles[19]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy New York Avenue for $200?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=200) 
						{
							o.setMoney(o.getMoney()-200);
							o.setProperties("new york");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[19]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[19]!=turn) 
				{
					//pay rent
					switch(board.getHouses(10)) 
					{
					case 0:
						o.setMoney(o.getMoney()-16);
						switch(tiles[19]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+16);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+16);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+16);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+16);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-80);
						switch(tiles[19]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+80);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+80);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+80);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+80);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-220);
						switch(tiles[19]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+220);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+220);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+220);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+220);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-600);
						switch(tiles[19]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+600);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+600);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+600);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+600);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-800);
						switch(tiles[19]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+800);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+800);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+800);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+800);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-1000);
						switch(tiles[19]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1000);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1000);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1000);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1000);
							break;
						}
						break;
					}
				}
				break;
			case 20:
				//free parking
				JOptionPane.showMessageDialog(null, "Free Parking!!!");
				break;
			case 21:
				//kentucky
				if(tiles[21]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Kentucky Avenue for $220?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=220) 
						{
							o.setMoney(o.getMoney()-220);
							o.setProperties("kentucky");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[21]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[21]!=turn) 
				{
					//pay rent
					switch(board.getHouses(11)) 
					{
					case 0:
						o.setMoney(o.getMoney()-18);
						switch(tiles[21]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+18);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+18);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+18);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+18);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-90);
						switch(tiles[21]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+90);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+90);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+90);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+90);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-250);
						switch(tiles[21]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+250);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+250);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+250);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+250);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-700);
						switch(tiles[21]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+700);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+700);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+700);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+700);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-875);
						switch(tiles[21]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+875);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+875);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+875);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+875);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-1050);
						switch(tiles[21]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1050);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1050);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1050);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1050);
							break;
						}
						break;
					}
				}
				break;
			case 22:
				//chance
				JOptionPane.showMessageDialog(null, "Chance!!!  (Cards not currently implemented).");
				break;
			case 23:
				//indiana
				if(tiles[23]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Indiana Avenue for $220?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=220) 
						{
							o.setMoney(o.getMoney()-220);
							o.setProperties("indiana");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[23]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[23]!=turn) 
				{
					//pay rent
					switch(board.getHouses(12)) 
					{
					case 0:
						o.setMoney(o.getMoney()-18);
						switch(tiles[23]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+18);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+18);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+18);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+18);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-90);
						switch(tiles[23]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+90);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+90);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+90);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+90);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-250);
						switch(tiles[23]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+250);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+250);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+250);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+250);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-700);
						switch(tiles[23]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+700);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+700);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+700);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+700);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-875);
						switch(tiles[23]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+875);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+875);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+875);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+875);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-1050);
						switch(tiles[23]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1050);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1050);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1050);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1050);
							break;
						}
						break;
					}
				}
				break;
			case 24:
				//illinois
				if(tiles[24]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Illinois Avenue for $240?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=240) 
						{
							o.setMoney(o.getMoney()-240);
							o.setProperties("Illinois");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[24]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[24]!=turn) 
				{
					//pay rent
					switch(board.getHouses(13)) 
					{
					case 0:
						o.setMoney(o.getMoney()-20);
						switch(tiles[24]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+20);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+20);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+20);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+20);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-100);
						switch(tiles[24]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+100);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+100);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+100);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+100);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-300);
						switch(tiles[24]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+300);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+300);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+300);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+300);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-750);
						switch(tiles[24]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+750);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+750);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+750);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+750);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-925);
						switch(tiles[24]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+925);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+925);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+925);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+925);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-1100);
						switch(tiles[24]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1100);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1100);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1100);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1100);
							break;
						}
						break;
					}
				}
				break;
			case 25:
				//bo rr
				if(tiles[25]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy B&O Railroad for $200?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=200) 
						{
							o.setMoney(o.getMoney()-200);
							o.setProperties("bo");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[25]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[25]!=turn)
				{
					switch(tiles[25]) 
					{
					case 1: 
						int rr=1;
						if (tiles[15]==1) {rr++;}
						if (tiles[5]==1) {rr++;}
						if (tiles[35]==1) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player1.setMoney(player1.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player1.setMoney(player1.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player1.setMoney(player1.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player1.setMoney(player1.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $200.");
							break;
							
						}
						break;
					case 2: 
						 rr=1;
						if (tiles[15]==2) {rr++;}
						if (tiles[5]==2) {rr++;}
						if (tiles[35]==2) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player2.setMoney(player2.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player2.setMoney(player2.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player2.setMoney(player2.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player2.setMoney(player2.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $200.");
							break;
							
						}
						break;
					case 3: 
						 rr=1;
						if (tiles[15]==3) {rr++;}
						if (tiles[5]==3) {rr++;}
						if (tiles[35]==3) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player3.setMoney(player3.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player3.setMoney(player3.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player3.setMoney(player3.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player3.setMoney(player3.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $200.");
							break;
							
						}
						break;
					case 4: 
					    rr=1;
						if (tiles[15]==1) {rr++;}
						if (tiles[5]==1) {rr++;}
						if (tiles[35]==1) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player4.setMoney(player4.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player4.setMoney(player4.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player4.setMoney(player4.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player4.setMoney(player4.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $200.");
							break;
							
						}
						break;
					}
				}
				break;
			case 26:
				//atlantic
				if(tiles[26]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Atlantic Avenue for $260?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=260) 
						{
							o.setMoney(o.getMoney()-260);
							o.setProperties("atlantic");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[26]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[26]!=turn) 
				{
					//pay rent
					switch(board.getHouses(14)) 
					{
					case 0:
						o.setMoney(o.getMoney()-22);
						switch(tiles[26]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+22);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+22);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+22);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+22);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-110);
						switch(tiles[26]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+110);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+110);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+110);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+110);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-330);
						switch(tiles[26]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+330);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+330);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+330);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+330);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-800);
						switch(tiles[26]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+800);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+800);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+800);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+800);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-975);
						switch(tiles[26]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+975);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+975);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+975);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+975);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-1150);
						switch(tiles[26]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1150);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1150);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1150);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1150);
							break;
						}
						break;
					}
				}
				break;
			case 27:
				//ventnor
				if(tiles[27]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Ventnor Avenue for $260?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=260) 
						{
							o.setMoney(o.getMoney()-260);
							o.setProperties("ventnor");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[27]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[27]!=turn) 
				{
					//pay rent
					switch(board.getHouses(15)) 
					{
					case 0:
						o.setMoney(o.getMoney()-22);
						switch(tiles[27]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+22);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+22);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+22);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+22);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-110);
						switch(tiles[27]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+110);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+110);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+110);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+110);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-330);
						switch(tiles[27]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+330);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+330);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+330);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+330);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-800);
						switch(tiles[27]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+800);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+800);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+800);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+800);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-975);
						switch(tiles[27]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+975);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+975);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+975);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+975);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-1150);
						switch(tiles[27]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1150);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1150);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1150);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1150);
							break;
						}
						break;
					}
				}
				break;
			case 28:
				//water works
				utilities=0;
				if(tiles[28]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Water Works for $150?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=150) 
						{
							o.setMoney(o.getMoney()-150);
							o.setProperties("water");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[28]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[28]!=turn)
				{
					switch(tiles[28]) 
					{
					case 1: 
						
						if (tiles[12]==1) 
						{
							utilities=roll*10;
						}
						else 
						{
							utilities=roll*4;
						}
						o.setMoney(o.getMoney()-utilities);
						player1.setMoney(player1.getMoney()+utilities);
						JOptionPane.showMessageDialog(null, "Water Works.  Paid "+player1.getName()+" $"+utilities);
						break;

					case 2: 
						if (tiles[12]==1) 
						{
							utilities=roll*10;
						}
						else 
						{
							utilities=roll*4;
						}
						o.setMoney(o.getMoney()-utilities);
						player2.setMoney(player2.getMoney()+utilities);
						JOptionPane.showMessageDialog(null, "Water Works.  Paid "+player2.getName()+" $"+utilities);
						break;
					case 3: 
						if (tiles[12]==1) 
						{
							utilities=roll*10;
						}
						else 
						{
							utilities=roll*4;
						}
						o.setMoney(o.getMoney()-utilities);
						player3.setMoney(player3.getMoney()+utilities);
						JOptionPane.showMessageDialog(null, "Water Works.  Paid "+player3.getName()+" $"+utilities);
						break;
					case 4: 
						if (tiles[12]==1) 
						{
							utilities=roll*10;
						}
						else 
						{
							utilities=roll*4;
						}
						o.setMoney(o.getMoney()-utilities);
						player4.setMoney(player4.getMoney()+utilities);
						JOptionPane.showMessageDialog(null, "Water Works.  Paid "+player4.getName()+" $"+utilities);
						break;
					}
				}
				break;
			case 29:
				//marvin gardens
				if(tiles[29]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Marvin Gardens for $280?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=280) 
						{
							o.setMoney(o.getMoney()-280);
							o.setProperties("marvin");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[29]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[29]!=turn) 
				{
					//pay rent
					switch(board.getHouses(16)) 
					{
					case 0:
						o.setMoney(o.getMoney()-24);
						switch(tiles[29]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+24);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+24);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+24);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+24);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-120);
						switch(tiles[29]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+120);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+120);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+120);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+120);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-360);
						switch(tiles[29]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+360);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+360);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+360);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+360);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-850);
						switch(tiles[29]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+850);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+850);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+850);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+850);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-1025);
						switch(tiles[29]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1025);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1025);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1025);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1025);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-1200);
						switch(tiles[29]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1200);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1200);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1200);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1200);
							break;
						}
						break;
					}
				}
				break;
			case 30:
				//go to jail
				JOptionPane.showMessageDialog(null, "Go To Jail, Go Directly To Jail, Do Not Pass GO, Do Not Collect $200.");				
				o.setPosition(board.updatePlayerPosition(20, o.getPosition()));
				o.setTile((10)%40);
				break;
			case 31:
				//pacific
				if(tiles[31]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Pacific Avenue for $300?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=300) 
						{
							o.setMoney(o.getMoney()-300);
							o.setProperties("pacific");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[31]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[31]!=turn) 
				{
					//pay rent
					switch(board.getHouses(17)) 
					{
					case 0:
						o.setMoney(o.getMoney()-26);
						switch(tiles[31]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+26);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+26);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+26);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+26);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-130);
						switch(tiles[31]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+130);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+130);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+130);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+130);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-390);
						switch(tiles[31]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+390);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+390);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+390);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+390);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-900);
						switch(tiles[31]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+900);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+900);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+900);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+900);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-1100);
						switch(tiles[31]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1100);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1100);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1100);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1100);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-1275);
						switch(tiles[31]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1275);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1275);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1275);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1275);
							break;
						}
						break;
					}
				}
				break;
			case 32:
				//north carolina
				if(tiles[32]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy North Carolina Avenue for $300?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=300) 
						{
							o.setMoney(o.getMoney()-300);
							o.setProperties("north carolina");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[32]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[32]!=turn) 
				{
					//pay rent
					switch(board.getHouses(18)) 
					{
					case 0:
						o.setMoney(o.getMoney()-26);
						switch(tiles[32]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+26);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+26);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+26);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+26);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-130);
						switch(tiles[32]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+130);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+130);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+130);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+130);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-390);
						switch(tiles[32]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+390);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+390);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+390);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+390);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-900);
						switch(tiles[32]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+900);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+900);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+900);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+900);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-1100);
						switch(tiles[32]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1100);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1100);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1100);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1100);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-1275);
						switch(tiles[32]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1275);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1275);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1275);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1275);
							break;
						}
						break;
					}
				}
				break;
			case 33:
				//community chest
				JOptionPane.showMessageDialog(null, "Community Chest!!!  (Cards not currently implemented).");
				break;
			case 34:
				//pennsylvania avenue
				if(tiles[34]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Pennsylvania Avenue for $320?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=320) 
						{
							o.setMoney(o.getMoney()-320);
							o.setProperties("pennsylvania");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[34]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[34]!=turn) 
				{
					//pay rent
					switch(board.getHouses(19)) 
					{
					case 0:
						o.setMoney(o.getMoney()-28);
						switch(tiles[34]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+28);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+28);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+28);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+28);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-150);
						switch(tiles[34]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+150);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+150);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+150);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+150);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-450);
						switch(tiles[34]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+450);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+450);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+450);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+450);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-1000);
						switch(tiles[34]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1000);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1000);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1000);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1000);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-1200);
						switch(tiles[34]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1200);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1200);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1200);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1200);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-1400);
						switch(tiles[34]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1400);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1400);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1400);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1400);
							break;
						}
						break;
					}
				}
				break;
			case 35:
				//short line rr
				if(tiles[35]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Short Line for $200?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=200) 
						{
							o.setMoney(o.getMoney()-200);
							o.setProperties("short");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[35]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[35]!=turn)
				{
					switch(tiles[35]) 
					{
					case 1: 
						int rr=1;
						if (tiles[15]==1) {rr++;}
						if (tiles[25]==1) {rr++;}
						if (tiles[5]==1) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player1.setMoney(player1.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player1.setMoney(player1.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player1.setMoney(player1.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player1.setMoney(player1.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player1.getName()+" $200.");
							break;
							
						}
						break;
					case 2: 
						 rr=1;
						if (tiles[15]==2) {rr++;}
						if (tiles[25]==2) {rr++;}
						if (tiles[5]==2) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player2.setMoney(player2.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player2.setMoney(player2.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player2.setMoney(player2.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player2.setMoney(player2.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player2.getName()+" $200.");
							break;
							
						}
						break;
					case 3: 
						 rr=1;
						if (tiles[15]==3) {rr++;}
						if (tiles[25]==3) {rr++;}
						if (tiles[5]==3) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player3.setMoney(player3.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player3.setMoney(player3.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player3.setMoney(player3.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player3.setMoney(player3.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player3.getName()+" $200.");
							break;
							
						}
						break;
					case 4: 
					    rr=1;
						if (tiles[15]==1) {rr++;}
						if (tiles[25]==1) {rr++;}
						if (tiles[5]==1) {rr++;}
						switch(rr) 
						{
						case 1:
							o.setMoney(o.getMoney()-25);
							player4.setMoney(player4.getMoney()+25);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $25.");
							break;
						case 2:
							o.setMoney(o.getMoney()-50);
							player4.setMoney(player4.getMoney()+50);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $50.");
							break;
						case 3:
							o.setMoney(o.getMoney()-100);
							player4.setMoney(player4.getMoney()+100);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $100.");
							break;
						case 4:
							o.setMoney(o.getMoney()-200);
							player4.setMoney(player4.getMoney()+200);
							JOptionPane.showMessageDialog(null, "Paid "+player4.getName()+" $200.");
							break;
							
						}
						break;
					}
				}
				break;
			case 36:
				//chance
				JOptionPane.showMessageDialog(null, "Chance!!!  (Cards not currently implemented).");
				break;
			case 37:
				//park place
				if(tiles[37]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Park Place for $350?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=350) 
						{
							o.setMoney(o.getMoney()-350);
							o.setProperties("park");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[37]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[37]!=turn) 
				{
					//pay rent
					switch(board.getHouses(20)) 
					{
					case 0:
						o.setMoney(o.getMoney()-35);
						switch(tiles[37]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+35);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+35);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+35);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+35);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-175);
						switch(tiles[37]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+175);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+175);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+175);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+175);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-500);
						switch(tiles[37]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+500);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+500);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+500);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+500);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-1100);
						switch(tiles[37]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1100);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1100);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1100);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1100);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-1300);
						switch(tiles[37]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1300);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1300);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1300);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1300);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-1500);
						switch(tiles[37]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1500);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1500);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1500);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1500);
							break;
						}
						break;
					}
				}
				break;
			case 38:
				//luxury tax
				JOptionPane.showMessageDialog(null, "Luxury Tax, Pay $100.");
				o.setMoney(o.getMoney()-100);
				break;
			case 39:
				//boardwalk
				if(tiles[39]==0) 
				{//offer to buy
					Object[] buy =  {"yes", "no"};
					int p=JOptionPane.showOptionDialog(null, "Do you want to buy Boardwalk for $400?",
							"Buy Property", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buy, buy[0]);
					Arrays.fill(buy,null);
					if(p==0) 
					{
						if(o.getMoney()>=400) 
						{
							o.setMoney(o.getMoney()-400);
							o.setProperties("board");
							JOptionPane.showMessageDialog(null, "Purchased.");
							tiles[39]=turn;
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "You do not have enough money.");
						}

					}
				}
				else if(tiles[39]!=turn) 
				{
					//pay rent
					switch(board.getHouses(21)) 
					{
					case 0:
						o.setMoney(o.getMoney()-50);
						switch(tiles[39]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+50);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+50);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+50);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+50);
							break;
						}
						break;
					case 1:
						o.setMoney(o.getMoney()-200);
						switch(tiles[39]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+200);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+200);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+200);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+200);
							break;
						}
						break;
					case 2:
						o.setMoney(o.getMoney()-600);
						switch(tiles[39]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+600);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+600);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+600);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+600);
							break;
						}
						break;
					case 3:
						o.setMoney(o.getMoney()-1400);
						switch(tiles[39]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1400);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1400);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1400);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1400);
							break;
						}
						break;
					case 4:
						o.setMoney(o.getMoney()-1700);
						switch(tiles[39]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+1700);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+1700);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+1700);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+1700);
							break;
						}
						break;
					case 5:
						o.setMoney(o.getMoney()-2000);
						switch(tiles[39]) 
						{
						case 1:
							player1.setMoney(player1.getMoney()+2000);
							break;
						case 2:
							player2.setMoney(player2.getMoney()+2000);
							break;
						case 3:
							player3.setMoney(player3.getMoney()+2000);
							break;
						case 4:
							player4.setMoney(player4.getMoney()+2000);
							break;
						}
						break;
					}
				}
				break;

			
				
		}
	}
}
