package pkg_2;

public class Logical_operater 
{
	public static void main(String[]args)
	{
		int a = 10;
		int b = 20;
		boolean s = a>b;
		boolean s1 = b<a;
		
	System.out.println("---&& operation----");
		 if((s&&s1)==true)//s=false,s1=true 
		 {
			 System.out.println("true");
		 }
		 else 
		 {
			 System.out.println("false");
		 }
		 
	System.out.println("---|| operation----");
		 if(s || s1 ==true )
		 {
			 System.out.println("hi");
			 
		 }
		 else
		 {
			 System.out.println("bye");
		 }
   System.out.println("---! operation----");
		
        //boolean x = true;
        //boolean y = false;
         int a1 = 2; 
        if(!(a1==2))
        {
			System.out.println("a");
        	
		 }
        else 
        {
        	System.out.println("b");
        }
        
        
		 
		 
	  }

}
