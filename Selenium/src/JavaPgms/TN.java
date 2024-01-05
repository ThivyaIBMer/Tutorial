package JavaPgms;

public class TN implements Traffic,Interface2{

	public static void main(String[] args) {
		Traffic n=new TN();
		n.blue();
		
		TN newobj=new TN();
		newobj.test();
		
		
		Interface2 i2=TN.anotherMethod();
		
		
		i2.orange();

	}
	public static Interface2 anotherMethod() {
		  return new TN();
		 }

	public void test() {
		System.out.println("local class method");
	}
	
	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green");
		
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red");
		
	}

	@Override
	public void blue() {
		// TODO Auto-generated method stub
		System.out.println("blue");
		
	}

	@Override
	public void orange() {
		// TODO Auto-generated method stub
		System.out.println("Orange");
		
	}

}
