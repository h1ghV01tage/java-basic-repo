package chapter14;

//demonstrate two simple lambda expressions
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare an interface reference
		MyValue myVal;
		
		/*
		 * here, the lambda expression is simply a constant expression
		 * when it is assigned to myVal, a class instance is constructed
		 * in which the lambda expression implements the getValue() method in MyValue.
		 */
		myVal = () -> 98.6; //a simple lambda expression
		
		//call getValue(), which is provided by the previously assigned lambda expression
		System.out.println("A constant value " + myVal.getValue());
		
		//now create a parameterized lambda expression and assign it to 
		//a MyParamValue reference. this lambda expression returns the
		//reciprocal of its argument
		
		MyParamValue myPval = (n) -> 1.0 / n; //lambda expression with a parameter
		
		//call getValue(v) through the myPval reference
		System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
		System.out.println("Reciprrocal of 8 is" + myPval.getValue(8.0));
		
		//A lambda expression must be compatible with the method defined
		//by the functional interface. Therefore, these won't work
		
		//myVal = () -> "three"; //Error because incompatible data type of string
		//myPval = () -> Math.random(); //error because parameter is required 
	
		
		
		
		
	}

}
