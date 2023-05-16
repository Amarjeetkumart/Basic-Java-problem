package vac;
import java.util.*;
public class Third {
/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Number of Quantity- ");
	int a= sc.nextInt();
	int b = a*100;
	if (b>1000) {
		int c=b-(b/10);
		System.out.println("Your Total cost is- "+c);
	}
	else {
		System.out.println("Your Total cost is- "+b);
	}
	}
}
