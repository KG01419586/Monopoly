package Mono_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Mono.Board;
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
		board.updateTextField("Rolling a 50");
		board.updatePlayerPosition(50,pos);
		board.updateTextField("Test Complete");
		assertArrayEquals(pos,newPos);
		
	}

}
