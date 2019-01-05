

import java.util.Random;
public class Die {
	public static final int MAX_FACES = 6;
	private int firstValue;
	private int secondValue;
	private Random rand;
	
	public Die(){
		rand = new Random();
		roll();
	}

	public void roll() {
		firstValue = (rand.nextInt(MAX_FACES-1) + 1);
		secondValue = (rand.nextInt(MAX_FACES-1) + 1);
	}

	public int getFirstValue() {
		return firstValue;
	}
	
	public int getSecondValue() {
		return secondValue;
	}
	
	public int getSum() {
		return firstValue + secondValue;	
	}
}
