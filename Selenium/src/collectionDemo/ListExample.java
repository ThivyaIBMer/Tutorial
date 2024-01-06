package collectionDemo;

import java.util.*;

public class ListExample {
	
	

	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		
		System.out.println(al);
		
		int[] check= {1,3,5,2,6,8,9};
		System.out.println(check);
		List l=Arrays.asList(check);
		System.out.println(l);

		ArrayList arr = new ArrayList();
		arr.add("test");
		arr.add("t1");
		arr.add("t4");
		arr.add(1,"t5");
		
		arr.remove("t1");
		arr.add(1.90);
		/*
		 * System.out.println(arr.indexOf("t4"));
		 * 
		 * System.out.println(arr.get(1)); System.out.println(arr.contains("t5dsd"));
		 * System.out.println(arr.isEmpty());
		 */
//		
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i));
//			
//		}
//		System.out.println("**************");
//		for (Object object : arr) {
//			System.out.println(object);
//		}
		 ListIterator<Object> iterator =arr.listIterator();
         

     // Printing the iterated value
     System.out.println("\nUsing ListIterator:\n");
//     while (iterator.hasNext()) {
//         System.out.println("Value is : "
//                            + iterator.next());
//     }
     System.out.println("*************");
     while (iterator.hasPrevious()) {
    
         System.out.println("Value is : "
                            + iterator.previous());
     }
	}

}
