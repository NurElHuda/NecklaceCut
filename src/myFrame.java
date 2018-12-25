import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {

    private final String titel = "Necklace Cut";
    private Necklace necklace;
    private Cut cut;

    public myFrame() throws HeadlessException {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        setSize(960, 860);
        setPreferredSize(new Dimension(1100, 620));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MainPanel(this).$$$getRootComponent$$$());
        repaint(1000);
        pack();
    }
}
