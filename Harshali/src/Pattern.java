
public class Pattern {

public static void main(String args[])
{
	
		int count=0,flag=0,n=7;
		for(int i=0;i<4;i++)
		{ 
		    count=i;
			flag=1;
			while(count>0)
			{
			    System.out.print(" ");
			    count--;
			}
			for(int j=0;j<n;j++)
			{
					if(flag==1)
					{
						System.out.print(flag);
						flag=0;
					}
					else
					{
						System.out.print(flag);
						flag=1;
					}
			}
			System.out.println();
			n=n-2;
		}
		}
	}
