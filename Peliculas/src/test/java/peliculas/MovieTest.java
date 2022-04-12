package peliculas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieTest {
	
	Movie Thor; 
	Movie CapitanAmerica;
	Movie IronMan;
	Movie Dunkirk;
	Movie Rocky;
	Movie Rambo;
	
	Decoder decoder;
	ScoreStrategy scoreStrategy;
	NoveltyStrategy noveltyStrategy;
	SimilarityStrategy similarityStrategy;
	
	List<Movie> auxList = new ArrayList<>();
	
	@BeforeEach
	void setUp() {
		Thor = new Movie ( "Thor" , 2007 , 7.9);
		CapitanAmerica = new Movie ("Capitan America" , 2016 , 7.8); 
		IronMan = new Movie ("Iron Man" , 2010 , 7.9);
		Dunkirk = new Movie ("Dunkirk" , 2017 , 7.9);
		Rambo = new Movie ("Rambo" , 1979 , 7.8);
		Rocky = new Movie ("Rocky" , 1976 , 8.4);
		
		Thor.addSimilar(CapitanAmerica);
		Thor.addSimilar(IronMan);
		IronMan.addSimilar(Thor);
		IronMan.addSimilar(CapitanAmerica);
		CapitanAmerica.addSimilar(IronMan);
		CapitanAmerica.addSimilar(Thor);
		Rocky.addSimilar(Rambo);
		Rambo.addSimilar(Rocky);
		
		
		decoder = new Decoder(null);
		
		decoder.addMovie(Dunkirk);
		decoder.addMovie(Thor);
		decoder.addMovie(CapitanAmerica);
		decoder.addMovie(IronMan);
		decoder.addMovie(Rambo);
		decoder.addMovie(Rocky);
		
		decoder.seeMovie(Thor);
		decoder.seeMovie(Rocky);
	}
	
	@Test
	void testNovelty() {
		noveltyStrategy = new NoveltyStrategy();
		decoder.setRecommender(noveltyStrategy);
		
		auxList.clear();
		auxList.add(Dunkirk);
		auxList.add(CapitanAmerica);
		auxList.add(IronMan);
		
		assertEquals(auxList , decoder.recommend());
	}
	
	@Test
	void testSimilarity() {
		similarityStrategy = new SimilarityStrategy();
		decoder.setRecommender(similarityStrategy);
		
		auxList.clear();
		auxList.add(CapitanAmerica);
		auxList.add(IronMan);
		auxList.add(Rambo);

		assertEquals(auxList , decoder.recommend());
	}
	
	@Test
	void testScore() {
		scoreStrategy = new ScoreStrategy();
		decoder.setRecommender(scoreStrategy);

		auxList.clear();
		auxList.add(Dunkirk);
		auxList.add(IronMan);
		auxList.add(CapitanAmerica);
		
		assertEquals(auxList , decoder.recommend());
	}
	
	
	
	

}
