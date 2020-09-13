package main;

import java.util.Objects;

public class Student extends Person {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return group == student.group &&
                solvedTasks == student.solvedTasks &&
                modulesPassed == student.modulesPassed &&
                Objects.equals(experience, student.experience) &&
                Objects.equals(goal, student.goal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, solvedTasks, modulesPassed, experience, goal);
    }

    public static final int MAX_MODULE = 10;
    private int group;
    private int solvedTasks;
    private int modulesPassed;
    private String experience;
    private String goal;
    static int overallTasksSolved;
    static int maxModulePassed;

    public void modulePassed() {
        System.out.println("Module passed");
        modulesPassed += 1;
        if (maxModulePassed < modulesPassed) {
            maxModulePassed = modulesPassed;
        }
        if (modulesPassed == MAX_MODULE) {
            System.out.println("Congrats with completing the course");
        }
    }

    public void taskSolved() {
        System.out.println("Task solved");
        solvedTasks += 1;
        overallTasksSolved += 1;
    }

    public Student(String firstName, String lastName, int age, int group, int solvedTasks, int modulesPassed,
                   String experience, String goal) {
        super(firstName, lastName, age);
        this.group = group;
        this.solvedTasks = solvedTasks;
        this.modulesPassed = modulesPassed;
        this.experience = experience;
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group=" + group +
                ", solvedTasks=" + solvedTasks +
                ", modulesPassed=" + modulesPassed +
                ", experience='" + experience + '\'' +
                ", goal='" + goal + '\'' +
                '}';
    }
}