package ru.geekbrains.lesson1.participants;

public class Robot implements Participant {
    private String name;
    private boolean isOnDistance = true;
    private int runDistance;
    private int jumpHeight;


    public Robot(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Человек %s пробежал дистанцию %d", getName(), distance));
    }

    @Override
    public void jump(int height) {
        // Эти роботы не умеют прыгать.
        isOnDistance = false;
    }

    @Override
    public void swim(int distance) {
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Робот %s проплыл дистанцию %d", getName(), distance));
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public String getName() {
        return name;
    }
}
