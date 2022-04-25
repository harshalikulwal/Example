import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int n,x,y, sum=0;
			n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			x=sc.nextInt();
			y=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				if(a[i]>=b[i])
					sum=sum+a[i];
				else
					sum=sum+b[i];
			}
			System.out.println(sum);
	}

}
