package online;

public class replaceVowels {

	public static void main(String[] args) {
		String given="i love mahendra singh dhoni";
		 given=given.toLowerCase();
		 char[] character=given.toCharArray();
		 for (int i=0;i<given.length();i++)
		 {
			 if (given.charAt(i)=='a' || given.charAt(i)=='e' || given.charAt(i)=='i' ||
					 given.charAt(i)=='o' || given.charAt(i)=='u')
			 {
				 character[i]='*';
			 }
		 }
		System.out.println(character);
		

	}
}

