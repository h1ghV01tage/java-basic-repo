package chapter2;

public class UseCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i = 0; i < 5; i++) {
			System.out.println(i + " / 3: " + i / 3);
			System.out.println(i + " / 3: with fractions: " + (double) i / 3);
		}
	}

}
