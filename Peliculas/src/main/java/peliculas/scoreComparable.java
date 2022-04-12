package peliculas;

import java.util.Comparator;

public class scoreComparable implements Comparator<Movie> {

	public int compare(Movie o1, Movie o2) {
		if (o1.getScore() < o2.getScore()) return 1;
		if (o1.getScore() > o2.getScore()) return 0;
		return -1;
	}

}
