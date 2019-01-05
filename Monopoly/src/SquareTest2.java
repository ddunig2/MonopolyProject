import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest2 {
	Square[] sq = new Square[5];
	int squareOne = 1;
	int squareTwo = 2;
	int squareThree = 3;

	@Test
	void testSquareIndex() {
		sq[squareOne] = new Square(squareOne);
		assertEquals(1, sq[squareOne].getIndex());
	}

	@Test
	void testSquarePrice() {
		sq[squareTwo] = new Square(39);
		assertEquals(400, sq[squareTwo].getPurchasePrice());

	}

	@Test
	void isOwnedTest() {
		RobotPlayer pl = new RobotPlayer("player", 500);
		sq[squareThree] = new Square(squareThree);
		sq[squareThree].setOwner(pl);
		assertEquals(true, sq[squareThree].isOwned());
	}

	@Test
	void isNotOwnedTest() {
		sq[squareThree] = new Square(squareThree);
		assertEquals(false, sq[squareThree].isOwned());
	}

	@Test
	void TestOwner() {
		RobotPlayer pl = new RobotPlayer("player", 500);
		sq[squareThree] = new Square(squareThree);
		sq[squareThree].setOwner(pl);

		assertEquals(pl, sq[squareThree].getOwner());
	}

	@Test
	void testSquareRentPrice() {
		sq[squareThree] = new Square(39);
		assertEquals(50, sq[squareThree].getRent());
	}

	//@Test
	void testMonopolyRent() {
		sq[3] = new Square(3);
		sq[3].updateRent();;
		assertEquals(18, sq[3].getRent());
	}
}
