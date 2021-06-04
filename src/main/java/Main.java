package main.java;

import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Перше завдання.");
        System.out.println("2. Друге завдання.");
        System.out.println("3. Третє завдання.");
        System.out.println("4. Четверте завдання.");
        System.out.println("5. Вихід.");
        System.out.print("Введіть число : ");
        int num = scanner.nextInt();
        while (num != 5) {
            switch (num) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                /*case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;*/
                default:
                    System.out.println("Не вірно введене число!!! Повторіть спробу :");
                    break;
            }
            System.out.println("1. Перше завдання.");
            System.out.println("2. Друге завдання.");
            System.out.println("3. Третє завдання.");
            System.out.println("4. Четверте завдання.");
            System.out.println("5. Вихід.");
            System.out.print("Введіть число : ");
            num = scanner.nextInt();
        }
        System.out.println("1. Перше завдання.");
        System.out.println("2. Друге завдання.");
        System.out.println("3. Третє завдання.");
        System.out.println("4. Четверте завдання.");
        System.out.println("5. Вихід.");
        System.out.print("Введіть число : ");
        num = scanner.nextInt();
    }
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уведіть ваш вік");
        int year = scanner.nextInt();

        switch (year) {
            case 1, 21, 31, 41, 51, 61, 71, 81, 91:
                System.out.println("Вам "+ year+" рік");
                break;
            case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54,
                    62, 63, 64, 72, 73, 74, 82, 83, 84, 92, 93, 94:
                System.out.println("Вам "+year +" роки");
                break;
            case 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 27, 28, 29, 30,
                    35, 36, 37, 38, 39, 40, 45, 46, 47, 48, 49, 50, 55, 56, 57, 58, 59, 60, 65, 66,
                    67, 68, 69, 70, 75, 76, 77, 78, 79, 80, 85, 86, 87, 88, 89, 90, 95, 96, 97, 98, 99:
                System.out.println("Вам "+year+" років");
                break;
            default:
                System.out.println("Не вірно введене число");
        }
    }
    public static void task2() {
    int a = 0,b = 3;
    double dx= 0.05d;
        for (double x = a; x <= b; x += dx) {
           double y = Math.pow(4, -Math.cos(x));
           System.out.print(String.format("%.2f", x) + "\t" + String.format("%.2f", y) + "\n");
     }
        double x=a;
        do{
            double y = Math.pow(4, -Math.cos(x));
            System.out.println("x = " + String.format("%.2f", x) + "\ty = " + String.format("%.2f", y));
            x +=dx;
        }while (x<=b);
    }
    public static void task3() {

    }
}

