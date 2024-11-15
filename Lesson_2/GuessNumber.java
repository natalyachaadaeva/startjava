import java.util.Scanner;

class GuessNumber {
    private Player player1;
    private Player player2;
    private int winNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.winNumber = (int) (Math.random() * 100) + 1;
    }

    public void play() {
        while (true) {
            System.out.println(player1.getName() + ", угадайте число от 1 до 100:");
            player1.setNumber(new Scanner(System.in).nextInt());

            if (player1.getNumber() == winNumber) {
                System.out.println("Поздравляем, " + player1.getName() + ", вы угадали число!");
                break;
            } else {
                System.out.println(player2.getName() + ", угадайте число от 1 до 100:");
                player2.setNumber(new Scanner(System.in).nextInt());

                if (player2.getNumber() == winNumber) {
                    System.out.println("Поздравляем, " + player2.getName() + ", вы угадали число!");
                    break;
                }
            }
        }
    }
}