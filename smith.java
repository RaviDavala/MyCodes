import java.util.*;
import java.lang.*;
class smith
{
    public static void main(String ar[])
    {
        int n,k,dig=0,flag=0,fac=0,i,j,g=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=n;
        while(k>0)
        {
         i=k%10;
         dig=dig+i;
         k=k/10;
        }
        for(i=1;i<=n;i++)
        {
         if(n%i==0)
           flag++;
        }
        int a[]=new int[flag];
        for(i=1;i<n;i++)
        {
            flag=0;
            for(j=1;j<=i;j++)
            {
              if(n%i==0)
              {
               if(i%j==0)
               {
                flag++;
               }
              }
            }
            if(flag==2)
            {
             a[g]=i;
             g++;
            }
        }
        for(i=0;i<g;i++)
        {
         j=a[i];
         while(j>0)
         {
          flag=j%10;
          j=j/10;
          fac=fac+flag;
         }
        }
        if(fac==dig)
        System.out.println("Smith Number");
        else
        System.out.println("not a Smith Number");
    }
}