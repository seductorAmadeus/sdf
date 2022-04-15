package app;

import app.commands.AddCommand;
import app.commands.Command;
import app.commands.InfoCommand;

import java.util.HashMap;

public class Invoker {
    private final HashMap<String, Command> commands ;

    public Invoker(CollectionManager collectionManager) {
        commands = new HashMap<>();
        commands.put("info", new InfoCommand(collectionManager));
        commands.put("add", new AddCommand(collectionManager));
    }

    public void execute(String commandName) {
        Command command = commands.get(commandName);
        command.execute();
    }
}
