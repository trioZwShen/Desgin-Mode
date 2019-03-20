import java.util.Deque;
import java.util.ArrayDeque;

public class RemoteControl
{
    private Command [] onCommands;
    private Command [] offCommands;

    private Deque<Command> undoList;

    /**
     * init remote control
     */
    public RemoteControl(int size) {
        onCommands = new Command[size];
        offCommands = new Command[size];
        for (int i=0; i<size; ++i) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

        undoList = new ArrayDeque<>();
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void pressOnButton(int index) {
        onCommands[index].execute();
        undoList.addLast(onCommands[index]);
    }

    public void pressOffButton(int index) {
        offCommands[index].execute();
        undoList.addLast(offCommands[index]);
    }

    public void pressUndoButton() {
        Command cmd = undoList.pollLast();
        if (cmd == null) {
            System.out.println("Empty History.");
        } else {
            cmd.execute();
        }
    }
}
