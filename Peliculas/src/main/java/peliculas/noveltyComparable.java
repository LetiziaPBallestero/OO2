package peliculas;

import java.util.Comparator;

public class noveltyComparable  {

	
	public int compareTo(Movie o1, Movie o2) {
		// > < 
		if (o1.getYearRelase() > o2.getYearRelase()) return 1;
		if (o1.getYearRelase() < o2.getYearRelase()) return 0;
		return -1;
	}

}
