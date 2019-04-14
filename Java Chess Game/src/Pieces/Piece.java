package Pieces;
import Game.*;

public abstract class Piece {

	//The location of each piece
	public Pair place;
	
	//The owner of each piece
	public Player owner;
	
	//The type of each piece
	public pieceType m_type;
	
	//Constructor for pieces
	public Piece(pieceType type, Pair coord, Player own) {
		
		m_type = type;
		owner = own;
		place = coord;
	}
	
	//Abstract method to take in an end location and validate it for each piece
	public abstract boolean isValidPath(Pair endLocation);
	
	
}
