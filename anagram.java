import java.util.*;
import java.lang.*;
class anagram
{
    public static void main(String ar[])
    {
        String s1,s2,s3;
        int t,c=0,j,i,flag=0;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        int a[]=new int[t];
        while(c<t)
        {
         s1=s.nextLine();
         if(c==0)
           s1+=s.nextLine();
         j=s1.indexOf(" ");
         s2=s1.substring(j+1);
         s1=s1.substring(0,j);
         if(s1.length()==s2.length())
         {
            j=s1.length();
            while(j!=0)
            {
              for(i=0;i<j;i++)
              {
                if(s1.charAt(0)==s2.charAt(i))
                {
                 flag=1;
                 s1=s1.substring(1);
                 s3=s2.substring(0,i);
                 s2=s2.substring(i+1);
                 s2=s2+s3;
                 j=s1.length();
                }
                else
                  flag=0;
                if(flag==1)
                {
                    flag=2;
                    break;
                }
              }
              if(flag==0)
               break;
            }
            if(s1.length()==0 && s2.length()==0)
              a[c]=1;
            else
              a[c]=0;
         }
         else
            a[c]=0;
         c++;
        }
        for(i=0;i<t;i++)
        {
         if(a[i]==0)
          System.out.print("NO ");
         else
          System.out.print("YES ");
        }
        s.close();
    }
}