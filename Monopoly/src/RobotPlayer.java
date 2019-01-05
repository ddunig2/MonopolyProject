//import java.security.KeyStore.PrivateKeyEntry;

public class RobotPlayer {

	private String name;
	private int wallet;
	private int currentPosition;
	public int passingGo;
	boolean isOut = false;
	private int losingTurns = 0;
	private int getOutOfJailFreeCards;

	public RobotPlayer(String givenName, int startingmoney) {
		name = givenName;
		wallet = startingmoney;
		currentPosition = 0;
	}

	public String getName() {
		return name;
	}

	public int getWallet() {
		return wallet;
	}

	public void setCurrentPosition(int setPosition) {
		currentPosition = setPosition;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void takeTurn(Die d2, Board board) {
		roll(d2);
		move(d2, board);

	}

	private void move(Die d2, Board board) {
		passingGo = currentPosition + d2.getSum();
		currentPosition = board.move(currentPosition, d2.getSum());
		// int totalSpacesMoved = board.ttsm(totalSpacesMoved, d2.getSum());
	}

	public void moveSpaces(int spaces, Board b) {
		passingGo = currentPosition + spaces;
		currentPosition = b.move(currentPosition, spaces);
	}

	private void roll(Die d2) {
		System.out.println("\n" + name + " is on position " + currentPosition + " and is now taking turn");
		d2.roll();
		//d2.getSum();
	}

	public boolean PassGo(Board b) {
		if (PassGo(passingGo, b)) {
			return true;
		}
		return false;
	}

	private boolean PassGo(int passgoCounter, Board b) {
		if (b.passGo(passgoCounter)) {
			return true;
		}
		return false;
	}

	public void addToWallet(int money) {
		wallet += money;
	}

	public void setInorOut(boolean out) {
		isOut = out;
	}

	public boolean out() {
		return isOut;
	}

	public int getLosingTurns() {
		return losingTurns;
	}

	public void setLosingTurns(int amountOfturns) {
		losingTurns = amountOfturns;
	}

	public void addGetOutOfJailFreeCard(int amountOfCards) {
		getOutOfJailFreeCards += amountOfCards;
	}

	public int GetGetOutOfJailFreeCards() {
		return getOutOfJailFreeCards;
	}
}