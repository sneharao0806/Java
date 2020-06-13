
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 String str="java Demo";
		 String revstr=" ";
		 
		 int len=str.length();
		 
		 
		 for(int i=len-1;i>=0;i--) {
			 revstr= revstr+ str.charAt(i);
		 }

			 System.out.println("Reverse of the string"+revstr);
		 
		
	}

}
