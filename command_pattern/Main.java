public class Main
{
    public static void main(String [] args) {
        RemoteControl control = new RemoteControl(3);
        Light light = new Light();
        MusicPlayer musicPlayer = new MusicPlayer();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command musicOn = new MusicOnCommand(musicPlayer);
        Command musicOff = new MusicOffCommand(musicPlayer);
        Command partyOn = new MarcoCommand(new Command[] {lightOn, musicOn});
        Command partyOff = new MarcoCommand(new Command[] {lightOff, musicOff});

        control.setCommand(0, partyOn, partyOff);
        control.setCommand(1, lightOn, lightOff);
        control.setCommand(2, musicOn, musicOff);

        System.out.println("-- Test Light --");
        control.pressOnButton(1);
        control.pressOffButton(1);
    
        System.out.println("-- Test Music --");
        control.pressOnButton(2);
        control.pressOffButton(2);

        System.out.println("-- Test Party --");
        control.pressOnButton(0);
        control.pressOffButton(0);

        System.out.println("-- Test Undo --");
        control.pressUndoButton();
        control.pressUndoButton();
        control.pressUndoButton();
        control.pressUndoButton();
        control.pressUndoButton();
        control.pressUndoButton();
        control.pressUndoButton();
    } 

}
