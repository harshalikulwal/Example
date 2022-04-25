
public class length {

static int i,c,res;
static int slength(String s)
{
	try
	{
	for(i=0,c=0;0<=i;i++,c++)
		s.charAt(i);
	}
	catch (Exception e)
	{
		System.out.println("length is");
	}
	return c;
}	

	
public static void main(String a[])
{
	String s="harshali";
	res=slength(s);
	System.out.println(res);
}
	
}
