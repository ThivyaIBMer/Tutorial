package JavaPgms;

public class StaticVar {
	
	String name;
	String address;
	static String city;
	static int i;
	
	static {
		city="Chennai";
		i=10;
	}
	
	public StaticVar(String name,String addreess) {
		
		this.name=name;
		this.address=addreess;
		i++;
		
	}
	
	public static void getAddress() {
		//System.out.println(name+" "+address+" "+city);
		System.out.println(city+" "+i);
	}
	
	public int gtValue(int b) {
		int a=b+10;
		return a;
		
	}
	public static void main(String[] args) {
		
		//StaticVar var=new StaticVar("Thivya","s2Street");
		//var.getAddress();
		
		StaticVar var1=new StaticVar("Pavithra","s3Street");
		var1.getAddress();
		int c=var1.gtValue(30);
		System.out.println(c);
		
		StaticVar.getAddress();
	
		
		
	}

}
