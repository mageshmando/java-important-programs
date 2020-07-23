package online;

public class findVowels {

	public static void main(String[] args) {
		String given="mandro";
		int vowelCount=0;
		given=given.toLowerCase();
		for(int i=0;i<given.length();i++)
		{
if(given.charAt(i)=='a' || given.charAt(i)=='e' || given.charAt(i)=='i' ||given.charAt(i)=='o'
|| given.charAt(i)=='u')	
{
	vowelCount++;
}
}
		System.out.println("your name has "  +vowelCount+ "  vowels");

	}

}
  