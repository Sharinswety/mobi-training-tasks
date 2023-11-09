package mobitaining.day1;

import java.util.ArrayList;
import java.util.Collection;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> org= new ArrayList<>();
		org.add(1);
		org.add(2);
		org.add(3);
		ArrayList<Integer> temp= new ArrayList<>(org);
		//Collection.copy(org,temp);
		System.out.print(org);
		System.out.print(temp);
		
	}

}
