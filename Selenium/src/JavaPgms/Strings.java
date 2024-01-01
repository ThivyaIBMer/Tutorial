package JavaPgms;

public class Strings {
	
	String s="ria k test";
	String s1="test";
	String s2="test";//string literal
	String s3=" trim ";
	int i=9;
	int j=9;
	String s4=new String("test");//new keyword
	
	public void stringOperations() {
		char getChr=s.charAt(2);
		String checkTrim=s3.trim();
		String[] splitName=s.split("k");
		System.out.println(splitName[0].trim().toUpperCase());
		System.out.println(getChr);
		System.out.println(checkTrim);
	}

	public void comparingStrings() {
		String val1="anu";
		String val2=new String("anu");
		if(val1.equals(val2)) {
			System.out.println("the result is: Passed");
		}
		else {
			System.out.println("the result is: Failed");
		}
	}
	
	public void substringTest() {
		String sub_vl="Testing Academy";
		System.out.println(sub_vl.substring(0,7));
		
	}
	public void compareTo_Test() {
		String a="lia";
		String b="jia";
		System.out.println(b.compareTo(a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strings st=new Strings();
		//st.substringTest();
		st.compareTo_Test();
		//st.comparingStrings();
		//st.stringOperations();
//		System.out.println(st.s);
//		st.s=st.s.concat("k");
//		System.out.println(st.s);
		
		

	}

}
