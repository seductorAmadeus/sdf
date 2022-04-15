package app;

import app.commands.Cat;

import java.util.ArrayList;

public class CollectionManager {

    public ArrayList list = new ArrayList();

    public void add(Cat cat) {
        list.add(cat);
    }

    public void info() {
        System.out.println("В коллекции " + list.size() + " котят");
    }

}
