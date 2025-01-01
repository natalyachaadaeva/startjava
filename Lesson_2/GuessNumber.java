import java.util.Scanner;

class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.targetNumber = (int) (Math.random() * 100) + 1;
    }

    public void play() {
        Player currentPlayer = player1;
        Scanner scanner = new Scanner(System.in);

        while (currentPlayer.getNumber() != targetNumber) {
            System.out.println(currentPlayer.getName() + ", угадайте число от 1 до 100:");
            int guessedNumber = scanner.nextInt();
            currentPlayer.setNumber(guessedNumber);
            currentPlayer = (currentPlayer == player1) ? player2 : player1;

            if (targetNumber < guessedNumber) {
                System.out.println("Число меньше того, что загадал компьютер");
            } else if (targetNumber > guessedNumber) {
                System.out.println("Число больше того, что загадал компьютер");
            }
        }
        System.out.println("Поздравляем, " + currentPlayer.getName() + ", вы угадали число!");
    }
}