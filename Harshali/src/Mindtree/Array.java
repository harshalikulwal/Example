package Mindtree;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int box[]=new int[m];
		int cloth[]=new int[m];
		int result=0;
		for(int i=0;i<m;i++)
		{
			box[i]=sc.nextInt();
			cloth[i]=sc.nextInt();	
		}
		for(int i=0;i<m-1;i++)
		{
			for(int j=i+1;j<m;j++)
			{
				if(cloth[i]<cloth[j])
				{
					int temp=cloth[i];
					cloth[i]=cloth[j];
					cloth[j]=temp;
					int t=box[i];
					box[i]=box[j];
					box[j]=t;
				}
			}
		}
		int cap=n;
		for(int i=0;i<m;i++)
		{
			if(box[i]<=cap)
			{
				result=result+box[i]*cloth[i];
				cap=cap-box[i];
			}
			else
			{
				result=result+cap*cloth[i];
				cap=0;
			}
			
		}
		System.out.println(result);
	}
}
