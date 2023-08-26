import java.util.*;
class ravi
{
    int a[]=new int[9];
    int b[]=new int[9];
    int i,flag,j,yc,k,mc,h,mo,yo,m,g=0,l=0;
    void first()
    {
      //Entering invalid values into the array and printing null matrix
      for(m=0;m<9;m++)
         a[m]=0;
      for(m=0;m<9;m++)
         b[m]=10;
      for(m=0;m<9;m++)
      {
          System.out.print(a[m]+" ");
          if(m==2 || m==5 || m==8)
            System.out.println();
      }
      Scanner s=new Scanner(System.in);
      //while loop just to select pawns 1 or 3
      do
      {
      System.out.println("Choose an option between 1 and 3");
      yc=s.nextInt();
      if(yc==1)
      {
       System.out.println("Mine is 3");
       mc=3;
      }
      else if(yc==3)
      {
       System.out.println("Mine is 1");
       mc=1;
      }
      }while(yc!=1 && yc!=3);
      i=-1;
      //loop that repeats until someone wins
     do
     {
       //loop to check the user insertion values
      do
      {
      System.out.println("Choose a position in box to enter your Option(1 to 9)");
      h=s.nextInt();
      yo=--h;
      i++;
      for(j=0;j<9;j++)
      {
       if(yo==b[j])
         g=1;
      }
      if(g==0)
      {
        a[yo]=yc;
        b[i]=yo;
        break;
      }
      else 
        g=0;
        i--;
     }while(g==1);//user checking loop ends 
     if(i>=5)
    {
     if(a[0]==mc && a[1]==mc && a[2]==mc)
     {
      flag=1;
      break;
     }
    else if(a[3]==mc && a[4]==mc && a[5]==mc)
    {
      flag=1;
      break;
    }
    else if(a[6]==mc && a[7]==mc && a[8]==mc)
    {
      flag=1;
      break;
    }
    else if(a[0]==mc && a[3]==mc && a[6]==mc)
    {
      flag=1;
      break;
    }
    else if(a[1]==mc && a[4]==mc && a[7]==mc)
    {
      flag=1;
      break;
    }
    else if(a[2]==mc && a[5]==mc && a[8]==mc)
    {
      flag=1;
      break;
    }
    else if(a[0]==mc && a[4]==mc && a[8]==mc)
    {
      flag=1;
      break;
    }
    else if(a[2]==mc && a[4]==mc && a[6]==mc)
    {
      flag=1;
      break;
    }
    if(a[0]==yc && a[1]==yc && a[2]==yc)
    {
     flag=2;
     break;
    }
   else if(a[3]==yc && a[4]==yc && a[5]==yc)
   {
     flag=2;
     break;
   }
   else if(a[6]==yc && a[7]==yc && a[8]==yc)
   {
     flag=2;
     break;
   }
   else if(a[0]==yc && a[3]==yc && a[6]==yc)
   {
     flag=2;
     break;
   }
   else if(a[1]==yc && a[4]==yc && a[7]==yc)
   {
     flag=2;
     break;
   }
   else if(a[2]==yc && a[5]==yc && a[8]==yc)
   {
     flag=2;
     break;
   }
   else if(a[0]==yc && a[4]==yc && a[8]==yc)
   {
     flag=2;
     break;
   }
   else if(a[2]==yc && a[4]==yc && a[6]==yc)
   {
     flag=2;
     break;
   }
  }
  //some random numbers between 0 to 8 were taken as AI insertions in matrix
     Random n=new Random();
     for(m=0;m<1;m--)//loop repeats until some unused position is got into myOption(mo)
     {
      mo=n.nextInt(9);
      l=0;
      for(j=0;j<9;j++)
      {
        if(mo==b[j])
           l=1;
      }
      if(l==0)
       break;
     }
     a[mo]=mc;
     i++;
     b[i]=mo;
     for(k=0;k<9;k++)
      {
          System.out.print(a[k]+" ");
          if(k==2 || k==5 || k==8)
            System.out.println();
      }
    if(i>=5)
    {
     if(a[0]==mc && a[1]==mc && a[2]==mc)
     {
      flag=1;
      break;
     }
    else if(a[3]==mc && a[4]==mc && a[5]==mc)
    {
      flag=1;
      break;
    }
    else if(a[6]==mc && a[7]==mc && a[8]==mc)
    {
      flag=1;
      break;
    }
    else if(a[0]==mc && a[3]==mc && a[6]==mc)
    {
      flag=1;
      break;
    }
    else if(a[1]==mc && a[4]==mc && a[7]==mc)
    {
      flag=1;
      break;
    }
    else if(a[2]==mc && a[5]==mc && a[8]==mc)
    {
      flag=1;
      break;
    }
    else if(a[0]==mc && a[4]==mc && a[8]==mc)
    {
      flag=1;
      break;
    }
    else if(a[2]==mc && a[4]==mc && a[6]==mc)
    {
      flag=1;
      break;
    }
    if(a[0]==yc && a[1]==yc && a[2]==yc)
    {
     flag=2;
     break;
    }
   else if(a[3]==yc && a[4]==yc && a[5]==yc)
   {
     flag=2;
     break;
   }
   else if(a[6]==yc && a[7]==yc && a[8]==yc)
   {
     flag=2;
     break;
   }
   else if(a[0]==yc && a[3]==yc && a[6]==yc)
   {
     flag=2;
     break;
   }
   else if(a[1]==yc && a[4]==yc && a[7]==yc)
   {
     flag=2;
     break;
   }
   else if(a[2]==yc && a[5]==yc && a[8]==yc)
   {
     flag=2;
     break;
   }
   else if(a[0]==yc && a[4]==yc && a[8]==yc)
   {
     flag=2;
     break;
   }
   else if(a[2]==yc && a[4]==yc && a[6]==yc)
   {
     flag=2;
     break;
   }
  }
     }while(flag==0);
    if(flag==1)
      iWon();
    else if(flag==2)
      uWon();
    } 
  void iWon()
  {
    for(k=0;k<9;k++)
    {
        System.out.print(a[k]+" ");
        if(k==2 || k==5 || k==8)
          System.out.println();
    }
    System.out.println("I have awon the game dude!");
    flag=0;
    return;
  }
  void uWon()
  {
    for(k=0;k<9;k++)
    {
        System.out.print(a[k]+" ");
        if(k==2 || k==5 || k==8)
          System.out.println();
    }
    System.out.println("U have won, Congrats!");
    flag=0;
    return;
  }
}
class ttt
{
    public static void main(String ar[])
    {
        ravi r=new ravi();
        System.out.println("TIC-TAC-TOE");
        Scanner s2=new Scanner(System.in);
        int ch;
        do{
           System.out.println("Do you wanna play or Exit?");
           System.out.println("1.play");
           System.out.println("2.Exit");
           ch=s2.nextInt();
           switch(ch)
           {
               case 1: 
                      r.first();
                      break;
               case 2:
                      System.exit(0);
                      break;
           }
        }while(ch!=2);
    }
}