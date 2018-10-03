package Checkers;

public class Board{
	private Piece[][] board = new Piece [8][8];
	
	public void setPiece(Piece p, int x, int y){
		//error if x and y are <;
		board[x][y] = p;
	}
	
	public boolean checkOccupied(int x, int y){
		return (board [x][y]!=null); 
	}
}