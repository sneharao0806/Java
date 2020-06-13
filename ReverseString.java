import java.util.*;

public class ReverseString 
{
	public static void main(String args[]) 
	{
		//declare string object and assign string
		StringBuffer str= new StringBuffer("Java Demo");
		
		//reverse the string
		str.reverse();
		
		//print the reversed string 
		System.out.println("String after reversing:" + str);
	}  
}
