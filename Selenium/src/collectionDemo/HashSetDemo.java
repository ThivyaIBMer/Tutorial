package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs =new HashSet();
		hs.add("Tina");
		hs.add("joshua");
		hs.add("joshua");
		hs.add("joshua");
		hs.add("barbara");
		hs.remove("joshua");		
		System.out.println(hs);
		System.out.println(hs.size());
//		hs.remove("barbara");
//		hs.remove("Tina");
//		System.out.println(hs.size());
//		System.out.println(hs.isEmpty());
		
		Iterator<String> it=hs.iterator();
		 while (it.hasNext()) {
			
	         System.out.println("Value is : "
	                            + it.next());
	}

}
	
}
