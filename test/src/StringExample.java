
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "qwert";
		System.out.println(s.toCharArray());
		char[] c = s.toCharArray();
		System.out.println(c[0]);
		String s1 = "abc";
		String s2 = new String("abc");
		//s2.intern();
		System.out.println(s1.equals(s2));
	}

}
