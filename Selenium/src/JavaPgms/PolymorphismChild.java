package JavaPgms;

public class PolymorphismChild extends PolymorphismFOverloading {
	
	int i=23;
	public void getTestReport() {
		System.out.println("ChildTestReport");
	}
	public static void main(String[] args) {
		PolymorphismChild cd=new PolymorphismChild();
		cd.getTestReport();
		
		PolymorphismFOverloading d=new  PolymorphismChild();
		System.out.println(d.i);

	}

}
