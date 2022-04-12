package peliculas;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class NoveltyStrategy implements Recommender {

	/**(i) novedad: 
	 * las películas más recientes
	**/
	@Override
	
	public List<Movie> recommend(List<Movie> played, List<Movie> available) {
		 return available.stream()
				.sorted(Comparator.comparingInt(Movie::getYearRelase).reversed())
				.limit(3)
				.toList(); 
	}
	



}
