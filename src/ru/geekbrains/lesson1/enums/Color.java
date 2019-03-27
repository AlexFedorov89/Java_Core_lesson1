package ru.geekbrains.lesson1.enums;

public enum Color {
    Black("Черный"),
    Red("Рыжий"),
    Yellow("Желтый"),
    White("Белый");

   private String name;

    Color(String name) {
        this.name = name;
    }
}
