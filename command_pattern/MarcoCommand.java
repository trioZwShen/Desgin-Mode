public class MarcoCommand implements Command
{
    private Command [] command;

    public MarcoCommand(Command[] command) {
        this.command = command;
    }

    @Override
    public void execute() {
        for (Command cmd : command) {
            cmd.execute();
        }
    }

    @Override
    public void undo() {
        for (Command cmd : command) {
            cmd.undo();   
        }
    }
}
