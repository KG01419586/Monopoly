package Mono;

public class Player {

	private String token;
	private Integer money;
	private Integer position;
	private Integer doubles;
	private Integer jailRolls;
	private Boolean inJail;

	public Player() {
		doubles = 0;
	}

	public void setToken(String t) {
		this.token = t;
	}

	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(int p) {
		this.position = p;
	}

	public Integer rollDice() {
		return Dice.roll();
	}

	public Integer numOfDoubles() {
		return doubles;
	}

	public Integer getMoney() {
		return money;
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

	}

}
