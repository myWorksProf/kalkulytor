import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        calculations();
    }

    public static void calculations() {
        boolean replay = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число = ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число = ");
        int b = scanner.nextInt();
        out.println("1. Сложение ( + )");
        out.println("2. Вычитание ( - )");
        out.println("3. Умножение ( * )");
        out.println("4. Деление ( / )");
        out.println("5. Остаток от деления ( % )");
        out.print("Введите номер операции или знак операции - ");
        char operation = scanner.next().charAt(0);
        int result = 0;
        if (operation == 1 || operation == '+') {
            result = a + b;
        } else if (operation == 2 || operation == '-') {
            result = a - b;
        } else if (operation == 3 || operation == '*') {
            result = a * b;
        } else if (operation == 4 || operation == '/') {
            result = a / b;
        } else if (operation == 5 || operation == '%') {
            result = a % b;
        }

        System.out.println(result);
        System.out.print("Проведем еще вычесления?  y/n - ");
        char otvet = scanner.next().charAt(0);
        if (otvet == 'n') {
            replay = false;
        }
        while (replay) {
            calculations();

        }
    }
}
