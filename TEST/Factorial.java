import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        int factorialNumber = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= factorialNumber; i++) {
            result = result * i;
        }
        System.out.println("Output: " + result);
    }
}