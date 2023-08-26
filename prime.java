import java.util.*;
class prime
{
public static void main(String ar[])
{
int n,i,c=0;
Scanner s=new Scanner(System.in);
System.out.println("enter any number");
n=s.nextInt();
for(i=1;i<=n;i++)
{
if((n%i)==0)
{
  c++;
}
}
if(c==2)
{
System.out.println("prime number");
}
else
System.out.println("not a prime number");
}
}