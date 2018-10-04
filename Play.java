import Checkers.*;
import java.util.Scanner;

public class Play{
	public static void main(String[] args){
		Board board = new Board();
		Piece r1 = new Piece();
		Piece b1 = new Piece();
		
		r1.set(Color.RED);
		b1.set(Color.BLACK);
		board.setPiece(b1,0,0);
		board.setPiece(r1,7,7);
		
		System.out.println("Location 2x2 is occupied: " + board.checkOccupied(2,2));
		System.out.println("Location 7x7 is occupied: " + board.checkOccupied(7,7));
		System.out.println("Color of the piece at 7x7 is: " + r1.getColor());
		System.out.println("Color of the piece at 7x7 is: " + board.checkColor(7,7));
	}
}