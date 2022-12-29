package dynamic_beat3;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Music extends Thread {
    private Player player;
    private boolean isLoop;
    private File file;
    private FileInputStream fis;
    private BufferedInputStream bis;

    public Music(String name, boolean isLoop) {
        try {
            this.isLoop = isLoop;
            file = new File(Main.class.getResource("../music/" + name).toURI());
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(bis);
            player = new Player(bis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getTime() {
        if (player == null) {
            return 0;
        }
        return player.getPosition();
    }

    public void close() {
        isLoop = false;
        player.close();
        this.interrupt();
    }

    @Override
    public void run() {
        try {
            do {
                player.play();
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(bis);
                player = new Player(bis);
            } while (isLoop);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Music{" +
                "player=" + player +
                ", isLoop=" + isLoop +
                ", file=" + file +
                ", fis=" + fis +
                ", bis=" + bis +
                '}';
    }
}
