import java.util.*;
class ravi
{
    public static void main(String ar[])
    {
    int n,k,s=0,g;
    System.out.println("enter the number");
    Scanner s1 = new Scanner(System.in);
    n=s1.nextInt();
    k=n;
    while(n>0)
    {
     g=n%10;
     s=s+(g*g*g);
     n=n/10;
     System.out.println(s);
    }
    if(k==s)
    {
     System.out.println("armstrong number");
    }
    else
    System.out.println("not an armstrong number");
    }
}