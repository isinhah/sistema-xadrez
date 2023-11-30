package src.application.boardgame;

public class Piece {
    protected Position position; //Posição do xadrez
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //Apenas subclasse (ChessPiece) pode acessar o tabuleiro
    protected Board getBoard() {
        return board;
    }
}
