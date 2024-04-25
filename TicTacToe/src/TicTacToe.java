import java.util.Scanner;

public class TicTacToe {
	
	int player = 1;

	public static void main(String[] args) {
		String[][] board = makeBoard();
		int turnCount = 0;
		int player = 1;
		
		while (turnCount < 9) {
			printBoard(board);
			makeMove(board, player);
			player = (player%2)+1;
			printBoard(board);
		}
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
	
	private static void makeMove(String[][] board, int player) {
		int pick = -1;
		Scanner input = new Scanner(System.in);
		
		while (pick < 0 || pick > 8 || board[(pick)/3][(pick)%3].equals(String.valueOf(pick))) {
			System.out.print("\nPlayer " + player + ", input your next move: ");
			pick = input.nextInt();
		}
		String piece = "O";
		if (player == 1) {
			piece = "X";
		}
		board[(pick) / 3][(pick) % 3] = piece;
	}
}
