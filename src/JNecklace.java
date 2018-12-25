import javax.swing.*;
import java.awt.*;

public class JNecklace extends JComponent {

    private int[] chain;

    public JNecklace(Necklace necklace) {
        this.chain = necklace.getChain();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawLine(0, 0, 1, 0);

        g2.drawLine(8, 51, 996, 51);

        Rectangle box = new Rectangle(12, 42, 18, 18);

        for (int elt : chain) {
            switch (elt) {
                case 0: {
                    g2.setColor(Color.red);
                    break;
                }
                case 1: {
                    g2.setColor(Color.blue);
                    break;
                }
                case 2: {
                    g2.setColor(Color.yellow);
                    break;
                }
                case 3: {
                    g2.setColor(Color.green);
                    break;
                }
                case 4: {
                    g2.setColor(Color.orange);
                    break;
                }
            }
            g2.fill(box);
            box.translate(26, 0);
        }
    }
}
