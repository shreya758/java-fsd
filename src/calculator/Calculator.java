package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	int n1,n2;
	char choice;
	double operation=0.0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st number: ");
	n1 = sc.nextInt();

	System.out.println("Enter 2nd number: ");
	n2 = sc.nextInt();

	System.out.println("choice");
	choice = sc.next().charAt(0);

	switch(choice) {
	case 'a' : operation = n1 + n2;
	   break;

	case 'b' : operation = n1 - n2;
	           break;
	           
	case 'c' : operation = n1*n2;
	           break;
	           
	case 'd' : operation = n1/n2;
	           break;
	           
	}

	System.out.println(n1+" "+choice+" "+n2+" "+operation);
	}

}
