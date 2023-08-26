import java.util.Scanner;
import java.lang.*;
class abracadabra
{
    public static void main(String ar[])
    {
        String abc="abcdefghijklmnopqrstuvwxyz";
        String s2="";
        int num,com,c,d,len,j=1,i,k,flag=0;
        char m,n;
        Scanner x=new Scanner(System.in);
        num= x.nextInt();
        String s1= x.next();
        int a[]=new int[num];
        com=num-1;
        for(k=0;k<num;k++)
        {
        if(k<com)
        {
         c= s1.indexOf(",");
         d=c-1;
         s2=s1.substring(0,c);
         len= s1.length();
         s1=s1.substring(c+1,len);
        }
        else
        {
         s2=s1;
        }
         len=s2.length();
         for(i=1;i<len;i++)
         {
          m=s2.charAt(i-1);
          n=s2.charAt(i);
          c=abc.indexOf(m);
          d=abc.indexOf(n);
          if(c>d)
          {
           a[flag]=0;
           flag++;
           j=0;
           break;
          }
         }
         if(j!=0)
         {  
           a[flag]=1;
           flag++;
         }
         j=1;
        }
        for(i=0;i<num;i++)
        {
        if(i==num-1)
          System.out.print(a[i]);
        else
          System.out.print(a[i]+",");
        }
    }
}
