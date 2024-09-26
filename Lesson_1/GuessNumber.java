import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // компьютер "загадывает" число от 1 до 100
        int computerNumber = 4;
        Scanner console = new Scanner(System.in);
        int playerNumber;
        System.out.println("Введите число: ");
        playerNumber = console.nextInt();
        while (playerNumber != computerNumber) {
            if (playerNumber < computerNumber) {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
            } else {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
            }
            System.out.println("Попробуйте снова: ");
            playerNumber = console.nextInt();
        }
        System.out.println("Вы победили! Компьютер загадал число: " + computerNumber);
    }
}