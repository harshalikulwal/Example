
public class palin {

static boolean palindrome(String s)
{
	return palindrome(s,0,s.length()-1);
}
static boolean palindrome(String s,int low,int high)
{
	if(high<=low)
		return true;
	else if(s.charAt(low)!=s.charAt(high))
		return false;
	else
		return palindrome(s,low+1,high-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="y";
if(palindrome(s)==true)
	System.out.println("String is palindrome");
else
	System.out.println("String is palindrome");
	}

}
