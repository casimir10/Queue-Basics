package cisc3150hw2;
import java.util.Stack;

public class SongHistoryList {
	  private Song first;
	  Stack<Song> History;
	  
	  public SongHistoryList(){
	    // constructor for creating a new list
		  History = new Stack<Song>();
	  }
	  public void addSong(Song s){
		  History.add(s);
	  }
	  public Song lastListened(){
	    // retrieves the next song to listen to
		 return first;
	  }
}
