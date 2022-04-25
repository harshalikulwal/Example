import java.util.Scanner;

public class ShiftString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a,b;
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 a=sc.next();
		 b=sc.next();
		 int j=0,count=0;
		 for(int i=0;i<a.length();i++)
		 {
			 if(a.charAt(j)==b.charAt(i))
			 {
				 System.out.println(count);
				 break;
			 }
			 else
				 count++;
		 }
				 
	}

}
