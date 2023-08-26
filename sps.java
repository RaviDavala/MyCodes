import java.util.*;
import java.io.*;
import java.lang.*;
class ravi
{
int ych,mch;
void ravi()
{
Scanner s=new Scanner(System.in);
 System.out.println("enter your choice as number");
 System.out.println("1.stone");
 System.out.println("2.paper");
 System.out.println("3.scissor");
 ych=s.nextInt();
 Random r=new Random();
 mch=r.nextInt(3);
 if(ych==1 && mch==2)
 {
  System.out.println("Mine is Scissor");
  System.out.println("you won! Congrats");
}
else if(ych==2 && mch==0)
{
   System.out.println("Mine is Stone");
  System.out.println("you won! Congrats"); 
}
else if( ych==3 && mch==1)
{
   System.out.println("Mine is paper");
  System.out.println("you won! Congrats");
}
else if(ych==1 && mch==0)
{
  System.out.println("Mine is Stone too");
  System.out.println("Its a Tie!Hehe");	
}
else if(ych==2 && mch==1)
{
   System.out.println("Mine is Paper too");
  System.out.println("Its a Tie!Hehe");	
}
else if(ych==3 && mch==2)
{
   System.out.println("Mine is Scissor too");
  System.out.println("Its a Tie!Hehe");	
}
else if(ych==3 && mch==0)
{
	System.out.println("Mine is Stone");
	System.out.println("I won!");
}
else if(ych==1 && mch==1)
{
	System.out.println("Mine is paper");
	System.out.println("I won!");
}
else if(ych==2 && mch==2)
{
	System.out.println("Mine is Scissor");
	System.out.println("I won!");
}
else if(ych>3 || ych<1)
{
	System.out.println("choose correct number");
}
return;
}
}
class sps
{
	public static void main(String ar[])
	{
		ravi r1 = new ravi();
		Scanner x=new Scanner(System.in);
		int c;
		do
		{
		System.out.println("you wanna play or exit?");
        System.out.println("1.play");	
		System.out.println("2.exit");
		c =x.nextInt();
		switch(c)
		{
			case 1:
			       r1.ravi();
				   System.out.print("\n");
				   break;
		    case 2:
			        System.exit(0);
					break;
			default:
			        System.out.println("choose right option");
		}
		}while(c!=2);
	}
}