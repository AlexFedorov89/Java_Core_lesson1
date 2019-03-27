package ru.geekbrains.lesson1.participants;

public interface Participant {
    void Run(int distance);

    void Jump(int height);

    void Swim(int distance);

    boolean isOnDistance();

    String getName();
}
