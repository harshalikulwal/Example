
public class Amdoc {
	public static void main(String args[])
	{
		int a[]= {10,5,3,4,3,5,6};
		int n=a.length;
		int pos=n;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					if(pos>i)
						pos=i;
				}
			}
		}
		System.out.println(a[pos]);
	}

}
