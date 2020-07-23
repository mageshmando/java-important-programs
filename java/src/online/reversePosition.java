package online;

public class reversePosition {

	public static void main(String[] args) {
		String given ="my name is mandro";
		String reversed=" ";
		String[] stringArray=given.split(" ");
		for(int i=stringArray.length-1;i>=0;i--)
		{
        reversed=reversed+stringArray[i]+" ";
		}
		System.out.println(reversed);
	}

}
 