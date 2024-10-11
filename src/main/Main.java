package main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Xadrez");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Programa encerra quando janela é fechada
        window.setResizable(true);

        GamePanel g = new GamePanel();
        window.add(g);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        g.launchGame(); // Chamamos esse método para iniciar o Thread após iniciar a janela
    }
}