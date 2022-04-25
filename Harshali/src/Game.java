import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,k,res=0;
		n=sc.nextInt();
		k=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		for(int i=k-1;i<n;i=i+k)
		{
			res=res+a[i]*b[i];
		}
		System.out.println(res);
	}

}
