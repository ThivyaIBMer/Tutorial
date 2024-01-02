package JavaPgms;

public class PolymorphismFOverloading {
	
	int i=12;
	public void getTestReport() {
		System.out.println("ParentTestReport");
	}
	public void getTestReport(int i) {
		System.out.println("TestReport"+i);
	}
	public void getTestReport(String i) {
		System.out.println("TestReport"+i);
	}
	public void getTestReport(String i,int j) {
		System.out.println("TestReport"+i+j);
	}
public static void main(String[] args) {
		
	PolymorphismFOverloading over=new PolymorphismFOverloading();
	over.getTestReport();
	over.getTestReport(3);
	over.getTestReport("string value");
	over.getTestReport("stringvalue",10);
	
	}

}
