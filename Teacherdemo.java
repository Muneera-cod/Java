import java.util.Scanner;
class Employee
{
 int empid;
 String name;
 int salary;
 String address;
 public Employee(int empid,String name,int salary,String address)
 {
   this.empid=empid;
   this.name=name;
   this.salary=salary;
   this.address=address;
   }
   }
   
   class Teacher extends Employee
   {
    String deptmnt;
    String subject;
   public Teacher(int empid,String name,int salary,String address,String deptmnt,String subject)
    {
      super(empid,name,salary,address);
      this.deptmnt=deptmnt;
      this.subject=subject;
      }
      public void display()
      {
        System.out.println("EmpID: "+empid);
        System.out.println("Name of the Employee: "+name);
        System.out.println("Salary of employee: "+salary);
        System.out.println("Address of the Employee: "+address);
        System.out.println("Department of the Teacher: "+deptmnt);
        System.out.println("Subject of the teacher: "+subject);
        }
        }
        
      public class Teacherdemo
      {
       public static void main(String args[])
       {
        Scanner sc=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
          System.out.println("enter the limit of array: ");
           int N=sc.nextInt();
           Teacher[] teachers=new Teacher[N];
           for(int i=0;i<N;i++)
           {
            System.out.println("Details of Employee"+(i+1)+": ");
                System.out.println();
                System.out.println();
                System.out.println("EmpID: ");
                int empid=sc.nextInt();
        
        System.out.println("Name of the Employee: ");
         String name=s.nextLine();
        
        System.out.println("Salary of employee: ");
        int salary=sc.nextInt();
        
        System.out.println("Address of the Employee: ");
        String address=s.nextLine();
        
        System.out.println("Department of the Teacher: ");
        String deptmnt=s.nextLine();
        
        System.out.println("Subject of the teacher: ");
        String subject=s.nextLine();
        
        teachers[i]=new Teacher(empid,name,salary,address,deptmnt,subject);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\t\tDetails of the "+N+" Teachers: ");
        System.out.println();
        System.out.println();
          for(int i=0;i<N;i++)
           {
            teachers[i].display();
 System.out.println();
 }
 for(Teacher str:teachers)
 {
    str.display();
    }
 }
 }           
        
        
        
        
