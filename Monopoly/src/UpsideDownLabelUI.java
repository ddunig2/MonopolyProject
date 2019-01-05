import javax.swing.*;
import java.awt.geom.AffineTransform;
import java.awt.*;
import javax.swing.plaf.basic.BasicLabelUI;

public class UpsideDownLabelUI extends BasicLabelUI {
	static {
		labelUI = new VerticalLabelUI(false);
	}

	@Override
	public Dimension getPreferredSize(JComponent c) {
		Dimension dim = super.getPreferredSize(c);
		return new Dimension(dim.height, dim.width);
	}

	private static Rectangle paintIconR = new Rectangle();
	private static Rectangle paintTextR = new Rectangle();
	private static Rectangle paintViewR = new Rectangle();
	private static Insets paintViewInsets = new Insets(0, 0, 0, 0);

	@Override
	public void paint(Graphics g, JComponent c) {
		JLabel label = (JLabel) c;
		String text = label.getText();
		Icon icon = (label.isEnabled()) ? label.getIcon() : label.getDisabledIcon();
		if ((icon == null) && (text == null)) {
			return;
		}
		FontMetrics fm = g.getFontMetrics();
		paintViewInsets = c.getInsets(paintViewInsets);

		paintViewR.x = paintViewInsets.left;
		paintViewR.y = paintViewInsets.top;

		// Use inverted height &amp; width
		paintViewR.height = c.getHeight() - (paintViewInsets.left + paintViewInsets.right);
		paintViewR.width = c.getWidth() - (paintViewInsets.top + paintViewInsets.bottom);

		paintIconR.x = paintIconR.y = paintIconR.width = paintIconR.height = 0;
		paintTextR.x = paintTextR.y = paintTextR.width = paintTextR.height = 0;

		String clippedText = layoutCL(label, fm, text, icon, paintViewR, paintIconR, paintTextR);

		Graphics2D g2 = (Graphics2D) g;
		AffineTransform tr = g2.getTransform();

		g2.rotate(Math.toRadians(180));
		g2.translate(-c.getWidth(), -c.getHeight());
		if (icon != null) {
			icon.paintIcon(c, g, paintIconR.x, paintIconR.y);
		}

		if (text != null) {
			int textX = paintTextR.x;
			int textY = paintTextR.y + fm.getAscent();
			if (label.isEnabled()) {
				paintEnabledText(label, g, clippedText, textX, textY);
			} else {
				paintDisabledText(label, g, clippedText, textX, textY);
			}
		}
		g2.setTransform(tr);
	}
}