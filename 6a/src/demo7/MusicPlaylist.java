package demo7;
import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {
    private LinkedList<String> playlist;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }

  
    public void addSong(String song) {
        playlist.add(song);
    }

 
    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Removed song: " + song);
        } else {
            System.out.println("Song not found");
        }
    }

 
    public void moveSong(int fromIndex, int toIndex) {
        if (fromIndex >= 0 && fromIndex < playlist.size() && toIndex >= 0 && toIndex < playlist.size()) {
            String song = playlist.remove(fromIndex);
            playlist.add(toIndex, song);
        } else {
            System.out.println("Invalid indices");
        }
    }

 
    public void displayPlaylist() {
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }
    }

    public static void main(String[] args) {
        MusicPlaylist mp = new MusicPlaylist();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMusic Playlist");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String song = scanner.nextLine();
                    mp.addSong(song);
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    String removeSong = scanner.nextLine();
                    mp.removeSong(removeSong);
                    break;
                case 3:
                    System.out.print("Enter current position of the song: ");
                    int fromIndex = scanner.nextInt() - 1;
                    System.out.print("Enter new position for the song: ");
                    int toIndex = scanner.nextInt() - 1;
                    mp.moveSong(fromIndex, toIndex);
                    break;
                case 4:
                    mp.displayPlaylist();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
