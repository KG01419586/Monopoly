package Mono;

import java.util.ArrayList;
import java.util.Timer;

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
		case "boot.png":
			pIcon ="boot";
			position[0]=2;
			position[1]=7;
			break;
		case "dog.jpg":
			pIcon ="dog";
			position[0]=1;
			position[1]=8;
			break;
		case "iron.jpg":
			pIcon="iron";
			position[0]=1;
			position[1]=7;
			break;
		case "ship.jpg":
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
			player1.setProperties("baltic");
			player1.setProperties("board");
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


}
