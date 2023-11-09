package mobitaining.day1;

import java.util.HashMap;

public class Mapemptyornot {

	public static void main(String[] args) {


HashMap <Integer,String> swe = new HashMap <Integer,String> ();
swe.put(1, "Red");
swe.put(2, "Green");
swe.put(3, "Black");
swe.put(4, "White");
swe.put(5, "Blue");

System.out.println("the hashmap is : "+swe);
if(swe.isEmpty()) {
	System.out.println("it is empty");
	
}
else {
	System.out.println("it is not empty");
	//swe.clear();
}
	}

}
