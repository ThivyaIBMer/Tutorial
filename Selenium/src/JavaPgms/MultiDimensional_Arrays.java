package JavaPgms;

public class MultiDimensional_Arrays {
	
	

	public static void main(String[] args) {
		int a[][]=new int [2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=5;
		a[1][1]=6;
		a[1][2]=7;
		
		int abc[][]= {{1,2,3},{5,0,7}};
		
//		System.out.println(abc[0][1]);
//		System.out.println(a[1][1]);
		
		int min=abc[0][0];
		for(int i=0;i<abc.length;i++) {
			for(int j=0;j<abc.length;j++) {
				if(abc[i][j]>min) {
					min=abc[i][j];
				}
				
			}
		}
		System.out.println(min);

	}

}
