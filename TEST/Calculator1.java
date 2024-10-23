import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scan.nextLine();
        String[] parts = input.split("[\\+\\-\\*\\/]");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        char operation = input.charAt(parts[0].length());
        int result = 0;
        if (operation == '+') {
            result = a + b;
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '*') {
            result = a * b;
        } else if (operation == '/') {
            if (b == 0) {
                System.out.println("Деление на ноль не поддерживается");
                return;
            }
            result = a / b;
        } else {
            System.out.println("Знак " + operation + " не поддерживается");
            return;
        }
        System.out.println("Output: " + result);
    }
}