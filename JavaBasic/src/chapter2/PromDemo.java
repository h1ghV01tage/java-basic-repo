package chapter2;

// A promotion surprise
public class PromDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		int i;
		
		b = 10;
		i = b * b; //okay no cast needed because the result is auto elevated into int
		
		b = 10;
		b = (byte) (b * b); // cast needed because result is still a byte
		
		System.out.println("i and b: " + i + " " + b);
		
		
		
	}

}
