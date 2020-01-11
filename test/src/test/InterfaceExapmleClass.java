package test;

public class InterfaceExapmleClass implements InterfaceExample,InterfaceExample1{
	
	public void a() {System.out.println("in a");}  
	public void b() {System.out.println("in b");}  
	public void c() {System.out.println("in c");}  
	public void d() {System.out.println("in a");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample1 i = new InterfaceExapmleClass();
		InterfaceExample first  =  new InterfaceExapmleClass();
		i.c();
		first.a();
		System.out.println(InterfaceExample.cube(3));
	}

}
