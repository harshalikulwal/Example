
public class Zensar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {9,5,3,4,3,5,9,3,1,4,1,2,5};
		int n=a.length;
		int b[]= new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=0;
			
		}
		for(int i=0;i<n;i++)
		{
			int ch=a[i];
			int count=1;
			switch(ch)
			{
			case 0:
				b[ch]=b[ch]+count;
				count=0;
				break;
			case 1:
				b[ch]=b[ch]+count;
				count=0;
				break;	
			case 2:
				b[ch]=b[ch]+count;
				count=0;
				break;
			case 3:
				b[ch]=b[ch]+count;
				count=0;
				break;
			case 4:
				b[ch]=b[ch]+count;
				count=0;
				break;
			case 5:
				b[ch]=b[ch]+count;
				count=0;
				break;	
			case 6:
				b[ch]=b[ch]+count;
				count=0;
				break;
			case 7:
				b[ch]=b[ch]+count;
				count=0;
				break;
			case 8:
				b[ch]=b[ch]+count;
				count=0;
				break;
			case 9:
				b[ch]=b[ch]+count;
				count=0;
				break;	
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==1)
				System.out.println(i);
		}
	}

}
