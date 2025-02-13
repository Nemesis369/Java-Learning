import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playlist) {
        int index = trackNo - 1;
        if (index >= 0 && index < songs.size()) {
            playlist.addLast(songs.get(index));
            return true;
        }

        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song temp = findSong(title);
        if (temp == null) {
            return false;
        }
        playlist.offer(temp);
        return true;
    }
}