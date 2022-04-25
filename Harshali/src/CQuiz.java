import java.sql.*;
import java.util.*;
public class CQuiz {
    public static void cquestion(Connection c)
    {
 //   Statement st=c.createStatement("select ID,QUESTION,OPTION1,OPTION2,OPTION3 from CQUESTION where ID=1");
    
    
    }
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","harshali");
		System.out.println("Are you want to start the Quiz(yes/no):");
		String s=sc.next();
		switch(s)
		{
		case "yes":
		System.out.println("Competition Started");
		break;
		case "no":
		System.out.println("Quit the Game ");
				
	}
	}
}
