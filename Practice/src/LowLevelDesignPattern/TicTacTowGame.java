package LowLevelDesignPattern;

 enum PieceType{
	X,
	O;
}
 
 class PlayingPiece {
	 
	 PieceType pieceType;
	 
	 PlayingPiece(PieceType pieceType){
		 this.pieceType = pieceType;
	 }
	 
 }
 
 class PieceTypeX extends PlayingPiece{

	PieceTypeX(PieceType pieceType) {
		super(pieceType.X);
		// TODO Auto-generated constructor stub
	}
	 
 }
 
 class PieceTypeO extends PlayingPiece{

	PieceTypeO(PieceType pieceType) {
		super(pieceType);
		// TODO Auto-generated constructor stub
	}
	 
 }

 class Board{
	 
	 int size;
	 PlayingPiece board[][];
	 
	 public Board(int size) {
		 this.size = size;
		 board = new PlayingPiece[size][size];
	 }
 }

public class TicTacTowGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 0;
		int column = 0;
		int arr[][] = new int[4][4];
		
		for(int i = 0; i<4 ; i++) {
			for(int j = 0;j<4 ; j++) {
				if(i==j) {
					arr[i][j] = 1;
				}
			}
		}
		
		for(int i =0 ;i<arr.length ; i++) {
			for(int j = 0;j<4 ; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
