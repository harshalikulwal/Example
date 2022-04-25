package Mindtree;
class Foo
{
	Foo(String test )
	{
		System.out.println(test);
	}
	Foo(double f, double h)
	{
		
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test();
	}
	Foo f=new Foo("hi");
	static Foo f1=new Foo("hey");
	
	Foo h=new Foo(20 ,15);
}
