package src.chess;

import src.boardgame.Board;

//Regras do jogo
public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    //Retorna matriz de peças de xadrez da partida
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i=0; i< board.getRows(); i++) {
            for (int j=0; j< board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j); //Downcasting -> Peça de xadrez
            }
        }
        return mat;
    }

}
