package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class CrossAndCirclesApp {

    public static void main(String[] args) {
        String[][] map = initField(3);
        System.out.println("Игра началась! Вперёд");

        printMap(map);

        while (true) {

            playerTurn(map);
            printMap(map);
            if (isWinner("X", map) || isDraw(map)) {
                break;
            }

            computerTurn(map);
            printMap(map);
            if (isWinner("0", map) || isDraw(map)) {
                break;
            }
        }
    }

    public static boolean isWinner(String mark, String[][] map) {
        //проверка по горизонтали
        if (
                (map[0][0].equals(mark) && map[0][1].equals(mark) && map[0][2].equals(mark))
                || (map[1][0].equals(mark) && map[1][1].equals(mark) && map[1][2].equals(mark))
                || (map[2][0].equals(mark) && map[2][1].equals(mark) && map[2][2].equals(mark))
        ) {
            System.out.println(mark + " победил");
            return true;
        }
        //проверка по вертикали
        else if (
                (map[0][0].equals(mark) && map[1][0].equals(mark) && map[2][0].equals(mark))
                        || (map[0][1].equals(mark) && map[1][1].equals(mark) && map[2][1].equals(mark))
                        || (map[0][2].equals(mark) && map[1][2].equals(mark) && map[2][2].equals(mark))
        ) {
            System.out.println(mark + " победил");
            return true;
        }
        //проверка по диагонали
        else if (
                (map[0][0].equals(mark) && map[1][1].equals(mark) && map[2][2].equals(mark))
                        || (map[0][2].equals(mark) && map[1][1].equals(mark) && map[2][0].equals(mark))
        ) {
            System.out.println(mark + " победил");
            return true;
        }

        else {
            return false;
        }

    }

    public static boolean isDraw(String[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {

                if (map[i][j].equals("*")) {
                    return false;
                }

            }
        }

        System.out.println("Блин блинский, ничья B')");
        return true;

    }

    public static void computerTurn(String[][] map) {
        System.out.println("Компьютер ходит, подождите");

        Random random = new Random();

        boolean isActiveTurn = true;

        while (isActiveTurn) {

            int x = random.nextInt(map[0].length);
            int y = random.nextInt(map.length);

            if (map[x][y].equals("*")) {
                map[x][y] = "0";
                isActiveTurn = false;
            }
        }
        System.out.println("Компухтер сходил");
    }


    public static void playerTurn(String[][] map) {

        System.out.println("Игрок ходит, на какие клетки вы ходите?");

        Scanner sc = new Scanner(System.in);

        boolean isActiveTurn = true;

        while (isActiveTurn) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if ((x > 0 && x <= map[0].length) && (y > 0 && y <= map.length)) {
                if (map[x - 1][y - 1].equals("*")) {
                    map[x-1][y-1] = "X";
                    isActiveTurn = false;
                } else {
                    System.out.println("Вы сходили на занятую ячейку");
                }
            } else {
                System.out.println("Вы вышли за пределы поля");
            }

        }
    }

    public static void printMap(String[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static String[][] initField(int size) {

        String[][] map = new String[size][size];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "*";
            }
        }

        return map;
    }

}
