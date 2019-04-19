package lesson6.homeWorkLesson6.CrossesZeros;

public class TicTacToe {

    static final int SIZE_X = 3;
    static final int SIZE_Y = 3;
    static final char DOT_PLAYER = 'X';
    static final char DOT_AI = '0';
    static final char EMPTY_DOT = '*';
    static final char[][] field = new char[SIZE_Y][SIZE_X];


    public static void main(String[] args) {
        initField();
        printField();
    }
        static void initField() {
            for(int i = 0; i < SIZE_Y; i++){
                for (int j = 0; j < SIZE_X; j++){
                    field[i][j] = EMPTY_DOT;
                }
            }
        }

    static void printField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
