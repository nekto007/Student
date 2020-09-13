package main;

import java.util.Random;

public class Loader {
    public static void main(String[] args) {
        Random random = new Random();

        Mentor[] mentor = new Mentor[4];
        mentor[0] = new Mentor("Стивен", "Сигал", 26);
        mentor[1] = new Mentor("Дольф", "Лундгрен", 55);
        mentor[2] = new Mentor("Шелдон", "Купер", 40);
        mentor[3] = new Mentor("Илон", "Маск", 41);

        Student[] student = new Student[10];
        student[0] = new Student("Генерал", "Драккисат", 40,mentor[0]);
        student[1] = new Student("Говард", "Хофстедер", 28,mentor[1]);
        student[2] = new Student("Радж", "Кутрапали", 20,mentor[2]);
        student[3] = new Student("Джек", "О`нилл", 35,mentor[3]);
        student[4] = new Student("Брюс", "Ли", 50,mentor[0]);
        student[5] = new Student("Саша", "Белый", 40,mentor[1]);
        student[6] = new Student("Мастер", "Йода", 24,mentor[2]);
        student[7] = new Student("Джеки", "Чан", 32,mentor[3]);
        student[8] = new Student("Рики", "Мартин", 36,mentor[2]);
        student[9] = new Student("Манька", "Облигация", 33,mentor[3]);

        Task[] task = createTasks(30);

        for (Student value: student) {
            System.out.println(value.getFirstName() + " " + value.getLastName() + " решает задачи");
            value.passedTask(random.nextInt(task.length), task);
            System.out.println();
        }
    }

    private static Task[] createTasks(int numberOfTasks){
        Task[] task = new Task[numberOfTasks];
        for (int i = 0; i < task.length; i++){
            if (i % 2 == 0){
                task[i] = new DragAndDrop();
                task[i].setNumber(i+1);
            }
            else if (i % 3 == 0){
                task[i] = new Test();
                task[i].setNumber(i+1);
            }
            else {
                task[i] = new WriteCode();
                task[i].setNumber(i+1);
            }
        }
        return task;
    }
}
