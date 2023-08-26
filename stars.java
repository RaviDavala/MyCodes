import java.util.*;
class stars
{
public static void main(String ar[])
{
int i,j,m,n;
Scanner s=new Scanner(System.in);
System.out.println("enter the number of rows");
n=s.nextInt();
m=0;
// loop for changing row after each completion for printing
for(i=0;i<n;i++)
{
m=m+1;
//loop for printing respective stars in a row
for(j=0;j<m;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}