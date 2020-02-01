package me.camdenorrb.shanechess;

import org.jetbrains.annotations.Nullable;


public final class Cell {

	private final int x, y;

	private final boolean isBlack;

	@Nullable
	public Piece piece;


	public Cell(final int x, final int y, final boolean isBlack) {
		this(x, y, isBlack, null);
	}

	public Cell(final int x, final int y, final boolean isBlack, @Nullable final Piece piece) {
		this.x = x;
		this.y = y;
		this.isBlack = isBlack;
		this.piece = piece;
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isBlack() {
		return isBlack;
	}

	@Nullable
	public Piece getPiece() {
		return piece;
	}
}
