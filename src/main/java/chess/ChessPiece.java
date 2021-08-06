package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import javax.swing.Popup;

public abstract class ChessPiece extends Piece {

  private Color color;

  public ChessPiece(Board board, Color color) {
    super(board, color);
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  protected boolean isThereOpponentePiece(Position position){
    ChessPiece p = (ChessPiece) getBoard().piece(position);
    return p != null && p.getColor() != color;
  }

}
