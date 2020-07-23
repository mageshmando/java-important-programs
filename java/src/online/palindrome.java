package online;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		String str;
		String reversed="";
		System.out.println("enter the value: ");
		Scanner scanner= new Scanner(System.in);
		str=scanner.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
          reversed=reversed+str.charAt(i);
		}
	
if(str.equals(reversed))

	System.out.println("the given word is paindrome");

else

	System.out.println("the given word is not palindrome");

}
}
