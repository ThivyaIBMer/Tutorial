package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Ria");
		hm.put(2, "pooja");
		hm.put(3, "seetha");
		hm.put(null, "seetha");
		hm.put(null, null);
	
		hm.put(4,null);
		
		System.out.println(hm.get(4));
		
		  System.out.println(hm.get(1));
		  System.out.println(hm.get(2));
		  System.out.println(hm.get(3)); 
		  System.out.println(hm);
		  hm.replace(1,"priya"); 
		  System.out.println(hm); 
		  hm.remove(1); 
		  System.out.println(hm);
		 

		Set st = hm.entrySet();
		Iterator it = st.iterator();

		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + " " + me.getValue());

		}

	}

}
