package me.camdenorrb.shanechess;

import java.awt.*;


public class Board extends Canvas {

	public static final int BOX_SIZE = 50;

	private final int cols, rows;

	public Board(int cols, int rows) {
		this.cols = cols;
		this.rows = rows;
	}


	@Override
	public void paint(final Graphics graphics) {
		System.out.println(getSize());
		graphics.setColor(Color.RED);
		graphics.fillRect(0, 0, getWidth(), getHeight());
	}


	public int getCols() {
		return cols;
	}

	public int getRows() {
		return rows;
	}

}