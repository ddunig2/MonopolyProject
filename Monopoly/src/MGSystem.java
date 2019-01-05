
public class MGSystem {
	Game game;
	public static void main(String[] arg) {
		MGSystem mg = new MGSystem();
		mg.createGame();
		mg.playGame();
	}

	public MGSystem() {
		game = new Game();

	}

	public void createGame() {
		game.createGame();
		
	}

	public void playGame() {
		game.playGame();

	}
}