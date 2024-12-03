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
        while (true) {
            System.out.println(currentPlayer.getName() + ", угадайте число от 1 до 100:");
            currentPlayer.setNumber(new Scanner(System.in).nextInt());

            if (currentPlayer.getNumber() == targetNumber) {
                System.out.println("Поздравляем, " + currentPlayer.getName() + ", вы угадали число!");
                break;
            } else if (targetNumber < currentPlayer.getNumber()) {
                System.out.println("Число  меньше того, что загадал компьютер");
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else if (targetNumber > currentPlayer.getNumber()) {
                System.out.println("Число больше того, что загадал компьютер");
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }
}