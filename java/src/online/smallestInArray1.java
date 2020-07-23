package online;

public class smallestInArray1 {

	public static void main(String[] args) {
		int[] givenArray= {9,7,5,6};
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<givenArray.length;i++)
		{
	       if(givenArray[i]<smallest)
	       {
	    	   smallest=givenArray[i];
	       }
		}
	    	  System.out.println(smallest); 
		

}
}