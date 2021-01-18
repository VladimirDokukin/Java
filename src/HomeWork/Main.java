package HomeWork;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        //FunctionSolve();
        //SecondTask();
        //ThirdTask();
        //FourthTask();
        FifthTask();
        scanner.close();

    }

    public static void FunctionSolve() {
        int a, b, c, d;
        System.out.println("Решение - a * (b + (c/d))\nВведите значение a");
        a = scanner.nextInt();
        System.out.println("Введите значение b");
        b = scanner.nextInt();
        System.out.println("Введите значение c");
        c = scanner.nextInt();
        System.out.println("Введите значение d");
        d = scanner.nextInt();

        float nd = (float) c / d;
        float result = a * (b + nd);
        System.out.println(result);
    }

    public static void SecondTask() {
        int a, b, c;
        System.out.println("Введите первое целое число");
        a = scanner.nextInt();
        System.out.println("Введите второе челое число");
        b = scanner.nextInt();
        c = a + b;

        if (10 <= c && c <= 20) {
            System.out.println("Число " + c + " лежит в диапазоне от 10 до 20");
        } else {
            System.out.println("Число " + c + " не лежит в диапазоне от 10 до 20");
        }
    }

    public static void ThirdTask() {
        int a;
        System.out.println("Введите целое число");
        a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Введеное число положительное: " + a);
        } else {
            System.out.println("Введеное число отрицательное: " + a);
        }
    }

    public static void FourthTask() {
        String name;
        System.out.println("Введите строку");
        name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
    }

    public static void FifthTask() {
        int year;
        System.out.println("Введите год");
        year = scanner.nextInt();
        if ((year % 4) == 0 && (year % 100) != 0) {
            System.out.println("Год високосный: " + year);
        }
     else {
            if (year % 100 == 0 && (year % 400) == 0) { System.out.println("Год високосный: " + year);}
            else System.out.println("Год не високосный: " + year);
    }

    }
}




