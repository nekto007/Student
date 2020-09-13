package main;

import java.util.Random;

public class Mentor extends Person implements Staff {
    private boolean goodMood;
    Random random = new Random();

    public Mentor(String firstName, String lastName, int age) {

        super(firstName, lastName, age);
        goodMood = true;
    }

    public boolean checkCode(Task task) {
        if (!(task instanceof WriteCode)) {
            System.out.println("Не верный тип задания!");
            return false;
        }

        int randomNumber = random.nextInt(2000);

        setGoodMood(randomNumber > 1000);

        if (!goodMood) {
            System.out.println("Задача " + task.getNumber() + " не принята!");
            return false;
        } else {
            System.out.println("Задача " + task.getNumber() + " принята!");
            return true;
        }
    }

    @Override
    public void helpStudent(Student student) {
        System.out.println("Ты молодец. Ты сможешь выполнить " + student.getFirstName());
    }


    public boolean isGoodMood() {
        return goodMood;
    }

    public void setGoodMood(boolean goodMood) {
        this.goodMood = goodMood;
    }
}
