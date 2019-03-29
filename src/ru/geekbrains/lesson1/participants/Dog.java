package ru.geekbrains.lesson1.participants;

import ru.geekbrains.lesson1.enums.Color;

public class Dog extends Animal implements Participant {
    private boolean isOnDistance = true;
    private int runDistance;
    private int jumpHeight;

    public Dog(String name, int age, Color color, int runDistance, int jumpHeight) {
        super(name, age, color);
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    void voice() {
        System.out.println("Гав-гав!");
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Собака %s пробежала дистанцию %d", getName(), distance));
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Собака %s прыгнула на высоту %d", getName(), height));
    }

    @Override
    public void swim(int distance) {
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Собака %s проплыла дистанцию %d", getName(), distance));
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }
}
