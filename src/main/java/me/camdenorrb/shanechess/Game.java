package me.camdenorrb.shanechess;

import javax.swing.*;


public class Game {

    private boolean isRunning = false;

    private final Board board = new Board(8 /*Cols*/, 8 /*Rows*/);

    final JFrame frame = new JFrame("Chess") {{
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
