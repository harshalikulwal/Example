
public class Queue {
	static int front=-1;
	static int rear=-1;
	static int a[]= {1,9,3,5,4,6,2,8};
	static int queue[]=new int[a.length];
public static void createqueue()
{
	for(int i=0;i<a.length;i++)
	{
		if(front == 0 && rear == a.length - 1) 
		{
	      System.out.println("Queue is full");
	    } 
		else 
		{
			if (front == -1)
				front = 0;
	      rear++;
	      queue[rear] =a[i]; 
	    }
	}	
}
			
public static void findelement(int e)
{
	int flag=0;
	for(int i=0;i<queue.length;i++)
	{
		if(queue[i]==e)
		{
			System.out.println("Element "+e+" found at index "+i);
			flag=1;
		}	
	}
	if(flag==0)
		System.out.println("Element Not Found");
}
public static int middleelement()
{
	int first=0;
	int last=queue.length-1;
	int mid=(first+last)/2;
	System.out.println("Middle Element is "+queue[mid]);
	return mid;
}
public static int[] subqueue(int mid)
{
	int count=0;
	for(int i=0;i<mid;i++)
	{
		if(queue[i]<queue[mid])
			count++;
	}
	int subq[]=new int [count];
	count=0;
	for(int i=0;i<mid;i++)
	{
		
		if(queue[i]<queue[mid])
		{
			subq[count]=queue[i];
			count++;
		}
	}
	return subq;
}
public static void main(String args[])
{
	createqueue();
	System.out.println("Newly created queue:");
	for(int i=0;i<queue.length;i++)
		System.out.println(queue[i]);
	findelement(5);
	int index=middleelement();
	int q[]=subqueue(index);
	System.out.println("Sub Queue whose elements are less than middle element");
	for(int i=0;i<q.length;i++)
		System.out.println(q[i]);
}
}
