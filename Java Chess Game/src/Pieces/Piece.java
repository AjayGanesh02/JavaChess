package Pieces;
import Game.*;

public abstract class Piece {

	//The location of each piece
	public Pair place;
	
	//The owner of each piece
	public Player owner;
	
	//Constructor for pieces
	public Piece(Pair coord, Player own) {
		
		owner = own;
	}
	
	//Abstract method to take in an end location and validate it for each piece
	public abstract boolean isValidPath(Pair endLocation);
}
