package mobitaining.day1;

public class Word {

	public static void main(String[] args) {
		String ss="hi good luck";
		String[] words= ss.split("\\s+");
		int Wordcount= words.length;
		System.out.println("the word count is : "+Wordcount);
	}

}
//{
//	String sha="world is beautyful";
//	String[]word=sha.split("\\s+");
//	int Wordcount=word.length;
//}