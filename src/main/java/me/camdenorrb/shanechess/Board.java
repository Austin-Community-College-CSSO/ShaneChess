package me.camdenorrb.shanechess;

import java.awt.*;


public class Board extends Canvas {

	public static final int BOX_SIZE = 50;

	private final int cols, rows;

	private final Cell[][] cells;


	public Board(int cols, int rows) {

		this.cols = cols;
		this.rows = rows;
		this.cells = new Cell[cols][rows];

		for (int x = 0; x < cols; x++) {
			for (int y = 0; y < rows; y++) {
				final boolean isBlack = (x % 2 == 0 && y % 2 != 0) || (y % 2 == 0 && x % 2 != 0);
				cells[x][y] = new Cell(x, y, isBlack);
			}
		}

		setSize(cols * BOX_SIZE, rows * BOX_SIZE);
	}


	@Override
	public void paint(final Graphics graphics) {

		System.out.println(getSize());

		graphics.setColor(Color.RED);
		//graphics.fillRect(0, 0, getWidth(), getHeight());

		for (int x = 0; x < cols; x++) {
			for (int y = 0; y < rows; y++) {
				final Cell cell = cells[x][y];
			}
		}
	}


	public int getCols() {
		return cols;
	}

	public int getRows() {
		return rows;
	}

}