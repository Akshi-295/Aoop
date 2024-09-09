package demo13;
public class Main {
    public static void main(String[] args) {
        MusicSource localFile = new LocalFileMusicSource("song.mp3");
        MusicSource onlineStream = new OnlineStreamingMusicSource("http://example.com/stream");
        MusicSource radioStation = new RadioStationMusicSource("Radio FM 101");

        MusicPlayer localFilePlayer = new BasicMusicPlayer(localFile);
        MusicPlayer onlineStreamPlayer = new BasicMusicPlayer(onlineStream);
        MusicPlayer radioStationPlayer = new BasicMusicPlayer(radioStation);

        // Playing local file with equalizer and volume control
        MusicPlayer localFileWithFeatures = new VolumeControlDecorator(new EqualizerDecorator(localFilePlayer));
        localFileWithFeatures.playMusic();

        // Playing online stream with equalizer
        MusicPlayer onlineStreamWithEqualizer = new EqualizerDecorator(onlineStreamPlayer);
        onlineStreamWithEqualizer.playMusic();

        // Playing radio station with volume control
        MusicPlayer radioStationWithVolume = new VolumeControlDecorator(radioStationPlayer);
        radioStationWithVolume.playMusic();
    }
}
