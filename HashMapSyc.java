import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class HashMapSyc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> names = Collections.synchronizedMap(new HashMap<>());
		names.put(1, "rao");
		names.put(2, "riteesh");
		names.put(3, "reddy");
		names.put(4, "kumar");
		names.put(5, "karthik");
		names.put(6, "ch");
		names.put(7, "aaanu");
		names.put(8, "harika");
	     System.out.println(names.get(3));
        Iterator<Integer> itr = names.keySet().iterator();
        synchronized (names) 
        {
            while(itr.hasNext()) {
                System.out.println(names.get(itr.next()));
            }
        }
        
        ConcurrentHashMap<Integer, String> cMap = new ConcurrentHashMap<>();
        cMap.put(1, "bachu");
        cMap.put(2, "siri");
        cMap.put(3, "jannu");
        cMap.put(4, "ajay");
        cMap.put(15, "priya");
        cMap.put(6, "chethan");
    
        System.out.println(cMap.get(15));         
        Iterator<Integer> itr1 = cMap.keySet().iterator();
        synchronized (cMap) 
        {
            while(itr1.hasNext()) {
                System.out.println(cMap.get(itr1.next()));
            }
        }
		
	}

}
