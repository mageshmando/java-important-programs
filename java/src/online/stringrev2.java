package online;

public class stringrev2 {

	public static void main(String[] args) {
		String given="mandro";
		char[] givenString=given.toCharArray();
		String reversed="";
		for(int i=givenString.length-1;i>=0;i--)
		{
          reversed=reversed+givenString[i];
	}
		System.out.println(reversed);

}
}
