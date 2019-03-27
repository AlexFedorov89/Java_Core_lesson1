package ru.geekbrains.lesson1.participants;

import ru.geekbrains.lesson1.enums.Color;

public abstract class Animal {
    private String name;
    private int age;
    private Color color;

    public Animal(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    abstract void Voice();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }
}
