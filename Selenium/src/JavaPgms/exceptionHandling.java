package JavaPgms;

public class exceptionHandling {
	
	

	public static void main(String[] args) {
		int b=3;
		int c=0;
		
		try {
		int d=b/c;
		
		}
		catch(Exception e){
			System.out.println("Got the Exception : "+e);
		}
		finally {
			System.out.println("Finally am at the end");
		}
		

	}

}
