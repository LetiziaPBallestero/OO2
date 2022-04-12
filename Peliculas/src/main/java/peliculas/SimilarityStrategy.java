package peliculas;

import java.util.List;
import java.util.stream.Collectors;

public class SimilarityStrategy implements Recommender {

	/**
	 * (ii) similaridad: las películas son similares a alguna película que
	 * reprodujo.
	 **/
	@Override
	public List<Movie> recommend(List<Movie> played, List<Movie> available) {
		List<Movie> unsee = available.stream()
				.sorted((m1,m2) -> m2.getYearRelase() - m1.getYearRelase())
				.filter(x -> {return played.stream().anyMatch(y -> y.similar(x));})
				.limit(3).collect(Collectors.toList());
		return unsee;
	}

}
