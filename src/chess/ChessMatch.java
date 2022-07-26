package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch(){ //Passo a informação que tem que ser um board de 8x8
        board = new Board(8, 8);
        inicialSetup(); //Quando cria a partida, cria o tabuleiro e chama o inicialSetup
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

    private void inicialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
    }
}
