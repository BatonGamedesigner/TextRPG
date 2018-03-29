package ru.bia.Gamesa;

import java.util.Scanner;

public class Walk {
    static Scanner sc = new Scanner(System.in);

    /**
     * Реализация хотьбы.
     * @param table
     */
    public static void walkLVL1(Frame table[][]) {
        int y = 15;// две переменные, обозначающие Х и У начальной точки. Потом поймешь нахуя они нужны
        int x = 7;
        table[y][x].setStay(true); // присвоение элементу в массиве с Х и У что там человек
        String playerWord = ""; // инициализация ввода команд
        while (!playerWord.equals("exit")) {
            System.out.println("Введите направление");
            playerWord = sc.nextLine();
            switch (playerWord) { //ебать мой хуй, это что, свич?
                case "8":// если вводишь восемь, то идешь вверх
                    if (table[y - 1][x].isWall()) {// проверочка на пидораса, если на той клетке, куда ты идешь, стена, то пошлет нахуй, и выкенет обратно
                        System.out.println("Глаза разуй, чего в стену бьешься, дурак");
                        table[y][x].setStay(true);
                        Battlefield.output();
                    } else {
                        table[y][x].setStay(false);
                        table[y - 1][x].setStay(true);
                        y--; //а вот и то, для чего нужны конкретные переменные. Сохранение положения
                        Battlefield.output();
                    }
                    break;
                case "4": //Идешь вправо
                    if (table[y][x - 1].isWall()) {
                        System.out.println("Глаза разуй, чего в стену бьешься, дурак");
                        table[y][x].setStay(true);
                        Battlefield.output();
                    } else {
                        table[y][x].setStay(false);
                        table[y][x - 1].setStay(true);
                        x--;
                        Battlefield.output();
                    }
                    break;
                case "6": //идешь влево
                    if (table[y][x + 1].isWall()) {
                        System.out.println("Глаза разуй, чего в стену бьешься, дурак");
                        table[y][x].setStay(true);
                        Battlefield.output();
                    } else {
                        table[y][x].setStay(false);
                        table[y][x + 1].setStay(true);
                        x++;
                        Battlefield.output();
                    }
                    break;
                case "2"://идешь на дно
                    if (table[y + 1][x].isWall()) {
                        System.out.println("Глаза разуй, чего в стену бьешься, дурак");
                        table[y][x].setStay(true);
                        Battlefield.output();
                    } else {
                        table[y][x].setStay(false);
                        table[y + 1][x].setStay(true);
                        y++;
                        Battlefield.output();
                    }
                    break;
                case "exit": //Идешь нахуй
                    System.out.println("Уходи, раз боишься");
                    break;

            }

        }


    }
}
