class Calculator {
    public int calculate(int a, char operation, int b) {
        if (operation == '/' || operation == '%' && b == 0) {
            System.out.println("Ошибка: деление на ноль запрещено");
            return 0;
        }
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '^':
                int result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                return result;
            case '%':
                return a % b;
            default:
                System.out.println("Ошибка: операция '" + operation + "' не поддерживается.");
                System.out.println("Доступны следующие операции: +, -, *, /, ^, %");
                return 0;
        }
    }
}