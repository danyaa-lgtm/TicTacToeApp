public class TicTacToeApp {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human's turn");
            } else {
                System.out.println("Computer's turn");
            }

            gameOver = checkGameOver();

            isHumanTurn = !isHumanTurn;
        }

        System.out.println("Game Over");
    }

    static boolean checkGameOver() {
        return false;
    }
}