package dynamic_beat2;

import javax.swing.*;
import java.awt.*;

public class DynamicBeat2 extends JFrame {

    private Image screenImage;
    private Graphics screenGraphic;
    private Image introBackground;

    public DynamicBeat2() {
        setTitle("Dynamic Beat");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();

    }

    public void paint(Graphics graphics) {
        screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw(screenGraphic);
        graphics.drawImage(screenImage, 0, 0, null);
    }

    public void screenDraw(Graphics graphics) {
        graphics.drawImage(introBackground, 0, 0, null);
        this.repaint();
    }
}
