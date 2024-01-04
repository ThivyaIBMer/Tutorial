package JavaPgms;

public final class finalKeywordExample  {

	final int i=90;
	
	public final void getValue() {
		System.out.println("overriding");
	}
	
	
	
	public static void main(String[] args) {
	finalKeywordExample fin=new finalKeywordExample();
	//fin.i=91;//cannot modify the value with final keyword 

	}

}
