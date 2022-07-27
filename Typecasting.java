import java.util.Scanner;
public class Typecasting {
public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		System.out.println("Value of a: "+a);
		
		int b=(int)a;
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=a;
		System.out.println("Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x = sc.nextDouble();
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}


