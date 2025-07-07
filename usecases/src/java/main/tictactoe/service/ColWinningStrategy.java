package src.java.main.tictactoe.service;

import src.java.main.tictactoe.model.Board;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean isWin(int row, int col, Board board) {
        return false;
    }
}
