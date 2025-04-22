public class CPU
{
int price;
CPU(int price)
{
this.price=price;
}
public void display()
{
System.out.println("In CPU info");
System.out.println("CPU price " +price);
}
class Processor
{
int cores;
String producer;
Processor(int cores,String producer)
{
this.cores=cores;
this.producer=producer;
}
void display()
{
System.out.println("In Processor info");
System.out.println("Number of cores="+cores);
System.out.println("Manufacturer="+producer);
}
}
static class RAM
{
int memory;
String producer;
RAM(int memory,String producer)
{
this.memory=memory;
this.producer=producer;
}
void display()
{
System.out.println("In RAM info");
System.out.println("Memory="+memory+"GB");
System.out.println("Manufacturer="+producer);
}
}
public static void main(String[] args)
{
CPU cpuobj=new CPU(30000);
CPU.Processor probj=cpuobj.new Processor(8,"Samsung");
CPU.RAM ramobj=new CPU.RAM(8,"Intel");
cpuobj.display();
probj.display();
ramobj.display();
}
}

