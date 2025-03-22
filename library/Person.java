package library;

public abstract class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayInfo();
}
