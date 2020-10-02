import java.util.Scanner;

 // Compiler version JDK 11.0.2

class AllPatterns
{
  Scanner sc=new Scanner(System.in);
  public static void main(String args[])
  { 
    Dcoder obj=new Dcoder();
    System.out.println("********************WELCOME********************\n");
    obj.patterns();//call the method patterns() through the object of the class
    System.out.println("\n*******************THANK YOU*******************");
  }
  void patterns()//method for taking the choice of user and calling suitable methods
  {
    int n;char ch;
    //take user's choice
    System.out.println("Which type of pattern do you want to print :");
    System.out.println("Press 1 for \"Triangular Patterns\".");
    System.out.println("Press 2 for \"Square Patterns\".");
    System.out.println("Press 0 to exit.");
    System.out.print("Your choice : ");
    switch(sc.nextInt())
    {
      case 1:
        System.out.println("Which type of Triangular Pattern do you want to print :");
        System.out.println("Press 1 for \"Right Triangular Patterns\".");
        System.out.println("Press 2 for \"Equilateral Triangle Patterns\".");
        System.out.print("Your choice : ");
        switch(sc.nextInt())
        {
          case 1:
            System.out.println("You chose right tringular pattern.");
            System.out.print("Enter the number of rows you want : ");
            n=sc.nextInt();
            System.out.print("Enter the character you want : ");
            ch=sc.next().charAt(0);
            rightTriangle(n,ch);//call rightTriangle() method which prints right traingular pattern
            break;
          case 2:
            System.out.println("You chose equilateral tringular pattern.");
            System.out.print("Enter the number of rows you want : ");
            n=sc.nextInt();
            System.out.print("Enter the character you want : ");
            ch=sc.next().charAt(0);
            equilateralTriangle(n,ch);//call equilateralTriangle() method which prints equilateral pattern
            break;
          default :
            System.out.println("Sorry wrong choice....Try again\n");
            patterns();//call method patterns() again for wrong choice
        }
        break;
      case 2:
        System.out.println("You chose square pattern.");
        System.out.print("Enter the number of rows you want : ");
        n=sc.nextInt();
        System.out.print("Enter the character you want : ");
        ch=sc.next().charAt(0);
        square(n,ch);//call sqaure() method which prints square pattern
        break;
      case 0:
        return;
      default:
        System.out.println("Sorry wrong choice....Try again\n");
        patterns();//call method patterns() again for wrong choice
    }
  }
  void square(int n,char ch)//method to print sqaure pattern
  {
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        System.out.print(ch+" ");
      }
      System.out.println();
    }
  }
  void rightTriangle(int n,char ch)//method to print right triangular pattern
  {
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(ch+" ");
      }
      System.out.println();
    }
  }
  void equilateralTriangle(int n,char ch)//method to print equilateral triangle pattern
  {
    for(int i=1;i<=n;i++)
    {
      for(int j=i;j<=n;j++)
      {
        System.out.print(" ");
      }
      for(int k=1;k<=(i*2)-1;k++)
      {
        if(k%2==1)
        {
          System.out.print(ch);
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
