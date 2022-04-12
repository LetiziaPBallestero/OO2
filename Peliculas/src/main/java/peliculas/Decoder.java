package peliculas;

/** 
 * estoy intentando programar en inglés
 * a ver que tan mal sale
 **/

import java.util.ArrayList;
import java.util.List;

public class Decoder {
	private List <Movie> played; 
	private List <Movie> available; 
	private Recommender recommender;
	
	public Decoder(Recommender actualRecommender) {
		this.recommender = actualRecommender;
		this.played = new ArrayList<Movie>();
		this.available = new ArrayList<Movie>();
	}
	
	public void setRecommender(Recommender newRecommender) {
		this.recommender = newRecommender;
	}
	
	public List<Movie> recommend() {
		return this.recommender.recommend(this.played , this.available);
	}
	
	public void seeMovie(Movie movie) {
		this.played.add(movie);
		this.available.remove(movie);
	}
	
	public void addMovie(Movie movie) {
		this.available.add(movie);
	}

	
}
