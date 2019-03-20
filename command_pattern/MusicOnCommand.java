public class MusicOnCommand implements Command
{
    private MusicPlayer musicPlayer;

    public MusicOnCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.on();
    }

    @Override
    public void undo() {
        musicPlayer.off();
    }
}
