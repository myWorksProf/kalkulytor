import java.util.Scanner;

import static java.lang.System.*;

public class main {

    public static void main(String[] args) {
        boolean replay = true;
        while (replay) {
            calculations();
        }
    }

    public static void calculations() {
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
        String operation = scanner.next();
        int result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else if (operation == 4) {
            result = a / b;
        } else {
            result = a % b;
        }

        System.out.println("Результат = " + result);

    }
            System.out.print("Проведем еще вычесления?  y/n - ");
    String otvet = scanner.next();
            if(otvet.equals("n"))

    {
        replay = false;
        break;
    }
}
