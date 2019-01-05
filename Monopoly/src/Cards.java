import java.util.Random;

public class Cards {
	public static final int MAX_CHANCE_CARDS = 16;

	String info;
	int number;
	Random random;

	public Cards() {
		random = new Random();
	}
	public String getCardInfo() {
		return info;
	}
	public void Shuffle() {
		number = (random.nextInt(MAX_CHANCE_CARDS - 1) + 1);
	}

	public int getNumber() {
		return number;
	}
	// ------------------------------------------------------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------------------------------------------------------
	// Chance

	public void getChance(RobotPlayer player, Board b) {
		if (number == 1) {
			info = "Advance to Go (Collect $200)";
			int amountToMove = 40 - player.getCurrentPosition();
			player.moveSpaces(amountToMove, b);
			player.addToWallet(200);
		}
		if (number == 2) {
			info = "Advance to Illinois Ave. - If you pass Go, collect $200";
			if (player.getCurrentPosition() > 24) {
				int amountToMove = ((40 - player.getCurrentPosition()) + 24);
				player.moveSpaces(amountToMove, b);
				player.addToWallet(200);
			} else {
				int amountToMove = 24 - player.getCurrentPosition();
				player.moveSpaces(amountToMove, b);
			}
		}
		if (number == 3) {
			info = "Advance to St. Charles Place – If you pass Go, collect $200";
			if (player.getCurrentPosition() > 11) {
				int amountToMove = ((40 - player.getCurrentPosition()) + 11);
				player.moveSpaces(amountToMove, b);
				player.addToWallet(200);
			} else {
				int amountToMove = 11 - player.getCurrentPosition();
				player.moveSpaces(amountToMove, b);
			}
		}

		if (number == 4) {
			info = "Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown.";
			if (player.getCurrentPosition() == 7) {
				player.moveSpaces(5, b);
			} else if (player.getCurrentPosition() == 22) {
				player.moveSpaces(6, b);
			} else if (player.getCurrentPosition() == 36) {
				player.moveSpaces(16, b);
				player.addToWallet(200);
			}
		}
		if (number == 5) {
			info = "Advance token to the nearest Railroad and pay owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank";
			if (player.getCurrentPosition() == 7) {
				player.moveSpaces(8, b);
			} else if (player.getCurrentPosition() == 22) {
				player.moveSpaces(3, b);
			} else if (player.getCurrentPosition() == 36) {
				player.moveSpaces(9, b);
				player.addToWallet(200);
			}
		}
		if (number == 6) {
			info = "Bank pays you dividend of $50";
			player.addToWallet(50);
		}
		if (number == 7) {
			info = "Get out of Jail Free – This card may be kept until needed, or traded/sold";
			player.addGetOutOfJailFreeCard(1);
		}

		if (number == 8) {
			info = "Go Back 3 Spaces";
			player.moveSpaces(-3, b);
		}
		if (number == 9) {
			info = "Go to Jail – Go directly to Jail – Do not pass Go, do not collect $200 ";
			player.setCurrentPosition(30);
		}

		if (number == 10) {
			info = "Make general repairs on all your property – For each house pay $25 – For each hotel $100";
		}

		if (number == 11) {
			info = "Pay poor tax of $15";
			player.addToWallet(-15);
		}
		if (number == 12) {
			info = "Take a trip to Reading Railroad – If you pass Go, collect $200";
			if (player.getCurrentPosition() > 5) {
				int amountToMove = ((40 - player.getCurrentPosition()) + 5);
				player.moveSpaces(amountToMove, b);
				player.addToWallet(200);
			} else {
				int amountToMove = 5 - player.getCurrentPosition();
				player.moveSpaces(amountToMove, b);
			}
		}
		if (number == 13) {
			info = "Take a walk on the Boardwalk – Advance token to Boardwalk.";
			player.setCurrentPosition(39);
		}

		if (number == 14) {
			info = "You have been elected Chairman of the Board – Pay each player $50";
		}

		if (number == 15) {
			info = "Your building {and} loan matures – Collect $150";
			player.addToWallet(150);
		}
		if (number == 16) {
			info = "You have won a crossword competition - Collect $100";
			player.addToWallet(100);
		}
	}

	// ------------------------------------------------------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------------------------------------------------------
	// Community chest
	public void getCommunityChest(RobotPlayer player, Board b) {
		if (number == 1) {
			info = "Advance to Go (Collect $200)";
			int amountToMove = 40 - player.getCurrentPosition();
			player.moveSpaces(amountToMove, b);
			player.addToWallet(200);
		}
		if (number == 2) {
			info = "Bank error in your favor – Collect $200";
			player.addToWallet(200);
		}
		if (number == 3) {
			info = "Doctor's fees – Pay $50";
			player.addToWallet(-50);
		}
		if (number == 4) {
			info = "From sale of stock you get $50";
			player.addToWallet(50);
		}
		if (number == 5) {
			info = "Get Out of Jail Free {Get out of Jail, Free}";
			player.addGetOutOfJailFreeCard(1);
		}
		if (number == 6) {
			info = "Go to Jail – Go directly to jail – Do not pass Go – Do not collect $200";
			player.setCurrentPosition(30);
		}
		if (number == 7) {//
			info = "Grand Opera Night {Opening} – Collect $50 from every player for opening night seats";
		}
		if (number == 8) {
			info = "Holiday Fund matures - Receive $100";
			player.addToWallet(100);
		}
		if (number == 9) {
			info = "Income tax refund – Collect $20";
			player.addToWallet(20);
		}
		if (number == 10) {
			info = "It is your birthday - Collect $10 from each player";
		}
		if (number == 11) {
			info = "Life insurance matures – Collect $100";
			player.addToWallet(100);
		}
		if (number == 12) {
			info = "Pay hospital fees of $100";
			player.addToWallet(-100);
		}
		if (number == 13) {
			info = "Pay school fees of $150";
			player.addToWallet(-150);
		}
		if (number == 14) {
			info = "Receive $25 consultancy fee";
			player.addToWallet(25);
		}
		if (number == 15) {
			info = "You are assessed for street repairs – $40 per house – $115 per hotel";
		}
		if (number == 16) {
			info = "You inherit $100";
			player.addToWallet(100);
		}
		// if (number == 17) {
		// info = "You have won second prize in a beauty contest – Collect $10 ";
		// player.addToWallet(10);
		// }
	}
}
