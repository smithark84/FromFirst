package packagetest;

public class pyrsmid {

	public static void main(String[] args) {
		int counter = 1;
	/**	for(int i=1 ; i<=4; i++)
		{
			for (int j =1; j<=i;j++)
			{
				System.out.print(counter);
				counter++;
			}
			System.out.println();
		}
		}
	**/
		String alpha = "abcdcba";
		//char [] arr = alpha;
		int len = alpha.length();
		int lenVal = len/2;
		Boolean palinrome = false;
	//	System.out.println(lenVal);
		for (int i=0;i<lenVal;i++)
		{
				if (alpha.charAt(i) == alpha.charAt(len-1))
				{
					//System.out.println();
					palinrome = true;
				}else
				{palinrome  = false ;} 
		}
		if (palinrome = true)
		{System.out.println("string is plaindrome");}
		else
		{System.out.println("not a palindrom");}
		System.out.println(alpha.replace('d', 'z'));
		System.out.println(alpha.replaceAll(Character.toString('c'), " "));
		}
		

}
