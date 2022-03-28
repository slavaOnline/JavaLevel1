package Lesson1;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Целые числа
        int salaryOfChef = 2000000000; //int 32 бита -> 2^32 -> -2000000000 - +20000000

        double hours = 41.5; //64 бит

        boolean isWorker = true;

        char letter = 'a';

        String s = "s";

        String name = "Slava";
        System.out.println(name);
        name = "Vasiliy";

        int x = 300;
        int y = 400;
        int sum = 500;
        System.out.println(sum);
        //+ - * / %
        sum = x + y;
        System.out.println(sum);

        sum = sum + 300; // <=> sum += 300;
        System.out.println(sum);

        sum += 300;
        System.out.println(sum);

        sum = sum / 333;
        System.out.println(sum);

        sum = sum + 500;
        System.out.println(sum % 50);



        double d1 = 165.3;
        System.out.println(d1/7);

        int time1 = 50, time2 = 120, time3 = 180;


        String firstName = "slava";
        String secondName = "alekseev";

        System.out.println(firstName + " " + secondName + " " + salaryOfChef);

        System.out.println(time1+time2+"hello"+(time1+time2));

        int a = 150;
        int b = 100;
        boolean isBiggerA = a == b; // <=, >=, >, <, ==


        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 && b2); // && -> и
        System.out.println(b1 || b2); // || -> или
        System.out.println(!b1); //! -> не

        System.out.println(isBiggerA);

        int numOfCars = 100;
        boolean isBigBoss = true;



        if (numOfCars > 1000) {

            String myName = "Kover";

            System.out.println("Премия огромная привет");

            if (isBigBoss == true) {
                System.out.println("Премия 2х привет");
            }

        }
        else if (numOfCars > 800) {
            System.out.println("Премия поменьше привет");
        }
        else if (numOfCars > 500) {
            System.out.println("Привет совсем маленькая премия, жесть...");
        }
        else {
            System.out.println("Прощай зарплата :(");
        }





        System.out.println("Этот код выполнится в любом случае");


        double sumOfNumbers = sum(5, 10);



    }

    public static double sum(double x, double y) {
        double result = x + y;
        return result;
    }

}
