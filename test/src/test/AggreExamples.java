package test;

public class AggreExamples {
	
	int d ;
	String s  ;
	Address a ;
	
	public AggreExamples(int d, String s,Address a)
	{
		this.d = d;
		this.s = s;
		this.a = a;
	}
	
	void display()
	{
		System.out.println(this.d + " " + this.s+ " " + this.a.city + " " + this.a.country + " "+this. a.state );
	}

	public static void main(String[] args) {
		Address e =  new Address("Ciyt","STate","Country" );
		AggreExamples e1 =  new AggreExamples(111,"qwer",e);
		e1.display();

	}

}
