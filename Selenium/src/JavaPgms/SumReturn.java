package JavaPgms;

public class SumReturn{  
    private int a;  
    public SumReturn(int i)  
    {  
        a = i;  
    }  
    /*The addition method returns a SumReturn object with adding 100 into it. */  
    public SumReturn addition()  
    {  
        SumReturn result = new SumReturn(a + 100);  
  
        return result;  
    }  
    public void display()  
    {  
        System.out.println("Additon result: " + a);  
    } 
    
  
}  