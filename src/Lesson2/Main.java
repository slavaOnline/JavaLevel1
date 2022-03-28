package Lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //String s = sc.nextLine();
        //int n = sc.nextInt();
        //double d = sc.nextDouble();

        //System.out.println(s + " " + n + " " + d);

        //Integer.parseInt()
        //String.valueOf()
        //Double.valueOf()

        String numInText = "150";
        System.out.println(Integer.parseInt(numInText) + 15);

        boolean isDividedBy25And15 = false;
        int num = 1;

        while (!isDividedBy25And15) {

            if (num % 25 == 0 && num % 15 == 0) {
                isDividedBy25And15 = true;
                System.out.println(num);
            }
            num += 1;

        }

        int count = 15;
        for (int days = 0; days <= count; days++) {
            System.out.println("Иду домой");
            days += 1; // <=> days++;
        }

        Scanner sc = new Scanner(System.in);
        boolean isActive = true;
        while (isActive) {
            int n = sc.nextInt();
            String dayOfTheWeek = "Monday";
            switch (dayOfTheWeek) {
                case "Monday":
                    System.out.println("Вы ввели первую команду, ловите фото котиков");
                    break;
                case "Sunday":
                    System.out.println("Вы ввели первую команду, ловите фото собакенов");

                case "Friday":
                    isActive = false;
            }

        }


        for (int i = 0; i < 100; i++) {
            if (i % 9 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");

                System.out.println();
            }

        }
    }
}
