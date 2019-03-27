package ru.geekbrains.lesson1.participants;

import ru.geekbrains.lesson1.enums.Color;

public class Human extends Animal implements Participant {
    private boolean isOnDistance = true;
    private int runDistance;
    private int jumpHeight;

    public Human(String name, int age, Color color, int runDistance, int jumpHeight) {
        super(name, age, color);
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    void Voice() {
        System.out.println("Ку-ку!)");
    }

    @Override
    public void Run(int distance) {
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Человек %s пробежал дистанцию %d", getName(), distance));
    }

    @Override
    public void Jump(int height) {
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Человек %s прыгнул на высоту %d", getName(), height));
    }

    @Override
    public void Swim(int distance) {
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Человек %s проплыл дистанцию %d", getName(), distance));
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }
}
