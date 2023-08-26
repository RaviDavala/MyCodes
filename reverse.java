import java.util.*;
class arpita
{
    public static void main(String ar[])
    {
        int a=8,b=8,i,j;
        for(i=8;i>0;i--)
        {
            b=a;
            for(j=b;j>0;j--)
                System.out.print(j+" ");
            a--;
            System.out.println();
        }
    }
}