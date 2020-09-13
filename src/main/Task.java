package main;

public abstract class Task {

    int number;
    String taskText;


    public Task() {
        this.number = 0;
        this.taskText = "Условие задачи!";
    }

    public Task(int number, String taskText) {
        this.number = number;
        this.taskText = taskText;
    }

    public int getNumber() {
        return number;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }
}