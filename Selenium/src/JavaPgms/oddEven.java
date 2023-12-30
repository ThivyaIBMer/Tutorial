package JavaPgms;

public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nested loops
		int[] arr= {1,3,5,2,6,8,9};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" The given num is even");
				break;
			}
			else {
				System.out.println(arr[i]+ " The given num is odd");
			}
		}

		//while
		int k=9;
		while(k<10) {
			System.out.println(k);
			k++;
		}
		//do-while
		int j=20;
		do {
			System.out.println(j);
			j++;
		}while(j>30);

		//for loop
		for(int i=0;i<=4;i++) {
			System.out.println("outer loop start");
			for(int m=1;m<=4;m++) {
				System.out.println("inner loop");
			}
			System.out.println("outer loop ends");
		}

	}

}
