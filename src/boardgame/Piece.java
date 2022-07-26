package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() { //so classes e subclasses podem acessar
        return board;
    }
    //Tira o set pq o tabuleiro não pode ser alterado


}
