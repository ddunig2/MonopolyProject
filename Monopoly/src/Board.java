
//import java.util.ArrayList;
//import java.util.List;
public class Board {
	int currentPlayerP;
	private static final int SIZE = 40;
	Square[] sq = new Square[SIZE];
	Cards crds = new Cards();
	private boolean monopolyBr;
	private boolean monopolyBl;
	private boolean monopolyLb;
	private boolean monopolyP;
	private boolean monopolyO;
	private boolean monopolyR;
	private boolean monopolyY;
	private boolean monopolyG;

	// RobotPlayer lu, mike; // = new RobotPlayer("lu", 0);
	// private List<Space> spaces;
	public Board() {
		buildSquares();
	}

	private void buildSquares() {
		for (int i = 0; i < sq.length; i++) {
			sq[i] = new Square(i);
		}
	}

	public Square square(int squareNumer) {
		return sq[squareNumer];
	}

	public Cards cards() {
		return crds;
	}

	public int move(int currentPlayerP, int dieFv) {
		currentPlayerP = (currentPlayerP + dieFv) % Board.SIZE;
		return currentPlayerP;
	}

	public boolean passGo(int passgoCounter) {
		if (passgoCounter > 39) {
			return true;
		}
		return false;
	}

	public void moneyTransfer(RobotPlayer recievingPlayer, RobotPlayer payingPlayer, int amount) {
		if (payingPlayer.getWallet() < amount) {
			System.out.println("insuficient fund");
		} else {
			payingPlayer.addToWallet(-amount);
			recievingPlayer.addToWallet(amount);
		}
	}

	public void payRent(RobotPlayer recievingPlayer, RobotPlayer payingPlayer, Square sq) {
		if (payingPlayer.getWallet() < sq.getRent()) {
			System.out.println("Can not afford to pay rent, you will be removed from the game");
			removePlayer(payingPlayer);
		} else {
			System.out.println("You just paid " + recievingPlayer.getName() + ", " + sq.getRent()
					+ " dollars for landing on their property");
			moneyTransfer(recievingPlayer, payingPlayer, sq.getRent());
		}
	}

	public void purchaseProperty(RobotPlayer buyingPlayer, Square square) {
		if (buyingPlayer.getWallet() < square.getPurchasePrice()) {
			System.out.println("Sorry, not enough funds to buy this property");
		} else {
			System.out.println("You now own this property");
			buyingPlayer.addToWallet(-square.getPurchasePrice());
			square.setOwner(buyingPlayer);
		}
	}

	public void purchaseBuildings(RobotPlayer buyingPlayer, Square square) {
		if (buyingPlayer.getWallet() < square.getBuildingCost()) {
			System.out.println("Sorry, you are unable to buy buildings");
		} else if (square.getHouses() < 4) {
			buyingPlayer.addToWallet(-square.getBuildingCost());
			square.buyHouses(1);
			System.out.println("this player just bought a house on " + square.getName());
		} else if (square.getHouses() == 4) {
			buyingPlayer.addToWallet(-square.getBuildingCost());
			square.buyHotel(1);
			System.out.println("this player just bought a hotel on " + square.getName());
		} else if (square.getHotel() == 1) {

		}
	}

	public void payTax(RobotPlayer player, int amountOfTax) {
		if (player.getWallet() < amountOfTax) {
			System.out.println("Can not afford to pay rent, you will be removed from the game");
			removePlayer(player);
		} else {
			player.addToWallet(-amountOfTax);
			sq[20].addToTax(amountOfTax);
		}
	}

	private void removePlayer(RobotPlayer Player) {
		Player.setInorOut(true);
	}

