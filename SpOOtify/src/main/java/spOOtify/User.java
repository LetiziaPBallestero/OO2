package spOOtify;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Song> myMusic;

    public User (String n){
        this.name = n.toLowerCase();
        this.myMusic = new ArrayList<>();
    }

    public void addSong(Song s){
        if (!this.myMusic.contains(s))
            this.myMusic.add(s);
    }

    public void removeSong(Song s){
        if (this.myMusic.contains(s))
            this.myMusic.remove(s);
    }

    public List<Song> getMyMusic(){
        return this.myMusic;
    }

    public String getName(){
        return this.name.toLowerCase();
    }
}
