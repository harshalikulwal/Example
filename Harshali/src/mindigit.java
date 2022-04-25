
public class mindigit {
	static int cnt;
static int wcount(int num)
{
cnt=9;	
while(num>0)
{
int rem=num%10;
if(rem<cnt)
{
	cnt=rem;
}
num=num/10;

}

return cnt;	
}
public static void main(String args[])
{
	int s1=1974;
int s=wcount(s1);
System.out.println(s);
}
}
