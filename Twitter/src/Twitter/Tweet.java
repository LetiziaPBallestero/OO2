package Twitter;

public class Tweet {
	private Usuario usuario;
	private String contenido; 
	private Tweet reTweet;
	
	public Tweet (String contenido , Usuario u) {
		this.contenido = contenido;
		this.usuario = u;
		this.reTweet = null;
	}
	
	public String getContenido() {
		return this.contenido;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public Tweet getTweet() {
		return this.reTweet;
	}
	
	public boolean isAReTweet () {
		if (this.reTweet.equals(null))
			return false;
		else
			return true;
	}
	
	public String whoMakeit () {
		if (isAReTweet())
			return this.reTweet.usuario.getScreenName();
		else 
			return null;
	}
	
	public void makeReTweet(Tweet t) {
		this.reTweet = t;
	}



}
