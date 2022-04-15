package app;

import app.entities.Cat;

import java.util.ArrayList;

public class CollectionManager {

    private final ArrayList<Cat> list = new ArrayList<>();

    public void add(Cat cat) {
        list.add(cat);
    }

    public void info() {
        System.out.println("В коллекции " + list.size() + " котят");
    }

}
