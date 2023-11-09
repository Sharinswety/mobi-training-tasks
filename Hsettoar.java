package mobitaining.day1;

import java.util.ArrayList;
import java.util.HashSet;

public class Hsettoar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs= new HashSet<>();
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Integer[] ar = new Integer[hs.size()];
		hs.toArray(ar);
		 for (int i : ar) {
			 System.out.println(i);
			 
		 }

	}

}
