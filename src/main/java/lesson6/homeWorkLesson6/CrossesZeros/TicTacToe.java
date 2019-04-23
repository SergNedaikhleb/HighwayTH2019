package lesson6.homeWorkLesson6.CrossesZeros;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final String USER_SIGN = "X";
    public static final String USER_SIGN_SECOND = "O";
    public static final String AI_SIGN = "O";
    public static final String AI_SIGN_SECOND = "X";
    public static final String NOT_SIGN = "*";
    public static int aiLevel = 0;
    public static final int BATTLEFIELD = 3;
    public static String[][] field = new String[BATTLEFIELD][BATTLEFIELD];

    public static void main(String[] args) {
        mainMenu();
    }

    public static void modeTwoPlayers() {
        int count = 0;
        initField();
        while (true) {
            printField();
            userShot(USER_SIGN, 1);
            count++;
            if (checkWin(USER_SIGN)) {
                System.out.println("USER 1 WIN!!!");
                printField();
                break;
            }
            userShot(USER_SIGN_SECOND, 2);
            count++;
            if (checkWin(USER_SIGN_SECOND)) {
                System.out.println("USER 2 WIN!!!");
                printField();
                break;
            }
            if (count == Math.pow(BATTLEFIELD, 2)) {
                printField();
                break;
            }
        }
    }

    public static void modeAgainstAI() {
        int count = 0;
        initField();
        while (true) {
            printField();
            userShot(USER_SIGN, 0);
            count++;
            if (checkWin(USER_SIGN)) {
                System.out.println("USER WIN!!!");
                printField();
                break;
            }
            aiShot();
            count++;
            if (checkWin(AI_SIGN)) {
                System.out.println("COMP WIN!!!");
                printField();
                break;
            }
            if (count == Math.pow(BATTLEFIELD, 2)) {
                printField();
                break;
            }
        }
    }

    public static void modeTwoComputers() {
        int count = 0;
        initField();
        while (true) {
            printField();
            userShot(AI_SIGN_SECOND, 0);
            count++;
            if (checkWin(AI_SIGN_SECOND)) {
                System.out.println("Comp 1 WIN!!!");
                printField();
                break;
            }
            aiShot();
            count++;
            if (checkWin(AI_SIGN)) {
                System.out.println("Comp 2 WIN!!!");
                printField();
                break;
            }
            if (count == Math.pow(BATTLEFIELD, 2)) {
                printField();
                break;
            }
        }
    }

    public static void mainMenu() {
        System.out.println("Выберите режим игры: ");
        System.out.println("1. Игра против компьютера.");
        System.out.println("2. 2 игрока.");
        System.out.println("3. Два компьютера");
        System.out.println("4. Не играю.");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        switch (i) {
            case 1: {
                aiLevel();
                break;
            }
            case 2: {
                modeTwoComputers();
                break;
            }
            case 3: {
                modeTwoPlayers();
                break;
            }
            case 4: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Ну что ты пишешь?!");
            }
        }
    }

    public static void aiLevel() {
        System.out.println("Выберите сложность компьютера: ");
        System.out.println("1. Простой.");
        System.out.println("2. Сложный.");
        System.out.println("3. Выход.");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        switch (i) {
            case 1: {
                aiLevel = 0;
                modeAgainstAI();
                break;
            }
            case 2: {
                aiLevel = 1;
                modeAgainstAI();
                break;
            }
            case 3: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Было введено неверное значение!");
            }
        }
    }

    public static void initField() {
        for (int i = 0; i < BATTLEFIELD; i++) {
            for (int j = 0; j < BATTLEFIELD; j++) {
                field[i][j] = NOT_SIGN;
            }
        }
    }

    public static void printField() {
        for (int i = 0; i <= BATTLEFIELD; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < BATTLEFIELD; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < BATTLEFIELD; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void userShot(String sign, int i) {
        int x = -1;
        int y = -1;
        do {
            if (i == 0) {
                System.out.println("Введите координаты x y (1 - " + BATTLEFIELD + "): ");
            } else {
                System.out.println("Игрок " + i + ". Введите координаты x y (1 - " + BATTLEFIELD + "): ");
            }
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (isCellBusy(x, y));
        field[x][y] = sign;
    }

    public static void aiShot() {
        int x = -1;
        int y = -1;
        boolean ai_win = false;
        boolean user_win = false;
        // Находим выигрышный ход
        if (aiLevel == 2) {
            for (int i = 0; i < BATTLEFIELD; i++) {
                for (int j = 0; j < BATTLEFIELD; j++) {
                    if (!isCellBusy(i, j)) {
                        field[i][j] = AI_SIGN;
                        if (checkWin(AI_SIGN)) {
                            x = i;
                            y = j;
                            ai_win = true;
                        }
                        field[i][j] = NOT_SIGN;
                    }
                }
            }
        }
        // Блокировка хода пользователя, если он побеждает на следующем ходу
        if (aiLevel > 0) {
            if (!ai_win) {
                for (int i = 0; i < BATTLEFIELD; i++) {
                    for (int j = 0; j < BATTLEFIELD; j++) {
                        if (!isCellBusy(i, j)) {
                            field[i][j] = USER_SIGN;
                            if (checkWin(USER_SIGN)) {
                                x = i;
                                y = j;
                                user_win = true;
                            }
                            field[i][j] = NOT_SIGN;
                        }
                    }
                }
            }
        }
        if (!ai_win && !user_win) {
            do {
                Random rnd = new Random();
                x = rnd.nextInt(BATTLEFIELD);
                y = rnd.nextInt(BATTLEFIELD);
            }
            while (isCellBusy(x, y));
        }
        field[x][y] = AI_SIGN;
        System.out.println("x = " + x + "| y = " + y + "| ai_win = " + ai_win + "| user_win = " + user_win);
    }


    public static boolean isCellBusy(int x, int y) {
        if (x < 0 || y < 0 || x > BATTLEFIELD - 1 || y > BATTLEFIELD - 1) {
            return false;
        }
        return field[x][y] != NOT_SIGN;
    }

    public static boolean checkLine(int start_x, int start_y, int dx, int dy, String sign) {
        for (int i = 0; i < BATTLEFIELD; i++) {
            if (field[start_x + i * dx][start_y + i * dy] != sign)
                return false;
        }
        return true;
    }

    public static boolean checkWin(String sign) {
        for (int i = 0; i < BATTLEFIELD; i++) {
            // проверяем строки
            if (checkLine(i, 0, 0, 1, sign)) return true;
            // проверяем столбцы
            if (checkLine(0, i, 1, 0, sign)) return true;
        }
        // проверяем диагонали
        if (checkLine(0, 0, 1, 1, sign)) return true;
        if (checkLine(0, BATTLEFIELD - 1, 1, -1, sign)) return true;
        return false;
    }


    public static boolean checkWin2(String sign) {
        // проверка по строкам
        {
            for (int i = 0; i < BATTLEFIELD; i++) {
                if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) {
                    return true;
                }
            }
        }
        // проверка по столбцам
        {
            for (int j = 0; j < BATTLEFIELD; j++) {
                if (field[0][j] == sign && field[1][j] == sign && field[2][j] == sign) {
                    return true;
                }
            }
        }
        // проверка диагоналей
        {
            if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
                return true;
            }
            if (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) {
                return true;
            }
        }
        return false;
    }
}
