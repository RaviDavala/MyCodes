import java.util.*;
import java.lang.*;
class twin
{
    public static void main(String ar[])
    {
        int c[]= new int[2];
        int a,b,i,j,flag=0,e=0,m,n,d;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        for(i=a;i<=b;i++)
        {
            for(j=1;j<=i;j++)
            {
             if(i%j==0){
              flag++;
             }
            }
            if(flag==2)
            {
                if(e==0){
                  c[1]=i;
                  e=1;
                 }
                 else
                 {
                  c[0]=i;
                 }
                flag=0;
               if(e==1)
               {
                 if(c[0]-c[1]==2 && c[0]!=0 && c[1]!=0)
                 {
                   System.out.print("("+c[1]+","+c[0]+")");
                 }
                 if(c[0]!=0 && c[1]!=0)
                   c[1]=c[0];
               }
            }
            else
            flag=0;
        }
    }
}