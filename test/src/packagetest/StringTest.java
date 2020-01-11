package packagetest;



//immutable
public class StringTest {

	public static void main(String[] args) {
	String s = "Sachin";
	String s2 = "sachin";
			
/*	System.out.println(s.equalsIgnoreCase(s2));
	
	System.out.println(s == s2);
//	s.concat("tend");
	s=s.concat("te");
	System.out.println(s);


	StringBuffer sb = new StringBuffer("HELLO");
	sb.insert(2, "rewt");
	System.out.println(sb);
	System.out.println(System.currentTimeMillis());*/
	char ch[] = s.toCharArray();
	String rev = "";
	
	for ( int i = ch.length-1;i>=0;i--)
	{
		rev = rev+ch[i];
	}
	System.out.println(rev.toString());
	
//	int i = System.in.read();
	//System.out.println(i);
	}
	
	

}
