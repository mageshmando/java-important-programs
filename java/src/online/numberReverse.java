package online;
import java.util.Scanner;


public class numberReverse {

	public static void main(String[] args) {
		int given;
		int reversed=0;
		System.out.println("enter the number");
		Scanner scanner=new Scanner(System.in);
		given=scanner.nextInt();
		while(given!=0)
		{
			reversed=reversed*10;
			reversed=reversed+given%10;
			given=given/10;
		}
		System.out.println("the reversed number is "+reversed);
	}

}
