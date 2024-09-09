package demo13;
public class BasicMusicPlayer implements MusicPlayer {
    protected MusicSource musicSource;

    public BasicMusicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void playMusic() {
        musicSource.play();
    }
}
