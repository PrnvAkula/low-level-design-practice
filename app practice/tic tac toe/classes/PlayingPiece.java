package classes;

import enums.PieceType;

public abstract class PlayingPiece {
    PieceType pieceType;

    public PlayingPiece(PieceType pieceType){
        this.pieceType = pieceType;
    }

    public PieceType getPieceType(){
        return pieceType;
    }
}
