package packagetest;

import java.util.ArrayList;
import java.util.Iterator;

public class CollecitonExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("first");
		list.add("Second");
		Iterator ir = list.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}

	}

}
