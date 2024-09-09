package demo13;
public class RadioStationMusicSource implements MusicSource {
    private String station;

    public RadioStationMusicSource(String station) {
        this.station = station;
    }

    @Override
    public void play() {
        System.out.println("Playing music from radio station: " + station);
    }
}
