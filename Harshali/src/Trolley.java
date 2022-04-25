import java.util.Scanner;

public class Trolley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int hr=sc.nextInt();
		int hour=hr;
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			total=total+a[i];
		}
		int c=total/hr;
		while(hr!=0)
		{
			for(int i=0;i<a.length;i++)
			{
					if(a[i]>c)
					{
						if(i+1<a.length)
						{
							a[i+1]=a[i+1]+a[i]-c;
							a[i]=0;
							hr--;
						}
						else
						{
							total=a[i]-c;
							a[i]=a[i]-c;
							hr--;
						}
						
					}
					else
					{
						a[i]=0;
						hr--;
					}
				
				
			}
			if(total<c*hr)
			{
				System.out.println(c);
				hr=0;
			}
			else
			{
				c++;
				hr=hour;
			}	
			for(int i=hr;i>0;i--)
			{
				if(total>0)
				{	
				total=total-c;
				}
			}
		}
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			System.out.println(hr);
	}
	

}
