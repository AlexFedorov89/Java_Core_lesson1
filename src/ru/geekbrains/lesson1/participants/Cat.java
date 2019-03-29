package ru.geekbrains.lesson1.participants;

import ru.geekbrains.lesson1.enums.Color;

public class Cat extends Animal implements Participant {

    private boolean isOnDistance = true;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int age, Color color, int runDistance, int jumpHeight) {
        super(name, age, color);
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    void voice() {
        System.out.println("Мяу!");
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Кошка %s пробежала дистанцию %d", getName(), distance));
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Кошка %s прыгнула на высоту %d", getName(), height));
    }

    @Override
    public void swim(int distance) {
        isOnDistance = false;
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }
}
