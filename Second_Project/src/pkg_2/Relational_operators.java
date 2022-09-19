package pkg_2;

public class Relational_operators 
{

	public static void main(String[] args) 
	{
		
		//Logical operators
		
		System.out.println("******* greater than(>) *******");
		
		int a = 20;
		int b = 10;
		boolean c = a>b;
		System.out.println(c);
		//20>10; true
		
		System.out.println("******* less than than(<) ********");
		// less than(<)
		c = a<b;
		System.out.println(c);
		//20<10 , false
		
	System.out.println( "******** equal equal(==) *********");
		int e1 = 10;
		int e2 = 10;
		boolean e = e1==e2;
		System.out.println(e);
		//if both values are same then it shows true
		//otherwise false,it compare both the values.
		
	System.out.println("********* greater than or equal(>=) ********");
		//1 case
		int d1 = 50;
		int d2 = 20;
		boolean d = d1>=d2;
		System.out.println(d);
		// 2nd case
		
		int f1 = 50;
		int f2 = 50;
		boolean f = f1>=f2;
		System.out.println(f);
		
	System.out.println("******* Less than or equal (<=) *********");
	
	   int a1 = 20;
	   int a2 = 10;
	   boolean a3 = a1<a2;
	   System.out.println(a3);
	   
	   int b1 = 20;
	   int b2 =20;
	    boolean b3 = b1<=b2;
	    System.out.println(b3);
System.out.println("*******not equal (!=) *********");
		
		int c1 = 20;
		int c2 = 30;
		boolean v = (c1!=c2);
		System.out.println(v);
		
		
		
		
		
	}
}
