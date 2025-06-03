public class Game {
    private final CommandHistory history;

    public Game() {
        this.history = new CommandHistory();
    }

    public void runCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public CommandHistory getHistory() {
        return this.history;
    }
}
