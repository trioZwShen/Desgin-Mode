public class MusicOffCommand implements Command
{
    private MusicPlayer musicPlayer;

    public MusicOffCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.off();
    }

    @Override
    public void undo() {
        musicPlayer.on();
    }
}
