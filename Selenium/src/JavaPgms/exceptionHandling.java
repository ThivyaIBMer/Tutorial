package JavaPgms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.BindException;

public class exceptionHandling {
	
	public static void exc() throws FileNotFoundException {
		FileInputStream file_data = null;  
         
            file_data = new FileInputStream("C:/Users/ajeet/OneDrive/Desktop/programs/Hell.txt");  
	}
	

	public static void main(String[] args) throws FileNotFoundException,BindException {
//		int b=3;
//		int c=0;
		//exceptionHandling.exc();
				
		
		try {
			int[] a=new int[2];
			a[0]=1;
			a[1]=2;
			a[2]=4;
	
		}
		
		
		catch(ArithmeticException e){
			System.out.println("Got the Arithmetic Exception : "+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Got the indexoutofbound Exception : "+e);
			
		}
		
		catch(Exception e){
			System.out.println("Got the Exception : "+e);
		}
		
		finally {
			System.out.println("Finally am at the end");
		}
		

	}

}
