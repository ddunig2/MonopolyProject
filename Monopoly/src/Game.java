import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;

public class Game {
	private boolean endgame;
	private static final int MAX_NUMBER_PLAYERS = 8;
	Board board;
	Die d2;
	Cards card = new Cards();
	RobotPlayer[] playerArray = new RobotPlayer[MAX_NUMBER_PLAYERS];
	Square[] squ = new Square[40];
	MonopolyGUI hi;
	private int amountOfP;

	public void createGame() {
		board = new Board();
		d2 = new Die();
		String players = JOptionPane.showInputDialog("Enter the amount of players 1-8");
		amountOfP = Integer.parseInt(players);
		for (int i = 0; i < amountOfP; i++) {
			playerArray[i] = new RobotPlayer("player " + (1 + i), 20000);
		}
		hi = new MonopolyGUI();

	}

	public void playGame() {
		while (endgame == false) {
			playersTakingTurns();
		}
	}

	private void calculateWinner() {

		int plyersremaning;
		plyersremaning = amountOfP;
		for (int i = 0; i < amountOfP; i++) {
			if (playerArray[i].isOut) {
				plyersremaning--;
			}
		}
		if (plyersremaning == 1) {
			for (int i = 0; i < amountOfP; i++) {
				if (!playerArray[i].isOut) {
					RobotPlayer winner = playerArray[i];
					System.out.println("Winner is " + winner.getName());
				}
			}
			endgame = true;
		}
	}

	private void playersTakingTurns() {
		for (int i = 0; i < amountOfP; i++) {
			
			if (endgame == false) {
				int initialPp;
				initialPp = playerArray[i].getCurrentPosition();
				if (playerArray[i].isOut) {
					System.out.println("\n" + playerArray[i].getName() + " is out.");
					for (int j = 0; j < squ.length; j++) {
						if (board.square(j).getOwner() == playerArray[i]) {
							board.square(j).unOwned();
						}
					}
					board.updateSquares(d2.getSum());

				} else if (playerArray[i].getLosingTurns() > 0) {
					playerArray[i].setLosingTurns(playerArray[i].getLosingTurns() - 1);
				} else {

					playerArray[i].takeTurn(d2, board);
					int newPp;
					newPp = playerArray[i].getCurrentPosition()+1;
					for (int j = initialPp; j < newPp; j++) {
						hi.sqPanel[j][0].setBackground(Color.GRAY);
						pause(100);
						hi.sqPanel[j][0].setBackground(new Color(127, 255, 212));
					}
					hi.sqPanel[newPp-1][0].setBackground(Color.GRAY);
					pause(2000);
					hi.sqPanel[newPp-1][0].setBackground(new Color(127, 255, 212));
					didPlayerPassGo(i);
					board.updateSquares(d2.getSum());
					narate(i);
					CheckMovements(i);
					checkPropertyOwnership(i);
				}
				calculateWinner();
			} else {
				break;
			}
		}
	}

	private void CheckMovements(int i) {
		// Chance
		Square currentSquare;
		int playersPosition;
		playersPosition = playerArray[i].getCurrentPosition();
		currentSquare = board.square(playersPosition);
		if (playersPosition == 7 || playersPosition == 22 || playersPosition == 36) {
			board.cards().Shuffle();
			board.cards().getChance(playerArray[i], board);
			int card = board.cards().getNumber();
			System.out.println(board.cards().getCardInfo());
			if (card == 4) {
				d2.roll();
				currentSquare.setRentPrice(d2.getSum() * 10);
			} else if (card == 5 && currentSquare.isOwned() && currentSquare.getOwner() != playerArray[i]) {
				board.moneyTransfer(currentSquare.getOwner(), playerArray[i], currentSquare.getRent());
				System.out.println("You just paid " + currentSquare.getOwner().getName() + ", "
						+ currentSquare.getRent() + " dollars for landing on their property");
			} else if (card == 10) {
				int amountOfHouses = 0;
				int amountOfHotels = 0;
				int amountToDeduct;
				for (int j = 0; j < 40; j++) {
					if (board.square(j).isOwned() && board.square(j).getOwner() == playerArray[i]) {
						amountOfHouses += board.square(j).getHouses();
						amountOfHotels += board.square(j).getHotel();
						amountToDeduct = (amountOfHouses * 25) + (amountOfHotels * 100);
						playerArray[i].addToWallet(-amountToDeduct);
					}
				}

			}
			if (card == 14) {
				for (int j = 0; j < amountOfP; j++) {
					if (j != i && !playerArray[j].isOut) {
						System.out.println(playerArray[i].getName() + " will pay " + playerArray[j].getName() + " $50");
						board.moneyTransfer(playerArray[j], playerArray[i], 50);
					}
				}
			}
			// community chest
		} else if (playersPosition == 2 || playersPosition == 17 || playersPosition == 33) {
			board.cards().Shuffle();
			board.cards().getCommunityChest(playerArray[i], board);
			int card = board.cards().getNumber();
			System.out.println(board.cards().getCardInfo());
			if (card == 7) {
				for (int j = 0; j < amountOfP; j++) {
					if (j != i && !playerArray[j].isOut) {
						System.out.println(playerArray[j].getName() + " will pay " + playerArray[i].getName() + " $50");
						board.moneyTransfer(playerArray[i], playerArray[j], 50);
					}
				}

			} else if (card == 10) {
				for (int j = 0; j < amountOfP; j++) {
					if (j != i && !playerArray[j].isOut) {
						System.out.println(playerArray[j].getName() + " will pay " + playerArray[i].getName() + " $10");
						board.moneyTransfer(playerArray[i], playerArray[j], 10);
					}
				}

			} else if (card == 15) {
				int amountOfHouses = 0;
				int amountOfHotels = 0;
				int amountToDeduct;
				for (int j = 0; j < 40; j++) {
					if (board.square(j).isOwned() && board.square(j).getOwner() == playerArray[i]) {
						amountOfHouses += board.square(j).getHouses();
						amountOfHotels += board.square(j).getHotel();
						amountToDeduct = (amountOfHouses * 40) + (amountOfHotels * 115);
						playerArray[i].addToWallet(-amountToDeduct);
					}
				}
			}
		}

		checkPropertyOwnership(i);
		narate(i);
	}

