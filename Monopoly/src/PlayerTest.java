import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {
	Player p = new Player();
	@Test
	void test() {
		assertEquals(45, p.getTsm());
	}
	
	@Test
	void testTaketurn2() {
		assertEquals(5, p.getCP());
	}

}
