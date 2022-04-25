
public class reverse {

	static void rev(String s)
	{
		char c[];
		/*char c[]=new char[s.length()];
		for(int i=0;i<=s.length()-1;i++)
			c[i]=s.charAt(i);*/
		c=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(c[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="harshali";
 rev(s);
	}

}
