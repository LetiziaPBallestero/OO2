package spOOtify;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpOOtify {

	List <User> users;
	List <Author> authors; 
	
	public SpOOtify() {
		this.users = new ArrayList<>();
		this.authors = new ArrayList<>();
	}
	/** 
	 * add & remove  
	**/
	public void addUser (User u) {
		this.users.add(u);
	}
	
	public void removeUser (User u) {
		this.users.remove(u);
	}
	
	public void addAuthor (Author a) {
		this.authors.add(a);
	}
	
	public void removeAuthor (Author a) {
		this.authors.remove(a);
	}
	
	
	/** 
	* searchings refactorizados 
	* aguante el spaniglish vieja
	* los viejos métodos los delegué una vez 
	* vi que esta cosa funcionaba
	* si pudiera usar patterns, usaría 
	* un template method 
	**/
	
	public List<Song> search(String data) {
		return this.authors.stream()
				.flatMap(s -> s.search(data.toLowerCase())
						.stream()).collect(Collectors.toList());
	}
	
	
	public List<User> getUsers() {
		return this.users;
	}
	
	public List<Author> getAuthors() {
		return this.authors;
	}
}
