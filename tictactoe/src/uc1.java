public class uc1 {

    static char[][] board = new char[3][3];

        static void initializeBoard() {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = '-';
                }
            }
        }
        static void printBoard() {
            System.out.println("\n--- Tic-Tac-Toe Board ---");
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    System.out.print(board[row][col] + " ");
                }
                System.out.println();
            }
            System.out.println("-------------------------");
        }

        public static void main(String[] args) {
            initializeBoard();
            printBoard();
        }
    }
