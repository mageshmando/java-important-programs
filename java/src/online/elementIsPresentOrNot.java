package online;

import java.util.Scanner;

public class elementIsPresentOrNot {

		int[]  given= {1,4,6,9,};
		boolean found=false;
		int find=6;
	
		public void foundArray()
		{
		for (int i : given) {
			if(i==find)
			{
				 found=true;
				System.out.println("the number is present.");
				break;
			}
		}
		}
public static void main(String[] args) {
				elementIsPresentOrNot element= new elementIsPresentOrNot();
				element.foundArray();
			}
		

	}


