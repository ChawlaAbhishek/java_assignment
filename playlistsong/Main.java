package playlistsong;

import java.util.List;
import java.util.Scanner;

public class Main {
    Song st = new Song();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayList p = new PlayList();


        int count = 1;
        while(count<=4){
            System.out.println("Enter song"+count++);
           String songe =  sc.next();
          // System.out.println("Enter movie");
            //String moviee = sc.next();
            Song s = new Song();
            s.setSongName(songe);
            //s.setMovieName(moviee);
            p.addSong(s);


        }

    }

    public void getSong(List<Song> songs) {
        st.play(songs);
    }
}
