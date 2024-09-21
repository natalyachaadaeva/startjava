
public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        char operation = '^';
        int result = 0;

        if (operation == '+') {
            result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        } else if (operation == '-') {
            result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        } else if (operation == '*') {
            result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        } else if (operation == '/') {
            if (b != 0) {
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
            } else {
                System.out.println("На ноль делить нельзя");
            }
        } else if (operation == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            System.out.println(a + " ^ " + b + " = " + result);
        } else if (operation == '%') {
            if (b != 0) {
                result = a % b;
                System.out.println(a + " % " + b + " = " + result);
            } else {
                System.out.println("На ноль делить нельзя");
            }
        } else {
            System.out.println("Неверное выражение");
        }
    }
}