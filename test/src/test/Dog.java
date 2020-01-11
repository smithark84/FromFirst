package test;

public class Dog extends Animals {
	void eat(){System.out.println("eating bread...");}  
	void bark(){System.out.println("barking...");}  
	void work(){  
			super.eat();  
			bark();  
	} 

}
