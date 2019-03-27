package ru.geekbrains.lesson1.course;

import ru.geekbrains.lesson1.participants.Participant;

public class Cross extends Obstacle {
    int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.Run(distance);
    }
}
