import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testDie {
	Die die = new Die();
	@Test
	void dieSum() {
		int die1= die.getFirstValue();
		int die2 = die.getSecondValue();
		int dieSum = die1+die2;
		assertEquals(dieSum, die.getSum());
	}
	//test for range 1-6 of die
}
