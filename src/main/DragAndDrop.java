package main;

public class DragAndDrop extends Task implements AutoCheck{

    String[][] variants;

    public DragAndDrop() {
        super();
        this.variants = new String[][]{
                {"a", "1"},
                {"b", "3"},
                {"c", "2"},
        };
    }
}
