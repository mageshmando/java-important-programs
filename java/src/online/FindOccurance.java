package online;

public class FindOccurance {

	public static void main(String[] args) {
		String given="maha";
		char toFind= 'a' ; 
		int occurance=0;
		
		given=given.toLowerCase();
		
		for( int i=0;i<given.length();i++)
		{
			if(given.charAt(i)== toFind)
			{
             occurance++;
		}

		}
		System.out.println("the occurance is" +occurance);

}
}
