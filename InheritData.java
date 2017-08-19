///Inheritance of non static data
//refer : about inheritance of data.txt
//see the diagram
package student;
class A
{
 int x, y; //data members

 {
  System.out.println("NSIB of A");
 }

 A()//default constructor
 {
  System.out.println("A()");
  x = 10;
  y = 20;
 }

 A(int q, int w)//parameterized constructor
 {
  System.out.println("A(int,int)");
  x = q;
  y = w;
 }
}//A

class B extends A
{
 int z;

 {
  System.out.println("NSIB of B");
 }

 B()
 {
  //super(); compiler generates a call like this
  System.out.println("B()");
  z = x + y; //can access x and y of super class
 }

 B(int l, int m ,int n) 
 {
  super(l,m);//invoking A(int,int)
  System.out.println("B(int,int,int)");
  z = n;
 }

 void display()
 {
  System.out.println("x :  " + x);
  System.out.println("y :  " + y);
  System.out.println("z :  " + z);
 }
}//B

class InheritData
{
 public static void main(String args[])
 {
  System.out.println("============");
  //B objB = new B(); //object of derived class
  B objB = new B(1,2,3); //object of derived class
  System.out.println("============");
  objB.display();

 }
}