package online;

import java.util.Scanner;

public class positionOfAlphabet {

	public static void main(String[] args) {
		System.out.println("enter the character: ");
		Scanner scanner=new Scanner(System.in);
		char given=scanner.next().charAt(0);
		char lower = Character.toLowerCase(given);
		int ascii=(int)lower;
		int position=ascii-96;
		System.out.println("position of "  +given+  "is"   +position );

	}

}
