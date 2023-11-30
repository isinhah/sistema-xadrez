package src.boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces; //Matriz de peças

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns]; //Instanciação das peças informando linhas e colunas
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    //Retorna a peça com linha e coluna
    public Piece piece(int row, int column) {
        return pieces[row][column];
    }

    //Retorna a peça pela posição
    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
}
