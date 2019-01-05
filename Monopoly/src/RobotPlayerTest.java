import static org.junit.jupiter.api.Assertions.*;

//import java.util.jar.Attributes.Name;

import org.junit.jupiter.api.Test;
//import org.omg.CORBA.Current;

class RobotPlayerTest {
	private String name = "1";
	private int startingMoney = 100;
	RobotPlayer rp = new RobotPlayer(name, startingMoney);
	@Test
	void testName() {
		assertEquals(name, rp.getName());
	}
	@Test
	void testStartingMoney() {
		assertEquals(startingMoney, rp.getWallet());
	}
	
	@Test
	void testCurrentPoaition() {
		int startingPosition = 0;
		assertEquals(startingPosition, rp.getCurrentPosition());
	}
	
	//@Test
	void testPassGo() {
		//int passingGO = 31;
		//int currentposition = 31;
		//int dieValue = 9;
		//int ok = currentposition+dieValue;
		assertEquals(true, rp.PassGo(null));
	}
	@Test
	void testAddToWallet() {
		int Money = 200;
		rp.addToWallet(Money);
		assertEquals(300, rp.getWallet());
	}

}
