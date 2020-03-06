package cisc3150hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Queue extends LinkedList{
	
	public Queue() {}
	
	
	public Queue(String filename) throws IOException {
		//Open and Store items From Files, then Sort
		LinkedList<String> list = new LinkedList<String>();
		FileReader r = new FileReader(filename);
		BufferedReader reader = new BufferedReader(r);
		
		String line = "";
		
		while ((line = reader.readLine()) != null) {
		      list.add(line);
		      line = reader.readLine();       
		}
		Collections.sort(list);
		reader.close();
	}
	
	/* This function takes two queues and returns one into one */
	public Queue mergingFunction(Queue first, Queue second){
		  Queue mergedQueue = new Queue();
		  
	        // If both queues are not empty.
	        while (!first.isEmpty() && !second.isEmpty()) {
	            mergedQueue.add(first.poll());
	            mergedQueue.add(second.poll());
	        }

	        return mergedQueue;
	    }
	}


