package demo13;
public class VolumeControlDecorator extends MusicPlayerDecorator {
    public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    @Override
    public void playMusic() {
        super.playMusic();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Adjusting volume level.");
    }
}
