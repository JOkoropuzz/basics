package lab4.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        System.out.println("Резултат: " + ex5(array));
        System.out.println("Резултат: " + ex6(array));
    }

    //1st exercise
    public static void ex1() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }

    //2nd exercise
    public static void ex2() {
        for (int i = 1; i < 100; ++i) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("Делится на 3 и на 5: " + i);
            else if (i % 3 == 0) System.out.println("Делится на 3: " + i);
            else if (i % 5 == 0) System.out.println("Делится на 5: " + i);
        }
    }

    //3rd exercise
    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        boolean res = a + b == c;
        System.out.println("Результат: " + res);
    }

    //4th exercise
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        boolean res = a < b && b < c;
        System.out.println("Результат: " + res);
    }

    //5th exercise
    public static boolean ex5(int[] ints) {
        return ints[0] == 3 || ints[ints.length - 1] == 3;
    }

    //6th exercise
    public static boolean ex6(int[] ints) {
        boolean res = false;
        for (int i : ints) {
            if (i == 3 || i == 1) {
                res = true;
                break;
            }
        }
        return res;
    }

}
