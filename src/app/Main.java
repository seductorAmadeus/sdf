package app;

public class Main {

    public static void main(String[] args) {
        CollectionManager collectionManager = new CollectionManager();
        Invoker invoker = new Invoker(collectionManager);
        invoker.execute("add");
        invoker.execute("add");
        invoker.execute("info");
    }
}
