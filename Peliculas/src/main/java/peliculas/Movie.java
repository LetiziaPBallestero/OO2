package peliculas;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String title;
	private int yearRelase;
	private double score;
	private List<Movie> similar;

	public Movie(String title, int year, double score) {
		this.title = title;
		this.yearRelase = year;
		this.score = score;
		this.similar = new ArrayList<>();
	}
	
	public boolean similar(Movie m) {
		return similar.contains(m);
	}

	/** 
	 * GETTERS & SETTERS
	 */
	
	public String getTitle() {
		return title;
	}

	public int getYearRelase() {
		return yearRelase;
	}

	public double getScore() {
		return score;
	}

	public List<Movie> getSimilar() {
		return similar;
	}

	public void addSimilar (Movie movie) {
		this.similar.add(movie);
	}

}
