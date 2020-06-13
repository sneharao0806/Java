import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Copyon {

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
	     System.out.println(sai);
	     sai.remove(3);
	     System.out.println(sai);
	     sai.add(12);
	     System.out.println(sai.size());
	     sai.add(99);
	     sai.add(5, 78);
	     sai.contains(9);
	     System.out.println(sai);
	 //    Collections.sort(names);

	     
	     
// CopyONWrite
		CopyOnWriteArrayList<Integer> na=new  CopyOnWriteArrayList<>();
		na.add(5);
		na.add(7);
		na.add(56);
		System.out.println(na.size());
//HashMap
		
		HashMap<String, String> names=new HashMap<String, String>();
		
		names.put("sneha", "rao");
		names.put("sai", "riteesh");
		names.put("nani", "reddy");
		names.put("dileep", "kumar");
		names.put("bachu", "karthik");
		names.put("swathi", "ch");
		names.put("san", "aaanu");
		names.put("alladi", "harika");
		System.out.println(names);
		System.out.println(names.values());
		System.out.println(names.keySet());
		System.out.println(names.remove("bachu"));
		System.out.println(names.hashCode());
		System.out.println(names.containsKey("san"));
		System.out.println(names.entrySet());

	}

}
