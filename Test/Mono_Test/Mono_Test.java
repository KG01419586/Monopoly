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
		board.updateTextField("Click Roll!!!");
		int roll = board.getRoll();
		board.updatePlayerPosition(roll,pos);
		board.updateTextField("Test Complete");
		while(true);
		//assertArrayEquals(pos,newPos);
		
	}

}
