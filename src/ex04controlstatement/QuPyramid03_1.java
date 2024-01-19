package ex04controlstatement;

public class QuPyramid03_1 {
	
	public static void main(String[] args) {
		
		for(int a=5 ; a>=1 ; a--) {
			for(int b=1 ; b<=a ; b++) {
				System.out.print("*");
			}
			for(int c = 1 ; c<=10 ; c++) {
				for(int d = 9; d>=c ; d--) {
//					System.out.println(c-d);
				}
				System.out.print("0");
			}
			System.out.println();
		}
	}
}
