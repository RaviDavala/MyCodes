import java.util.*;
import java.lang.*;
class ravi
{
    public static void main(String ar[])
    {
        int n,k,i=0,j=0,sum=0,sum2,l;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        k=n;
        while(k>0)
        {
          k=k/10;
          i++;
        }
        int a[]=new int[i];
        k=n;
        for(l=i-1;l>=0;l--)
        {
         a[l]=k%10;
         sum=sum+a[l];
         k=k/10;
        }
        j=i-1;
         while(sum<n)
         {
          sum2=0;
          for(l=0;l<j;l++)
            a[l]=a[l+1];
          a[j]=sum;
          for(l=0;l<i;l++)
           sum2=sum2+a[l];
          sum=sum2;
         }
       if(sum==n)
        System.out.println("Keith Number");
        else
        System.out.println("Not a keith Number");
    }
}