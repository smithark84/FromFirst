package test;

public class staticcheck {
	int a =40;
	static 
	{
		System.out.println("in static block befor e main");
	}
	public static void main(String args[])
	{
		System.out.println("testing static method");
	}

}
