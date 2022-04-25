import java.util.Scanner;
import java.sql.*;
public class UserPass {
	
	
	Scanner sc=new Scanner(System.in);
	static int flag=0;
	public static String username;
	public static String password;
public void getCredentials()
{
		System.out.println("Username:");
		 username=sc.next();
		
		System.out.println("password:");
		password =sc.next();
		
}
	
/*public static Connection myConnection() throws SQLException, ClassNotFoundException
{
Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","nikita");
	
	
	return c;
	
}*/

public static void stateUpdate(Connection c) throws ClassNotFoundException, SQLException
{
	
	
	 
	PreparedStatement st=c.prepareStatement("Insert into USERS(USERNAME,PASSWORD)VALUES(?,?)");
	
	st.setString(1,username);
	st.setString(2,password);
	
	int s=st.executeUpdate();
	
	
	if(s!=0)
	System.out.println("Successfully registered");
	
	else
		System.out.println("Failed to register");
	
}


public String login(Connection c)throws Exception
{
	getCredentials();
	PreparedStatement ps=c.prepareStatement("Select * from USERS where USERNAME=? and PASSWORD=?");
	
	ps.setString(1, username);
	ps.setString(2, password);
	
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
	if(rs.getString(1).equals(username)&&rs.getString(2).equals(password))
	{
		System.out.println(username+" you are successfully Logged in");
		flag=1;
	}
	}
	if(flag==0)
	{
		System.out.println("Login failed");
	}
	return (username);
	
}
public void cquestion(Connection c)throws Exception
{
	int userans[]=new int[20];
for(int i=1;i<=5;i++)
{
Statement sta=c.createStatement();	
String sql="select ID,QUESTION,OPTION1,OPTION2,OPTION3 from CQUESTION";
ResultSet s=sta.executeQuery(sql);
while(s.next())
{
//if(s.getInt(1)==i)	
System.out.println("Id:"+s.getInt(1)+"Que:"+s.getString(2)+"\n"+s.getString(3)+"\t"+s.getString(4)+"\t"+s.getString(5)+"\n");
}

System.out.println("Answer:");
int ans=sc.nextInt();
userans[i]=ans;
}

}



public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","harshali");
	
	
	
		UserPass up=new UserPass();
		int langChoice;
		String user;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Quiz Game");
		do
		{
System.out.println("\nMenu\n1.Register\n2.Login");
	System.out.println("Enter choice:");
	langChoice=sc.nextInt();
	
				switch(langChoice)
		{
				case 1:
					up.getCredentials();
					//up.myConnection();
					stateUpdate(c);
				break;
				case 2:
				
					user=up.login(c);
				break;
					
					
		
		
		}
		
		}while(flag==0);	
		
		System.out.println("Are you want to play the game(yes/no):");
		String s=sc.next();
		int a[];
		switch(s)
		{
		case "yes":
			System.out.println("\nMenu \n1.C programming\n2.C++\n3.Java ");
			break;
		case "no":
			System.out.println("\nQuit the game ");
		}
		
		System.out.println("\nChoose the language in which you want to play the game: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Welcome to C programming competition");
			System.out.println("Are you want to start the Quiz(yes/no):");
			String s1=sc.next();
			switch(s1)
			{
			case "yes":
			System.out.println("Competition Started");
			up.cquestion(c);
			
			break;
			case "no":
			System.out.println("Quit the Game ");
					
			}

			break;
		case 2:
			System.out.println("Welcome to C++ programming competition");
		    break;
		case 3:
			System.out.println("Welcome to Java programming competition");
		    break;
		default:
			System.out.println("Choice is wrong");
		}	
		
		

	}

}
