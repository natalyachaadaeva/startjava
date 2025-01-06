package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока:");
        String player1Name = scanner.nextLine();
        Player player1 = new Player(player1Name);

        System.out.println("Введите имя второго игрока:");
        String player2Name = scanner.nextLine();
        Player player2 = new Player(player2Name);

        String continueGame = "yes";

        while (continueGame.equals("yes")) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.play();

            System.out.println("Хотите продолжить игру? [yes/no]:");
            continueGame = scanner.nextLine();

            while (!continueGame.equals("yes") && !continueGame.equals("no")) {
                System.out.println("Пожалуйста, введите 'yes' или 'no':");
                continueGame = scanner.nextLine();
            }
        }
        System.out.println("Игра завершена.");
    }
}