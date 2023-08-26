import java.util.*;
class ravi
{
int queue[]=new int[5];
int front=0;
int rear=-1;
int num,count,j;
Scanner s=new Scanner(System.in);
void enQue()
{
if(count==5)
{
System.out.println("Queue is overflow");
return;
}
System.out.println("enter element into the queue");
num =s.nextInt();
if(rear==4)
    rear=0;
else 
    rear++;
queue[rear]=num;
count++;
System.out.println(num+" entered into queue");
System.out.println("front at "+front);
System.out.println("rear at "+rear);
}
void deQue()
{
if(count==0)
{
    System.out.println("Queue is underflow");
	return;
}
num=queue[front];
if(front==4)
    front=0;
else
    front++;
count--;
System.out.println(num+" deleted from queue");
System.out.println("front at "+front);
System.out.println("rear at "+rear);
}
void display()
{
System.out.println("Queue has elements...");
 for(int i=0;i<count;i++)
 {
 if(i==0)
    j=front;
 System.out.println(queue[j]);
 if(j==4)
    j=-1;
j++;
}
}
}
class cq
{
	public static void main(String ar[])
	{
		ravi r=new ravi();
		int ch;
		Scanner s1=new Scanner(System.in);
		do
		{
		System.out.println("Circular queue operations");
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
		ch=s1.nextInt();
		switch(ch)
		{
			case 1:
			       r.enQue();
				   break;
	        case 2:
			       r.deQue();
				   break;
			case 3:
			       r.display();
				   break;
			case 4:
			       System.exit(0);
		}
	}while(ch!=4);
	}
}