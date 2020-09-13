package main;

public interface AutoCheck {
    default void checkAutomatically() {
        System.out.println("Задание выполнено!");
    }
}