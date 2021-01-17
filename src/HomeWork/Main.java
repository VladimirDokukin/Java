package HomeWork;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int a,b,c,d;
        System.out.println("Решение - a * (b + (c/d))\nВведите значение a");
        a = scanner.nextInt();
        System.out.println("Введите значение b");
        b = scanner.nextInt();
        System.out.println("Введите значение c");
        c = scanner.nextInt();
        System.out.println("Введите значение d");
        d = scanner.nextInt();


        FunctionSolve(a,b,c,d);
        scanner.close();

    }

    public static void FunctionSolve(int a, int b, int c,int d)
    {
        float nd = (float)c/d;
        float result = a * (b + nd);
        System.out.println(result);
    }
}

