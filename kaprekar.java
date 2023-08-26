import java.util.*;
import java.math.*;
import java.lang.*;
class kaprekar
{
    public static void main(String ar[])
    {
        String s,s1;
        int n,k,len,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n*n;
        s=Integer.toString(k);
        len=s.length();
        a=len/2;
        s1=s.substring(a,len);
        s=s.substring(0,a);
        len=Integer.parseInt(s);
        k=Integer.parseInt(s1);
        a=len+k;
        if(n==a)
         System.out.println("Kaprekar Number");
         else
         System.out.println("Not a Kaprekar Number");
    }
}