import java.util.Scanner;

import static java.lang.System.*;
public class main {

    public static void main(String[] args) {
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
        out.print("Введите ноиер операции = ");
        int operation = scanner.nextInt();
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
}
