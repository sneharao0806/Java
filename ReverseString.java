package Strings;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
				//declaring string objects

		 String str="java Demo";
		 String revstr=" ";
		
				//get length of the input string 

		 
		 int len=str.length();
		
		 		//code to reverse string 

		 
		 for(int i=len-1;i>=0;i--) {
			 revstr= revstr+ str.charAt(i);
		 }

			 System.out.println("Reverse of the string"+revstr);
		 
		
	}

}
