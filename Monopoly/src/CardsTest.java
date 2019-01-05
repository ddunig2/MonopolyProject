import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardsTest {
	Cards cards = new Cards();
	RobotPlayer lu = new RobotPlayer("lu", 0);
	Board b = new Board();

	@Test
	void test() {
		cards.getChance(lu, b);
		assertEquals(0, lu.getCurrentPosition());
	}

}
