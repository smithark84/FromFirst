package test;

public class StringExamples 
{

	public static void main(String[] args)
	{
/*	String s = "smitha s";
	int count =0 ;
	byte a ;
	a = 5+5;
	System.out.println(a);
	System.out.println(s.length());
	for (int i= 0 ; i<s.length();i++)
	{
		if(s.charAt(i)!= ' ')
		{
			count ++;
		}
	}
	System.out.println(count);*/
	
	String s1 = "ABCDEFGH";
	String s2 = "EFGH";
	System.out.println(s1);
	System.out.println(s1.substring(s2.length()));
	System.out.println(s1 + s2);
	String s3 = new String("EFGH");
	
	System.out.println(s3);
	if(s2==s3)
	{
		System.out.println("checking for valluew");
		
	}
	
	}
	


}
