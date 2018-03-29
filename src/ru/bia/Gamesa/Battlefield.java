package ru.bia.Gamesa;

/**
 * Класс поля боя, тоесть игровой мапы.
 */
public class Battlefield {

    private static int SIZE = 17; // константа длинны квадрата массива. Ебаный рудимент, можно заменить на одну
    // переменную, а то и разбить на две, чтобы можно было прямоугольные данжи делать

    private static Frame[][] table = new Frame[SIZE][SIZE]; // массив фреймов


    /**
     * Вывод массива фрейма тустрингом
     */
    public static void output() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Ввод массива фреймов, передача дефолных значений, и собасна, ввод дефолтного поля боя (нет, конструктором по умолчанию не проще)
     */
    public static void input() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == 0) { // обвод поля стенами, чтобы он из двумерного массива не сьебался, и не пошел гулять, крашнув игру
                    table[i][j] = new Frame(i, j, true, false, true);
                } else if (i == 16) {
                    table[i][j] = new Frame(i, j, true, false, true);
                } else if (j == 0) {
                    table[i][j] = new Frame(i, j, true, false, true);
                } else if (j == 16) {
                    table[i][j] = new Frame(i, j, true, false, true);
                } else {
                    table[i][j] = new Frame(i, j, false, false, false); //заполнение оставшегося массива
                }

            }
        }
        output();
    }

    /**
     * Создание архитектуры первого уровня - четыре комнаты
     */
    public static void level1() {
        for (int i = 1; i <= 6; i++) {
            table[i][4].setWall(true);
            table[i][8].setWall(true);
            table[i][12].setWall(true);
            if (i == 6) {
                table[i][4 - 1].setWall(true);
                table[i][4 - 2].setWall(true);
                table[i][8 - 1].setWall(true);
                table[i][8 - 2].setWall(true);
                table[i][12 - 1].setWall(true);
                table[i][12 - 2].setWall(true);
                table[i][16 - 1].setWall(true);
                table[i][16 - 2].setWall(true);
            }

        }
        output();
        Walk.walkLVL1(table); // не ебу откуда, если не отсуда, передать массив в другой класс (при том, что он бля приватный!!)
    }
}
