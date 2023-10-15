import java.util.Scanner;
class Publisher
{
  String publisher;
  Publisher(String publisher)
  {
    this.publisher=publisher;
    }
    }
    class book extends Publisher
    {
     String title;
     book(String publisher,String title)
     {
       super(publisher);
       this.title=title;
    }
    }
    
    class Literature extends book
    {
     Literature(String publisher,String title)
     {
       super(publisher,title);
       }
       void display()
       {
          System.out.println("Publisher :"+publisher);
        System.out.println("Book :"+title);
        }
        }
        
        
   class Fiction extends book
   {
    Fiction(String publisher,String title)
    {
      super(publisher,title);
      }
      void display()
      {
            System.out.println("Publisher :"+publisher);
        System.out.println("Book :"+title);
        }
        }
        
        
public class Book
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
      Scanner s=new Scanner(System.in);
     
          System.out.println("Enter the number of Literature book : ");
        int n=sc.nextInt();
        Literature[] litr=new Literature[n];
        
        for(int i=0;i<n;i++)
        {
              System.out.println("Publisher :");
              String P=s.nextLine();
              
        System.out.println("Book :");
        String B=s.nextLine();
        litr[i]=new Literature(P,B);
        
        }
        
        
              System.out.println("Enter the number of Fiction book : ");
        int N=sc.nextInt();
        Fiction[] Fic=new Fiction[N];
        
        for(int i=0;i<n;i++)
        {
              System.out.println("Publisher :");
              String P=s.nextLine();
              
        System.out.println("Book :");
        String B=s.nextLine();
        Fic[i]=new Fiction(P,B);
        
        }
         System.out.println("\n********Informations of all the Literature Books************");
        for(int i=0;i<n;i++)
        {
          System.out.println((i+1)+".");
          litr[i].display();
          
        }
        System.out.println("\n********Informations of all the Fiction Books************");
         for(int i=0;i<n;i++)
        {
          System.out.println((i+1)+".");
          Fic[i].display();
          
        }
        
        }
            
        
        
        }
        
          
          
          
          
          
    
    
        
