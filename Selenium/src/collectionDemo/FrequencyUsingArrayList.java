package collectionDemo;

import java.util.ArrayList;

public class FrequencyUsingArrayList {

	public static void main(String[] args) {
		int[] a= {3,8,6,7,8,9,6,2,3,4,5,5,5};
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for(int i=0;i<a.length;i++) {
			int count=0;
			if(!arr.contains(a[i])) {
				arr.add(a[i]);
				count++;
				
				for(int k=i+1;k<a.length;k++) {
					
					if(a[i]==a[k]) {
						count++;
					}
				}
				//System.out.println(a[i]+" "+count);
				if(count==1) {
					System.out.println(a[i]+ " is unique");
				}
				
			}
			
			
		}
	}

}
