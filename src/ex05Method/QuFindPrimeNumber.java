package ex05Method;

public class QuFindPrimeNumber {

	public static boolean isPrimeNumber(int n) {
		if(n==1) return false;
		
		for(int j=2 ; j<n ; j++) {
			if(n % j == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		for(int i=1 ; i<=100 ; i++) {
			boolean result = isPrimeNumber(i);
			if(result==true)
				System.out.println("소수="+ i);
		}
	}
}
