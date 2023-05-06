package BasicSeleniumPrograms;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("provide NUMBER to reverse");
		
		int n= sc.nextInt();
		int a=0;
		
		for (int i=2;i<= n-1; i++) {
			if (n%i==0) {
				a=a+1;
			}
			}
		if (a==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("non prime");
		}
		}
	}

