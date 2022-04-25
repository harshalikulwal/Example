
public class GB {
public static String correctgb(int a[],int unique)
{
	int uni=0;
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]!=a[j+1])
			{
				uni=uni+1;
			}	
		}
	
	 if(uni==unique)
		return "yes\ngood";
	else if(uni<unique)
		return "yes\nbad";
	else
		return "yes\nAverage";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,1,1,1};
String s=correctgb(arr,1);
System.out.println(s);
	}

}
