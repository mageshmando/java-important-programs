package online;

public class addNumberInString {

	public static void main(String[] args) {
		String given="mandro99";
		int total=0;
		 for(int i=0;i<given.length();i++)
		 {
          char character=given.charAt(i);
          if(Character.isDigit(character))
          {
        	  total=total+Character.getNumericValue(character);
          }
	}
		 System.out.println(total);

}
}
