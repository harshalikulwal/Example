
public class Array {
//half of the array in ascending and other in decending
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,8,7,6,1,2,3,4};
		int n=a.length;
		int dec=(n/2)-1;
		for(int i=0;i<=dec-1;i++)
		{
			for(int j=i+1;j<=dec;j++)
			{
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}	
		for(int i=dec+1;i<=n-2;i++)
		{
			for(int j=i+1;j<=n-1;j++)
			{
				if(a[i]<a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}	
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
