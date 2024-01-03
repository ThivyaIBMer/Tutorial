package JavaPgms;

public class KeywordExamplesChild extends KeywordExamplesParent {

	String organization="Tier2";
	int a=19;
	
	
	public void sum() {
		int a=20;
		String organization="ABC";
		System.out.println(a+ this.a);
		System.out.println(organization+this.organization);
		
	}
	
	public KeywordExamplesChild() {
		super();
		System.out.println("I am a child constructor");
	}
	public void orgValues() {
		System.out.println(organization);
		System.out.println(super.organization);
	}
	public void getOrgInfo() {
		System.out.println("Child Org");
		super.getOrgInfo();
	}
	
	
	public static void main(String[] args) {
		
		KeywordExamplesChild ch=new KeywordExamplesChild();
		ch.orgValues();
		ch.getOrgInfo();
		ch.sum();

	}

}
