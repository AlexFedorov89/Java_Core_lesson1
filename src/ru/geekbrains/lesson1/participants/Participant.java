package ru.geekbrains.lesson1.participants;

public interface Participant {
    void run(int distance);

    void jump(int height);

    void swim(int distance);

    boolean isOnDistance();

    String getName();
}
