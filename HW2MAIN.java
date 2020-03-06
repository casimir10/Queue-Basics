package cisc3150hw2;

import java.io.*;
import java.util.ArrayList;
public class HW2MAIN {

	public static void main(String [] args) throws IOException {
	String[] tracklists = {"Tracks1.txt","Tracks2.txt","Tracks3.txt","Tracks4.txt"};
	
	ArrayList<Queue> allTheWeeks = new ArrayList<>();
	  //Create Queues from Files
	  for (int i=0; i < tracklists.length-1; i++){
	    Queue dataExtract = new Queue(tracklists[i]);
	    allTheWeeks.add(dataExtract);
	  }
	  
	  //Build a PlayList and History 
	  Playlist builtlist = new Playlist();
	  SongHistoryList builthistory = new SongHistoryList();
	  
	  for(int i = 0; i < allTheWeeks.size();i++) {
		  for(int j = 0; j < allTheWeeks.get(i).size();j++) {
			  Song current = new Song(allTheWeeks.get(i).get(j).toString());
			  builtlist.addSong(current);
			  builthistory.addSong(builtlist.listenToSong());
		  }
	  }
	  
	  //Merge some Queues
	  allTheWeeks.get(0).mergingFunction(allTheWeeks.get(0), allTheWeeks.get(1));
	  
	
	  
	  
	}
}