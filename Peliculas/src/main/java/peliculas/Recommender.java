package peliculas;
import java.util.List;

public interface Recommender {
	public List<Movie> recommend (List<Movie> played , List<Movie> available);
}
