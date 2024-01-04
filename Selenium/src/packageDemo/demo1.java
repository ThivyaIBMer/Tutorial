package packageDemo;

import JavaPgms.DateExamples;

public class demo1 extends DateExamples {

	public void validateMethod() {
		System.out.println("package example");
	}
	
	public static void main(String[] args) {
		demo1 d=new demo1();
		d.validateMethod();
		d.samplefun();
		d.checkdefault=0;
	}
}
