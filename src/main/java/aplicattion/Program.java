package aplicattion;

import chess.ChessExeption;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ChessMatch chessMatch = new ChessMatch();

    while (true) {
      try {
        UI.clearScreen();
        UI.printBoard(chessMatch.getPieces());
        System.out.println();
        System.out.print("Origem: ");
        ChessPosition source = UI.readChessPosition(sc);

        boolean[][] possibleMoves = chessMatch.possibleMoves(source);
        UI.clearScreen();
        UI.printBoard(chessMatch.getPieces(), possibleMoves);
        System.out.println();
        System.out.print("Destino: ");
        ChessPosition target = UI.readChessPosition(sc);

        ChessPiece capiturePiece = chessMatch.performeChessMove(source, target);
      } catch (ChessExeption e) {
        System.out.println(e.getMessage());
        sc.nextLine();
      } catch (InputMismatchException e) {
        System.out.println(e.getMessage());
        sc.nextLine();
      }

    }
  }
}