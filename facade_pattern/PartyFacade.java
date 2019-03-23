public class PartyFacade
{
    private Light light;
    private Music music;

    public PartyFacade(Light light, Music music) {
        this.light = light;
        this.music = music;
    }

    public void startParty() {
        light.on();
        music.on();
    }

    public void endParty() {
        light.off();
        music.off();
    }

    public static void main(String [] args) {
        PartyFacade party = new PartyFacade(new Light(), new Music());
        party.startParty();
        party.endParty();
    }
}
