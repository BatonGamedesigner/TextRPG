package ru.bia.Gamesa;

/**
 * Класс ебаных фреймов. Че такое фреймы? Клетки на игровом поле. Каждая клетка = фрейм.
 */

public class Frame {

    private int y;
    private int x;
    private boolean fill; // наполненность клетки (хз где можно заюзать)
    private boolean stay; // остановился ли персонаж на этой клетке
    private boolean wall; // Является ли клетка стеной

    /**
     * Ну тут у нас конструктор, ебать его в рот
     * @param y
     * @param x
     * @param fill
     * @param stay
     * @param wall
     */
    public Frame(int y, int x, boolean fill, boolean stay, boolean wall) {
        this.y = y;
        this.x = x;
        this.fill = fill;
        this.stay = stay;
        this.wall = wall;
    }


    public boolean getFill() {
        return fill;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public boolean getStay() {
        return stay;
    }

    public boolean isWall() {
        return wall;
    }

    public void setStay(boolean stay) {
        this.stay = stay;
    }

    /**
     * обдроченый юникодовскими символами тустринг.
     * @return
     */
    @Override
    public String toString() {
        if (stay) {
            return "⛹ ";
        } else if (wall) {
            return "⬛ ";
        } else {
            return "◻ ";
        }
    }

}