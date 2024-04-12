package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Блок 1-ого задания
        System.out.println("Exercise 1");
        System.out.println("Я\nхорошо\nзнаю\nJava\n");

        //Блок 2-ого задания
        System.out.println("Exercise 2");
        System.out.println((46 + 10) * (double)10/3); //Result of (46 + 10) * (10 / 3)
        System.out.println((29) * (4) * (-15) + "\n"); // Result of (29) * (4) * (-15)

        //Блок 3-его задания
        System.out.println("Exercise 3");
        int number = 10500;
        double result = ((double)number/10)/10;
        System.out.println(result+"\n");

        //Блок 4-ого задания
        System.out.println("Exercise 4");
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result2 = a*b*c;
        System.out.println(result2+"\n");

        //Блок 5-ого задания
        System.out.println("Exercise 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 целых числа:");
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        System.out.println("Первое число: " + d + "\nВторое число: " + e + "\nТретье число: " + f +"\n");

        //Блок 6-ого задания
        System.out.println("Exercise 6");
        System.out.println("Введите целое число:");
        String answer;
        int g = scanner.nextInt();
        if (g % 2 == 0) //Деление на 2 без остатка
            answer = (g > 100) ? "Выход за диапазон" : "Четное"; //Проверка на выход за диапазон 100 для четного числа
        else answer = "Нечентое";
        System.out.println(answer);
    }
}
