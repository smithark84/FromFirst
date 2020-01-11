package test;

public class Array {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	aa :
	//	 Object String =  s = "smith";
		for (int i = 1;i<=3;i++) 
		{
			for (int j=1;j<=3;j++)
			{
				if (i==2 && j==2)
				{
					System.out.println("check break");
					break aa;
		//			System.out.println(s);
				}
					
				System.out.println(i + "" + j);
				
			}
		}

	}

}
