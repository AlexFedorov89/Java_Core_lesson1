/**
 * 1. Разобраться с имеющимся кодом;
 * 2. Добавить класс Team, который будет содержать название команды, массив из четырех участников (в конструкторе можно сразу указыватьвсех участников ), метод для вывода информации о членах команды, прошедших дистанцию, метод вывода информации обо всех членах команды.
 * 3. Добавить класс Course (полоса препятствий), в котором будут находиться массив препятствий и метод, который будет просить команду пройти всю полосу;
 * <p>
 * В итоге должно быть что-то вроде:
 * <p>
 * public static void main(String[] args) {
 * Course c = new Course(...); // Создаем полосу препятствий
 * Team team = new Team(...); // Создаем команду
 * c.doIt(team); // Просим команду пройти полосу
 * team.showResults(); // Показываем результаты
 * }
 **/

package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.participants.*;
import ru.geekbrains.lesson1.course.*;
import ru.geekbrains.lesson1.enums.Color;

public class Application {
    public static void main(String[] args) {
        Obstacle[] obstacles = {new Cross(300), new Wall(1), new Water(150)};

        Team team = new Team("Сборная солянка",
                new Cat("Барсик", 3, Color.White, 133, 2),
                new Dog("Бобик", 1, Color.Black, 500, 3),
                new Human("Александр", 29, Color.White, 2000, 1),
                new Robot("T-1000", 20000, 5));

        team.showTeam();
        Course course = new Course(obstacles);
        course.doIt(team);

        team.showResult();
    }
}
