package boardgame;

public abstract class Piece {

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

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){ //Metodo comum retornando um abstrato - Hook metódo
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length; j++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
