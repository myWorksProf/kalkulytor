package dop_homeWork.dop_1;

import java.util.Scanner;

public class ugadaiChislo {
    public static void main(String[] args) {
        System.out.println("Угадай число!");
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("a = " + a);
    }
}
