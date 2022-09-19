package pkg_2;

public class Practise_2 {

	public static void main(String[] args) 
	{
		int x = 1634;
		int sum = 0;
		int x1 = x;
		
		for(int i=x;i>=0;i--)
		//for(int i=1;i<=4;i++)
		{
			int a = x%10;//371%10=1//37%10=7//3%10=3
			
			int b=a*a*a;//7*7*7=343//27
			
			sum=sum+b;//1+343=344//344+27=371
			
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
