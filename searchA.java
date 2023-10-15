import java.util.Scanner;
public class searchA
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Scanner s=new Scanner(System.in);
    System.out.println("enter the limit of array: ");
    int n=sc.nextInt();
    
    String[] array=new String[n];
    boolean state=false;
    int x=0;
    System.out.println(" the element of array:");
        
    for(int i=0;i<n;i++)
    {
      array[i]=s.nextLine();
      }
      
      System.out.println("Enter the element to Search: ");
      String srch=s.nextLine();
      
      for(int i=0;i<n;i++)
      {
       if(array[i].equals(srch))
       {
        state=true;
        x=i;
       break;
        }
        }
        if(state)
        {
         System.out.println(" the element to Search is at: "+(x+1));
        }
        else
        {
         System.out.println("not found");
        }
        }
        }
        
