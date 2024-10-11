package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    public static final int WIDTH = 720;
    public static final int HEIGHT = 720;
    final int FPS = 60;
    Thread gameThread;
    Tabuleiro board = new Tabuleiro();

    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
    }

    public void launchGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() { // Game loop
        double drawInterval = (double) 1000000000 /FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while(gameThread != null) {
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime)/drawInterval;
            lastTime = currentTime;

            if(delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }
    }

    private void update() { // Lida com atualizações

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        board.draw(g2);
    }


}
