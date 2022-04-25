
public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,8,7,6,1,2,3,4,7,11,89,3};
		int k=3,max=0,j=1;
	
		for(int i=0;i<a.length;i++)
		{
			if(j<=2)
			{
				j=j+1;
				if(a[i]>a[i+1])
				{
					if(max<a[i])
						max=a[i];
				}
				else
				{
					if(max<a[i+1])
						max=a[i+1];
				}
			}
			else
			{
				System.out.println(max);
				max=0;
				j=1;
				
			}
		}
		
	}

}
