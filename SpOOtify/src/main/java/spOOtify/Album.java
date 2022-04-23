package spOOtify;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Album {
	private String name;
    private List<Song> songs;

    public Album(String n){
        this.name = n.toLowerCase();
        this.songs = new ArrayList<>();
    }

    public String getName(){
        return this.name.toLowerCase();
    }

    public void addSong(Song s){
        this.songs.add(s);
    }

    public List<Song> getSongs(){
        return this.songs;
    }
    
    public List<Song> search(String data) {
    	// a data la lowecaseo(? desde SpOOtify
    	if (this.getName().contains(data)) 
    		return this.getSongs();
    	return this.songs.stream().flatMap(s -> s.search(data).stream()).collect(Collectors.toList());
    }
}
