package main;

public interface Staff {
    void helpStudent(Student student);
    default void giveAdditionalContent(){
        System.out.println("habr.com");
    }
}
