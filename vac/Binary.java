package vac;

public class Binary {
	public static void main(String[] args) {
		int n =0b1;
		int decimal = 0;
		int i=0;
		while(n>0) {
			int last_digit = n%10 ;
			int m = ((last_digit)*((int)Math.pow(2, i)));
			decimal = decimal+m ;
			n/=10;
			i+=1;
		}
		System.out.println(decimal);
	}
}
