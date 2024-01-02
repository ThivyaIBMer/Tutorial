package JavaPgms;

public class ChildForAbstract extends AbstractClassExplanation{

	public static void main(String[] args) {
		ChildForAbstract cs=new ChildForAbstract();
		cs.childAbsMethod();
		cs.test();
		
		

	}

	public void childAbsMethod() {
		System.out.println("child class method");
	}
	@Override
	public void test() {
	System.out.println("Abstract class Explanation-Parent");
		
	}

}
