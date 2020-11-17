package Mono_Test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.BorderLayout;

import org.junit.jupiter.api.Test;

import Mono.Board;
import Mono.Dice;
import Mono.GUI.SidePanel;
import Mono.GUI.Startup;


class Mono_Test {

	//tests Board and movement around the board starting from Kentucky Avenue
	@Test
	void testBoard() {
		//Startup startup = new Startup(1000,1000);
		Board board = new Board();
		int[] pos = new int[]{2,7};
		int[] newPos=new int[] {8,43};
		int playerNum=1;
		board.updateHouses("mediterranean", 5);
		board.updateHouses("baltic", 5);
		board.updateHouses("oriental", 5);
		board.updateHouses("vermont", 5);
		board.updateHouses("connecticut", 5);
		board.updateHouses("st. charles", 5);
		board.updateHouses("states", 5);
		board.updateHouses("virginia", 5);
		board.updateHouses("st. james", 5);
		board.updateHouses("tennessee", 5);
		board.updateHouses("new york", 5);
		board.updateHouses("kentucky", 5);
		board.updateHouses("indiana", 5);
		board.updateHouses("illinois", 5);
		board.updateHouses("atlantic", 5);
		board.updateHouses("ventnor", 5);
		board.updateHouses("pacific", 5);
		board.updateHouses("north carolina", 5);
		board.updateHouses("pennsylvania", 5);
		board.updateHouses("park", 5);
		board.updateHouses("board", 5);
		board.updateHouses("marvin", 5);
		board.updateTextField("Player "+ playerNum+ ":  Click Roll!!!");
		int roll = board.getRoll();
		board.updatePlayerPosition(roll,pos);
		board.updateTextField("Test Complete");
		while(true);
		//assertArrayEquals(pos,newPos);
		
	}

}
