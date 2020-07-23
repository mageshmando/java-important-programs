package online ;

import java.util.Scanner;

public class factorial {
	

	public static void main(String[] args) {
		int num;
		System.out.println("enter the number :");
	Scanner scanner=new Scanner(System.in);
	num=scanner.nextInt();
	int f=1;
	for(int i=1;i<=num;i++)
	{ 
		f=f*i;

	}
System.out.println("the factorial of " +num+ "is" +f);
	}
}
