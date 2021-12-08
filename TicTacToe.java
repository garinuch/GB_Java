/**
 *  Java 1. Lesson4
 *
 *  @author Igor Shirokov
 *
 *  @version 14.11.2021
 *
 */
import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    final char SIGN_X = 'x';
    final char SIGN_0 = '0';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Scanner sc;
    Random random;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() {
        initTable();
        while (true) {
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORY. DRAW");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(SIGN_0)) {
                System.out.println("AI WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORY. DRAW");
                break;
            }
        }
        System.out.println("GAME OVER!");
        printTable();
    }

    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Your turn X Y [1..3]: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (! isCellValid(x, y));
        table[x][y] = SIGN_X;
    }

    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (! isCellValid(x, y));
        table[x][y] = SIGN_0;
    }

    boolean checkWin(char ch) {
                // Проверка х, y.
        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch
                    || table[0][i] == ch && table[1][i] == ch && table[2][i] == ch))
                return true;
                // Проверка диагоналей.
            if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch)
                    || (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch))
                return true;
            return false;
        }
        return false;
  /*            Проверка х.y.
        if (table[0][0] == ch && table[1][0] ==ch && table[2][0] == ch) return true;
        if (table[0][1] == ch && table[1][1] ==ch && table[2][1] == ch) return true;
        if (table[0][2] == ch && table[1][2] ==ch && table[2][2] == ch) return true;
            //  Проверка y.
        if (table[0][0] == ch && table[0][1] ==ch && table[0][2] == ch) return true;
        if (table[1][0] == ch && table[1][1] ==ch && table[1][2] == ch) return true;
        if (table[2][0] == ch && table[2][1] ==ch && table[2][2] == ch) return true;
              //  Проверка диагонали - (x, y).
        if (table[0][0] == ch && table[1][1] ==ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] ==ch && table[0][2] == ch) return true;
*/
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        //if (table[x][y] == SIGN_EMPTY) {
        //    return true;
        //}
        //return false;
        return table[x][y] == SIGN_EMPTY;
    }

    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
