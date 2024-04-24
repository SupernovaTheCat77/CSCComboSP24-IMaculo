import java.util.Scanner;

public class TicTacToe {
	
	int player = 1;

	public static void main(String[] args) {
		String[][] board = makeBoard();
		printBoard(board);
		makeMove(board, 1);
		printBoard(board);
	}
	
	public static String[][] makeBoard() {
		String[][] board = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = i; j < i+3; j++) board[i][j-i] = String.valueOf((2*i)+j);
		}
		return board;
	}
	
	public static void printBoard(String[][] board) {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + board[i][j]);
				if (j != 2) System.out.print(" |");
			}
			if (i !=2) System.out.println("\n-----------");
		}
		System.out.println();
	}
	
	public static String[][] makeMove(String[][] board, int player) {
		int choice = -1;
		Scanner input = new Scanner(System.in);;
		while ((choice < 1 || choice > 9) || !board[(choice - 1) / 3][(choice - 1) % 3].equals(String.valueOf(choice))) {
			System.out.print("Player " + player + ", make your move: ");
			choice = input.nextInt();
		}
		String fill = "X";
		if (player == 2) fill = "O";
		
		for (int i = 0; i < 3; i++) {
			for (int j = i; j < i+3; j++) {
				if (((2*i)+j) == choice) board[i][j-i] = fill;
			}
		}
		player = (player%2)+1;
		return board;
	}
}
