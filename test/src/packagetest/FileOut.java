package packagetest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {

	public static void main(String[] args) throws IOException {
		
		
		//Libraries\Pictures
		FileOutputStream fb = new FileOutputStream("C:\\Users\\general\\Desktop\\logs.txt");
		String s = "Welcome to Java";
		byte b[] = s.getBytes();
		//fb.write(65);
		//fb.write(23);
		fb.write(b);
		fb.close();
		System.out.println("test done");
		
		
		FileInputStream fi = new FileInputStream("C:\\Users\\general\\Desktop\\logs.txt");
		int sb = fi.read();
		
		System.out.println((char)sb);
		
		
		
	}

}
