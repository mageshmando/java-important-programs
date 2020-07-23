package online;

public class swap1 {

	public static void main(String[] args) {
		int first=50;
		int second=20;
		
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println(first);
		System.out.println(second);
	}
}
