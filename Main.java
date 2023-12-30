import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        char[][] board = {
                {'p', 'O', '9'},
                {'O', 'X', 'O'},
                {'X', 'X', 'O'}
        };

        printTicTacToeBoard(board);
    }
   public static void printTicTacToeBoard(char[][] board) {
    for (char[] row : board) {
        for (int col = 0; col < row.length; col++) {
            System.out.print(row[col]);

            if (col < row.length - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println();

        if (Arrays.asList(board).indexOf(row) < board.length - 1) {
            System.out.println("---------");
        }
    }
}

}