package Mono;
import java.util.Random;

public class Dice {

	private static Integer firstDie;
	private static Integer secondDie;

	public static Integer roll() {
		firstDie = (new Random()).nextInt(6) + 1;
		secondDie = (new Random()).nextInt(6) + 1;
		return getTotal();
	}

	public static Integer getTotal() {
		return firstDie + secondDie;
	}

	public static boolean isDouble() {
		return firstDie == secondDie;
	}
}
