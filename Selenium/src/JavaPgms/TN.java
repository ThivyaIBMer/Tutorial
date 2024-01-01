package JavaPgms;

public class TN implements Traffic,Interface2{

	public static void main(String[] args) {
		Traffic n=new TN();
		n.blue();
		
		Interface2 i2=new TN();
		i2.orange();

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
