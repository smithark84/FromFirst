package packagetest;

import java.io.IOException;

public class ioExapmle {

	public static void main(String[] args) {
		int i = 0;
		try {
			i  = System.in.read();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(i);
		

	}

}
