import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char operation = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            int result = calculator.calculate(a, operation, b);
            System.out.println("Результат:" + result);

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next().toLowerCase();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Пожалуйста, введите 'yes' или 'no': ");
                answer = scanner.next();
            }
        }
    }
}