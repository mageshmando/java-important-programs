package online;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int num;
		boolean isPrime=false;
	System.out.println("enter the number");
	Scanner scanner=new Scanner(System.in);
	num=scanner.nextInt();
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			 isPrime=true;
	}
	}
	if(isPrime=true)
	{
		System.out.println(+num+  "is prime number");
		
	}else {
		System.out.println(+num+ "is not a prime number");
	}


}
}
