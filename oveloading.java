import java.util.Scanner;
class shape
{
 int length,breadth,radius;
 float pi=3.141f;
 void area(int radius)
 {
   System.out.println("Area of Circle is: "+(pi*radius*radius));
   }
   void area(int length,int breadth)
   {
    System.out.println("Area of Rectangle: "+(length*breadth));
    }
   
   }
   
 
   
 
    class oveloading
    {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the radius: ");
    int radiu=sc.nextInt();
     shape over=new shape();
     over.area(radiu);
     over.area(3,4);
     }
     }   
