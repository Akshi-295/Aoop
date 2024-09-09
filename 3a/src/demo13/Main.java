package demo13;
public class Main {
    public static void main(String[] args) {
        MusicSource localFile = new LocalFileMusicSource("song.mp3");
        MusicSource onlineStream = new OnlineStreamingMusicSource("http://example.com/stream");
        MusicSource radioStation = new RadioStationMusicSource("Radio FM 101");

        // Playing local file with equalizer and volume control
        MusicSource localFileWithFeatures = new VolumeControlDecorator(new EqualizerDecorator(localFile));
        localFileWithFeatures.play();

        // Playing online stream with equalizer
        MusicSource onlineStreamWithEqualizer = new EqualizerDecorator(onlineStream);
        onlineStreamWithEqualizer.play();

        // Playing radio station with volume control
        MusicSource radioStationWithVolume = new VolumeControlDecorator(radioStation);
        radioStationWithVolume.play();
    }
}
