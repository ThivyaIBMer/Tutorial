package JavaPgms;

import java.util.ArrayList;

public class ClassOne {
	
	int num=10;//instance
	static int sec_num=12;//static
	final int f=3;
	String s="test";
	char c='A';
	int[] numArray= {1,3,5,7};
	
	public void method1() {
		int num=58;//local
		//System.out.println(num);
		
		
		//arrays
		int[] arr=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		for(int f:arr) {
			if(f==2) {
			System.out.println(f);}
			else {
				System.out.println("no need to print");
			}
		}
	}

	public static void main(String[] args) {
		ClassOne c1=new ClassOne();
//		System.out.println(c1.num);
//		System.out.println(sec_num);
		c1.method1();
		//System.out.println(c1.c);
		//System.out.println(c1.numArray[3]);
		//System.out.println(Integer.MAX_VALUE);
		
		
	}

}
