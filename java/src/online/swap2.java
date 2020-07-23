package online;

public class swap2 {

	public static void main(String[] args) {
		int mySalary=20;
		int superiorSalary=50;
		int temp;
		
		temp=mySalary;
		mySalary=superiorSalary;
		superiorSalary=temp;
		System.out.println("my salary is "+mySalary);
		System.out.println("my superior salary is "+superiorSalary);
	}

}
