package cisc3150hw2;

import java.util.LinkedList;

public class Playlist {
	
		  private Song first;
		  LinkedList<Song> Playlist;
		  
		  public  Playlist(){
		    // constructor for creating a new list
			  Playlist = new LinkedList<>();
		  }
		  public void addSong(Song s){
			  Playlist.add(s);
		  }
		  public Song listenToSong(){
		    // retrieves the next song to listen to
			  return first;
		  }
}
