package JavaPgms;

public class small_large_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {55,63,45,67,89,8,54};
		int min=x[0];
		
		for(int i=0;i<x.length;i++) {
			if(x[i]>min) {
				min=x[i];
				
			}
		}
		System.out.println(min);

	}

}
