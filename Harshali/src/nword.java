
public class nword {
	static int cnt;
static int wcount(String s)
{
	char c[]=new char[s.length()];
	for(int i=0;i<=s.length()-1;i++)
		{
			c[i]=s.charAt(i);
			if(((i>0)&&c[i]!=' ')&& c[i-1]==' ' ||(c[0]!=' '&& i==0))
				cnt++;
		}

return cnt;	
}
public static void main(String args[])
{
	String s1="Harshali kulwal s";
int s=wcount(s1);
System.out.println(s);
}
}
