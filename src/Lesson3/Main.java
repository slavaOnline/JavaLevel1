package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        int[][] days = new int[7][24];

        int[] a1 = new int[3];
        int a2[] = new int[3];

        int dayTemp[] = getTempForDay();

        System.out.println(days[1][12]);

        System.out.println(days);

        for (int i = 0; i < 7; i++) {
            days[i] = getTempForDay();
        }

        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 24; j++) {
                System.out.print(days[i][j] + " ");
            }

            System.out.println();

        }

        for (int i = 0; i < 24; i++) {
            System.out.print(dayTemp[i] + " ");
        }




        int tmp[][] = new int[4][];
        tmp[0] = new int[3];
        tmp[1] = new int[2];
        tmp[2] = new int[10];
        tmp[3] = new int[15];


        Scanner sc = new Scanner(System.in);

        String[] strings = new String[6];

        //добавление
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine() + " " + (i+1) + " число";
        }

        //алгоритм
        //...

        //итоговый результат
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

         */

        int[] nums = {10, 15, 12, 5, 100, 129, 230, 450};

        System.out.println(haveElemMoreThan100(nums));
        System.out.println(howManyElemsMoreThan100(nums));


    }

    public static void getTemp(int temp) {
        transformToCels();
        System.out.println(temp);
    }

    public static void transformToCels() {

    }

    public static int[] getTempForDay() {
        Random random = new Random();

        int[] dayTemp = new int[24];

        for (int i = 0; i < 24; i++) {
            dayTemp[i] = random.nextInt(30);
        }

        return dayTemp;
    }

    public static boolean haveElemMoreThan100(int[] arr) {

        boolean isTrue = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100) {
                isTrue = true;
                break;
            }
        }

        return isTrue;
    }

    public static int howManyElemsMoreThan100(int[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100) {
                result++;
            }
        }

        return result;
    }

}
