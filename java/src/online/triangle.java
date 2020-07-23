package online;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		int row=0;
	     int column=0;
		int lines;
		System.out.println("enter the lines:"); 
		Scanner scanner = new Scanner(System.in);
		lines=scanner.nextInt();
		for ( row=0;row<lines;row++) 
		{
			for (column=0;column<=row;column++)
			{
				System.out.print("* ");
			}
			
		
		System.out.println();
	}

}
}
