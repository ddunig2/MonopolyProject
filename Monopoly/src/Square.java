
public class Square {
	private String name;
	private int purchasePrice;
	private int rentPrice;
	private int squareNumber;
	public boolean owned;
	private boolean abilityToBuyHouses;
	RobotPlayer owner;
	private int oneHouseRent;
	private int twoHousesRent;
	private int threeHousesRent;
	private int fourHousesRent;
	private int hotelRent;
	int ownTwoRrRentPrice = 50;
	int ownThreeRrRentPrice = 100;
	private int hotel = 0;
	private int houses = 0;
	private int mortgage;
	private int buildingCost;
	private int monopolyRent;
	private int ownAllRr;
	private boolean utilities;
	private boolean Railroads;
	private boolean houseSquares;
	boolean TwoOwned;
	boolean ThreeOwned;
	boolean allOwned;
	boolean canBuyTwoHouses;
	boolean canBuyThreeHouses;
	boolean canBuyFourHouses;
	boolean canBuyHotel;
	private int taxMoney;

	public Square(int squarenumber) {
		squareNumber = squarenumber;
		setStartValues();
		monopolyRent = rentPrice * 2;

	}

	public int getIndex() {
		return squareNumber;
	}

	public String getName() {
		return name;
	}

	public void setRentPrice(int value) {
		rentPrice = value;
	}

	public void RailRoadsOwned(int howMany) {
		if (howMany == 2) {
			TwoOwned = true;
		} else if (howMany == 3) {
			ThreeOwned = true;
		} else if (howMany == 4) {
			allOwned = true;
		}
	}

	public void updateRent() {
		if (houseSquares) {
			if (abilityToBuyHouses) {
				rentPrice = monopolyRent;
			}
			if (houses == 1) {
				rentPrice = oneHouseRent;
			}
			if (houses == 2) {
				rentPrice = twoHousesRent;
			}
			if (houses == 3) {
				rentPrice = threeHousesRent;
			}
			if (houses == 4) {
				rentPrice = fourHousesRent;
			}
			if (hotel == 1) {
				rentPrice = hotelRent;
			}
		}
		if (Railroads) {
			if (TwoOwned) {
				rentPrice = ownTwoRrRentPrice;
			}
			if (ThreeOwned) {
				rentPrice = ownThreeRrRentPrice;
			}
			if (allOwned) {
				rentPrice = ownAllRr;
			}
		}

	}

	public int getRent() {
		return rentPrice;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}

	public boolean isOwned() {
		if (owner != null) {
			return true;
		}
		return false;
	}

	public void setOwner(RobotPlayer player) {
		owner = player;
	}

	public void unOwned() {
		owner = null;
	}

	public RobotPlayer getOwner() {
		return owner;
	}

	public boolean canBuyHouses() {
		return abilityToBuyHouses;
	}

	public void setAbilitytoBuyHouses(boolean canBuy) {
		abilityToBuyHouses = canBuy;
	}

	public void setAbilityToBuyTwoHouses(boolean twoHouses) {
		canBuyTwoHouses = twoHouses;
	}

	public void setAbilityToBuyThreeHouses(boolean threeHouses) {
		canBuyThreeHouses = threeHouses;
	}

	public void setAbilityToBuyFourHouses(boolean fourHouses) {
		canBuyFourHouses = fourHouses;
	}

	public void setAbilityToBuyHotel(boolean hotel) {
		canBuyHotel = hotel;
	}

	public void buyHouses(int amountOfHouses) {
		houses += amountOfHouses;
	}

	public void buyHotel(int amountOfHotels) {
		hotel += amountOfHotels;
	}

	public int getHouses() {
		return houses;
	}

	public int getHotel() {
		return hotel;
	}

	public int getMortgage() {
		return mortgage;
	}

	public int getOneHouseRent() {
		return oneHouseRent;
	}

	public int getTwoHousesRent() {
		return twoHousesRent;
	}

	public int getThreeHousesRent() {
		return threeHousesRent;
	}

	public int getFourHousesRent() {
		return fourHousesRent;
	}

	public int getHotelRent() {
		return hotelRent;
	}

	public int getBuildingCost() {
		return buildingCost;
	}

	public int getMonopolyRent() {
		return monopolyRent;
	}

	public int getOwnAllRr() {
		return ownAllRr;
	}

	public boolean canBuyTwoHouses() {
		return canBuyTwoHouses;
	}

	public boolean canBuyThreeHouses() {
		return canBuyThreeHouses;
	}

	public boolean canBuyFourHouses() {
		return canBuyFourHouses;
	}

