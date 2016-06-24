import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Solution {
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	HashMap<Double,String> hm = new HashMap<>();
	    	ArrayList<Double> listOfRankings = new ArrayList<>();
	    	ArrayList<String> listOfBestSongs = new ArrayList<>();
	    	int n = scanner.nextInt();
	    	int m = scanner.nextInt();
	    	int e = n;
	    	for (int i = 1; i<=n; i++){
	    		double f = scanner.nextInt(); // Number of times the song is selected
	    		String s = scanner.next();
	    		double q = (double) f/((double) n-i+1); // But we need to consider the real rank of the song according to the Zipf's law
	    		if (hm.containsKey(q)){
	    			hm.put(q - (double)i/e, s);
	    			listOfRankings.add(q - (double) i/e);
	    		} else {
	    			hm.put(q, s);
	    			listOfRankings.add(q);
	    		}
	    	}
	    	scanner.close();
	    	System.out.println(hm);
	    	Collections.sort(listOfRankings);
	    	System.out.println(listOfRankings);
	    	for (int j = n-1; j>= n-m; j--){
	    		String s = hm.get(listOfRankings.get(j));
	    		listOfBestSongs.add(s);
	    	}
	    	
	    	System.out.println(listOfBestSongs);
	    }
	       
}
	

