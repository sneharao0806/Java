import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> sai=new ArrayList<Integer>();
     sai.add(5);
     sai.add(4);
     sai.add(90);
     sai.add(90);
     sai.add(90);
     sai.add(90);
     sai.add(2);
     sai.add(1);
		/*
		 * System.out.println(sai); sai.remove(3); System.out.println(sai); sai.add(12);
		 * System.out.println(sai.size()); sai.add(99); sai.add(5, 78); sai.contains(9);
		 * System.out.println(sai);
		 */
	 System.out.println(sai);
     for(int i= 0;i<sai.size();i++) {
    	 for(int j=0;j<sai.size();j++) {
    		 if(i!=j && sai.get(i).equals(sai.get(j))) {
    			 sai.remove(j);  		
    			
    	 }
    	 } 
    	
     }
     System.out.println(sai);
     }
	}
