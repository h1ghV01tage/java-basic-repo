package chapter6;

public class AccessDemo {
	
	public static void main (String [] args) {
		
		MyClass ob = new MyClass();
		
		/*
		 * Access to alpha is allowed only through its accessor methods
		 */
		ob.setAlpha(-99);
		System.out.println(ob.getAlpha());
		
		/*
		 * You can not access alpha
		 * like this
		 */
		
		 //ob.alpha = 10; //Wrong ! alpha is private
		
		/*
		 * These are okay because beta and gamma are public
		 */
		
		ob.beta = 88;
		ob.gamma = 99;
		
		System.out.println("beta " + ob.beta + " gamma " + ob.gamma );
			
		
		
		
	}
}
