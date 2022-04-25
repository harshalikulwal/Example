package Mindtree;

import java.util.Arrays;
import java.util.Scanner;

public class Hello
{
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int rot=arr[0];
		while(k!=0)
		{	
		for(int i = 0; i < rot; i++)
		{  
            int j, first;  
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++)
            {  
                arr[j] = arr[j+1];  
            }  
             arr[j] = first;  
        }  
		rot=arr[0];
		k--;

		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