	public boolean canBuyHotel() {
		return canBuyHotel;
	}

	public boolean isUtilities() {
		return utilities;
	}

	public boolean isRailroads() {
		return Railroads;
	}

	public boolean isHouseSquares() {
		return houseSquares;
	}

	public int CollectedTax() {
		return taxMoney;
	}

	public void addToTax(int amount) {
		taxMoney += amount;
	}

	// -------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------
	// --------------------------------------------------------------------------------------
	// set value all squares begin with
	private void setStartValues() {
		// Properties
		if (squareNumber == 1 || squareNumber == 3 || squareNumber == 6 || squareNumber == 8 || squareNumber == 9) {
			houseSquares = true;
			buildingCost = 50;
			if (squareNumber == 1 || squareNumber == 3) {
				purchasePrice = 60;
				mortgage = 30;
				rentPrice = squareNumber + 1;
				if (squareNumber == 1) {
					name = "Mediterranean Avenue";
					oneHouseRent = 10;
					hotelRent = 250;
				}
				if (squareNumber == 3) {
					name = "Baltic Avenue";
					oneHouseRent = 20;
					hotelRent = 450;
				}
				twoHousesRent = oneHouseRent * 3;
				threeHousesRent = twoHousesRent * 3;
				fourHousesRent = oneHouseRent * 16;
			}
			if (squareNumber == 6 || squareNumber == 8) {
				purchasePrice = 100;
				rentPrice = 6;
				oneHouseRent = 30;
				twoHousesRent = 90;
				threeHousesRent = 270;
				fourHousesRent = 400;
				hotelRent = 550;
				mortgage = 50;
				if (squareNumber == 6) {
					name = "Oriental Avenue";
				}
				if (squareNumber == 8) {
					name = "Vermont Avenue";
				}
			}
			if (squareNumber == 9) {
				name = "Connecticut Avenue";
				purchasePrice = 120;
				rentPrice = 8;
				oneHouseRent = 40;
				twoHousesRent = 100;
				threeHousesRent = 300;
				fourHousesRent = 450;
				hotelRent = 600;
				mortgage = 60;
			}
		}
		if (squareNumber == 11 || squareNumber == 13 || squareNumber == 14 || squareNumber == 16 || squareNumber == 18
				|| squareNumber == 19) {
			houseSquares = true;
			buildingCost = 100;
			if (squareNumber == 11 || squareNumber == 13) {
				purchasePrice = 140;
				rentPrice = 10;
				oneHouseRent = 50;
				twoHousesRent = 150;
				threeHousesRent = 450;
				fourHousesRent = 625;
				hotelRent = 750;
				mortgage = 70;
				if (squareNumber == 11) {
					name = "St. Charles Place";
				}
				if (squareNumber == 13) {
					name = "State Avenue";
				}
			}
			if (squareNumber == 14) {
				name = "Virginia Avenue";
				purchasePrice = 160;
				rentPrice = 12;
				oneHouseRent = 60;
				twoHousesRent = 180;
				threeHousesRent = 500;
				fourHousesRent = 700;
				hotelRent = 900;
				mortgage = 80;
			}
			if (squareNumber == 16 || squareNumber == 18) {
				purchasePrice = 180;
				rentPrice = 14;
				oneHouseRent = 70;
				twoHousesRent = 200;
				threeHousesRent = 550;
				fourHousesRent = 750;
				hotelRent = 950;
				mortgage = 90;
				if (squareNumber == 16) {
					name = "St. James Place";
				}
				if (squareNumber == 18) {
					name = "Tennessee Avenue";
				}
			}
			if (squareNumber == 19) {
				name = "New York Avenue";
				purchasePrice = 200;
				rentPrice = 16;
				oneHouseRent = 80;
				twoHousesRent = 220;
				threeHousesRent = 600;
				fourHousesRent = 800;
				hotelRent = 1000;
				mortgage = 100;
			}
		}
		if (squareNumber == 21 || squareNumber == 23 || squareNumber == 24 || squareNumber == 26 || squareNumber == 27
				|| squareNumber == 29) {
			houseSquares = true;
			buildingCost = 150;
			if (squareNumber == 21 || squareNumber == 23) {
				purchasePrice = 220;
				rentPrice = 18;
				oneHouseRent = 90;
				twoHousesRent = 250;
				threeHousesRent = 700;
				fourHousesRent = 875;
				hotelRent = 1050;
				mortgage = 110;
				if (squareNumber == 21) {
					name = "Kentucky Avenue";
				}
				if (squareNumber == 23) {
					name = "Indiana Avenue";
				}
			}
			if (squareNumber == 24) {
				name = "Illinois Avenue";
				purchasePrice = 240;
				rentPrice = 20;
				oneHouseRent = 100;
				twoHousesRent = 300;
				threeHousesRent = 750;
				fourHousesRent = 925;
				hotelRent = 1100;
				mortgage = 120;
			}
			if (squareNumber == 26 || squareNumber == 27) {
				purchasePrice = 260;
				rentPrice = 22;
				oneHouseRent = 110;
				twoHousesRent = 330;
				threeHousesRent = 800;
				fourHousesRent = 975;
				hotelRent = 1150;
				mortgage = 130;
				if (squareNumber == 26) {
					name = "Atlantic Avenue";
				}
				if (squareNumber == 27) {
					name = "Ventnor Avenue";
				}
			}
			if (squareNumber == 29) {
				name = "Marvin Gardens";
				purchasePrice = 280;
				rentPrice = 24;
				oneHouseRent = 120;
				twoHousesRent = 360;
				threeHousesRent = 850;
				fourHousesRent = 1025;
				hotelRent = 1200;
				mortgage = 140;
			}
		}

		if (squareNumber == 31 || squareNumber == 32 || squareNumber == 34 || squareNumber == 37
				|| squareNumber == 39) {
			houseSquares = true;
			buildingCost = 200;
			if (squareNumber == 31 || squareNumber == 32) {
				purchasePrice = 300;
				rentPrice = 26;
				oneHouseRent = 130;
				twoHousesRent = 390;
				threeHousesRent = 900;
				fourHousesRent = 1100;
				hotelRent = 1275;
				mortgage = 150;
				if (squareNumber == 31) {
					name = "Pacific Avevue";
				}
				if (squareNumber == 32) {
					name = "North Carolina Avenue";
				}
			}
			if (squareNumber == 34) {
				name = "Pennsylvania Avenue";
				purchasePrice = 320;
				rentPrice = 28;
				oneHouseRent = 150;
				twoHousesRent = 450;
				threeHousesRent = 1000;
				fourHousesRent = 1200;
				hotelRent = 1400;
				mortgage = 160;
			}
			if (squareNumber == 37) {
				name = "Park Place";
				purchasePrice = 350;
				rentPrice = 35;
				oneHouseRent = 175;
				twoHousesRent = 500;
				threeHousesRent = 1100;
				fourHousesRent = 1300;
				hotelRent = 1500;
				mortgage = 175;
			}
			if (squareNumber == 39) {
				name = "Boardwalk";
				purchasePrice = 400;
				rentPrice = 50;
				oneHouseRent = 200;
				twoHousesRent = 600;
				threeHousesRent = 1400;
				fourHousesRent = 1700;
				hotelRent = 2000;
				mortgage = 200;
			}
		}
		// Railroads
		if (squareNumber == 5 || squareNumber == 15 || squareNumber == 25 || squareNumber == 35) {
			Railroads = true;
			purchasePrice = 200;
			rentPrice = 25;
			ownTwoRrRentPrice = 50;
			ownThreeRrRentPrice = 100;
			ownAllRr = 200;
			mortgage = 100;
			if (squareNumber == 5) {
				name = "Reading Railroad";
			}
			if (squareNumber == 15) {
				name = "Pennsylvania Railroad";
			}
			if (squareNumber == 25) {
				name = "B & O Railroad";
			}
			if (squareNumber == 35) {
				name = "Short Line";
			}
		}
		// Utilities
		if (squareNumber == 12 || squareNumber == 28) {
			utilities = true;
			purchasePrice = 150;
			rentPrice = 4;
			monopolyRent = 10;
			mortgage = 75;
			if (squareNumber == 12) {
				name = "Electric Company";
			}
			if (squareNumber == 28) {
				name = "Water Works";
			}
		}
		// not done but opening for testing purposes
		if (squareNumber == 2 || squareNumber == 17 || squareNumber == 33) {
			name = "Community Chest";
		}
		if (squareNumber == 7 || squareNumber == 22 || squareNumber == 36) {
			name = "Chance";
		}
		if (squareNumber == 0) {
			name = "Go";
		}
		if (squareNumber == 4) {
			name = "Income Tax";
		}
		if (squareNumber == 10) {
			name = "Jail";
		}
		if (squareNumber == 20) {
			name = "Free Parking";
			taxMoney = 0;
		}
		if (squareNumber == 30) {
			name = "GO To Jail";
		}
		if (squareNumber == 38) {
			name = "Luxury Tax";
		}
	}
}
