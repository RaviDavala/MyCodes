import java.util.*;
import java.lang.*;
class sentence
{
    public static void main(String ar[])
    {
        String s,s1,s3,s4,s5;
        String s2="|";
        int t,m,k=0,i=0,l=0,j,b,count=0,p;
        Scanner x=new Scanner(System.in);
        s=x.nextLine();
        s1=s;
        t=s1.indexOf(" ");
        if(t>=0)
           s1=s1.replaceAll(" ","|");
        t=s1.indexOf("!");
        if(t>=0)
           s1=s1.replaceAll("!","|");
        t=s1.indexOf("?");
        if(t>=0)
           s1=s1.replace("?","|");
        t=s1.indexOf(".");
        if(t>=0)
           s1=s1.replace(".","|");
        s3=s1.substring(s1.length()-1);
        Boolean n=s3.equals(s2);
        if(!n)
          s1=s1+"|";
        System.out.println(s1);
        s3=s1;
        t=1;
        while(t!=0)
        {
         m=s3.indexOf("|");
         if(m==-1){
           t=0;
           break;
          }
         k++;
         s2=s3.substring(m+1);
         s3=s3.substring(0,m);
         s3=s3+s2;
        }
        System.out.println(s3);
        System.out.println("The total words :"+k);
        b=k-1;
        while(i<k)
        {
         i++;
         m=s1.indexOf("|");
         if(i==1)
         s3=s1.substring(0,m);
         else
         s3=s1.substring(l+1,m);
         s4=s1.substring(m+1);
         for(j=0;j<b;j++)
         {
          t=s4.indexOf("|");
          s5=s4.substring(0,t);
          s4=s4.substring(t+1);
          if(s3.length()==s5.length())
          {
           p=s3.length();
           while(p!=0)
            {
              for(i=0;i<p;i++)
              {
                if(s3.charAt(0)==s5.charAt(i))
                {

          }
          else
           count++;
         }
         b--;
         l=m;
        }
    }
}
    }
}
}