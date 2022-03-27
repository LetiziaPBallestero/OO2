package ar.edu.unlp.info.oo2.twitter_ejercicio1;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
public class ServicioTest {
ServicioTwitter Servicio1; 
Usuario u1;
Usuario u2;
Usuario u3;
Usuario u4;
Tweet t1;

		@BeforeEach
		public void setUp() throws Exception {
			Servicio1 = new ServicioTwitter(); 
			u1 = new Usuario ("Letizia");
			u2 = new Usuario ("Marcos");
			u3 = new Usuario ("Bruno");
			u4 = new Usuario ("Luna");
			t1 = new Tweet ("soy un tweet" , u1);
		}
		
		@Test 
		public void testAddUsers() {
			Servicio1.newUser("UsuarioPrueba");
			assertEquals(1 , Servicio1.getCantUsers());
		}
		@Test 
		public void testEraseUser() {
			Servicio1.newUser("UsuarioPrueba2");
			Servicio1.eliminarUsuario("UsuarioPrueba2");
			assertTrue(Servicio1.thereIsNotThisUserName("UsuarioPrueba2"));
		}
		@Test 
		public void testUsuario() {
			assertEquals("Letizia" , u1.getScreenName());
			assertEquals(0 , u1.getCantOfTweets());
			
		}
		@Test 
		public void testHacertweet() {
			u2.hacerTweet("Soy un texto adecuado");
			assertEquals(1 , u2.getCantOfTweets());
			u2.hacerTweet("");
			assertEquals(1 , u2.getCantOfTweets());
			u2.hacerTweet("mi viejo estuvo toda la tarde en la compu con el google earth ya es de noche y solo se veía su cara iluminada por la pantalla. cuando se dio cuenta de que lo estaba viendo tiró un \"mirá lo que es bulgaria\" todo emocionado mostrándome el baldío más desolador que vi en mi vida además que viejo trolo");
			assertEquals(1 , u2.getCantOfTweets());
			u2.hacerReTweet(t1);
			assertEquals(2 , u2.getCantOfTweets());
		}
		
		@Test 
		public void testRetweet() {
			u3.hacerReTweet(t1);
			assertEquals(1 , u3.getCantOfTweets());
			Tweet t = u3.getTweets().get(0);
			assertTrue(t.isAReTweet());
			assertEquals("soy un tweet" , t.getContenido());
			assertEquals(u1.getScreenName() , t.whoMakeit());
		}
		

}
