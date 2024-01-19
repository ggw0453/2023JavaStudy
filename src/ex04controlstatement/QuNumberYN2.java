package ex04controlstatement;

public class QuNumberYN2 {
	
	public static void main(String[] args)  {
		for (int a=1 ; a<=5 ; a++) {
			for(int b=1 ; b<=a ; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a=4; a>=1 ; a--) {
			for(int b=1 ; b<=a ; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}