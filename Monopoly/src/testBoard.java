import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testBoard {
	Board board = new Board();
	RobotPlayer rob, lu, nick;

	@Test
	void movetest() {
		int dieFv = 4;
		int currentPlayerP = 39;
		assertEquals(3, board.move(currentPlayerP, dieFv));
	}

	@Test
	void passGoTest() {
		int dieFv = 5;
		int currentPlayerP = 39;
		assertEquals(4, board.move(currentPlayerP, dieFv));
	}

	@Test
	void TotalSpacesMoved() {
		int dieFv = 5;
		int currentPlayerP = 39;
		assertEquals(44, board.totalSpacesMoved(currentPlayerP, dieFv));
	}

	@Test
	void isPrimeTest() {
		int currentPlayerP = 2;
		assertEquals(true, board.isPrime(currentPlayerP));
	}

	@Test
	void passgoTest() {
		int passGo = 41;
		assertEquals(true, board.passGo(passGo));
	}

	@Test
	void TestPayRent() {
		rob = new RobotPlayer("rob", 500);
		lu = new RobotPlayer("lu", 500);
		board.payRent(rob, lu, board.square(30));
		assertEquals(410, lu.getWallet());
	}

	@Test
	void monopolyBrown() {
		lu = new RobotPlayer("lu", 500);
		board.square(1).setOwner(lu);
		board.square(3).setOwner(lu);
		//five stands for dice face value but not needed here, only needed for utilties.
		board.updateSquares(5);;
		assertEquals(true, board.monopolyBrown());
	}

	@Test
	void monopolyLightBlue() {
		lu = new RobotPlayer("lu", 500);
		board.square(6).setOwner(lu);
		board.square(8).setOwner(lu);
		board.square(9).setOwner(lu);
		board.updateSquares(5);
		assertEquals(true, board.monopolyLightBlue());
	}

	@Test
	void setAbilityTobuy() {
		board.square(5).setAbilitytoBuyHouses(true);
		assertEquals(true, board.square(5).canBuyHouses());
	}

	@Test
	void AbilitytoBuyProperties() {
		lu = new RobotPlayer("lu", 500);
		board.square(1).setOwner(lu);
		board.square(3).setOwner(lu);
		board.updateSquares(5);
		assertEquals(true, board.square(1).canBuyHouses());
	}
	@Test
	void testMonopoylyRents() {
		lu = new RobotPlayer("lu", 500);
		board.square(15).setOwner(lu);
		board.square(35).setOwner(lu);
		board.square(5).setOwner(lu);
		board.square(25).setOwner(lu);
		board.updateSquares(5);
		assertEquals(200, board.square(35).getRent());
	}
}
