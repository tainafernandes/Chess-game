package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch(){ //Passo a informação que tem que ser um board de 8x8
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces(){ //Retorna a matriz com as peças correspondentes a partida
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows(); i ++){
            for (int j = 0; j < board.getColumns(); j ++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
