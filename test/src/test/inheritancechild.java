package test;

public class inheritancechild extends InheritanceExamplesClass {
	

	inheritancechild()
	{
		super();
		System.out.println("In child costructor");
	}
	int bonus=10000;  
	//System.out.println(super.);
	
	
	void print1()
	{
		System.out.println("in Child class");
	}
	
	void ToprintSuper()
	{
		System.out.println(super.salary);
		//System.out.print(super.print1());
		
		super.print1();
		System.out.println(super.salary);
		System.out.println(super.x);
		super.printsuper1();
		
	}

		
}