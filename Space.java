package mobitaining.day1;

public class Space {

	public static void main(String[] args) {
		String word="  the world is good   ";
		word= word.replaceAll("\\s","");
		
		System.out.println(word);

	}

}
