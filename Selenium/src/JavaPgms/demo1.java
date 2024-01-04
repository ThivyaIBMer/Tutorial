package JavaPgms;

public class demo1 {

	public void validateMethodInSamePackage() {
		System.out.println("same package");
		DateExamples d=new DateExamples();
		d.checkdefault=0;
		System.out.println(d.checkdefault);
	}
}
