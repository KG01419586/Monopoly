package Mono;

import java.util.ArrayList;
import java.util.Timer;

public class Game {

	private Integer numOfPlayers;
	private Timer timeLimit;
	private ArrayList<Player> players;
	public Board board;
	public Dice dice;
	public Player currentPlayer;

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
		
	}

}
