package Mindtree;

import java.util.*;

public class Employee implements Comparable<Employee>{
	int id=0;
	String name="";
	int age=0;
	double salary=0.0;
	static List<Employee> emplist;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}


	public int getAge() {
		return age;
	}



	public double getSalary() {
		return salary;
	}


	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public static void create() throws AgeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Id:");
		int i=sc.nextInt();
		System.out.println("Enter Your Name:");
		String n=sc.next();
		System.out.println("Enter Your Age");
		int a=sc.nextInt();
		System.out.println("Enter Your Salary");
		double s=sc.nextDouble();
		
		if(a<=21)
			throw new AgeException("Employee should be at least more than 21 years");
		else
			emplist.add(new Employee(i,n,a,s));
		
		
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.salary==o.salary)
			return 0;
		else if(this.salary>o.salary)
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1,"Harshali",22,20000));
		emplist.add(new Employee(2,"Durga",22,30000));
		emplist.add(new Employee(3,"Mike",24,25000));
		emplist.add(new Employee(4,"Daniel",25,20500));
		emplist.add(new Employee(5,"Steve",22,23000));
		emplist.add(new Employee(6,"Rone",25,34000));
		emplist.add(new Employee(7,"Jenifier",28,26000));
		emplist.add(new Employee(8,"Prem",29,20600));
		emplist.add(new Employee(9,"Vansh",30,40000));
		emplist.add(new Employee(10,"Pratiksha",32,21000));
	try
	{
	create();
	}
	catch(AgeException e)
	{
		System.out.println("Exception Caught "+e);
	}
				
	System.out.println("Sorted Employee List based on salary");
	
	Collections.sort(emplist);
	System.out.println(emplist);
	}


	

}
