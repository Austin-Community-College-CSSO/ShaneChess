package me.camdenorrb.shanechess;

import javax.swing.*;
import java.awt.*;


public class Game {

    private boolean isRunning = false;

    private final Board board = new Board(10 /*Cols*/, 10 /*Rows*/);

    final JFrame frame = new JFrame("Chess") {{
        setPreferredSize(new Dimension(board.getCols() * Board.BOX_SIZE, board.getRows() * Board.BOX_SIZE));
        add(board);
        pack();
    }};


    public void start() {

        if (isRunning) {
            return;
        }

        frame.setVisible(true);

        isRunning = true;
    }

    public void stop() {

        if (!isRunning) {
            return;
        }

        frame.setVisible(false);

        isRunning = false;
    }

}
