package Mono;

import java.util.ArrayList;

public class Player {

	private String token;
	private Integer money =2000;
	private Integer[] position;
	private Integer tile;
	private Integer doubles;
	private Integer jailRolls;
	private Boolean inJail;
	private ArrayList<String> properties = new ArrayList<String>();
	private Integer roll;

	public Player() {
		doubles = 0;
	}

	public void setToken(String t) {
		this.token = t;
	}
	public String getToken() 
	{
		return this.token;
	}

	public Integer[] getPosition() {
		return this.position;
	}
	
	public Integer getTile() {
		return this.tile;
	}

	public void setPosition(Integer[] p) {
		this.position = p;
	}
	
	public void setTile(int t) {
		this.tile = t;
	}

	public Integer rollDice() {
		return Dice.roll();
	}

	public Integer numOfDoubles() {
		return doubles;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(int m) {
		money += m;
	}

	public void payRent(int rent, Player landLord) {
		if (this.getMoney() < rent) {
			// TODO: Bankrupt
		}
		this.setMoney(-rent);
		landLord.setMoney(rent);
	}

	public void payTax(int tax) {
		if (this.getMoney() < tax) {
			// TODO: Bankrupt
		}
		this.setMoney(-tax);
	}

	public void payRansom(int ransom) {
		if (this.getMoney() < ransom) {
			// TODO: Bankrupt
		}
		this.setMoney(-ransom);
	}

	public void buy() {
		// TODO:
	}

	public void goToJail() {
		// TODO:
		this.inJail = true;
	}

	public Boolean isInJail() {
		return this.inJail;
	}

	public Integer getJailRolls() {
		return jailRolls;
	}

	public void setJailRolls(int jr) {
		this.jailRolls = jr;
	}

	public void free() {
		this.inJail = false;
		setJailRolls(0);
	}
	public void setProperties(String property)
	{
		this.properties.add(property);
	}
	public ArrayList<String> getProperties() 
	{
		return properties;
	}
	public int getRoll() 
	{
		return roll;
	}
	public void setRoll(int roll) 
	{
		this.roll=roll;
	}
}