	// updating square rent, house and hotel
	// --------------------------------------------------------------------------------------
	public void updateSquares(int dv) {
		if ((sq[1].isOwned() && sq[3].isOwned()) && (sq[1].getOwner() == sq[3].getOwner())) {
			monopolyBr = true;
			sq[1].setAbilitytoBuyHouses(true);
			sq[3].setAbilitytoBuyHouses(true);
			if (sq[1].getHouses() == 1 && sq[3].getHouses() == 1) {
				sq[1].setAbilityToBuyTwoHouses(true);
				sq[3].setAbilityToBuyTwoHouses(true);
			}
			if (sq[1].getHouses() == 2 && sq[3].getHouses() == 2) {
				sq[1].setAbilityToBuyThreeHouses(true);
				sq[3].setAbilityToBuyThreeHouses(true);
			}
			if (sq[1].getHouses() == 3 && sq[3].getHouses() == 3) {
				sq[1].setAbilityToBuyFourHouses(true);
				sq[3].setAbilityToBuyFourHouses(true);
			}
			if (sq[1].getHouses() == 4 && sq[3].getHouses() == 4) {
				sq[1].setAbilityToBuyHotel(true);
				sq[3].setAbilityToBuyHotel(true);
			}

		} else {
			monopolyBr = false;
		}
		if ((sq[6].isOwned() && sq[8].isOwned() && sq[9].isOwned())
				&& (sq[6].getOwner() == sq[8].getOwner() && sq[6].getOwner() == sq[9].getOwner())) {
			monopolyLb = true;
			sq[6].setAbilitytoBuyHouses(true);
			sq[8].setAbilitytoBuyHouses(true);
			sq[9].setAbilitytoBuyHouses(true);
			if (sq[6].getHouses() == 1 && sq[8].getHouses() == 1 && sq[9].getHouses() == 1) {
				sq[6].setAbilityToBuyTwoHouses(true);
				sq[8].setAbilityToBuyTwoHouses(true);
				sq[9].setAbilityToBuyTwoHouses(true);
			}
			if (sq[6].getHouses() == 2 && sq[8].getHouses() == 2 && sq[9].getHouses() == 2) {
				sq[6].setAbilityToBuyThreeHouses(true);
				sq[8].setAbilityToBuyThreeHouses(true);
				sq[9].setAbilityToBuyThreeHouses(true);
			}
			if (sq[6].getHouses() == 3 && sq[8].getHouses() == 3 && sq[9].getHouses() == 3) {
				sq[6].setAbilityToBuyFourHouses(true);
				sq[8].setAbilityToBuyFourHouses(true);
				sq[9].setAbilityToBuyFourHouses(true);
			}
			if (sq[6].getHouses() == 4 && sq[8].getHouses() == 4 && sq[9].getHouses() == 4) {
				sq[6].setAbilityToBuyHotel(true);
				sq[8].setAbilityToBuyHotel(true);
				sq[9].setAbilityToBuyHotel(true);
			}
		} else {
			monopolyLb = false;
		}
		if ((sq[11].isOwned() && sq[13].isOwned() && sq[14].isOwned())
				&& (sq[11].getOwner() == sq[13].getOwner() && sq[11].getOwner() == sq[14].getOwner())) {
			monopolyP = true;
			sq[11].setAbilitytoBuyHouses(true);
			sq[13].setAbilitytoBuyHouses(true);
			sq[14].setAbilitytoBuyHouses(true);
			if (sq[11].getHouses() == 1 && sq[13].getHouses() == 1 && sq[14].getHouses() == 1) {
				sq[11].setAbilityToBuyTwoHouses(true);
				sq[13].setAbilityToBuyTwoHouses(true);
				sq[14].setAbilityToBuyTwoHouses(true);
			}
			if (sq[11].getHouses() == 2 && sq[13].getHouses() == 2 && sq[14].getHouses() == 2) {
				sq[11].setAbilityToBuyThreeHouses(true);
				sq[13].setAbilityToBuyThreeHouses(true);
				sq[14].setAbilityToBuyThreeHouses(true);
			}
			if (sq[11].getHouses() == 3 && sq[13].getHouses() == 3 && sq[14].getHouses() == 3) {
				sq[11].setAbilityToBuyFourHouses(true);
				sq[13].setAbilityToBuyFourHouses(true);
				sq[14].setAbilityToBuyFourHouses(true);
			}
			if (sq[11].getHouses() == 4 && sq[13].getHouses() == 4 && sq[14].getHouses() == 4) {
				sq[11].setAbilityToBuyHotel(true);
				sq[13].setAbilityToBuyHotel(true);
				sq[14].setAbilityToBuyHotel(true);
			}
		} else {
			monopolyP = false;
		}
		if ((sq[16].isOwned() && sq[18].isOwned() && sq[19].isOwned())
				&& (sq[16].getOwner() == sq[18].getOwner() && sq[16].getOwner() == sq[19].getOwner())) {
			monopolyO = true;
			sq[16].setAbilitytoBuyHouses(true);
			sq[18].setAbilitytoBuyHouses(true);
			sq[19].setAbilitytoBuyHouses(true);
			if (sq[16].getHouses() == 1 && sq[18].getHouses() == 1 && sq[19].getHouses() == 1) {
				sq[16].setAbilityToBuyTwoHouses(true);
				sq[18].setAbilityToBuyTwoHouses(true);
				sq[19].setAbilityToBuyTwoHouses(true);
			}
			if (sq[16].getHouses() == 2 && sq[18].getHouses() == 2 && sq[19].getHouses() == 2) {
				sq[16].setAbilityToBuyThreeHouses(true);
				sq[18].setAbilityToBuyThreeHouses(true);
				sq[19].setAbilityToBuyThreeHouses(true);
			}
			if (sq[16].getHouses() == 3 && sq[18].getHouses() == 3 && sq[19].getHouses() == 3) {
				sq[16].setAbilityToBuyFourHouses(true);
				sq[18].setAbilityToBuyFourHouses(true);
				sq[19].setAbilityToBuyFourHouses(true);
			}
			if (sq[16].getHouses() == 4 && sq[18].getHouses() == 4 && sq[19].getHouses() == 4) {
				sq[16].setAbilityToBuyHotel(true);
				sq[18].setAbilityToBuyHotel(true);
				sq[19].setAbilityToBuyHotel(true);
			}
		} else {
			monopolyO = false;
		}
		if ((sq[21].isOwned() && sq[23].isOwned() && sq[24].isOwned())
				&& (sq[21].getOwner() == sq[23].getOwner() && sq[21].getOwner() == sq[24].getOwner())) {
			monopolyR = true;
			sq[21].setAbilitytoBuyHouses(true);
			sq[23].setAbilitytoBuyHouses(true);
			sq[24].setAbilitytoBuyHouses(true);
			if (sq[21].getHouses() == 1 && sq[23].getHouses() == 1 && sq[24].getHouses() == 1) {
				sq[21].setAbilityToBuyTwoHouses(true);
				sq[23].setAbilityToBuyTwoHouses(true);
				sq[24].setAbilityToBuyTwoHouses(true);
			}
			if (sq[21].getHouses() == 2 && sq[23].getHouses() == 2 && sq[24].getHouses() == 2) {
				sq[21].setAbilityToBuyThreeHouses(true);
				sq[23].setAbilityToBuyThreeHouses(true);
				sq[24].setAbilityToBuyThreeHouses(true);
			}
			if (sq[21].getHouses() == 3 && sq[23].getHouses() == 3 && sq[24].getHouses() == 3) {
				sq[21].setAbilityToBuyFourHouses(true);
				sq[23].setAbilityToBuyFourHouses(true);
				sq[24].setAbilityToBuyFourHouses(true);
			}
			if (sq[21].getHouses() == 4 && sq[23].getHouses() == 4 && sq[24].getHouses() == 4) {
				sq[21].setAbilityToBuyHotel(true);
				sq[23].setAbilityToBuyHotel(true);
				sq[24].setAbilityToBuyHotel(true);
			}

		} else {
			monopolyR = false;
		}
		if ((sq[26].isOwned() && sq[28].isOwned() && sq[29].isOwned())
				&& (sq[26].getOwner() == sq[27].getOwner() && sq[26].getOwner() == sq[29].getOwner())) {
			monopolyY = true;
			sq[26].setAbilitytoBuyHouses(true);
			sq[27].setAbilitytoBuyHouses(true);
			sq[29].setAbilitytoBuyHouses(true);
			if (sq[26].getHouses() == 1 && sq[27].getHouses() == 1 && sq[29].getHouses() == 1) {
				sq[26].setAbilityToBuyTwoHouses(true);
				sq[27].setAbilityToBuyTwoHouses(true);
				sq[29].setAbilityToBuyTwoHouses(true);
			}
			if (sq[26].getHouses() == 2 && sq[27].getHouses() == 2 && sq[29].getHouses() == 2) {
				sq[26].setAbilityToBuyThreeHouses(true);
				sq[27].setAbilityToBuyThreeHouses(true);
				sq[29].setAbilityToBuyThreeHouses(true);
			}
			if (sq[26].getHouses() == 3 && sq[27].getHouses() == 3 && sq[29].getHouses() == 3) {
				sq[26].setAbilityToBuyFourHouses(true);
				sq[27].setAbilityToBuyFourHouses(true);
				sq[29].setAbilityToBuyFourHouses(true);
			}
			if (sq[26].getHouses() == 4 && sq[27].getHouses() == 4 && sq[29].getHouses() == 4) {
				sq[26].setAbilityToBuyHotel(true);
				sq[27].setAbilityToBuyHotel(true);
				sq[29].setAbilityToBuyHotel(true);
			}
		} else {
			monopolyY = false;
		}
		if ((sq[31].isOwned() && sq[32].isOwned() && sq[34].isOwned())
				&& (sq[31].getOwner() == sq[32].getOwner() && sq[31].getOwner() == sq[34].getOwner())) {
			monopolyG = true;
			sq[31].setAbilitytoBuyHouses(true);
			sq[32].setAbilitytoBuyHouses(true);
			sq[34].setAbilitytoBuyHouses(true);
			if (sq[31].getHouses() == 1 && sq[32].getHouses() == 1 && sq[34].getHouses() == 1) {
				sq[31].setAbilityToBuyTwoHouses(true);
				sq[32].setAbilityToBuyTwoHouses(true);
				sq[34].setAbilityToBuyTwoHouses(true);
			}
			if (sq[31].getHouses() == 2 && sq[32].getHouses() == 2 && sq[34].getHouses() == 2) {
				sq[31].setAbilityToBuyThreeHouses(true);
				sq[32].setAbilityToBuyThreeHouses(true);
				sq[34].setAbilityToBuyThreeHouses(true);
			}
			if (sq[31].getHouses() == 3 && sq[32].getHouses() == 3 && sq[34].getHouses() == 3) {
				sq[31].setAbilityToBuyFourHouses(true);
				sq[32].setAbilityToBuyFourHouses(true);
				sq[34].setAbilityToBuyFourHouses(true);
			}
			if (sq[31].getHouses() == 4 && sq[32].getHouses() == 4 && sq[34].getHouses() == 4) {
				sq[31].setAbilityToBuyHotel(true);
				sq[32].setAbilityToBuyHotel(true);
				sq[34].setAbilityToBuyHotel(true);
			}
		} else {
			monopolyG = false;
		}
		if ((sq[37].isOwned() && sq[39].isOwned()) && (sq[37].getOwner() == sq[39].getOwner())) {
			monopolyBl = true;
			sq[37].setAbilitytoBuyHouses(true);
			sq[39].setAbilitytoBuyHouses(true);
			if (sq[37].getHouses() == 1 && sq[39].getHouses() == 1) {
				sq[37].setAbilityToBuyTwoHouses(true);
				sq[39].setAbilityToBuyTwoHouses(true);
			}
			if (sq[37].getHouses() == 2 && sq[39].getHouses() == 2) {
				sq[37].setAbilityToBuyThreeHouses(true);
				sq[39].setAbilityToBuyThreeHouses(true);
			}
			if (sq[37].getHouses() == 3 && sq[39].getHouses() == 3) {
				sq[37].setAbilityToBuyFourHouses(true);
				sq[39].setAbilityToBuyFourHouses(true);
			}
			if (sq[37].getHouses() == 4 && sq[39].getHouses() == 4) {
				sq[37].setAbilityToBuyHotel(true);
				sq[39].setAbilityToBuyHotel(true);
			}
		} else {
			monopolyBl = false;
		}
		// if all railRoads are owned by the same player
		if (sq[5].getOwner() == sq[15].getOwner() && sq[25].getOwner() == sq[35].getOwner()
				&& sq[5].getOwner() == sq[35].getOwner() && sq[5].isOwned() && sq[15].isOwned() && sq[25].isOwned()
				&& sq[35].isOwned()) {
			sq[5].RailRoadsOwned(4);
			sq[15].RailRoadsOwned(4);
			sq[25].RailRoadsOwned(4);
			sq[35].RailRoadsOwned(4);
		}

		// if three railroads are owned by the same player
		if (sq[5].getOwner() == sq[15].getOwner() && sq[5].getOwner() == sq[25].getOwner() && sq[5].isOwned()
				&& sq[15].isOwned() && sq[25].isOwned()) {

			sq[5].RailRoadsOwned(3);
			sq[15].RailRoadsOwned(3);
			sq[25].RailRoadsOwned(3);
			sq[35].RailRoadsOwned(3);
		}
		if (sq[5].getOwner() == sq[15].getOwner() && sq[5].getOwner() == sq[35].getOwner() && sq[5].isOwned()
				&& sq[15].isOwned() && sq[35].isOwned()) {
			sq[5].RailRoadsOwned(3);
			sq[15].RailRoadsOwned(3);
			sq[25].RailRoadsOwned(3);
			sq[35].RailRoadsOwned(3);
		}
		if (sq[5].getOwner() == sq[25].getOwner() && sq[5].getOwner() == sq[35].getOwner() && sq[5].isOwned()
				&& sq[25].isOwned() && sq[35].isOwned()) {
			sq[5].RailRoadsOwned(3);
			sq[15].RailRoadsOwned(3);
			sq[25].RailRoadsOwned(3);
			sq[35].RailRoadsOwned(3);
		}
		if (sq[15].getOwner() == sq[25].getOwner() && sq[15].getOwner() == sq[35].getOwner() && sq[15].isOwned()
				&& sq[25].isOwned() && sq[35].isOwned()) {
			sq[5].RailRoadsOwned(3);
			sq[15].RailRoadsOwned(3);
			sq[25].RailRoadsOwned(3);
			sq[35].RailRoadsOwned(3);
		}
		// if two are owned
		if (sq[5].getOwner() == sq[15].getOwner() && sq[5].isOwned() && sq[15].isOwned()) {
			sq[5].RailRoadsOwned(2);
			sq[15].RailRoadsOwned(2);
		}
		if (sq[5].getOwner() == sq[25].getOwner() && sq[5].isOwned() && sq[25].isOwned()) {
			sq[5].RailRoadsOwned(2);
			sq[25].RailRoadsOwned(2);
		}
		if (sq[5].getOwner() == sq[35].getOwner() && sq[5].isOwned() && sq[35].isOwned()) {
			sq[5].RailRoadsOwned(2);
			sq[35].RailRoadsOwned(2);
		}
		if (sq[15].getOwner() == sq[25].getOwner() && sq[15].isOwned() && sq[25].isOwned()) {
			sq[15].RailRoadsOwned(2);
			sq[25].RailRoadsOwned(2);
		}
		if (sq[15].getOwner() == sq[35].getOwner() && sq[15].isOwned() && sq[35].isOwned()) {
			sq[15].RailRoadsOwned(2);
			sq[35].RailRoadsOwned(2);
		}
		if (sq[25].getOwner() == sq[35].getOwner() && sq[25].isOwned() && sq[35].isOwned()) {
			sq[25].RailRoadsOwned(2);
			sq[35].RailRoadsOwned(2);
		}
		// for utilities
		if (sq[12].isOwned() && sq[12].getOwner() == sq[28].getOwner()) {
			sq[12].setRentPrice(dv * 10);
			sq[28].setRentPrice(dv * 10);
		} else {
			sq[12].setRentPrice(dv * 4);
			sq[28].setRentPrice(dv * 4);
		}
		for (int i = 0; i < sq.length; i++) {
			sq[i].updateRent();
		}
	}
	// ----------------------------------------------------------------------------------

	public boolean monopolyBrown() {
		return monopolyBr;
	}

	public boolean monopolyLightBlue() {
		return monopolyLb;
	}

	public boolean monopolyRed() {
		return monopolyR;
	}

	public boolean monopolyYellow() {
		return monopolyY;
	}

	public boolean monopolyGreen() {
		return monopolyG;
	}

	public boolean monopolyBlue() {
		return monopolyBl;
	}

	public boolean monopolyPink() {
		return monopolyP;
	}

	public boolean monopolyOrange() {
		return monopolyO;
	}

	public int totalSpacesMoved(int currentPlayerP, int dieFv) {
		return currentPlayerP + dieFv;
	}

	public boolean isPrime(int currentPlayerP) {
		int[] prime = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37 };
		for (int i = 0; i < prime.length; i++) {
			if ((currentPlayerP) == prime[i]) {
				return true;
			}
		}
		return false;
	}

	// public String print() {
	// return "you";
	// }

	// public Space getSpace(Space start, int roll) {
	// int endIndex = ( start.getIndex() + roll ) % Board.SIZE;
	// return spaces.get(endIndex);
	// }
	//
	// public Space getStartSpace() {
	// return spaces.get(0);
	// }
	//
}
