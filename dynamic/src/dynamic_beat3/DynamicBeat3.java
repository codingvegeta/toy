package dynamic_beat3;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Logger;

public class DynamicBeat3 extends JFrame {

    private Image screenImage;
    private Graphics screenGraphic;
    private Image introBackground;

    public DynamicBeat3() {
        setTitle("Dynamic Beat");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();

        Music introMusic = new Music("y2mate.com - Jay Sean  With You ft Gucci Mane Asian Doll_320kbps.mp3", true);
        introMusic.start();
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
