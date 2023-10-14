package chapter2;

//A truth table for logical operators
public class LogicalOpTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = q = true;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = true; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	

	}

}
