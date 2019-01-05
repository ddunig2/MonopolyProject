import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

public class MonopolyGUI extends JFrame {

	// I do not know what the line bellow does but I was getting warning so I
	// included it.
	private static final long serialVersionUID = 1L;
	JPanel[][] sqPanel = new JPanel[40][2];
	JPanel[][] HH = new JPanel[40][5];
	JLabel[] owner = new JLabel[40];

	public MonopolyGUI() {
		createGUI();

		setSize(900, 900);
		setTitle("yuh");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void createGUI() {
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(127, 255, 212));
		panel.setBounds(0, 0, 785, 785);
		add(panel);
		panel.setLayout(null);

		for (int i = 0; i < HH.length; i++) {
			for (int j = 0; j < HH[i].length; j++) {
				HH[i][j] = new JPanel();
				HH[i][j].setBackground(Color.BLACK);
				if (i < 10) {
					if (j <= 3) {
						HH[i][j].setBounds((-j * 12) + 46, 20, 7, 7);
					} else {
						HH[i][j].setBounds(22, 30, 19, 7);
					}
				}
				if (i > 10 && i < 20) {
					if (j <= 3) {
						HH[i][j].setBounds(75, (-j * 12) + 46, 7, 7);
					} else {
						HH[i][j].setBounds(65, 22, 7, 19);
					}
				}
				if (i > 20 && i < 30) {
					if (j <= 3) {
						HH[i][j].setBounds((j * 12) + 10, 75, 7, 7);
					} else {
						HH[i][j].setBounds(22, 65, 19, 7);
					}
				}
				if (i > 30 && i <= 39) {
					if (j <= 3) {
						HH[i][j].setBounds(20, (j * 12) + 10, 7, 7);
					} else {
						HH[i][j].setBounds(30, 22, 7, 19);
					}
				}
			}
		}

		for (int i = 0; i < sqPanel.length; i++) {
			sqPanel[i][0] = new JPanel();
			sqPanel[i][0].setBorder(new LineBorder(new Color(0, 0, 0), 2));
			sqPanel[i][0].setBackground(new Color(127, 255, 212));
			sqPanel[i][0].setLayout(null);
			sqPanel[i][1] = new JPanel();
			sqPanel[i][1].setLayout(null);
			owner[i] = new JLabel();
			owner[i].setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 12));
			owner[i].setForeground(new Color(0, 0, 0));
			if (i < 10) {
				sqPanel[i][1].setBounds(2, 83, 61, 15);
				owner[i].setUI(new UpsideDownLabelUI());
				owner[i].setBounds(2, 2, 50, 12);
			}
			if (i > 10 && i < 20) {
				sqPanel[i][1].setBounds(2, 2, 15, 61);
				owner[i].setUI(new VerticalLabelUI(false));
				owner[i].setBounds(2, 2, 12, 50);
			}
			if (i > 20 && i < 30) {
				sqPanel[i][1].setBounds(2, 2, 61, 15);
				owner[i].setBounds(5, 2, 50, 12);
			}
			if (i > 30 && i <= 39) {
				sqPanel[i][1].setBounds(83, 2, 15, 61);
				owner[i].setUI(new VerticalLabelUI(true));
				owner[i].setBounds(2, 2, 12, 50);
			}
			panel.add(sqPanel[i][0]);
			if (i % 5 != 0 && i != 2 && i != 4 && i != 7 && i != 12 && i != 17 && i != 22 && i != 28 && i != 33
					&& i != 36 && i != 38) {
				for (int j = 0; j < HH[i].length; j++) {
					sqPanel[i][0].add(HH[i][j]);
					sqPanel[i][0].add(sqPanel[i][1]);
					sqPanel[i][1].add(owner[i]);
				}
			}
		}
		sqPanel[0][0].setBounds(0, 0, 100, 100);
		panel.add(sqPanel[0][0]);
		sqPanel[0][0].setLayout(null);

		sqPanel[1][0].setBounds(100, 0, 65, 100);
		panel.add(sqPanel[1][0]);

		sqPanel[1][1].setBackground(new Color(139, 69, 19));

		JLabel lblMediterranean = new JLabel("MEDITERRANEAN");
		lblMediterranean.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblMediterranean.setBounds(2, 71, 60, 10);
		lblMediterranean.setUI(new UpsideDownLabelUI());
		sqPanel[1][0].add(lblMediterranean);

		JLabel lblAvenue_12 = new JLabel("AVENUE");
		lblAvenue_12.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_12.setBounds(12, 61, 43, 10);
		lblAvenue_12.setUI(new UpsideDownLabelUI());
		sqPanel[1][0].add(lblAvenue_12);

		JLabel label = new JLabel("$60");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setBounds(24, 5, 21, 10);
		label.setUI(new UpsideDownLabelUI());
		sqPanel[1][0].add(label);

		sqPanel[2][0].setBounds(165, 0, 65, 100);
		panel.add(sqPanel[2][0]);

		sqPanel[3][0].setBounds(230, 0, 65, 100);
		panel.add(sqPanel[3][0]);

		sqPanel[3][1].setBackground(new Color(139, 69, 19));

		JLabel lblBaltic = new JLabel("BALTIC");
		lblBaltic.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblBaltic.setBounds(12, 71, 43, 10);
		lblBaltic.setUI(new UpsideDownLabelUI());
		sqPanel[3][0].add(lblBaltic);

		JLabel lblAvenue_13 = new JLabel("AVENUE");
		lblAvenue_13.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_13.setBounds(12, 61, 43, 10);
		lblAvenue_13.setUI(new UpsideDownLabelUI());
		sqPanel[3][0].add(lblAvenue_13);

		JLabel label_1 = new JLabel("$60");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_1.setBounds(24, 5, 21, 10);
		label_1.setUI(new UpsideDownLabelUI());
		sqPanel[3][0].add(label_1);

		sqPanel[4][0].setBounds(295, 0, 65, 100);

		sqPanel[5][0].setBounds(360, 0, 65, 100);

		sqPanel[6][0].setBounds(425, 0, 65, 100);

		sqPanel[6][1].setBackground(new Color(51, 204, 255));

		JLabel lblOriental = new JLabel("ORIENTAL");
		lblOriental.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblOriental.setBounds(4, 71, 56, 10);
		lblOriental.setUI(new UpsideDownLabelUI());
		sqPanel[6][0].add(lblOriental);

		JLabel lblAvenue_14 = new JLabel("AVENUE");
		lblAvenue_14.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_14.setBounds(12, 61, 43, 10);
		lblAvenue_14.setUI(new UpsideDownLabelUI());
		sqPanel[6][0].add(lblAvenue_14);

		JLabel label_2 = new JLabel("$100");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_2.setBounds(19, 5, 30, 10);
		label_2.setUI(new UpsideDownLabelUI());
		sqPanel[6][0].add(label_2);

		sqPanel[7][0].setBounds(490, 0, 65, 100);

		sqPanel[8][0].setBounds(555, 0, 65, 100);

		sqPanel[8][1].setBackground(new Color(51, 204, 255));

		JLabel lblVermont = new JLabel("VERMONT");
		lblVermont.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblVermont.setBounds(4, 71, 54, 10);
		lblVermont.setUI(new UpsideDownLabelUI());
		sqPanel[8][0].add(lblVermont);

		JLabel lblAvenue_15 = new JLabel("AVENUE");
		lblAvenue_15.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_15.setBounds(12, 61, 43, 10);
		lblAvenue_15.setUI(new UpsideDownLabelUI());
		sqPanel[8][0].add(lblAvenue_15);

		JLabel label_3 = new JLabel("$100");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_3.setBounds(19, 5, 30, 10);
		label_3.setUI(new UpsideDownLabelUI());
		sqPanel[8][0].add(label_3);

		sqPanel[9][0].setBounds(620, 0, 65, 100);

		sqPanel[9][1].setBackground(new Color(51, 204, 255));

		JLabel lblConnecticut = new JLabel("CONNECTICUT");
		lblConnecticut.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblConnecticut.setBounds(0, 71, 62, 10);
		lblConnecticut.setUI(new UpsideDownLabelUI());
		sqPanel[9][0].add(lblConnecticut);

		JLabel lblAvenue_16 = new JLabel("AVENUE");
		lblAvenue_16.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_16.setBounds(12, 61, 43, 10);
		lblAvenue_16.setUI(new UpsideDownLabelUI());
		sqPanel[9][0].add(lblAvenue_16);

		JLabel label_4 = new JLabel("$120");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_4.setBounds(19, 5, 30, 10);
		label_4.setUI(new UpsideDownLabelUI());
		sqPanel[9][0].add(label_4);

		sqPanel[10][0].setBounds(685, 0, 100, 100);

		sqPanel[11][0].setBounds(685, 100, 100, 65);

		sqPanel[11][1].setBackground(new Color(255, 20, 147));

		JLabel lblSt = new JLabel("ST.");
		lblSt.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSt.setBounds(19, 20, 10, 20);
		lblSt.setUI(new VerticalLabelUI(false));
		sqPanel[11][0].add(lblSt);

		JLabel lblCharles = new JLabel("CHARLES");
		lblCharles.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCharles.setBounds(29, 8, 10, 50);
		lblCharles.setUI(new VerticalLabelUI(false));
		sqPanel[11][0].add(lblCharles);

		JLabel lblPlace = new JLabel("PLACE");
		lblPlace.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPlace.setBounds(39, 8, 10, 43);
		lblPlace.setUI(new VerticalLabelUI(false));
		sqPanel[11][0].add(lblPlace);

		JLabel label_5 = new JLabel("$140");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_5.setBounds(85, 19, 10, 30);
		label_5.setUI(new VerticalLabelUI(false));
		sqPanel[11][0].add(label_5);

		sqPanel[12][0].setBounds(685, 165, 100, 65);

		sqPanel[13][0].setBounds(685, 230, 100, 65);

		sqPanel[13][1].setBackground(new Color(255, 20, 147));

		JLabel lblStates = new JLabel("STATES");
		lblStates.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblStates.setBounds(19, 12, 10, 43);
		lblStates.setUI(new VerticalLabelUI(false));
		sqPanel[13][0].add(lblStates);

		JLabel lblAvenue_8 = new JLabel("AVENUE");
		lblAvenue_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_8.setBounds(29, 12, 10, 43);
		lblAvenue_8.setUI(new VerticalLabelUI(false));
		sqPanel[13][0].add(lblAvenue_8);

		JLabel label_6 = new JLabel("$140");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_6.setBounds(85, 19, 10, 30);
		label_6.setUI(new VerticalLabelUI(false));
		sqPanel[13][0].add(label_6);

		sqPanel[14][0].setBounds(685, 295, 100, 65);

		sqPanel[14][1].setBackground(new Color(255, 20, 147));

		JLabel lblVirginia = new JLabel("VIRGINIA");
		lblVirginia.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblVirginia.setBounds(19, 4, 10, 56);
		lblVirginia.setUI(new VerticalLabelUI(false));
		sqPanel[14][0].add(lblVirginia);

		JLabel lblAvenue_7 = new JLabel("AVENUE");
		lblAvenue_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_7.setBounds(29, 12, 10, 43);
		lblAvenue_7.setUI(new VerticalLabelUI(false));
		sqPanel[14][0].add(lblAvenue_7);

		JLabel label_7 = new JLabel("$160");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_7.setBounds(85, 19, 10, 30);
		label_7.setUI(new VerticalLabelUI(false));
		sqPanel[14][0].add(label_7);

		sqPanel[15][0].setBounds(685, 360, 100, 65);

		sqPanel[16][0].setBounds(685, 425, 100, 65);

		sqPanel[16][1].setBackground(new Color(255, 127, 80));

		JLabel lblStJames = new JLabel("ST. JAMES");
		lblStJames.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblStJames.setBounds(19, 4, 10, 56);
		lblStJames.setUI(new VerticalLabelUI(false));
		sqPanel[16][0].add(lblStJames);

		JLabel lblPlace_1 = new JLabel("PLACE");
		lblPlace_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPlace_1.setBounds(29, 10, 10, 43);
		lblPlace_1.setUI(new VerticalLabelUI(false));
		sqPanel[16][0].add(lblPlace_1);

		JLabel label_8 = new JLabel("$180");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_8.setBounds(85, 19, 10, 30);
		label_8.setUI(new VerticalLabelUI(false));
		sqPanel[16][0].add(label_8);

		sqPanel[17][0].setBounds(685, 490, 100, 65);

		sqPanel[18][0].setBounds(685, 555, 100, 65);

		sqPanel[18][1].setBackground(new Color(255, 127, 80));

		JLabel lblTennessee = new JLabel("TENNESSEE");
		lblTennessee.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTennessee.setBounds(19, 4, 10, 58);
		lblTennessee.setUI(new VerticalLabelUI(false));
		sqPanel[18][0].add(lblTennessee);

		JLabel lblAvenue_6 = new JLabel("AVENUE");
		lblAvenue_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_6.setBounds(29, 12, 10, 43);
		lblAvenue_6.setUI(new VerticalLabelUI(false));
		sqPanel[18][0].add(lblAvenue_6);

		JLabel label_9 = new JLabel("$180");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_9.setBounds(85, 19, 10, 30);
		label_9.setUI(new VerticalLabelUI(false));
		sqPanel[18][0].add(label_9);

		sqPanel[19][0].setBounds(685, 620, 100, 65);

		sqPanel[19][1].setBackground(new Color(255, 140, 0));

		JLabel lblNewYork = new JLabel("NEW YORK");
		lblNewYork.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewYork.setBounds(19, 4, 10, 56);
		lblNewYork.setUI(new VerticalLabelUI(false));
		sqPanel[19][0].add(lblNewYork);

		JLabel lblAvenue_5 = new JLabel("AVENUE");
		lblAvenue_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_5.setBounds(29, 12, 10, 43);
		lblAvenue_5.setUI(new VerticalLabelUI(false));
		sqPanel[19][0].add(lblAvenue_5);

		JLabel label_10 = new JLabel("$200");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_10.setBounds(85, 19, 10, 30);
		label_10.setUI(new VerticalLabelUI(false));
		sqPanel[19][0].add(label_10);

		sqPanel[20][0].setBounds(685, 685, 100, 100);

		sqPanel[21][0].setBounds(620, 685, 65, 100);

		sqPanel[21][1].setBackground(Color.RED);
		
		JLabel lblKentucky = new JLabel("KENTUCKY");
		lblKentucky.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblKentucky.setBounds(4, 19, 58, 10);
		sqPanel[21][0].add(lblKentucky);

		JLabel lblAvenue_3 = new JLabel("AVENUE");
		lblAvenue_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_3.setBounds(12, 29, 43, 10);
		sqPanel[21][0].add(lblAvenue_3);

		JLabel label_21 = new JLabel("$220");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_21.setBounds(19, 85, 30, 10);
		sqPanel[21][0].add(label_21);

		sqPanel[22][0].setBounds(555, 685, 65, 100);

		sqPanel[23][0].setBounds(490, 685, 65, 100);

		sqPanel[23][1].setBackground(Color.RED);
		
		JLabel lblIndiana = new JLabel("INDIANA");
		lblIndiana.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblIndiana.setBounds(8, 19, 50, 10);
		sqPanel[23][0].add(lblIndiana);

		JLabel lblAvenue_4 = new JLabel("AVENUE");
		lblAvenue_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_4.setBounds(12, 29, 43, 10);
		sqPanel[23][0].add(lblAvenue_4);

		JLabel label_20 = new JLabel("$220");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_20.setBounds(19, 85, 30, 10);
		sqPanel[23][0].add(label_20);

		sqPanel[24][0].setBounds(425, 685, 65, 100);
		
		sqPanel[24][1].setBackground(Color.RED);
		

		JLabel lblIllinois = new JLabel("ILLINOIS");
		lblIllinois.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblIllinois.setBounds(8, 19, 50, 10);
		sqPanel[24][0].add(lblIllinois);

		JLabel lblAvenue_2 = new JLabel("AVENUE");
		lblAvenue_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_2.setBounds(12, 29, 43, 10);
		sqPanel[24][0].add(lblAvenue_2);

		JLabel label_19 = new JLabel("$240");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_19.setBounds(19, 85, 30, 10);
		sqPanel[24][0].add(label_19);

		sqPanel[25][0].setBounds(360, 685, 65, 100);

		sqPanel[26][0].setBounds(295, 685, 65, 100);

		sqPanel[26][1].setBackground(Color.YELLOW);
		
		JLabel lblAtlantic = new JLabel("ATLANTIC");
		lblAtlantic.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAtlantic.setBounds(4, 19, 58, 10);
		sqPanel[26][0].add(lblAtlantic);

		JLabel lblAvenue_1 = new JLabel("AVENUE");
		lblAvenue_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_1.setBounds(12, 29, 43, 10);
		sqPanel[26][0].add(lblAvenue_1);

		JLabel label_18 = new JLabel("$260");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_18.setBounds(19, 85, 30, 10);
		sqPanel[26][0].add(label_18);

		sqPanel[27][0].setBounds(230, 685, 65, 100);
		
		sqPanel[27][1].setBackground(Color.YELLOW);
		

		JLabel lblVetnor = new JLabel("VETNOR");
		lblVetnor.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblVetnor.setBounds(12, 19, 43, 10);
		sqPanel[27][0].add(lblVetnor);

		JLabel lblAvenue = new JLabel("AVENUE");
		lblAvenue.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue.setBounds(12, 29, 43, 10);
		sqPanel[27][0].add(lblAvenue);

		JLabel label_17 = new JLabel("$260");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_17.setBounds(19, 85, 30, 10);
		sqPanel[27][0].add(label_17);

		sqPanel[28][0].setBounds(165, 685, 65, 100);

		sqPanel[29][0].setBounds(100, 685, 65, 100);

		sqPanel[29][1].setBackground(Color.YELLOW);
		
		JLabel lblMarvinGarden = new JLabel("MARVIN");
		lblMarvinGarden.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblMarvinGarden.setBounds(12, 19, 43, 10);
		sqPanel[29][0].add(lblMarvinGarden);

		JLabel lblGarden = new JLabel("GARDEN");
		lblGarden.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblGarden.setBounds(12, 29, 43, 10);
		sqPanel[29][0].add(lblGarden);

		JLabel label_16 = new JLabel("$280");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_16.setBounds(19, 85, 30, 10);
		sqPanel[29][0].add(label_16);

		sqPanel[30][0].setBounds(0, 685, 100, 100);

		sqPanel[31][0].setBounds(0, 620, 100, 65);

		sqPanel[31][1].setBackground(new Color(0, 128, 0));
		
		JLabel lblPacific = new JLabel("PACIFIC");
		lblPacific.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPacific.setBounds(71, 12, 10, 47);
		lblPacific.setUI(new VerticalLabelUI(true));
		sqPanel[31][0].add(lblPacific);

		JLabel lblAvenue_9 = new JLabel("AVENUE");
		lblAvenue_9.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_9.setBounds(61, 12, 10, 43);
		lblAvenue_9.setUI(new VerticalLabelUI(true));
		sqPanel[31][0].add(lblAvenue_9);

		JLabel label_11 = new JLabel("$300");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_11.setBounds(5, 19, 10, 30);
		label_11.setUI(new VerticalLabelUI(true));
		sqPanel[31][0].add(label_11);

		sqPanel[32][0].setBounds(0, 555, 100, 65);

		sqPanel[32][1].setBackground(new Color(0, 128, 0));

		JLabel lblNorth = new JLabel("NORTH");
		lblNorth.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNorth.setBounds(71, 14, 10, 43);
		lblNorth.setUI(new VerticalLabelUI(true));
		sqPanel[32][0].add(lblNorth);

		JLabel lblCarolina = new JLabel("CAROLINA");
		lblCarolina.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCarolina.setBounds(61, 6, 10, 56);
		lblCarolina.setUI(new VerticalLabelUI(true));
		sqPanel[32][0].add(lblCarolina);

		JLabel lblAvenue_10 = new JLabel("AVENUE");
		lblAvenue_10.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_10.setBounds(51, 12, 10, 43);
		lblAvenue_10.setUI(new VerticalLabelUI(true));
		sqPanel[32][0].add(lblAvenue_10);

		JLabel label_12 = new JLabel("$300");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_12.setBounds(5, 19, 10, 30);
		label_12.setUI(new VerticalLabelUI(true));
		sqPanel[32][0].add(label_12);

		sqPanel[33][0].setBounds(0, 490, 100, 65);

		sqPanel[34][0].setBounds(0, 425, 100, 65);

		sqPanel[34][1].setBackground(new Color(0, 128, 0));
		
		JLabel lblPennsylvania = new JLabel("PENNSYLVANIA");
		lblPennsylvania.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPennsylvania.setBounds(71, 3, 10, 65);
		lblPennsylvania.setUI(new VerticalLabelUI(true));
		sqPanel[34][0].add(lblPennsylvania);

		JLabel lblAvenue_11 = new JLabel("AVENUE");
		lblAvenue_11.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_11.setBounds(61, 12, 10, 43);
		lblAvenue_11.setUI(new VerticalLabelUI(true));
		sqPanel[34][0].add(lblAvenue_11);

		JLabel label_13 = new JLabel("$320");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_13.setBounds(5, 19, 10, 30);
		label_13.setUI(new VerticalLabelUI(true));
		sqPanel[34][0].add(label_13);

		sqPanel[35][0].setBounds(0, 360, 100, 65);

		sqPanel[36][0].setBounds(0, 295, 100, 65);

		sqPanel[37][0].setBounds(0, 230, 100, 65);

		sqPanel[37][1].setBackground(Color.BLUE);

		JLabel lblParkPlace = new JLabel("PARK");
		lblParkPlace.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblParkPlace.setBounds(71, 14, 10, 30);
		lblParkPlace.setUI(new VerticalLabelUI(true));
		sqPanel[37][0].add(lblParkPlace);

		JLabel lblPlace_2 = new JLabel("PLACE");
		lblPlace_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPlace_2.setBounds(61, 12, 10, 43);
		lblPlace_2.setUI(new VerticalLabelUI(true));
		sqPanel[37][0].add(lblPlace_2);

		JLabel label_14 = new JLabel("$350");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_14.setBounds(5, 19, 10, 30);
		label_14.setUI(new VerticalLabelUI(true));
		sqPanel[37][0].add(label_14);

		sqPanel[38][0].setBounds(0, 165, 100, 65);

		sqPanel[39][0].setBounds(0, 100, 100, 65);

		sqPanel[39][1].setBackground(Color.BLUE);
		
		
		JLabel label_23 = new JLabel("Chance");
		label_23.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_23.setBounds(10, 79, 40, 10);
		label_23.setUI(new UpsideDownLabelUI());
		sqPanel[7][0].add(label_23);
		
		JLabel label_24 = new JLabel("?");
		label_24.setForeground(new Color(30, 144, 255));
		label_24.setFont(new Font("Script MT Bold", Font.PLAIN, 80));
		label_24.setBounds(8, 8, 46, 60);
		label_24.setUI(new UpsideDownLabelUI());
		sqPanel[7][0].add(label_24);
		
		
		
		JLabel label_22 = new JLabel("?");
		label_22.setForeground(new Color(30, 144, 255));
		label_22.setBounds(14, 23, 46, 60);
		label_22.setFont(new Font("Script MT Bold", Font.PLAIN, 80));
		sqPanel[22][0].add(label_22);
		
		JLabel lblChance = new JLabel("Chance");
		lblChance.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblChance.setBounds(14, 6, 40, 10);
		sqPanel[22][0].add(lblChance);
		
		
		
		JLabel label_25 = new JLabel("?");
		label_25.setForeground(new Color(30, 144, 255));
		label_25.setFont(new Font("Script MT Bold", Font.PLAIN, 80));
		label_25.setBounds(10, 11, 60, 38);
		label_25.setUI(new VerticalLabelUI(true));
		sqPanel[36][0].add(label_25);
		
		JLabel lblChance_1 = new JLabel("Chance");
		lblChance_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblChance_1.setBounds(80, 11, 10, 38);
		lblChance_1.setUI(new VerticalLabelUI(true));
		sqPanel[36][0].add(lblChance_1);

		JLabel lblBoard = new JLabel("BOARD");
		lblBoard.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblBoard.setBounds(71, 12, 10, 38);
		lblBoard.setUI(new VerticalLabelUI(true));
		sqPanel[39][0].add(lblBoard);

		JLabel lblwalk = new JLabel("-WALK");
		lblwalk.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblwalk.setBounds(61, 12, 10, 43);
		lblwalk.setUI(new VerticalLabelUI(true));
		sqPanel[39][0].add(lblwalk);

		JLabel label_15 = new JLabel("$400");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_15.setBounds(5, 19, 10, 30);
		label_15.setUI(new VerticalLabelUI(true));
		sqPanel[39][0].add(label_15);
		
		
		
		
		
		
		
		JLabel go0 = new JLabel("New label");
		go0.setBounds(10, 5, 75, 90);
		sqPanel[0][0].add(go0);
		go0.setUI(new UpsideDownLabelUI());
		ImageIcon imagei0 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\go.png");
		Image image0 = imagei0.getImage();
		Image lastImage0 = image0.getScaledInstance(go0.getWidth(), go0.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon goIcon0 = new ImageIcon(lastImage0);
		go0.setIcon(goIcon0);
		
		JLabel chest2 = new JLabel("New label");
		chest2.setBounds(2, 2, 60, 70);
		chest2.setUI(new UpsideDownLabelUI());
		sqPanel[2][0].add(chest2);
		ImageIcon imagei2 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Community Chest.gif");
		Image image2 = imagei2.getImage();
		Image lastImage2 = image2.getScaledInstance(chest2.getWidth(), chest2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon chestIcon2 = new ImageIcon(lastImage2);
		chest2.setIcon(chestIcon2);
		
		JLabel iTax4 = new JLabel("New label");
		iTax4.setBounds(25, 40, 20, 20);
		iTax4.setUI(new UpsideDownLabelUI());
		sqPanel[4][0].add(iTax4);
		ImageIcon imagei4 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\ITBL2.png");
		Image image4 = imagei4.getImage();
		Image lastImage4 = image4.getScaledInstance(iTax4.getWidth(), iTax4.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iTaxIcon = new ImageIcon(lastImage4);
		iTax4.setIcon(iTaxIcon);
		
		JLabel railR5 = new JLabel("New label");
		railR5.setBounds(6, 11, 50, 60);
		railR5.setUI(new UpsideDownLabelUI());
		sqPanel[5][0].add(railR5);
		ImageIcon imagei5 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Railroad.png");
		Image image5 = imagei5.getImage();
		Image lastImage5 = image5.getScaledInstance(railR5.getWidth(), railR5.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon railRIcon5 = new ImageIcon(lastImage5);
		railR5.setIcon(railRIcon5);
		
		JLabel jail10 = new JLabel("New label");
		jail10.setBounds(1, 28, 71, 71);
		sqPanel[10][0].add(jail10);
		jail10.setUI(new VerticalLabelUI(false));
		ImageIcon imagei10 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\jailEdit.jpg");
		Image image10 = imagei10.getImage();
		Image lastImage10 = image10.getScaledInstance(jail10.getHeight(), jail10.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon jailIcon10 = new ImageIcon(lastImage10);
		jail10.setIcon(jailIcon10);
		
		JLabel eCompany12 = new JLabel("New label");
		eCompany12.setBounds(29, 10, 50, 50);
		eCompany12.setUI(new VerticalLabelUI(false));
		sqPanel[12][0].add(eCompany12);
		ImageIcon imagei12 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\EC2.png");
		Image image12 = imagei12.getImage();
		Image lastImage12 = image12.getScaledInstance(eCompany12.getHeight(), eCompany12.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon eCompanyIcon12 = new ImageIcon(lastImage12);
		eCompany12.setIcon(eCompanyIcon12);
		
		JLabel railR15 = new JLabel("New label");
		railR15.setBounds(25, 6, 60, 50);
		railR15.setUI(new VerticalLabelUI(false));
		sqPanel[15][0].add(railR15);
		ImageIcon imagei15 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Railroad.png");
		Image image15 = imagei15.getImage();
		Image lastImage15 = image15.getScaledInstance(railR15.getHeight(), railR15.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon railRIcon15 = new ImageIcon(lastImage15);
		railR15.setIcon(railRIcon15);
		
		JLabel chest17 = new JLabel("New label");
		chest17.setBounds(25, 2, 70, 60);
		chest17.setUI(new VerticalLabelUI(false));
		sqPanel[17][0].add(chest17);
		ImageIcon imagei17 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Community Chest.gif");
		Image image17 = imagei17.getImage();
		Image lastImage17 = image17.getScaledInstance(chest17.getHeight(), chest17.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon chestIcon17 = new ImageIcon(lastImage17);
		chest17.setIcon(chestIcon17);
		
		JLabel freeParking20 = new JLabel("New label");
		freeParking20.setBounds(10, 5, 80, 85);
		sqPanel[20][0].add(freeParking20);
		//freeParking20.setUI(new UpsideDownLabelUI());
		ImageIcon imagei20 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\FP.png");
		Image image20 = imagei20.getImage();
		Image lastImage20 = image20.getScaledInstance(freeParking20.getWidth(), freeParking20.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon freeParkingIcon20 = new ImageIcon(lastImage20);
		freeParking20.setIcon(freeParkingIcon20);
		
		JLabel railR25 = new JLabel("New label");
		railR25.setBounds(6, 22, 50, 60);
		sqPanel[25][0].add(railR25);
		ImageIcon imagei25 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Railroad.png");
		Image image25 = imagei25.getImage();
		Image lastImage25 = image25.getScaledInstance(railR25.getWidth(), railR25.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon railRIcon25 = new ImageIcon(lastImage25);
		railR25.setIcon(railRIcon25);
		
		JLabel waterWorks28 = new JLabel("New label");
		waterWorks28.setBounds(5, 25, 50, 50);
		sqPanel[28][0].add(waterWorks28);
		ImageIcon imagei28 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\ww2.png");
		Image image28 = imagei28.getImage();
		Image lastImage28 = image28.getScaledInstance(waterWorks28.getWidth(), waterWorks28.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon waterIcon28 = new ImageIcon(lastImage28);
		waterWorks28.setIcon(waterIcon28);
		
		JLabel goToJail30 = new JLabel("New label");
		goToJail30.setBounds(10, 8, 85, 80);
		sqPanel[30][0].add(goToJail30);
		ImageIcon imagei30 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\GTJ.gif");
		Image image30 = imagei30.getImage();
		Image lastImage30 = image30.getScaledInstance(goToJail30.getWidth(), goToJail30.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon goToJailIcon30 = new ImageIcon(lastImage30);
		goToJail30.setIcon(goToJailIcon30);
		
		JLabel chest33 = new JLabel("New label");
		chest33.setBounds(2, 2, 70, 60);
		chest33.setUI(new VerticalLabelUI(true));
		sqPanel[33][0].add(chest33);
		ImageIcon imagei33 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Community Chest.gif");
		Image image33 = imagei33.getImage();
		Image lastImage33 = image33.getScaledInstance(chest33.getHeight(), chest33.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon chestIcon33 = new ImageIcon(lastImage33);
		chest33.setIcon(chestIcon33);
		
		JLabel railR35 = new JLabel("New label");
		railR35.setBounds(19, 6, 60, 50);
		railR35.setUI(new VerticalLabelUI(true));
		sqPanel[35][0].add(railR35);
		ImageIcon imagei35 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Railroad.png");
		Image image35 = imagei35.getImage();
		Image lastImage35 = image35.getScaledInstance(railR35.getHeight(), railR35.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon railRIcon35 = new ImageIcon(lastImage35);
		railR35.setIcon(railRIcon35);
		
		JLabel luxuryTax38 = new JLabel("New label");
		luxuryTax38.setBounds(25, 10, 48, 46);
		luxuryTax38.setUI(new VerticalLabelUI(true));
		sqPanel[38][0].add(luxuryTax38);
		ImageIcon imagei38 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\luxT2.png");
		Image image38 = imagei38.getImage();
		Image lastImage38 = image38.getScaledInstance(luxuryTax38.getWidth(), luxuryTax38.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon lTaxIcon = new ImageIcon(lastImage38);
		luxuryTax38.setIcon(lTaxIcon);
		
		JLabel railR = new JLabel("New label");
		railR.setBounds(387, 322, 166, 163);
		sqPanel[25][0].add(railR);
		ImageIcon imagei = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Railroad.png");
		Image image = imagei.getImage();
		Image lastImage = image.getScaledInstance(railR.getWidth(), railR.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon railRIcon = new ImageIcon(lastImage);
		railR.setIcon(railRIcon);
		
		JLabel lblIncome = new JLabel("INCOME");
		lblIncome.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblIncome.setBounds(9, 85, 45, 10);
		lblIncome.setUI(new UpsideDownLabelUI());
		sqPanel[4][0].add(lblIncome);
		
		JLabel lblTax_1 = new JLabel("TAX");
		lblTax_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTax_1.setBounds(19, 75, 25, 10);
		lblTax_1.setUI(new UpsideDownLabelUI());
		sqPanel[4][0].add(lblTax_1);
		
		JLabel label_38 = new JLabel("PAY $200");
		label_38.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_38.setBounds(3, 5, 55, 10);
		label_38.setUI(new UpsideDownLabelUI());
		sqPanel[4][0].add(label_38);
		
		JLabel lblReading = new JLabel("READING");
		lblReading.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblReading.setBounds(6, 85, 50, 10);
		lblReading.setUI(new UpsideDownLabelUI());
		sqPanel[5][0].add(lblReading);
		
		JLabel lblRailroad = new JLabel("RAILROAD");
		lblRailroad.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblRailroad.setBounds(0, 75, 60, 10);
		lblRailroad.setUI(new UpsideDownLabelUI());
		
		JLabel label_30 = new JLabel("$200");
		label_30.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_30.setBounds(19, 5, 30, 10);
		label_30.setUI(new UpsideDownLabelUI());
		sqPanel[5][0].add(label_30);
		
		JLabel visiting10 = new JLabel("VISITING");
		visiting10.setFont(new Font("Tahoma", Font.BOLD, 10));
		visiting10.setBounds(6, 5, 53, 10);
		visiting10.setUI(new UpsideDownLabelUI());
		sqPanel[10][0].add(visiting10);
		
		JLabel lblJust = new JLabel("JUST");
		lblJust.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblJust.setBounds(85, 49, 10, 27);
		lblJust.setUI(new VerticalLabelUI(false));
		sqPanel[10][0].add(lblJust);
		
		JLabel lblElectric = new JLabel("ELECTRIC");
		lblElectric.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblElectric.setBounds(4, 5, 10, 52);
		lblElectric.setUI(new VerticalLabelUI(false));
		sqPanel[12][0].add(lblElectric);
		
		JLabel lblCompany = new JLabel("COMPANY");
		lblCompany.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCompany.setBounds(14, 3, 10, 55);
		lblCompany.setUI(new VerticalLabelUI(false));
		sqPanel[12][0].add(lblCompany);
		
		JLabel label_35 = new JLabel("$150");
		label_35.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_35.setBounds(85, 19, 10, 30);
		label_35.setUI(new VerticalLabelUI(false));
		sqPanel[12][0].add(label_35);
		
		JLabel lblRailroads_1 = new JLabel("RAILROAD");
		lblRailroads_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblRailroads_1.setBounds(14, 0, 10, 60);
		lblRailroads_1.setUI(new VerticalLabelUI(false));
		sqPanel[15][0].add(lblRailroads_1);
		
		JLabel label_26 = new JLabel("PENNSYLVANIA");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_26.setBounds(4, 0, 10, 60);
		label_26.setUI(new VerticalLabelUI(false));
		sqPanel[15][0].add(label_26);
		
		JLabel label_28 = new JLabel("$200");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_28.setBounds(85, 19, 10, 30);
		label_28.setUI(new VerticalLabelUI(false));
		sqPanel[15][0].add(label_28);
		
		JLabel label_31 = new JLabel("CHEST");
		label_31.setFont(new Font("Tahoma", Font.BOLD, 8));
		label_31.setBounds(15, 5, 10, 40);
		label_31.setUI(new VerticalLabelUI(false));
		sqPanel[17][0].add(label_31);
		
		JLabel label_32 = new JLabel("COMMUNITY");
		label_32.setFont(new Font("Tahoma", Font.BOLD, 8));
		label_32.setBounds(5, -7, 10, 65);
		label_32.setUI(new VerticalLabelUI(false));
		sqPanel[17][0].add(label_32);
		
		JLabel lblBO = new JLabel("B & O");
		lblBO.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblBO.setBounds(15, 3, 30, 10);
		sqPanel[25][0].add(lblBO);
		
		JLabel lblRailroads = new JLabel("RAILROAD");
		lblRailroads.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblRailroads.setBounds(4, 12, 60, 10);
		sqPanel[25][0].add(lblRailroads);
		
		JLabel label_27 = new JLabel("$200");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_27.setBounds(19, 85, 30, 10);
		sqPanel[25][0].add(label_27);
		
		JLabel lblWater = new JLabel("WATER");
		lblWater.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWater.setBounds(12, 3, 43, 10);
		sqPanel[28][0].add(lblWater);
		
		JLabel lblWorks = new JLabel("WORKS");
		lblWorks.setBounds(12, 12, 43, 10);
		sqPanel[28][0].add(lblWorks);
		lblWorks.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel label_36 = new JLabel("$150");
		label_36.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_36.setBounds(19, 85, 30, 10);
		sqPanel[28][0].add(label_36);
		
		JLabel label_33 = new JLabel("COMMUNITY");
		label_33.setFont(new Font("Tahoma", Font.BOLD, 8));
		label_33.setBounds(85, 7, 10, 65);
		label_33.setUI(new VerticalLabelUI(true));
		sqPanel[33][0].add(label_33);
		
		JLabel label_34 = new JLabel("CHEST");
		label_34.setFont(new Font("Tahoma", Font.BOLD, 8));
		label_34.setBounds(75, 19, 10, 40);
		label_34.setUI(new VerticalLabelUI(true));
		sqPanel[33][0].add(label_34);
		
		JLabel lblRailraods = new JLabel("SHORT");
		lblRailraods.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblRailraods.setBounds(85, 15, 10, 43);
		lblRailraods.setUI(new VerticalLabelUI(true));
		sqPanel[35][0].add(lblRailraods);
		
		JLabel lblRailroads_2 = new JLabel("LINE");
		lblRailroads_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblRailroads_2.setBounds(75, 20, 10, 30);
		lblRailroads_2.setUI(new VerticalLabelUI(true));
		sqPanel[35][0].add(lblRailroads_2);
		
		JLabel label_29 = new JLabel("$200");
		label_29.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_29.setBounds(5, 19, 10, 30);
		label_29.setUI(new VerticalLabelUI(true));
		sqPanel[35][0].add(label_29);
		
		JLabel lblLuxury = new JLabel("LUXURY");
		lblLuxury.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLuxury.setBounds(85, 13, 10, 45);
		lblLuxury.setUI(new VerticalLabelUI(true));
		sqPanel[38][0].add(lblLuxury);
		
		JLabel lblTax = new JLabel("TAX");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTax.setBounds(75, 20, 10, 26);
		lblTax.setUI(new VerticalLabelUI(true));
		sqPanel[38][0].add(lblTax);
		
		JLabel label_37 = new JLabel("PAY $100");
		label_37.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_37.setBounds(5, 6, 10, 55);
		label_37.setUI(new VerticalLabelUI(true));
		sqPanel[38][0].add(label_37);
		
		
		
		
		
		JLabel lblChest = new JLabel("CHEST");
		lblChest.setFont(new Font("Tahoma", Font.BOLD, 8));
		lblChest.setBounds(-18, 75, 65, 10);
		lblChest.setUI(new UpsideDownLabelUI());
		sqPanel[2][0].add(lblChest);
		
		JLabel lblCommunity = new JLabel("COMMUNITY");
		lblCommunity.setBounds(-7, 85, 65, 10);
		sqPanel[2][0].add(lblCommunity);
		lblCommunity.setFont(new Font("Tahoma", Font.BOLD, 8));
		lblCommunity.setUI(new UpsideDownLabelUI());
		
		

		JPanel panel_40 = new JPanel();
		panel_40.setBounds(100, 100, 65, 65);
		panel.add(panel_40);

		JPanel panel_41 = new JPanel();
		panel_41.setBounds(165, 100, 65, 65);
		panel.add(panel_41);

		JPanel panel_42 = new JPanel();
		panel_42.setBounds(230, 100, 65, 65);
		panel.add(panel_42);

		JPanel panel_43 = new JPanel();
		panel_43.setBounds(295, 100, 65, 65);
		panel.add(panel_43);

		JPanel panel_44 = new JPanel();
		panel_44.setBounds(360, 100, 65, 65);
		panel.add(panel_44);

		JPanel panel_45 = new JPanel();
		panel_45.setBounds(425, 100, 65, 65);
		panel.add(panel_45);

		JPanel panel_46 = new JPanel();
		panel_46.setBounds(490, 100, 65, 65);
		panel.add(panel_46);

		JPanel panel_47 = new JPanel();
		panel_47.setBounds(555, 100, 65, 65);
		panel.add(panel_47);

		JPanel panel_48 = new JPanel();
		panel_48.setBounds(620, 100, 65, 65);
		panel.add(panel_48);

		JPanel panel_49 = new JPanel();
		panel_49.setBounds(620, 165, 65, 65);
		panel.add(panel_49);

		JPanel panel_50 = new JPanel();
		panel_50.setBounds(620, 230, 65, 65);
		panel.add(panel_50);

		JPanel panel_51 = new JPanel();
		panel_51.setBounds(620, 295, 65, 65);
		panel.add(panel_51);

		JPanel panel_52 = new JPanel();
		panel_52.setBounds(620, 360, 65, 65);
		panel.add(panel_52);

		JPanel panel_53 = new JPanel();
		panel_53.setBounds(620, 425, 65, 65);
		panel.add(panel_53);

		JPanel panel_54 = new JPanel();
		panel_54.setBounds(620, 490, 65, 65);
		panel.add(panel_54);

		JPanel panel_55 = new JPanel();
		panel_55.setBounds(620, 555, 65, 65);
		panel.add(panel_55);

		JPanel panel_56 = new JPanel();
		panel_56.setBounds(620, 620, 65, 65);
		panel.add(panel_56);

		JPanel panel_57 = new JPanel();
		panel_57.setBounds(555, 620, 65, 65);
		panel.add(panel_57);

		JPanel panel_58 = new JPanel();
		panel_58.setBounds(490, 620, 65, 65);
		panel.add(panel_58);

		JPanel panel_59 = new JPanel();
		panel_59.setBounds(425, 620, 65, 65);
		panel.add(panel_59);

		JPanel panel_60 = new JPanel();
		panel_60.setBounds(360, 620, 65, 65);
		panel.add(panel_60);

		JPanel panel_61 = new JPanel();
		panel_61.setBounds(295, 620, 65, 65);
		panel.add(panel_61);

		JPanel panel_62 = new JPanel();
		panel_62.setBounds(230, 620, 65, 65);
		panel.add(panel_62);

		JPanel panel_63 = new JPanel();
		panel_63.setBounds(165, 620, 65, 65);
		panel.add(panel_63);

		JPanel panel_64 = new JPanel();
		panel_64.setBounds(100, 620, 65, 65);
		panel.add(panel_64);

		JPanel panel_65 = new JPanel();
		panel_65.setBounds(100, 555, 65, 65);
		panel.add(panel_65);

		JPanel panel_66 = new JPanel();
		panel_66.setBounds(100, 490, 65, 65);
		panel.add(panel_66);

		JPanel panel_67 = new JPanel();
		panel_67.setBounds(100, 425, 65, 65);
		panel.add(panel_67);

		JPanel panel_68 = new JPanel();
		panel_68.setBounds(100, 360, 65, 65);
		panel.add(panel_68);

		JPanel panel_69 = new JPanel();
		panel_69.setBounds(100, 295, 65, 65);
		panel.add(panel_69);

		JPanel panel_70 = new JPanel();
		panel_70.setBounds(100, 230, 65, 65);
		panel.add(panel_70);

		JPanel panel_71 = new JPanel();
		panel_71.setBounds(100, 165, 65, 65);
		panel.add(panel_71);
	}
}