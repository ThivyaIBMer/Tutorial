package collectionDemo;

import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(1, "Ria");
		hm.put(2, "pooja");
		hm.put(3, "seetha");
		hm.put(null, "seetha");
		
		
		System.out.println(hm.get(4));
		  System.out.println(hm.get(1));
		  
		  Enumeration<Integer> e=hm.keys();
		  while(e.hasMoreElements()) {
			  int key=e.nextElement();
			  
			  System.out.println(key+" "+hm.get(key));
		  }
		  
	}

}
