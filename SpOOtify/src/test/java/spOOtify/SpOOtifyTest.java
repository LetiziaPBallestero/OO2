package spOOtify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpOOtifyTest {

	SpOOtify sputifai = new SpOOtify();
	User user = new User("Jill");

	@BeforeEach
	void setUp() {
		// Taylor Swift
		Song ts1 = new Song("Willow");
		Song ts2 = new Song("Champagne Problems");
		Song ts3 = new Song("Gold Rush");
		Song ts4 = new Song("'Tis the Damn Season");
		Song ts5 = new Song("Tolerate It");

		Album tsEvermore = new Album("Evermore");
		Author taylorSwift = new Author("Taylor Swift");

		tsEvermore.addSong(ts1);
		tsEvermore.addSong(ts2);
		tsEvermore.addSong(ts3);
		tsEvermore.addSong(ts4);
		tsEvermore.addSong(ts5);

		taylorSwift.addAlbum(tsEvermore);

		// TRANKI PUNKI

		Song tp1 = new Song("Será");
		Song tp2 = new Song("Muchacha");
		Song tp3 = new Song("Tresdoce");
		Song tp4 = new Song("Tengo");
		Song tp5 = new Song("Z.O.Z");

		Album tpNMDQNPS = new Album("No Me Digas Que No Pasa Nada");
		Author trankiPunki = new Author("TRANKI PUNKI");

		tpNMDQNPS.addSong(tp1);
		tpNMDQNPS.addSong(tp2);
		tpNMDQNPS.addSong(tp3);
		tpNMDQNPS.addSong(tp4);
		tpNMDQNPS.addSong(tp5);

		trankiPunki.addAlbum(tpNMDQNPS);

		// Maneskin
		Song ms1 = new Song("Coraline");
		Song ms2 = new Song("Zitti e buoni");
		Song ms3 = new Song("Vent'anni");
		Song ms4 = new Song("I Wanna Be Your Slave");
		Song ms5 = new Song("In nome del padre");

		Album teatro = new Album("Teatro d'ira: Vol. I");
		Author maneskin = new Author("Måneskin");

		teatro.addSong(ms1);
		teatro.addSong(ms2);
		teatro.addSong(ms3);
		teatro.addSong(ms4);
		teatro.addSong(ms5);

		maneskin.addAlbum(teatro);

		sputifai.addAuthor(maneskin);
		sputifai.addAuthor(trankiPunki);
		sputifai.addAuthor(taylorSwift);
		sputifai.addUser(user);
	}

	/**
	 * TEST DE BÚSQUEDA
	 */
	@Test
	// buscar por disco
	public void searchAlbum() {

		assertEquals(5, sputifai.search("No Me Digas Que No Pasa Nada").size());
	}

	@Test
	// buscar por autor
	public void searchAuthor() {
		assertEquals(5, sputifai.search("måneskin").size());
	}

	@Test
	// buscar por titulo
	public void searchOneSong() {
		assertEquals(1, sputifai.search("CoraLine").size());
	}

	@Test
	// un fallo, aunque debería hacer tres
	public void failedSearch() {
		assertNotEquals(1, sputifai.search("Betty").size());
	}

	/**
	 * TEST DE USUARIO Y TEST MEDIO BOLUDOS
	 */

	@Test
	public void thisUser() {
		Song proclama = new Song("Proclama");
		user.addSong(new Song("Torna a casa"));
		user.addSong(new Song("Morirò Da Re"));
		user.addSong(proclama);
		assertEquals(3, user.getMyMusic().size());
		user.removeSong(proclama);
		assertEquals(2, user.getMyMusic().size());
	}

	@Test
	public void spootify() {
		assertEquals(3, sputifai.getAuthors().size());
		assertEquals(1, sputifai.getUsers().size());
	}
}
