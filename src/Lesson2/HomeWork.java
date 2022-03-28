package Lesson2;

public class HomeWork {

    public static void main(String[] args) {

    }

    public static boolean checkSumInPeriod(int a, int b) {
        return (a+b >= 10 && a+b <= 20);
    }

    public static boolean isPositive(int a) {
        return (a >= 0);
    }

    public static boolean isNegative(int a) {
        return (a < 0);
    }

    public void printPhraseSomeTimes(String word, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }

    public static boolean isYearVisokosniy(int year) {
        return (year % 4 == 0 && year % 100 == 0)
                || (year % 400 == 0);
    }


}