	private void checkPropertyOwnership(int i) {
		int playerPosition;
		Square currentSquare;
		//JPanel curentPanel;
		JLabel currentOwner;
		playerPosition = playerArray[i].getCurrentPosition();
		currentSquare = board.square(playerPosition);
		//curentPanel = hi.sqPanel[playerPosition][0];
		currentOwner = hi.owner[playerPosition];

		if (playerPosition == 10) {
			playerArray[i].setLosingTurns(1);
		} else if (playerPosition == 30) {
			playerArray[i].setLosingTurns(3);
		} else if ((currentSquare.isHouseSquares() || currentSquare.isRailroads() || currentSquare.isUtilities())
				&& currentSquare.isOwned() == false) {
			System.out.println("This is not owned");
			board.purchaseProperty(playerArray[i], currentSquare);
		} else if (currentSquare.isOwned() && currentSquare.getOwner() == playerArray[i]) {
			System.out.println("You own this property");
			// pause(2000);
			currentOwner.setText(playerArray[i].getName());
			// pause(250);
			// hi.panel.setBackground(new Color(127, 255, 212));
		} else if (currentSquare.isOwned() && currentSquare.getOwner() != playerArray[i]) {
			board.payRent(currentSquare.getOwner(), playerArray[i], currentSquare);
		} else if (playerPosition == 2) {

		} else if (playerPosition == 4) {
			board.payTax(playerArray[i], 200);

		} else if (playerPosition == 38) {
			board.payTax(playerArray[i], 150);

		} else if (playerPosition == 20) {

		}
		upgradeProperties(i);
	}

	private void didPlayerPassGo(int i) {
		if (playerArray[i].PassGo(board)) {
			System.out.println("This player just passed go");
			playerArray[i].addToWallet(200);
		}
	}

	private void narate(int player) {
		System.out.println("Die 1: " + d2.getFirstValue() + " \nDie 2: " + d2.getSecondValue() + " \nNew position: "
				+ playerArray[player].getCurrentPosition() + " "
				+ board.square(playerArray[player].getCurrentPosition()).getName() + " \nTotal money: "
				+ playerArray[player].getWallet());
		if ((board.square(playerArray[player].getCurrentPosition()).isHouseSquares()
				|| board.square(playerArray[player].getCurrentPosition()).isRailroads()
				|| board.square(playerArray[player].getCurrentPosition()).isUtilities())) {
			System.out.println("Square rent price: " + board.square(playerArray[player].getCurrentPosition()).getRent()
					+ "\nSquare purchase price: "
					+ board.square(playerArray[player].getCurrentPosition()).getPurchasePrice());
		} else if (playerArray[player].getCurrentPosition() == 10) {
			System.out.println("You are visiting jail, you will lose a turn");
		}
		// income tax
		else if (playerArray[player].getCurrentPosition() == 4) {
			System.out.println("You have to pay taxes");
		}
		// luxury tax
		else if (playerArray[player].getCurrentPosition() == 38) {
			System.out.println("You have to pay luxury tax");
		}
		// Go to jail
		else if (playerArray[player].getCurrentPosition() == 30) {
			System.out.println("You are in jail, you will lose three turn");
		}

	}

	private void upgradeProperties(int i) {
		for (int j = 0; j < 40; j++) {
			if (board.square(j).isHouseSquares()) {
				if (board.square(j).getOwner() == playerArray[i]) {
					if (board.square(j).canBuyHouses() && board.square(j).getHouses() == 0) {
						board.purchaseBuildings(playerArray[i], board.square(j));
						hi.HH[j][0].setBackground(Color.BLUE);
						// pause(10000000);
					}
					if (board.square(j).canBuyTwoHouses() && board.square(j).getHouses() < 2) {
						board.purchaseBuildings(playerArray[i], board.square(j));
						hi.HH[j][1].setBackground(Color.BLUE);
					}
					if (board.square(j).canBuyThreeHouses() && board.square(j).getHouses() < 3) {
						board.purchaseBuildings(playerArray[i], board.square(j));
						hi.HH[j][2].setBackground(Color.BLUE);
					}
					if (board.square(j).canBuyFourHouses() && board.square(j).getHouses() < 4) {
						board.purchaseBuildings(playerArray[i], board.square(j));
						hi.HH[j][3].setBackground(Color.BLUE);
					}
					if (board.square(j).canBuyHotel() && board.square(j).getHotel() < 1) {
						board.purchaseBuildings(playerArray[i], board.square(j));
						hi.HH[j][4].setBackground(Color.BLUE);
					}

				}
			}

		}

	}

	public static void pause(int millis) {
		try {
			Thread.sleep(millis);

		} catch (Exception e) {

		}

	}

}
