package student;

public class DemoConstructor {
	int age;
	String name;
	{
		age=10;
		System.out.println("in SIB -1"+age);
	}
	{
		age=13;
		System.out.println("in SIB -2"+age);
	}
	//constructors
	public DemoConstructor() {
		// TODO Auto-generated constructor stub
		age=32;
		System.out.println("IN constructor :1"+age);
	}
	public DemoConstructor(int age)
	{
		this.age=age;
		System.out.println("IN constructor :2"+this.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoConstructor obj = new DemoConstructor();
		DemoConstructor obj2= new DemoConstructor(56);

	}

}
