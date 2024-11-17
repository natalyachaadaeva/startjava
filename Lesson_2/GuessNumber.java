import java.util.Scanner;

class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.targetNumber = (int) (Math.random() * 100) + 1;
    }

    public void play() {
        while (targetNumber != player1.getNumber() || targetNumber != player2.getNumber()) {
            System.out.println(player1.getName() + ", угадайте число от 1 до 100:");
            player1.setNumber(scanner.nextInt());
            if (targetNumber == player1.getNumber()) {
                System.out.println("Поздравляем, " + player1.getName() + ", вы угадали число!");
                break;
            }
            if (targetNumber < player1.getNumber()) {
                System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player1.getNumber() + "  больше того, что загадал компьютер");
            }
            System.out.println(player2.getName() + ", угадайте число от 1 до 100:");
            player2.setNumber(scanner.nextInt());
            if (targetNumber == player2.getNumber()) {
                System.out.println("Поздравляем, " + player2.getName() + ", вы угадали число!");
                break;
            }
            if (targetNumber < player2.getNumber()) {
                System.out.println("Число " + player2.getNumber() + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player2.getNumber() + " больше того, что загадал компьютер");
            }
        }
    }
}