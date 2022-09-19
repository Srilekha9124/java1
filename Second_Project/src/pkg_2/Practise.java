package pkg_2;

public class Practise {

	public static void main(String[] args) 
	{
		int x = 371;
		int sum =0;
		int x1=x;
		
		while(x!=0)
		{
			int a = x%10;//371%10=1//37%10=7//3%10=3
			
			int b=a*a*a;//7*7*7=343//27
			
//			sum+=Math.pow(a,3);
			
			x=x/10;//371/10=37//37/10=3//3/10=0
			
		}
		
		if(x1==sum)//371==371
		{
			System.out.println(x1+" is armstrong number");
		}
		else
		{
		 System.out.println(x1+" it is not armstrong number");
		}
		

	}

}
