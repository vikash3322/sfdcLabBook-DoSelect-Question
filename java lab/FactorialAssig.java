package sfdcAssig;

import java.util.Scanner;

public class FactorialAssig {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  
	int i,fact=1;
	int number = sc.nextInt();  
	for(i=1;i<=number;i++){    
		fact=fact*i;  
	}
	System.out.println(fact);
 }
}
