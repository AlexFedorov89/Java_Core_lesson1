package ru.geekbrains.lesson1.participants;

public class Team {
    private Participant[] participants;
    private String name;

    public Team(String name, Participant ... participants) {
        this.participants = participants;
        this.name = name;
    }

    public Participant[] getParticipan() {
        return participants;
    }

    public void showResult() {
        System.out.println("\nСписок победителей:");
        for (Participant participant : participants) {
            if (participant.isOnDistance()) {
                System.out.println(String.format("Участник %s прошёл полосу препятствий!", participant.getName()));

            }
        }
    }

    public void showTeam() {
        System.out.println(String.format("\n Список участников команды '%s':", name));
        for (Participant participant : participants) {
            System.out.println(String.format("Участник %s", participant.getName()));
        }
        System.out.println();
    }
}
