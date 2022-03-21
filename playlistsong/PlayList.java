package playlistsong;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    Main m = new Main();
    public List<Song> songs = new ArrayList<>();
    public void addSong(Song s){
        songs.add(s);
        System.out.println("Song added to the playlist successfully");
        m.getSong(songs);

    }


}
