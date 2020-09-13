package main;

import java.util.Objects;

public class Student extends Person {


    private int countSolvedTasks;
    private static int countSolvedTasksForAllStudents;
    private Mentor mentor;
    private boolean passedAllTask;

    public Student(String firstName, String lastName, int age, Mentor mentor) {
        super(firstName, lastName, age);
        this.countSolvedTasks = 0;
        this.mentor = mentor;
    }

    public int getCountSolvedTasks() {
        return countSolvedTasks;
    }

    public void setCountSolvedTasks(int countSolvedTasks) {
        this.countSolvedTasks = countSolvedTasks;
    }

    public static int getCountSolvedTasksForAllStudents() {
        return countSolvedTasksForAllStudents;
    }

    public static void setCountSolvedTasksForAllStudents(int countSolvedTasksForAllStudents) {
        Student.countSolvedTasksForAllStudents = countSolvedTasksForAllStudents;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public boolean isPassedAllTask() {
        return passedAllTask;
    }

    public void setPassedAllTask(boolean passedAllTask) {
        this.passedAllTask = passedAllTask;
    }

    public void passedTask(int numberOfTasksToComplete, Task[] tasks) {
        System.out.println("Надо решить: " + numberOfTasksToComplete + " задач из: " + tasks.length);
        if (numberOfTasksToComplete > tasks.length) {
            System.out.println("Задач должно быть меньше чем " + tasks.length);
        } else {
            for (int i = 0; i < numberOfTasksToComplete; i++) {
                solveTask(tasks[i]);
            }
            passedAllTask = (countSolvedTasks == tasks.length);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "countSolvedTasks=" + countSolvedTasks +
                ", mentor=" + mentor +
                ", passedAllTask=" + passedAllTask +
                '}';
    }

    private void solveTask(Task task) {
        if ((task instanceof Test) || (task instanceof DragAndDrop)) {
            System.out.println("Задание " + task.getNumber() + " выполнено!");
            countSolvedTasks++;
            countSolvedTasksForAllStudents++;
        } else if (task instanceof WriteCode) {
            while (true) {
                if (mentor.checkCode(task)) {
                    countSolvedTasks++;
                    countSolvedTasksForAllStudents++;
                    break;
                }
            }
        }
    }

}