
public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        char operation = '^';
        int result = 0;
        if (operation == '+') {
            result = a + b;
        } else if (operation == '-') {
                result = a - b;
        } else if (operation == '*') {
            result = a * b;
        } else if (operation == '/') {
        if (b != 0) {
        result = a / b;
        } else {
            System.out.println("Деление на ноль не поддерживается");
        }
        } else if (operation == '^') {
        result = 1;
        for (int i = 0; i < b; i++) {
        result *= a;
        }
        } else if (operation == '%') {
        if (b != 0) {
        result = a % b;
        } else {
        System.out.println("Деление на ноль не поддерживается");
        }
        } else  {
        System.out.println("Знак "  + operation +  " не поддерживается");
        }
        if (operation == '*' || operation == '/' || operation == '-' || operation == '+' 
            || operation == '%' || operation == '^') {
        System.out.println(a + " " + operation + " " + b + " = " + result); 
        } 
    }
}