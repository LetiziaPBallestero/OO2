package spOOtify;

import java.util.ArrayList;
import java.util.List;

public class Song {
	private String name; 
	
    public Song (String n){
        this.name = n.toLowerCase();
    }

    public String getName(){
        return this.name.toLowerCase();
    }
    
    public List<Song> search(String data) {
       	// a data la lowecaseo(? desde SpOOtify
		List<Song> songs = new ArrayList<Song>();
		if(this.getName().contains(data)) {
			songs.add(this);
		}
		return songs;
	
	}

}
