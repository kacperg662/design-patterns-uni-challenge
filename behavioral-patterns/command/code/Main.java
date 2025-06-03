public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Command startCommand = new StartGameCommand();
        Command scoresCommand = new ScoresCommand();
        Command settingCommand = new SettingsCommand();

        game.runCommand(startCommand);
        game.runCommand(scoresCommand);
        game.runCommand(settingCommand);

        System.out.println("Last used command: " + game.getHistory().pop().getClass().getSimpleName());
    }
}
