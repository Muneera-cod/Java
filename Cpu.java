class Cpu
{
  int price;
  Cpu(int price)
  {
   this.price=price;
   }
   
  class Processor
  {
     int Nocores;
     String manufatr;
     Processor(int Nocores,String manufatr)
     {
       this.Nocores=Nocores;
       this.manufatr=manufatr;
       }
       void display()
       {
       System.out.println("Processor Information");
        
        System.out.println("No of cores: "+Nocores);
        System.out.println("Manufacturer: "+manufatr);
  }
  }
   static class ram
   {
       int memory;
       String manufacter;
       ram(int memory,String manufacter)
       {
         this.memory=memory;
         this.manufacter=manufacter;
         }
         void display()
         {
         System.out.println("RAM Information");
      
           System.out.println("memory: "+memory+"GB");
        System.out.println("Manufacturer: "+manufacter);
}
}
public static void main(String args[])
{
 Cpu.ram obj1=new Cpu.ram(8,"Intel");
 obj1.display();
 Cpu obj2=new Cpu(1000);
 Cpu.Processor obj3=obj2.new Processor(8,"Samsung");
 obj3.display();
 }
 }
 
 
 
 
 
         

