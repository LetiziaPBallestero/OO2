package peliculas;

import java.util.Comparator;
import java.util.List;

public class ScoreStrategy implements Recommender {

	/**(iii) puntaje: 
	 * las películas de mayor puntaje, 
	 * para igual puntaje considera las más recientes.
	**/
	@Override
	public List<Movie> recommend(List<Movie> played, List<Movie> available) {
	return	available.stream()
			.sorted(Comparator.comparingDouble(Movie::getScore).reversed()
			.thenComparing(Comparator.comparing(Movie::getYearRelase).reversed()))
			.limit(3)
			.toList();	   
	}

}
