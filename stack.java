import java.util.*;
import java.io.*;
import java.lang.*;
class ravi 
{
int top=-1;
int n[]=new int[5];
ravi()
{
	System.out.println("stack is empty");
}
void push()
{
Scanner s1=new Scanner(System.in);
if(top==4)
{
System.out.println("stack is over flow");
System.out.println("|");
System.out.println("|");
System.out.println("*");
for(int i=top;i>=0;i--)
{
 System.out.println(n[i]);
}
return;
}
else
	System.out.println("enter the element");
	int ele=s1.nextInt();
	if(top>-2)
	{
		top++;
		n[top]=ele;
	}
	System.out.println("|");
System.out.println("|");
System.out.println("*");
for(int i=top;i>=0;i--)
{
 System.out.println(n[i]);
}
}
void pop()
{
if(top==-1)
{
System.out.println("stack is underflow");
return;
}
else
if(top>-1)
{
 top--;
 System.out.println("element poped");
}
System.out.println("|");
System.out.println("|");
System.out.println("*");
for(int i=top;i>=0;i--)
{
 System.out.println(n[i]);
}
}
}
class stack
{
public static void main(String ar[])
{
ravi r=new ravi();
Scanner sc=new Scanner(System.in);
int ch=0;
do
{
System.out.println("1.push");
System.out.println("2.pop");
System.out.println("3.exit");
System.out.println("enter your choice");
ch=sc.nextInt();
switch(ch)
{
	case 1: r.push();
	   System.out.println("\n");
	break;
	case 2:r.pop();
	System.out.println("\n");
	break;
	case 3: System.exit(0);
	break;
 default:
     System.out.println("invalid choice");
}
}
while(ch!=3);
}
}