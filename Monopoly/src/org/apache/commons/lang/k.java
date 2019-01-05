import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.font.ImageGraphicAttribute;
import java.nio.file.Path;

public class k extends JPanel {
	public static void main(String[] arg)
    {
		k GUI = new k();
        JFrame frame = new JFrame();
        frame.setSize(800,300);
        frame.setTitle("Draw squares");
        frame.getContentPane().add(GUI);
    }
	/**
	 * Create the panel.
	 */
	public k() {
		 //k ok = new k();
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(127, 255, 212));
		panel.setBounds(0, 0, 785, 785);
		add(panel);
		panel.setLayout(null);
		//panel.add(ok);
		
		JPanel panel_0 = new JPanel();
		panel_0.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_0.setBackground(new Color(127, 255, 212));
		panel_0.setBounds(0, 0, 100, 100);
		panel.add(panel_0);
		panel_0.setLayout(null);
		
		JLabel go0 = new JLabel("New label");
		go0.setBounds(10, 5, 75, 90);
		panel_0.add(go0);
		go0.setUI(new UpsideDownLabelUI());
		ImageIcon imagei0 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\go.png");
		Image image0 = imagei0.getImage();
		Image lastImage0 = image0.getScaledInstance(go0.getWidth(), go0.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon goIcon0 = new ImageIcon(lastImage0);
		go0.setIcon(goIcon0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(new Color(127, 255, 212));
		panel_1.setBounds(100, 0, 65, 100);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel canvas = new JPanel();
		canvas.setBounds(2, 83, 61, 15);
		panel_1.add(canvas);
		canvas.setBackground(new Color(139, 69, 19));
		canvas.setLayout(null);
		
		JLabel lblMediterranean = new JLabel("MEDITERRANEAN");
		lblMediterranean.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblMediterranean.setBounds(2, 71, 60, 10);
		lblMediterranean.setUI(new UpsideDownLabelUI());
		panel_1.add(lblMediterranean);
		
		JLabel lblAvenue_12 = new JLabel("AVENUE");
		lblAvenue_12.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_12.setBounds(12, 61, 43, 10);
		lblAvenue_12.setUI(new UpsideDownLabelUI());
		panel_1.add(lblAvenue_12);
		
		JLabel label = new JLabel("$60");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setBounds(24, 5, 21, 10);
		label.setUI(new UpsideDownLabelUI());
		panel_1.add(label);
		
		JLabel lblPlayer = new JLabel("Player 1");
		lblPlayer.setBounds(2, 83, 46, 14);
		//c.add(lblPlayer);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(new Color(127, 255, 212));
		panel_2.setBounds(165, 0, 65, 100);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblChest = new JLabel("CHEST");
		lblChest.setFont(new Font("Tahoma", Font.BOLD, 8));
		lblChest.setBounds(-18, 75, 65, 10);
		lblChest.setUI(new UpsideDownLabelUI());
		panel_2.add(lblChest);
		
		JLabel lblCommunity = new JLabel("COMMUNITY");
		lblCommunity.setBounds(-7, 85, 65, 10);
		panel_2.add(lblCommunity);
		lblCommunity.setFont(new Font("Tahoma", Font.BOLD, 8));
		lblCommunity.setUI(new UpsideDownLabelUI());
		
		JLabel chest2 = new JLabel("New label");
		chest2.setBounds(2, 2, 60, 70);
		chest2.setUI(new UpsideDownLabelUI());
		panel_2.add(chest2);
		ImageIcon imagei2 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Community Chest.gif");
		Image image2 = imagei2.getImage();
		Image lastImage2 = image2.getScaledInstance(chest2.getWidth(), chest2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon chestIcon2 = new ImageIcon(lastImage2);
		chest2.setIcon(chestIcon2);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBackground(new Color(127, 255, 212));
		panel_3.setBounds(230, 0, 65, 100);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel canvas_2 = new JPanel();
		canvas_2.setBackground(new Color(139, 69, 19));
		canvas_2.setBounds(2, 83, 61, 15);
		panel_3.add(canvas_2);
		canvas_2.setLayout(null);
		
		JLabel lblBaltic = new JLabel("BALTIC");
		lblBaltic.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblBaltic.setBounds(12, 71, 43, 10);
		lblBaltic.setUI(new UpsideDownLabelUI());
		panel_3.add(lblBaltic);
		
		JLabel lblAvenue_13 = new JLabel("AVENUE");
		lblAvenue_13.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_13.setBounds(12, 61, 43, 10);
		lblAvenue_13.setUI(new UpsideDownLabelUI());
		panel_3.add(lblAvenue_13);
		
		JLabel label_1 = new JLabel("$60");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_1.setBounds(24, 5, 21, 10);
		label_1.setUI(new UpsideDownLabelUI());
		panel_3.add(label_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBackground(new Color(127, 255, 212));
		panel_4.setBounds(295, 0, 65, 100);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblIncome = new JLabel("INCOME");
		lblIncome.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblIncome.setBounds(9, 85, 45, 10);
		lblIncome.setUI(new UpsideDownLabelUI());
		panel_4.add(lblIncome);
		
		JLabel lblTax_1 = new JLabel("TAX");
		lblTax_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTax_1.setBounds(19, 75, 25, 10);
		lblTax_1.setUI(new UpsideDownLabelUI());
		panel_4.add(lblTax_1);
		
		JLabel label_38 = new JLabel("PAY $200");
		label_38.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_38.setBounds(3, 5, 55, 10);
		label_38.setUI(new UpsideDownLabelUI());
		panel_4.add(label_38);
		
		JLabel iTax4 = new JLabel("New label");
		iTax4.setBounds(25, 40, 20, 20);
		panel_4.add(iTax4);
		iTax4.setUI(new UpsideDownLabelUI());
		panel_4.add(iTax4);
		ImageIcon imagei4 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\ITBL2.png");
		Image image4 = imagei4.getImage();
		Image lastImage4 = image4.getScaledInstance(iTax4.getWidth(), iTax4.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iTaxIcon = new ImageIcon(lastImage4);
		iTax4.setIcon(iTaxIcon);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBackground(new Color(127, 255, 212));
		panel_5.setBounds(360, 0, 65, 100);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblReading = new JLabel("READING");
		lblReading.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblReading.setBounds(6, 85, 50, 10);
		lblReading.setUI(new UpsideDownLabelUI());
		panel_5.add(lblReading);
		
		JLabel lblRailroad = new JLabel("RAILROAD");
		lblRailroad.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblRailroad.setBounds(0, 75, 60, 10);
		lblRailroad.setUI(new UpsideDownLabelUI());
		panel_5.add(lblRailroad);
		
		JLabel railR5 = new JLabel("New label");
		railR5.setBounds(6, 11, 50, 60);
		railR5.setUI(new UpsideDownLabelUI());
		panel_5.add(railR5);
		ImageIcon imagei5 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Railroad.png");
		Image image5 = imagei5.getImage();
		Image lastImage5 = image5.getScaledInstance(railR5.getWidth(), railR5.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon railRIcon5 = new ImageIcon(lastImage5);
		railR5.setIcon(railRIcon5);
		
		JLabel label_30 = new JLabel("$200");
		label_30.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_30.setBounds(19, 5, 30, 10);
		label_30.setUI(new UpsideDownLabelUI());
		panel_5.add(label_30);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_6.setBackground(new Color(127, 255, 212));
		panel_6.setBounds(425, 0, 65, 100);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel canvas_4 = new JPanel();
		canvas_4.setBackground(new Color(51, 204, 255));
		canvas_4.setBounds(2, 83, 61, 15);
		panel_6.add(canvas_4);
		canvas_4.setLayout(null);
		
		JLabel lblOriental = new JLabel("ORIENTAL");
		lblOriental.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblOriental.setBounds(4, 71, 56, 10);
		lblOriental.setUI(new UpsideDownLabelUI());
		panel_6.add(lblOriental);
		
		JLabel lblAvenue_14 = new JLabel("AVENUE");
		lblAvenue_14.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_14.setBounds(12, 61, 43, 10);
		lblAvenue_14.setUI(new UpsideDownLabelUI());
		panel_6.add(lblAvenue_14);
		
		JLabel label_2 = new JLabel("$100");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_2.setBounds(19, 5, 30, 10);
		label_2.setUI(new UpsideDownLabelUI());
		panel_6.add(label_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_7.setBackground(new Color(127, 255, 212));
		panel_7.setBounds(490, 0, 65, 100);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel label_23 = new JLabel("Chance");
		label_23.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_23.setBounds(10, 79, 40, 10);
		label_23.setUI(new UpsideDownLabelUI());
		panel_7.add(label_23);
		
		JLabel label_24 = new JLabel("?");
		label_24.setForeground(new Color(30, 144, 255));
		label_24.setFont(new Font("Script MT Bold", Font.PLAIN, 80));
		label_24.setBounds(10, 8, 46, 60);
		label_24.setUI(new UpsideDownLabelUI());
		panel_7.add(label_24);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_8.setBackground(new Color(127, 255, 212));
		panel_8.setBounds(555, 0, 65, 100);
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		JPanel canvas_1 = new JPanel();
		canvas_1.setBackground(new Color(51, 204, 255));
		canvas_1.setBounds(2, 83, 61, 15);
		panel_8.add(canvas_1);
		
		JLabel lblVermont = new JLabel("VERMONT");
		lblVermont.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblVermont.setBounds(4, 71, 54, 10);
		lblVermont.setUI(new UpsideDownLabelUI());
		panel_8.add(lblVermont);
		
		JLabel lblAvenue_15 = new JLabel("AVENUE");
		lblAvenue_15.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_15.setBounds(12, 61, 43, 10);
		lblAvenue_15.setUI(new UpsideDownLabelUI());
		panel_8.add(lblAvenue_15);
		
		JLabel label_3 = new JLabel("$100");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_3.setBounds(19, 5, 30, 10);
		label_3.setUI(new UpsideDownLabelUI());
		panel_8.add(label_3);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_9.setBackground(new Color(127, 255, 212));
		panel_9.setBounds(620, 0, 65, 100);
		panel.add(panel_9);
		panel_9.setLayout(null);
		
		JPanel canvas_3 = new JPanel();
		canvas_3.setBackground(new Color(51, 204, 255));
		canvas_3.setBounds(2, 83, 61, 15);
		panel_9.add(canvas_3);
		
		JLabel lblConnecticut = new JLabel("CONNECTICUT");
		lblConnecticut.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblConnecticut.setBounds(0, 71, 62, 10);
		lblConnecticut.setUI(new UpsideDownLabelUI());
		panel_9.add(lblConnecticut);
		
		JLabel lblAvenue_16 = new JLabel("AVENUE");
		lblAvenue_16.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_16.setBounds(12, 61, 43, 10);
		lblAvenue_16.setUI(new UpsideDownLabelUI());
		panel_9.add(lblAvenue_16);
		
		JLabel label_4 = new JLabel("$120");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_4.setBounds(19, 5, 30, 10);
		label_4.setUI(new UpsideDownLabelUI());
		panel_9.add(label_4);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(127, 255, 212));
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_10.setBounds(685, 0, 100, 100);
		panel.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel jail10 = new JLabel("New label");
		jail10.setBounds(1, 28, 71, 71);
		panel_10.add(jail10);
		jail10.setUI(new VerticalLabelUI(false));
		ImageIcon imagei10 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\jailEdit.jpg");
		Image image10 = imagei10.getImage();
		Image lastImage10 = image10.getScaledInstance(jail10.getHeight(), jail10.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon jailIcon10 = new ImageIcon(lastImage10);
		jail10.setIcon(jailIcon10);
		
		JLabel visiting10 = new JLabel("VISITING");
		visiting10.setFont(new Font("Tahoma", Font.BOLD, 10));
		visiting10.setBounds(6, 5, 53, 10);
		visiting10.setUI(new UpsideDownLabelUI());
		panel_10.add(visiting10);
		
		JLabel lblJust = new JLabel("JUST");
		lblJust.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblJust.setBounds(85, 49, 10, 27);
		lblJust.setUI(new VerticalLabelUI(false));
		panel_10.add(lblJust);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_11.setBackground(new Color(127, 255, 212));
		panel_11.setBounds(685, 100, 100, 65);
		panel.add(panel_11);
		panel_11.setLayout(null);
		
		JPanel canvas_5 = new JPanel();
		canvas_5.setBackground(new Color(255, 20, 147));
		canvas_5.setBounds(2, 2, 15, 61);
		panel_11.add(canvas_5);
		
		JLabel lblSt = new JLabel("ST.");
		lblSt.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSt.setBounds(19, 20, 10, 20);
		lblSt.setUI(new VerticalLabelUI(false));
		panel_11.add(lblSt);
		
		JLabel lblCharles = new JLabel("CHARLES");
		lblCharles.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCharles.setBounds(29, 8, 10, 50);
		lblCharles.setUI(new VerticalLabelUI(false));
		panel_11.add(lblCharles);
		
		JLabel lblPlace = new JLabel("PLACE");
		lblPlace.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPlace.setBounds(39, 8, 10, 43);
		lblPlace.setUI(new VerticalLabelUI(false));
		panel_11.add(lblPlace);
		
		JLabel label_5 = new JLabel("$140");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_5.setBounds(85, 19, 10, 30);
		label_5.setUI(new VerticalLabelUI(false));
		panel_11.add(label_5);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_12.setBackground(new Color(127, 255, 212));
		panel_12.setBounds(685, 165, 100, 65);
		panel.add(panel_12);
		panel_12.setLayout(null);
		
		JLabel lblElectric = new JLabel("ELECTRIC");
		lblElectric.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblElectric.setBounds(4, 5, 10, 52);
		lblElectric.setUI(new VerticalLabelUI(false));
		panel_12.add(lblElectric);
		
		JLabel lblCompany = new JLabel("COMPANY");
		lblCompany.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCompany.setBounds(14, 3, 10, 55);
		lblCompany.setUI(new VerticalLabelUI(false));
		panel_12.add(lblCompany);
		
		JLabel label_35 = new JLabel("$150");
		label_35.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_35.setBounds(85, 19, 10, 30);
		label_35.setUI(new VerticalLabelUI(false));
		panel_12.add(label_35);
		
		JLabel eCompany12 = new JLabel("New label");
		eCompany12.setBounds(29, 10, 50, 50);
		eCompany12.setUI(new VerticalLabelUI(false));
		panel_12.add(eCompany12);
		ImageIcon imagei12 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\EC2.png");
		Image image12 = imagei12.getImage();
		Image lastImage12 = image12.getScaledInstance(eCompany12.getHeight(), eCompany12.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon eCompanyIcon12 = new ImageIcon(lastImage12);
		eCompany12.setIcon(eCompanyIcon12);
		
//		JLabel railR15 = new JLabel("New label");
//		railR15.setBounds(25, 11, 60, 40);
//		railR15.setUI(new VerticalLabelUI(false));
//		panel_15.add(railR15);
//		ImageIcon imagei15 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Railroad.png");
//		Image image15 = imagei15.getImage();
//		Image lastImage15 = image15.getScaledInstance(railR15.getHeight(), railR15.getWidth(), Image.SCALE_SMOOTH);
//		ImageIcon railRIcon15 = new ImageIcon(lastImage15);
//		railR15.setIcon(railRIcon15);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_13.setBackground(new Color(127, 255, 212));
		panel_13.setBounds(685, 230, 100, 65);
		panel.add(panel_13);
		panel_13.setLayout(null);
		
		JPanel canvas_6 = new JPanel();
		canvas_6.setBackground(new Color(255, 20, 147));
		canvas_6.setBounds(2, 2, 15, 61);
		panel_13.add(canvas_6);
		
		JLabel lblStates = new JLabel("STATES");
		lblStates.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblStates.setBounds(19, 12, 10, 43);
		lblStates.setUI(new VerticalLabelUI(false));
		panel_13.add(lblStates);
		
		JLabel lblAvenue_8 = new JLabel("AVENUE");
		lblAvenue_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_8.setBounds(29, 12, 10, 43);
		lblAvenue_8.setUI(new VerticalLabelUI(false));
		panel_13.add(lblAvenue_8);
		
		JLabel label_6 = new JLabel("$140");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_6.setBounds(85, 19, 10, 30);
		label_6.setUI(new VerticalLabelUI(false));
		panel_13.add(label_6);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_14.setBackground(new Color(127, 255, 212));
		panel_14.setBounds(685, 295, 100, 65);
		panel.add(panel_14);
		panel_14.setLayout(null);
		
		JPanel canvas_7 = new JPanel();
		canvas_7.setBackground(new Color(255, 20, 147));
		canvas_7.setBounds(2, 2, 15, 61);
		panel_14.add(canvas_7);
		
		JLabel lblVirginia = new JLabel("VIRGINIA");
		lblVirginia.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblVirginia.setBounds(19, 4, 10, 56);
		lblVirginia.setUI(new VerticalLabelUI(false));
		panel_14.add(lblVirginia);
		
		JLabel lblAvenue_7 = new JLabel("AVENUE");
		lblAvenue_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_7.setBounds(29, 12, 10, 43);
		lblAvenue_7.setUI(new VerticalLabelUI(false));
		panel_14.add(lblAvenue_7);
		
		JLabel label_7 = new JLabel("$160");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_7.setBounds(85, 19, 10, 30);
		label_7.setUI(new VerticalLabelUI(false));
		panel_14.add(label_7);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_15.setBackground(new Color(127, 255, 212));
		panel_15.setBounds(685, 360, 100, 65);
		panel.add(panel_15);
		panel_15.setLayout(null);
		
		JLabel lblRailroads_1 = new JLabel("RAILROAD");
		lblRailroads_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblRailroads_1.setBounds(14, 0, 10, 60);
		lblRailroads_1.setUI(new VerticalLabelUI(false));
		panel_15.add(lblRailroads_1);
		
		JLabel label_26 = new JLabel("PENNSYLVANIA");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_26.setBounds(4, 0, 10, 60);
		label_26.setUI(new VerticalLabelUI(false));
		panel_15.add(label_26);
		
		JLabel railR15 = new JLabel("New label");
		railR15.setBounds(25, 6, 60, 50);
		railR15.setUI(new VerticalLabelUI(false));
		panel_15.add(railR15);
		ImageIcon imagei15 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Railroad.png");
		Image image15 = imagei15.getImage();
		Image lastImage15 = image15.getScaledInstance(railR15.getHeight(), railR15.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon railRIcon15 = new ImageIcon(lastImage15);
		railR15.setIcon(railRIcon15);
		
		JLabel label_28 = new JLabel("$200");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_28.setBounds(85, 19, 10, 30);
		label_28.setUI(new VerticalLabelUI(false));
		panel_15.add(label_28);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_16.setBackground(new Color(127, 255, 212));
		panel_16.setBounds(685, 425, 100, 65);
		panel.add(panel_16);
		panel_16.setLayout(null);
		
		JPanel canvas_8 = new JPanel();
		canvas_8.setBackground(new Color(255, 127, 80));
		canvas_8.setBounds(2, 2, 15, 61);
		panel_16.add(canvas_8);
		
		JLabel lblStJames = new JLabel("ST. JAMES");
		lblStJames.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblStJames.setBounds(19, 4, 10, 56);
		lblStJames.setUI(new VerticalLabelUI(false));
		panel_16.add(lblStJames);
		
		JLabel lblPlace_1 = new JLabel("PLACE");
		lblPlace_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPlace_1.setBounds(29, 10, 10, 43);
		lblPlace_1.setUI(new VerticalLabelUI(false));
		panel_16.add(lblPlace_1);
		
		JLabel label_8 = new JLabel("$180");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_8.setBounds(85, 19, 10, 30);
		label_8.setUI(new VerticalLabelUI(false));
		panel_16.add(label_8);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_17.setBackground(new Color(127, 255, 212));
		panel_17.setBounds(685, 490, 100, 65);
		panel.add(panel_17);
		panel_17.setLayout(null);
		
		JLabel label_31 = new JLabel("CHEST");
		label_31.setFont(new Font("Tahoma", Font.BOLD, 8));
		label_31.setBounds(15, 5, 10, 40);
		label_31.setUI(new VerticalLabelUI(false));
		panel_17.add(label_31);
		
		JLabel label_32 = new JLabel("COMMUNITY");
		label_32.setFont(new Font("Tahoma", Font.BOLD, 8));
		label_32.setBounds(5, -7, 10, 65);
		label_32.setUI(new VerticalLabelUI(false));
		panel_17.add(label_32);
		
		JLabel chest17 = new JLabel("New label");
		chest17.setBounds(25, 2, 70, 60);
		chest17.setUI(new VerticalLabelUI(false));
		panel_17.add(chest17);
		ImageIcon imagei17 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Community Chest.gif");
		Image image17 = imagei17.getImage();
		Image lastImage17 = image17.getScaledInstance(chest17.getHeight(), chest17.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon chestIcon17 = new ImageIcon(lastImage17);
		chest17.setIcon(chestIcon17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_18.setBackground(new Color(127, 255, 212));
		panel_18.setBounds(685, 555, 100, 65);
		panel.add(panel_18);
		panel_18.setLayout(null);
		
		JPanel canvas_9 = new JPanel();
		canvas_9.setBackground(new Color(255, 127, 80));
		canvas_9.setBounds(2, 2, 15, 61);
		panel_18.add(canvas_9);
		
		JLabel lblTennessee = new JLabel("TENNESSEE");
		lblTennessee.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTennessee.setBounds(19, 4, 10, 58);
		lblTennessee.setUI(new VerticalLabelUI(false));
		panel_18.add(lblTennessee);
		
		JLabel lblAvenue_6 = new JLabel("AVENUE");
		lblAvenue_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_6.setBounds(29, 12, 10, 43);
		lblAvenue_6.setUI(new VerticalLabelUI(false));
		panel_18.add(lblAvenue_6);
		
		JLabel label_9 = new JLabel("$180");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_9.setBounds(85, 19, 10, 30);
		label_9.setUI(new VerticalLabelUI(false));
		panel_18.add(label_9);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_19.setBackground(new Color(127, 255, 212));
		panel_19.setBounds(685, 620, 100, 65);
		panel.add(panel_19);
		panel_19.setLayout(null);
		
		JPanel canvas_10 = new JPanel();
		canvas_10.setBackground(new Color(255, 140, 0));
		canvas_10.setBounds(2, 2, 15, 61);
		panel_19.add(canvas_10);
		
		JLabel lblNewYork = new JLabel("NEW YORK");
		lblNewYork.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewYork.setBounds(19, 4, 10, 56);
		lblNewYork.setUI(new VerticalLabelUI(false));
		panel_19.add(lblNewYork);
		
		JLabel lblAvenue_5 = new JLabel("AVENUE");
		lblAvenue_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_5.setBounds(29, 12, 10, 43);
		lblAvenue_5.setUI(new VerticalLabelUI(false));
		panel_19.add(lblAvenue_5);
		
		JLabel label_10 = new JLabel("$200");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_10.setBounds(85, 19, 10, 30);
		label_10.setUI(new VerticalLabelUI(false));
		panel_19.add(label_10);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(127, 255, 212));
		panel_20.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_20.setBounds(685, 685, 100, 100);
		panel.add(panel_20);
		panel_20.setLayout(null);
		
		JLabel freeParking20 = new JLabel("New label");
		freeParking20.setBounds(10, 5, 80, 85);
		panel_20.add(freeParking20);
		//freeParking20.setUI(new UpsideDownLabelUI());
		ImageIcon imagei20 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\FP.png");
		Image image20 = imagei20.getImage();
		Image lastImage20 = image20.getScaledInstance(freeParking20.getWidth(), freeParking20.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon freeParkingIcon20 = new ImageIcon(lastImage20);
		freeParking20.setIcon(freeParkingIcon20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_21.setBackground(new Color(127, 255, 212));
		panel_21.setBounds(620, 685, 65, 100);
		panel.add(panel_21);
		panel_21.setLayout(null);
		
		JPanel canvas_11 = new JPanel();
		canvas_11.setBackground(Color.RED);
		canvas_11.setBounds(2, 2, 61, 15);
		panel_21.add(canvas_11);
		
		JLabel lblKentucky = new JLabel("KENTUCKY");
		lblKentucky.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblKentucky.setBounds(4, 19, 58, 10);
		panel_21.add(lblKentucky);
		
		JLabel lblAvenue_3 = new JLabel("AVENUE");
		lblAvenue_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_3.setBounds(12, 29, 43, 10);
		panel_21.add(lblAvenue_3);
		
		JLabel label_21 = new JLabel("$220");
		label_21.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_21.setBounds(19, 85, 30, 10);
		panel_21.add(label_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_22.setBackground(new Color(127, 255, 212));
		panel_22.setBounds(555, 685, 65, 100);
		panel.add(panel_22);
		panel_22.setLayout(null);
		
		JLabel label_22 = new JLabel("?");
		label_22.setForeground(new Color(30, 144, 255));
		label_22.setBounds(14, 23, 46, 60);
		panel_22.add(label_22);
		label_22.setFont(new Font("Script MT Bold", Font.PLAIN, 80));
		
		JLabel lblChance = new JLabel("Chance");
		lblChance.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblChance.setBounds(14, 6, 40, 10);
		panel_22.add(lblChance);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_23.setBackground(new Color(127, 255, 212));
		panel_23.setBounds(490, 685, 65, 100);
		panel.add(panel_23);
		panel_23.setLayout(null);
		
		JPanel canvas_12 = new JPanel();
		canvas_12.setBackground(Color.RED);
		canvas_12.setBounds(2, 2, 61, 15);
		panel_23.add(canvas_12);
		
		JLabel lblIndiana = new JLabel("INDIANA");
		lblIndiana.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblIndiana.setBounds(8, 19, 50, 10);
		panel_23.add(lblIndiana);
		
		JLabel lblAvenue_4 = new JLabel("AVENUE");
		lblAvenue_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_4.setBounds(12, 29, 43, 10);
		panel_23.add(lblAvenue_4);
		
		JLabel label_20 = new JLabel("$220");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_20.setBounds(19, 85, 30, 10);
		panel_23.add(label_20);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_24.setBackground(new Color(127, 255, 212));
		panel_24.setBounds(425, 685, 65, 100);
		panel.add(panel_24);
		panel_24.setLayout(null);
		
		JPanel canvas_13 = new JPanel();
		canvas_13.setBackground(Color.RED);
		canvas_13.setBounds(2, 2, 61, 15);
		panel_24.add(canvas_13);
		canvas_13.setLayout(null);
		
		JLabel lblIllinois = new JLabel("ILLINOIS");
		lblIllinois.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblIllinois.setBounds(8, 19, 50, 10);
		panel_24.add(lblIllinois);
		
		JLabel lblAvenue_2 = new JLabel("AVENUE");
		lblAvenue_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_2.setBounds(12, 29, 43, 10);
		panel_24.add(lblAvenue_2);
		
		JLabel label_19 = new JLabel("$240");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_19.setBounds(19, 85, 30, 10);
		panel_24.add(label_19);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_25.setBackground(new Color(127, 255, 212));
		panel_25.setBounds(360, 685, 65, 100);
		panel.add(panel_25);
		panel_25.setLayout(null);
		
		JLabel lblBO = new JLabel("B & O");
		lblBO.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblBO.setBounds(15, 3, 30, 10);
		panel_25.add(lblBO);
		
		JLabel lblRailroads = new JLabel("RAILROAD");
		lblRailroads.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblRailroads.setBounds(4, 12, 60, 10);
		panel_25.add(lblRailroads);
		
		JLabel railR25 = new JLabel("New label");
		railR25.setBounds(6, 22, 50, 60);
		panel_25.add(railR25);
		ImageIcon imagei25 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Railroad.png");
		Image image25 = imagei25.getImage();
		Image lastImage25 = image25.getScaledInstance(railR25.getWidth(), railR25.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon railRIcon25 = new ImageIcon(lastImage25);
		railR25.setIcon(railRIcon25);
		
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_26.setBackground(new Color(127, 255, 212));
		panel_26.setBounds(295, 685, 65, 100);
		panel.add(panel_26);
		panel_26.setLayout(null);
		
		JPanel canvas_14 = new JPanel();
		canvas_14.setBackground(Color.YELLOW);
		canvas_14.setBounds(2, 2, 61, 15);
		panel_26.add(canvas_14);
		
		JLabel lblAtlantic = new JLabel("ATLANTIC");
		lblAtlantic.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAtlantic.setBounds(4, 19, 58, 10);
		panel_26.add(lblAtlantic);
		
		JLabel lblAvenue_1 = new JLabel("AVENUE");
		lblAvenue_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_1.setBounds(12, 29, 43, 10);
		panel_26.add(lblAvenue_1);
		
		JLabel label_18 = new JLabel("$260");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_18.setBounds(19, 85, 30, 10);
		panel_26.add(label_18);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_27.setBackground(new Color(127, 255, 212));
		panel_27.setBounds(230, 685, 65, 100);
		panel.add(panel_27);
		panel_27.setLayout(null);
		
		JPanel canvas_15 = new JPanel();
		canvas_15.setBackground(Color.YELLOW);
		canvas_15.setBounds(2, 2, 61, 15);
		panel_27.add(canvas_15);
		
		JLabel lblVetnor = new JLabel("VETNOR");
		lblVetnor.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblVetnor.setBounds(12, 19, 43, 10);
		panel_27.add(lblVetnor);
		
		JLabel lblAvenue = new JLabel("AVENUE");
		lblAvenue.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue.setBounds(12, 29, 43, 10);
		panel_27.add(lblAvenue);
		
		JLabel label_17 = new JLabel("$260");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_17.setBounds(19, 85, 30, 10);
		panel_27.add(label_17);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_28.setBackground(new Color(127, 255, 212));
		panel_28.setBounds(165, 685, 65, 100);
		panel.add(panel_28);
		panel_28.setLayout(null);
		
		JLabel lblWater = new JLabel("WATER");
		lblWater.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblWater.setBounds(12, 3, 43, 10);
		panel_28.add(lblWater);
		
		JLabel lblWorks = new JLabel("WORKS");
		lblWorks.setBounds(12, 12, 43, 10);
		panel_28.add(lblWorks);
		lblWorks.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel label_36 = new JLabel("$150");
		label_36.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_36.setBounds(19, 85, 30, 10);
		panel_28.add(label_36);
		
		JLabel waterWorks28 = new JLabel("New label");
		waterWorks28.setBounds(5, 25, 50, 50);
		panel_28.add(waterWorks28);
		ImageIcon imagei28 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\ww2.png");
		Image image28 = imagei28.getImage();
		Image lastImage28 = image28.getScaledInstance(waterWorks28.getWidth(), waterWorks28.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon waterIcon28 = new ImageIcon(lastImage28);
		waterWorks28.setIcon(waterIcon28);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_29.setBackground(new Color(127, 255, 212));
		panel_29.setBounds(100, 685, 65, 100);
		panel.add(panel_29);
		panel_29.setLayout(null);
		
		JPanel canvas_16 = new JPanel();
		canvas_16.setBackground(Color.YELLOW);
		canvas_16.setBounds(2, 2, 61, 15);
		panel_29.add(canvas_16);
		canvas_16.setLayout(null);
		
		JLabel lblMarvinGarden = new JLabel("MARVIN");
		lblMarvinGarden.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblMarvinGarden.setBounds(12, 19, 43, 10);
		
		panel_29.add(lblMarvinGarden);
		
		JLabel lblGarden = new JLabel("GARDEN");
		lblGarden.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblGarden.setBounds(12, 29, 43, 10);
		panel_29.add(lblGarden);
		
		JLabel label_16 = new JLabel("$280");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_16.setBounds(19, 85, 30, 10);
		panel_29.add(label_16);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(new Color(127, 255, 212));
		panel_30.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_30.setBounds(0, 685, 100, 100);
		panel.add(panel_30);
		panel_30.setLayout(null);
		
		JLabel goToJail30 = new JLabel("New label");
		goToJail30.setBounds(10, 8, 85, 80);
		panel_30.add(goToJail30);
		ImageIcon imagei30 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\GTJ.gif");
		Image image30 = imagei30.getImage();
		Image lastImage30 = image30.getScaledInstance(goToJail30.getWidth(), goToJail30.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon goToJailIcon30 = new ImageIcon(lastImage30);
		goToJail30.setIcon(goToJailIcon30);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_31.setBackground(new Color(127, 255, 212));
		panel_31.setBounds(0, 620, 100, 65);
		panel.add(panel_31);
		panel_31.setLayout(null);
		
		JPanel canvas_21 = new JPanel();
		canvas_21.setBackground(new Color(0, 128, 0));
		canvas_21.setBounds(83, 2, 15, 61);
		panel_31.add(canvas_21);
		
		JLabel lblPacific = new JLabel("PACIFIC");
		lblPacific.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPacific.setBounds(71, 12, 10, 47);
		lblPacific.setUI(new VerticalLabelUI(true));
		panel_31.add(lblPacific);
		
		JLabel lblAvenue_9 = new JLabel("AVENUE");
		lblAvenue_9.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_9.setBounds(61, 12, 10, 43);
		lblAvenue_9.setUI(new VerticalLabelUI(true));
		panel_31.add(lblAvenue_9);
		
		JLabel label_11 = new JLabel("$300");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_11.setBounds(5, 19, 10, 30);
		label_11.setUI(new VerticalLabelUI(true));
		panel_31.add(label_11);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_32.setBackground(new Color(127, 255, 212));
		panel_32.setBounds(0, 555, 100, 65);
		panel.add(panel_32);
		panel_32.setLayout(null);
		
		JPanel canvas_20 = new JPanel();
		canvas_20.setBackground(new Color(0, 128, 0));
		canvas_20.setBounds(83, 2, 15, 61);
		panel_32.add(canvas_20);
		
		JLabel lblNorth = new JLabel("NORTH");
		lblNorth.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNorth.setBounds(71, 14, 10, 43);
		lblNorth.setUI(new VerticalLabelUI(true));
		panel_32.add(lblNorth);
		
		JLabel lblCarolina = new JLabel("CAROLINA");
		lblCarolina.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCarolina.setBounds(61, 6, 10, 56);
		lblCarolina.setUI(new VerticalLabelUI(true));
		panel_32.add(lblCarolina);
		
		JLabel lblAvenue_10 = new JLabel("AVENUE");
		lblAvenue_10.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_10.setBounds(51, 12, 10, 43);
		lblAvenue_10.setUI(new VerticalLabelUI(true));
		panel_32.add(lblAvenue_10);
		
		JLabel label_12 = new JLabel("$300");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_12.setBounds(5, 19, 10, 30);
		label_12.setUI(new VerticalLabelUI(true));
		panel_32.add(label_12);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_33.setBackground(new Color(127, 255, 212));
		panel_33.setBounds(0, 490, 100, 65);
		panel.add(panel_33);
		panel_33.setLayout(null);
		
		JLabel label_33 = new JLabel("COMMUNITY");
		label_33.setFont(new Font("Tahoma", Font.BOLD, 8));
		label_33.setBounds(85, 7, 10, 65);
		label_33.setUI(new VerticalLabelUI(true));
		panel_33.add(label_33);
		
		JLabel label_34 = new JLabel("CHEST");
		label_34.setFont(new Font("Tahoma", Font.BOLD, 8));
		label_34.setBounds(75, 19, 10, 40);
		label_34.setUI(new VerticalLabelUI(true));
		panel_33.add(label_34);
		
		JLabel chest33 = new JLabel("New label");
		chest33.setBounds(2, 2, 70, 60);
		chest33.setUI(new VerticalLabelUI(true));
		panel_33.add(chest33);
		ImageIcon imagei33 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Community Chest.gif");
		Image image33 = imagei33.getImage();
		Image lastImage33 = image33.getScaledInstance(chest33.getHeight(), chest33.getWidth(), Image.SCALE_SMOOTH);
		ImageIcon chestIcon33 = new ImageIcon(lastImage33);
		chest33.setIcon(chestIcon33);
		
		
		JPanel panel_34 = new JPanel();
		panel_34.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_34.setBackground(new Color(127, 255, 212));
		panel_34.setBounds(0, 425, 100, 65);
		panel.add(panel_34);
		panel_34.setLayout(null);
		
		JPanel canvas_19 = new JPanel();
		canvas_19.setBackground(new Color(0, 128, 0));
		canvas_19.setBounds(83, 2, 15, 61);
		panel_34.add(canvas_19);
		
		JLabel lblPennsylvania = new JLabel("PENNSYLVANIA");
		lblPennsylvania.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPennsylvania.setBounds(71, 3, 10, 65);
		lblPennsylvania.setUI(new VerticalLabelUI(true));
		panel_34.add(lblPennsylvania);
		
		JLabel lblAvenue_11 = new JLabel("AVENUE");
		lblAvenue_11.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAvenue_11.setBounds(61, 12, 10, 43);
		lblAvenue_11.setUI(new VerticalLabelUI(true));
		panel_34.add(lblAvenue_11);
		
		JLabel label_13 = new JLabel("$320");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_13.setBounds(5, 19, 10, 30);
		label_13.setUI(new VerticalLabelUI(true));
		panel_34.add(label_13);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_35.setBackground(new Color(127, 255, 212));
		panel_35.setBounds(0, 360, 100, 65);
		panel.add(panel_35);
		panel_35.setLayout(null);
		
		JLabel lblRailraods = new JLabel("SHORT");
		lblRailraods.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblRailraods.setBounds(85, 15, 10, 43);
		lblRailraods.setUI(new VerticalLabelUI(true));
		panel_35.add(lblRailraods);
		
		JLabel lblRailroads_2 = new JLabel("LINE");
		lblRailroads_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblRailroads_2.setBounds(75, 20, 10, 30);
		lblRailroads_2.setUI(new VerticalLabelUI(true));
		panel_35.add(lblRailroads_2);
		
		JLabel railR35 = new JLabel("New label");
		railR35.setBounds(19, 6, 60, 50);
		railR35.setUI(new VerticalLabelUI(true));
		panel_35.add(railR35);
		ImageIcon imagei35 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Railroad.png");
		Image image35 = imagei35.getImage();
		Image lastImage35 = image35.getScaledInstance(railR35.getWidth(), railR35.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon railRIcon35 = new ImageIcon(lastImage25);
		railR35.setIcon(railRIcon35);
		
		JLabel label_29 = new JLabel("$200");
		label_29.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_29.setBounds(5, 19, 10, 30);
		label_29.setUI(new VerticalLabelUI(true));
		panel_35.add(label_29);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_36.setBackground(new Color(127, 255, 212));
		panel_36.setBounds(0, 295, 100, 65);
		panel.add(panel_36);
		panel_36.setLayout(null);
		
		JLabel label_25 = new JLabel("?");
		label_25.setBounds(15, 16, 60, 38);
		panel_36.add(label_25);
		label_25.setForeground(new Color(30, 144, 255));
		label_25.setFont(new Font("Script MT Bold", Font.PLAIN, 80));
		label_25.setUI(new VerticalLabelUI(true));
		
		JLabel lblChance_1 = new JLabel("Chance");
		lblChance_1.setBounds(85, 16, 10, 38);
		panel_36.add(lblChance_1);
		lblChance_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblChance_1.setUI(new VerticalLabelUI(true));
		
		JPanel panel_37 = new JPanel();
		panel_37.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_37.setBackground(new Color(127, 255, 212));
		panel_37.setBounds(0, 230, 100, 65);
		panel.add(panel_37);
		panel_37.setLayout(null);
		
		JPanel canvas_18 = new JPanel();
		canvas_18.setBackground(Color.BLUE);
		canvas_18.setBounds(83, 2, 15, 61);
		panel_37.add(canvas_18);
		
		JLabel lblParkPlace = new JLabel("PARK");
		lblParkPlace.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblParkPlace.setBounds(71, 14, 10, 30);
		lblParkPlace.setUI(new VerticalLabelUI(true));
		panel_37.add(lblParkPlace);
		
		JLabel lblPlace_2 = new JLabel("PLACE");
		lblPlace_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPlace_2.setBounds(61, 12, 10, 43);
		lblPlace_2.setUI(new VerticalLabelUI(true));
		panel_37.add(lblPlace_2);
		
		JLabel label_14 = new JLabel("$350");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_14.setBounds(5, 19, 10, 30);
		label_14.setUI(new VerticalLabelUI(true));
		panel_37.add(label_14);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_38.setBackground(new Color(127, 255, 212));
		panel_38.setBounds(0, 165, 100, 65);
		panel.add(panel_38);
		panel_38.setLayout(null);
		
		JLabel lblLuxury = new JLabel("LUXURY");
		lblLuxury.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLuxury.setBounds(85, 13, 10, 45);
		lblLuxury.setUI(new VerticalLabelUI(true));
		panel_38.add(lblLuxury);
		
		JLabel lblTax = new JLabel("TAX");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTax.setBounds(75, 20, 10, 26);
		lblTax.setUI(new VerticalLabelUI(true));
		panel_38.add(lblTax);
		
		JLabel label_37 = new JLabel("PAY $100");
		label_37.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_37.setBounds(5, 6, 10, 55);
		label_37.setUI(new VerticalLabelUI(true));
		panel_38.add(label_37);
		
		JLabel luxuryTax38 = new JLabel("New label");
		luxuryTax38.setBounds(25, 10, 48, 46);
		panel_38.add(luxuryTax38);
		luxuryTax38.setUI(new VerticalLabelUI(true));
		panel_38.add(luxuryTax38);
		ImageIcon imagei38 = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\luxT2.png");
		Image image38 = imagei38.getImage();
		Image lastImage38 = image38.getScaledInstance(luxuryTax38.getWidth(), luxuryTax38.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon lTaxIcon = new ImageIcon(lastImage38);
		luxuryTax38.setIcon(lTaxIcon);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_39.setBackground(new Color(127, 255, 212));
		panel_39.setBounds(0, 100, 100, 65);
		panel.add(panel_39);
		panel_39.setLayout(null);
		
		JPanel canvas_17 = new JPanel();
		canvas_17.setBackground(Color.BLUE);
		canvas_17.setBounds(83, 2, 15, 61);
		panel_39.add(canvas_17);
		
		JLabel lblBoard = new JLabel("BOARD");
		lblBoard.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblBoard.setBounds(71, 12, 10, 38);
		lblBoard.setUI(new VerticalLabelUI(true));
		panel_39.add(lblBoard);
		
		JLabel lblwalk = new JLabel("-WALK");
		lblwalk.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblwalk.setBounds(61, 12, 10, 43);
		lblwalk.setUI(new VerticalLabelUI(true));
		panel_39.add(lblwalk);
		
		JLabel label_15 = new JLabel("$400");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_15.setBounds(5, 19, 10, 30);
		label_15.setUI(new VerticalLabelUI(true));
		panel_39.add(label_15);
		
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
		
		JLabel railR = new JLabel("New label");
		railR.setBounds(387, 322, 166, 163);
		panel_25.add(railR);
		ImageIcon imagei = new ImageIcon("C:\\Users\\lugdu\\eclipse-workspace\\Monopoly\\src\\Railroad.png");
		Image image = imagei.getImage();
		Image lastImage = image.getScaledInstance(railR.getWidth(), railR.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon railRIcon = new ImageIcon(lastImage);
		railR.setIcon(railRIcon);
		
		JLabel label_27 = new JLabel("$200");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_27.setBounds(19, 85, 30, 10);
		panel_25.add(label_27);
		

	
	}
}
