package Mono_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Mono.Board;
import Mono.GUI.SidePanel;
import Mono.GUI.Startup;

class Mono_Test {

	@Test
	void testBoard() {
		//Startup startup = new Startup(1000,1000);
		Board board = new Board();
		board.updatePlayerPosition();
		board.updateTextField("Test Complete");
		while(true);
	}

}
