package Lesson3.HomeWork;

import java.util.Scanner;

public class Main {

    private static final char HUMAN_SHIFT = 'X';
    private static final char MACHINE_SHIFT = 'O';
    private static final char FIELD_FILL = '_';
    private static final int xFieldLine = 3,yFieldLine = 3;
    private static final char [][] gameField = new char[xFieldLine][yFieldLine];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        createGameField(gameField);

        while (gameWinner(gameField,MACHINE_SHIFT) == false) {

        if(!gameFieldIsFull(gameField)) {System.out.println("Ничья"); break;}
        humanShift(gameField);
        reprintGameField(gameField);

        if (gameWinner(gameField, HUMAN_SHIFT) == true) {
            System.out.println("Вы выиграли"); break;
        }

        if(!gameFieldIsFull(gameField)) {System.out.println("Ничья"); break;}
        machineShift(gameField);
        reprintGameField(gameField);

        if (gameWinner(gameField,MACHINE_SHIFT) == true) {
            System.out.println("Компик выиграл");
        }
        }

    }

    public static void createGameField(char[][] arrayXO) {
        for (int i = 0; i<arrayXO.length; i++){
            for (int j = 0; j<arrayXO.length; j++){
                System.out.print((char) (arrayXO[i][j] = FIELD_FILL));
            }
            System.out.println();
        }
    }

    public static void humanShift(char[][] arrayXO){
        int xLine,yLine;
        boolean endThisCycle = false;

        while (endThisCycle != true) {

            System.out.println("Ваш ход, введите координаты поля: ");
            xLine = scanner.nextInt()-1;
            yLine = scanner.nextInt()-1;

            if (isXorOinField(xLine, yLine) == true && isXOHit(arrayXO, xLine, yLine) == false) {
                arrayXO[xLine][yLine] = HUMAN_SHIFT; endThisCycle = true;
            } else {
                System.out.println("Выбранное поле занято или выход за пределы поля"); endThisCycle =false;
            }
        }
    }

    public static void machineShift(char[][] arrayXO){
        int xLine = 1,yLine = 1;

        // если человек не поставил крестик в центр при первом ходе
        if (isXOHit(arrayXO, xLine, yLine) == false) {
            arrayXO[xLine][yLine] = MACHINE_SHIFT;
        }
        else {
        // если крестик в центре стот ищем позицию
        if (arrayXO[xLine][yLine] == HUMAN_SHIFT || arrayXO[xLine][yLine] == MACHINE_SHIFT) {
            machineSearchSpace(arrayXO);
                }
            }
        }

    public static void machineSearchSpace(char[][] arrayXO) {
        int iCounter = 0, jCounter = 0;
        boolean bBreakCycle = false;
// в цикле заполнять крестиками места и проверть гейм вин, если гейм вин, значит туда ставить нолик иначе искать пока не найдет
        if (machineSearchWinner(arrayXO, MACHINE_SHIFT) != true) {
            if (machineSearchWinner(arrayXO, HUMAN_SHIFT) != true) {
                if (machineCheckAngle(arrayXO) != true) {
                    for (iCounter = 0; iCounter < arrayXO.length; iCounter++) {
                        for (jCounter = 0; jCounter < arrayXO.length; jCounter++) {
                            if (arrayXO[iCounter][jCounter] == FIELD_FILL) {
                                arrayXO[iCounter][jCounter] = MACHINE_SHIFT;
                                bBreakCycle = true;
                                break;
                            }
                        }
                        if (bBreakCycle == true) break;
                    }
                }
            }
        }
    }

    public static boolean machineSearchWinner (char[][] arrayXO, char humanOrMachine) {
        int iCounter = 0, jCounter = 0;
        for (iCounter = 0; iCounter < arrayXO.length; iCounter++) {
            for (jCounter = 0; jCounter < arrayXO.length; jCounter++) {
                if (arrayXO[iCounter][jCounter] == FIELD_FILL) {
                    arrayXO[iCounter][jCounter] = humanOrMachine;
                    if (gameWinner(arrayXO,humanOrMachine) == true) {
                        arrayXO[iCounter][jCounter] = MACHINE_SHIFT;
                        return true;
                    } else arrayXO[iCounter][jCounter] = FIELD_FILL;
                }
            }
        }
        return false;
    }
    // свободны ли углы проверка и занят ли 1 из элементов на линии? Если да, то не даю следующих ходов
    public static boolean machineCheckAngle (char[][] arrayXO){

        if (arrayXO[0][0] == FIELD_FILL && arrayXO[0][1] == HUMAN_SHIFT) {arrayXO[0][0] = MACHINE_SHIFT; return true;}
        if (arrayXO[0][2] == FIELD_FILL && arrayXO[0][1] == HUMAN_SHIFT) {arrayXO[0][2] = MACHINE_SHIFT; return true;}
        if (arrayXO[2][0] == FIELD_FILL && arrayXO[2][1] == HUMAN_SHIFT) {arrayXO[2][0] = MACHINE_SHIFT; return true;}
        if (arrayXO[2][2] == FIELD_FILL && arrayXO [2][1] == HUMAN_SHIFT) {arrayXO[2][2] = MACHINE_SHIFT; return true;}

        return false;
    }
    //проверка ничейки
    public static boolean gameFieldIsFull(char[][] arrayXO){
        boolean xx =false;
        for (int iCounter = 0; iCounter<arrayXO.length;iCounter++){
            for (int jCounter = 0; jCounter<arrayXO.length;jCounter++){
                if (arrayXO[iCounter][jCounter] == FIELD_FILL) {return true;}
            }
        }
        return false;
    }
    //проверка в рамках заданного игрового пространства
    public static boolean isXorOinField(int xCoord, int yCoord){
        if (xCoord >=0 && xCoord <=xFieldLine && yCoord>=0 && yCoord<=yFieldLine) return true;
        else return false;
    }
    //попадание в уже занятое поле
    public static boolean isXOHit(char[][] arrayXO, int xCoord, int yCoord){
        if (arrayXO[xCoord][yCoord] == HUMAN_SHIFT || arrayXO[xCoord][yCoord] == MACHINE_SHIFT) return true;
        else return false;
    }

    public static boolean gameWinner(char[][] arrayXO, char howIsWinner){
        if (arrayXO[0][0] == howIsWinner && arrayXO[0][1] == howIsWinner && arrayXO[0][2] == howIsWinner) return true;
        if (arrayXO[1][0] == howIsWinner && arrayXO[1][1] == howIsWinner && arrayXO[1][2] == howIsWinner) return true;
        if (arrayXO[2][0] == howIsWinner && arrayXO[2][1] == howIsWinner && arrayXO[2][2] == howIsWinner) return true;

        if (arrayXO[0][0] == howIsWinner && arrayXO[1][0] == howIsWinner && arrayXO[2][0] == howIsWinner) return true;
        if (arrayXO[0][1] == howIsWinner && arrayXO[1][1] == howIsWinner && arrayXO[2][1] == howIsWinner) return true;
        if (arrayXO[0][2] == howIsWinner && arrayXO[1][2] == howIsWinner && arrayXO[2][2] == howIsWinner) return true;

        if (arrayXO[0][0] == howIsWinner && arrayXO[1][1] == howIsWinner && arrayXO[2][2] == howIsWinner) return true;
        if (arrayXO[0][2] == howIsWinner && arrayXO[1][1] == howIsWinner && arrayXO[2][0] == howIsWinner) return true;

        return false;
    }

    public static void reprintGameField(char[][] arrayXO) {
        for (int i = 0; i<arrayXO.length; i++){
            for (int j = 0; j<arrayXO.length; j++){
                System.out.print(arrayXO[i][j]);
            }
            System.out.println();
        }
    }

}
