package mobitaining.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class Joinlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> orgi=new ArrayList<>(Arrays.asList(22,3,4,5));
		//orgi.add(22);
		//orgi.add(3);
		//orgi.add(2);
		//orgi.add(20);
		
		System.out.println(orgi);
		
		ArrayList<Integer> orgi2=new ArrayList<>();
		orgi2.add(5);
		orgi2.add(10);
		System.out.println(orgi2);
		
		orgi.addAll(orgi2);
		System.out.println("the value are :"+orgi);

	}

}
