import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {
	Game game = new Game();
	RobotPlayer rob, lu, nick;

	@Test
	void testPayRent() {
		lu = new RobotPlayer("lu", 200);
		game.createGame();
		game.board.square(6).setOwner(lu);
		game.board.square(8).setOwner(lu);
		game.board.square(9).setOwner(lu);
		game.board.updateSquares(5);
		assertEquals(12, game.board.square(6).getRent());
	}
	@Test
	void testChanceCards() {
		lu = new RobotPlayer("lu", 200);
		assertEquals(200, lu.getWallet());
	}

}
