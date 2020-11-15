package Mono_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Mono.Board;

class Mono_Test {

	@Test
	void testBoard() {
		Board board = new Board();
		board.updatePlayerPosition();
		board.updateTextField("Test Complete");
		while(true);
	}

}
