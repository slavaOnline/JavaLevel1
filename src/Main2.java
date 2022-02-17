public class Main2 {

    public static void main(String[] args) {

        int x = 5, y = 3;

        double sumOfNumbers = sum(x, y);
        System.out.println(sumOfNumbers);
        minus(15, 20);


    }

    public static double sum(double x, double y) {
        double result = x + y;
        return result;
    }

    public static double minus(double x, double y) {
        double result = x - y;
        return result;
    }

    public static double umnozh(double x, double y) {
        double result = x * y;
        return result;
    }

    public static double division(double x, double y) {
        double result = x / y;
        return result;
    }

}
