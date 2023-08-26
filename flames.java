import java.util.*;
import java.lang.*;
class ravi
{
int i,j,a,b,t,z,c,y;
StringBuffer s1=new StringBuffer();
StringBuffer s2=new StringBuffer();
ravi()
{
Scanner x=new Scanner(System.in);
System.out.println("Find out your relation! 'FLAMES'");
System.out.println("enter your name, Without space bro");
s1.append(x.nextLine());
System.out.println("enter his/her name");
s2.append(x.nextLine());
a=s1.length();
b=s2.length();
c=a+b;
//System.out.println(a);
//System.out.println(b);
process();
}
void process()
{
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
if(s1.charAt(i)==s2.charAt(j))
{
s2.insert(j++,"*");
s2.deleteCharAt(j);
t++;
break;
}
}
}
//System.out.println(s2);
//System.out.println(s1);
z=t*2;
y=c-z;
System.out.println(y);
grand();
}
void grand()
{
  // sorting the relation
  // According to remainingletters
if(y>2&&y<4 || y>4&&y<6 || y>13&&y<15 || y>15&&y<17 || y>17&&y<19 || y>20&&y<22 || y>22&&y<24 || y>25&&y<27)
{
  System.out.println("you both are::Friends");
  System.out.println("Rey rey rey naakoka beer thesko");
}
else if(y>9&&y<11 || y>18&&y<20)
{
  System.out.println("you both are::Lovers");
  System.out.println("Mowaa party");
}
else if(y>7&&y<9 || y>11&&y<14 || y>16&&y<18 || y>27&&y<29 || y>29&&y<31)
{
  System.out.println("you both have::Attraction");
  System.out.println("Ela aithe kastam amma...All the best");
}
else if(y>5&&y<7 || y>10&&y<12 || y>14&&y<16)
{
  System.out.println("your future could be::Marriage");
  System.out.println("Mari pappu annam eppudu?");
}
else if(y>1&&y<3 || y>3&y<5 || y>6&&y<8 || y>8&&y<10 || y>19&&y<21 || y>21&&y<23 ||y>23&&y<26)
{
  System.out.println("you both are::Enemies");
  System.out.println("peekinav thee!");
}
else if(y>0&&y<2 || y>26&&y<28 ||y>28&&y<30)
{
  System.out.println("you both can be::Siblings");
  System.out.println("Amma edu nannu kodthunnadey!");
}
else if(y>30)
{
  System.out.println("Nedhe antha pedha name entra?");
  System.out.println("yesalu eykunda...correct ga enter chey");
}
}
}
class flames
{
public static void main(String ar[])
{
ravi m=new ravi();
}
}