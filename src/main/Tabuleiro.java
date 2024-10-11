package main;

import java.awt.*;

public class Tabuleiro {
    final int MAX_COL = 8;
    final int MAX_ROW = 8;
    public static final int SQUARE_SIZE = 90;
    public static final int HALF_SQUARE_SIZE = SQUARE_SIZE / 2;

    public void draw(Graphics2D g2) {
        boolean cor_preta = false;

        for(int row = 0; row < MAX_ROW; row++) {
            for (int col = 0; col < MAX_COL; col++) {
                if(!cor_preta) { // Pinta as colunas
                    g2.setColor(new Color(230, 230, 230));
                    cor_preta = true;
                }
                else {
                    g2.setColor(new Color(25, 25, 25));
                    cor_preta = false;
                }
                g2.fillRect(col*SQUARE_SIZE, row*SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            }

            cor_preta = !cor_preta; // Pinta as linhas
        }
    }
}