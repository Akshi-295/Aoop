package demo13;
public class VolumeControlDecorator extends MusicSourceDecorator {
    public VolumeControlDecorator(MusicSource decoratedMusicSource) {
        super(decoratedMusicSource);
    }

    @Override
    public void play() {
        super.play();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Adjusting volume level.");
    }
}

