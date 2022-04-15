package app;

import app.commands.InfoCommand;

public class Main {

    public static void main(String[] args) {
        CollectionManager collectionManager = new CollectionManager();

        Invoker invoker = new Invoker("/srv/path",collectionManager);

    }
}
