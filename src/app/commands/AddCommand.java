package app.commands;

import app.CollectionManager;

public class AddCommand implements Command {
    private CollectionManager collectionManager;

    public AddCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    // TODO: откуда взять 12 и 124
    @Override
    public void execute() {
        collectionManager.add(new Cat(12, 124));
    }
}
