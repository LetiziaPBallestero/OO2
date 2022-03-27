package Twitter;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;

	private void setScreenName(String name) {
		this.screenName = name;
	}

	private void setTweets() {
		this.tweets = new ArrayList<>();
	}

	public Usuario(String name) {
		setScreenName(name);
		setTweets();
	}

	// hacer un tweet
	public void hacerTweet(String c) {
		if (c.length() < 140 & c.length() > 1) {
			Tweet t = new Tweet(c, this);
			this.tweets.add(t);
		}
	}
	
	// hacer un retweet
	public void hacerReTweet (Tweet t) {
		Tweet myTweet = new Tweet (t.getContenido() , t.getUsuario());
		myTweet.makeReTweet(t);
		this.tweets.add(myTweet);
	}


	// eliminar
	public void eliminarTweet(Tweet t) {
		this.tweets.remove(t);
		t = null;
		System.gc();
	}

	// eliminar todos
	public void eliminarTweets() {
		this.tweets.clear();
		System.gc();
	}

	public String getScreenName() {
		return this.screenName;
	}

	public List<Tweet> getTweets() {
		return this.tweets;
	}
		
	public int getCantOfTweets() {
		return tweets.size();
	}
	
	public Usuario getUsuario() {
		return this;
	}

}
