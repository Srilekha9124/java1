package pkg_2;

public class Nested_if_else 
{ 
	public static void main(String[] args) 
	{
		int marks = 85;
		
		if(marks>75)
		{
			System.out.println("take addmission in science");
			 
			if(marks>90)
			{
				System.out.println(" Div A");
			}
			else if( marks >80)
			{
				System.out.println("Div B");
			}
			else
			{
				System.out.println(" Div c");//
			}
		}
		else 
		{	
			if(marks > 65)
		  {
		   System.out.println("take addmission in commerce");
		       if(marks > 60)
		          {
			          System.out.println("Div E");
		           }
		    }
		 else if(marks >50) 
		      {
			      System.out.println("Div F");
		       }
		 else
		 {
			 System.out.println("admission cancel");
		 }
		   
		 }
	}
}
		
		
	

		
		
		
	
		
	


