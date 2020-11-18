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
	static Player player1 = new Player();
	static Player player2 = new Player();
	static Integer[] p1 = {1,7};
	static Integer[] p2 = {1,8};
	private static int turn=1;

	
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
		// temp setup

		player1.setToken("iron");
		player2.setToken("dog");

		player1.setPosition(p1);
		player2.setPosition(p2);
		board.setPlayerPosition(p1, player1.getToken());
		board.setPlayerPosition(p2, player2.getToken());


		
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
			int roll=Dice.roll();
			board.updatePlayerPosition(roll, player1.getPosition());
			if(Dice.isDouble()) 
			{
				board.updateTextField("Rolled a " + roll+ ",    Doubles!!!");
				turn =1;
			}
			else 
			{
				turn=2;
			}
			
			break;
		case 2:
			roll=Dice.roll();
			board.updatePlayerPosition(roll, player2.getPosition());
			if(Dice.isDouble()) 
			{
				board.updateTextField("Rolled a " + roll+ ",    Doubles!!!");
				turn =2;
			}
			else 
			{
				turn=1;
			}
			break;
		case 3:
			break;
		case 4:
			break;
		}
		
		
	}



}
