package Mono;

import java.util.ArrayList;

public class Player {

	private String token;
	private Integer money =2000;
	private Integer propertyValue=0;
	private Integer[] position;
	private Integer tile =1;
	private Integer doubles=0;
	private Integer jailRolls=0;
	private Boolean inJail=false;
	private ArrayList<String> properties = new ArrayList<String>() ;
	private Integer roll;
	private String name;

	

	public Player() {
		
	}

	public void setToken(String t) {
		this.token = t;
	}
	public String getToken() 
	{
		return this.token;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return this.name;
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
		return this.doubles;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(int m) {
		this.money = m;
	}
	public Integer getPropertyValue() 
	{
		return this.propertyValue;
	}
	public void setPropertyValue(Integer x) 
	{
		this.propertyValue=x;
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
		return this.properties;
	}
	public int getRoll() 
	{
		return this.roll;
	}
	public void setRoll(int roll) 
	{
		this.roll=roll;
	}
}
