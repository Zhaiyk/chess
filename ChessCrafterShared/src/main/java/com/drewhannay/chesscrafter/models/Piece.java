package com.drewhannay.chesscrafter.models;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class Piece {
    private final int mTeamId;
    private final PieceType mPieceType;

    private int mMoveCount;

    public Piece(int teamId, PieceType pieceType) {
        mTeamId = teamId;
        mPieceType = pieceType;

        mMoveCount = 0;
    }

    @Deprecated
    public int getTeamId(Game game) {
        return mTeamId;
    }

    @Deprecated
    public PieceType getPieceType() {
        return mPieceType;
    }

    @Deprecated
    public ChessCoordinate getCoordinates() {
        return null;
    }

    @Deprecated
    public void setCoordinates(ChessCoordinate coordinates) {
    }

    @Deprecated
    public int getMoveCount() {
        return mMoveCount;
    }

    @Deprecated
    public long getId() {
        return 0;
    }

    public int getTeamId() {
        return mTeamId;
    }

    public boolean hasMoved() {
        return mMoveCount != 0;
    }

    public void incrementMoveCount() {
        mMoveCount++;
    }

    public void decrementMoveCount() {
        mMoveCount--;
    }

    public List<ChessCoordinate> getMovesFrom(@NotNull ChessCoordinate coordinate, @NotNull BoardSize boardSize) {
        return mPieceType.getMovesFrom(coordinate, boardSize);
    }

    @Override
    public String toString() {
        return mPieceType.toString();
    }
}
