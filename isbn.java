import java.util.*;
import java.lang.*;
class isbn
{
    public static void main(String ar[])
    {
        String is, is1;
        char c;
        int flag=0,i,sum=0,j,isno,k;
        Scanner s=new Scanner(System.in);
        is=s.next();
        if(is.length()==10)
        {
          c=is.charAt(9);
          if(c=='x'){
           is1=is.substring(0,9);
           flag=1;
          }
          else
           is1=is;
           isno=Integer.parseInt(is1);
           if(flag==1)
             k=2;
           else
             k=1;
           for(i=k;i<=10;i++)
           {
             j= isno%10;
             sum=sum+(i*j);
             isno=isno/10;
             if(i==9 && flag==1){
               sum=sum+10;
                break;
             }
           }
             System.out.println("INPUT CODE:"+is);
             System.out.println("sum="+sum);
             if(sum%11==0)
                System.out.println("LEAVES NO REMAINDER- VALID ISBN CODE");
             else
                System.out.println("LEAVES REMAINDER- INVALID ISBN CODE");
        
        }
        else{
           System.out.println("INPUT CODE:"+is);
           System.out.println("INVALID INPUT");
        }
    }
}  