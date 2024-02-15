package Programming_Striver;

import java.util.Scanner;

public class NthPrime {

	public static boolean isPrime(int num) {
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n=sc.nextInt(), count=0,num=2;
		boolean ans = isPrime(num);
		if(n!=1&&ans==true) {
			
			count++;
			if (count==n) {
				System.out.println(n+"th Prime Number is "+count);	
			}
			
		}
		else {
			System.out.println(n+"is not a Prime Number");
		}
	}
}
