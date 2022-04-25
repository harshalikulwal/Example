import java.util.*;

public class User implements Comparator<User>,Comparable<User>{
	int accno=0;
	String name="";
	String type="";
	String dob="";
	double bal=0.0;
	String add="";
	static List<User> list;
	
	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getDob() {
		return dob;
	}

	public double getBal() {
		return bal;
	}

	public String getAdd() {
		return add;
	}

	public User()
	{
		
	}
	public User(int accno, String name, String type, String dob, double bal, String add) {
		super();
		this.accno = accno;
		this.name = name;
		this.type = type;
		this.dob = dob;
		this.bal = bal;
		this.add = add;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		if(this.accno==o.accno)
			return 0;
		else if(this.accno>o.accno)
			return 1;
		else
			return -1;
			
	}
	
	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getAdd().compareTo(o2.getAdd());
	}
	@Override
	public String toString() {
		return "User [accno=" + accno + ", name=" + name + ", type=" + type + ", dob=" + dob + ", bal=" + bal + ", add="
				+ add + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String c="";
		int flag=0;
		list =new ArrayList<User>();
		do
		{
		System.out.println("Menu\n1.Create Bank User\n2.Update User Details\n3.Delete User Details\n4.Display User Details\n5.Exit");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Account number:");
			int no=sc.nextInt();
			System.out.println("Enter your name:");
			String name=sc.next();
			System.out.println("Enter Account type:");
			String type=sc.next();
			System.out.println("Enter your dob:");
			String dob=sc.next();
			System.out.println("Enter your Balance:");
			double bal=sc.nextDouble();
			System.out.println("Enter your address:");
			String add=sc.next();
			list.add(new User(no,name,type,dob,bal,add));
			System.out.println("User added successfully");
		
			break;
		case 2:
			System.out.println("Enter Account number");
			int a=sc.nextInt();
			System.out.println("if you want to change address then type 1 or if you want to change name then type 2 ");
			int ch=sc.nextInt();
			String t="";
			String d="";
			String ad="";
			String name1="";
			double balance=0.0;
			for(User u:list)
			{
				if(u.getAccno()==a)
				{
					t=u.getType();
					d=u.getDob();
					ad=u.getAdd();
					name1=u.getName();
					balance=u.getBal();
						 
				}
			}
			
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getAccno()==a && ch==1)
				{
					System.out.println("Enter new address:");
					ad=sc.next();
					list.set(i, new User(a,name1,t,d,balance,ad));
				}
				else if(list.get(i).getAccno()==a && ch==2)
				{
					System.out.println("Enter new name:");
					name1=sc.next();
					list.set(i, new User(a,name1,t,d,balance,ad));
				}
			}
			
			System.out.println("User Updated Successfully!!!");
			System.out.println(list);
			break;
		case 3:
			
			System.out.println("Enter Account number:");
			int ano=sc.nextInt();
		
			Iterator<User> iter = list.iterator();

			while (iter.hasNext()) {
			  User u = iter.next();

			  if (u.getAccno()==ano) {
			    iter.remove();
			  }
			}
			System.out.println("User Deleted Successfully!!!");
			System.out.println(list);      
		break;
		case 4:
			System.out.println("Enter your choice");
			int displaychoice=sc.nextInt();
			switch(displaychoice)
			{
			case 1:
				System.out.println("Enter Account number:");
				int noa=sc.nextInt();
			for(User u:list)
			{
				if(u.getAccno()==noa)
					System.out.println(u);
					
			}
			break;
			case 2:
				System.out.println("Enter your name:");
				String username=sc.next();
			for(User u:list)
			{
				if(u.getName().equals(username))
					System.out.println(u);
					
			}
			break;
			case 3:
				for(User u:list)
				{
					if(u.getBal()>0.0)
						System.out.println(u);
						
				}
			break;	
			case 4:
				Collections.sort(list);
				System.out.println(list);
			break;	
			case 5:
				Collections.sort(list,new User());
				System.out.println(list);
				break;
			}
			
		break;
		default:
			System.out.println("User want to exit");
			flag=1;
		}
		if(flag==0)
		{	
		System.out.println("Do you want to continue(y/n)");
		c=sc.next();
		}
		}while(c.equals("y"));
	}

}
