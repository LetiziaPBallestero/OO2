package spOOtify;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Author {

	private String name;
	private List<Album> albums;

	public Author(String name) {
		this.name = name.toLowerCase();
		this.albums = new ArrayList<>();
	}

	public void addAlbum(Album a) {
		this.albums.add(a);
	}

	public void removeAlbum(Album a) {
		this.albums.remove(a);
	}

	public List<Song> search(String data) {
		// data la lowecaseo en SpOOtify
		if(this.getName().contains(data)) {
			return this.albums.stream().flatMap(s -> s.getSongs().stream()).collect(Collectors.toList());
		}
		return this.albums.stream().flatMap(s -> s.search(data).stream()).collect(Collectors.toList());
	}

	public List<Album> getAlbums() {
		return this.albums;
	}

	public String getName() {
		return this.name.toLowerCase();
	}

}
