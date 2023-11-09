package mobitaining.day1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hstotree {

	public static void main(String[] args) {
		HashSet<Integer> hs= new HashSet<>();
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Set<Integer> tree = new TreeSet<>(hs);
		System.out.println("the value"+tree);
	}

}
