package ru.bia.Gamesa;

import java.util.Scanner;

/**
 * Ну тут все понятно должно быть.
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String PlayerWord;
        System.out.println("Введите play, если хотите начать играть,");
        System.out.println("Введите exit, если вы хотите выйти");
        PlayerWord = sc.nextLine();

        switch (PlayerWord) {
            case "play":
                Battlefield.input();
                Battlefield.level1();
                break;
            case "exit":
                System.out.println("До свидания!");
                break;
        }
    }
}
