import java.util.Scanner;
Interface Shape
{
void getdata();
void area();
void perimeter();
}
class Circle implements Shape
{
double pi=3.14;
double r;
Scanner sc=new Scanner(System.in);
public void getdata()
{

