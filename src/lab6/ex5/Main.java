package lab6.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        AlphaUser a = new AlphaUser();
        BettaUser b = new BettaUser();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите возраст пользователя а: ");
        a.setParametr(scanner);
        System.out.println("Введите имя пользователя b: ");
        b.setParametr(scanner);

        System.out.println("Возраст а: " + a.age);
        System.out.println("Имя b: " + b.fname);

    }
}
