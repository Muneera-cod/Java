import java.util.Scanner;
public class Symmetry
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the no of rows of Matrix; ");
  int rco=sc.nextInt();
  
  System.out.println("enter the no of rows of Matrix; ");
  int cco=sc.nextInt();
  
  int[][] matrix=new int[rco][cco];
  boolean state=false;
  System.out.println("Enter the entries of the Matrix: ");
 for(int i=0;i<rco;i++)
 {
  for(int j=0;j<cco;j++)
  { 
    matrix[i][j]=sc.nextInt();
}
}

  for(int i=0;i<rco;i++)
  {
   for(int j=0;j<cco;j++)
   {
      System.out.print(matrix[i][j]+"\t");
      }
      System.out.println();
      }
        for(int i=0;i<rco;i++)
  {
   for(int j=0;j<cco;j++)
   {
      if(matrix[i][j]==matrix[j][i])
      {
      state=true;
      
      
      }
      }
      }
      
      if(!state)
      {
       System.out.println("Not Symmetric");
       }
       else
       {
       System.out.println("Symmetric");
      }
       }
       }
      
