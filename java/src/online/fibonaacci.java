package online;
import java.util.Scanner;

public class fibonaacci {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int numNext,length;
		System.out.println("enter the length: ");
		Scanner scanner= new Scanner(System.in);
		length=scanner.nextInt();
		for(int i=0;i<length;i++)
		{
			System.out.println(num1+"");
			numNext=num1+num2;
			num1=num2;
			num2=numNext;
		}

	}

}
