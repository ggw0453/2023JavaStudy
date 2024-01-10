package ex05Method;

import java.util.Scanner;

public class QuCircleCalculator {
	
	static double circleArea(double r) {
		return (3.14 * r * r);
	}
	
	static double circleRound(double r) {
		double result = 2 * 3.14 * r;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("반지름을 입력하세요:");
		double rad = scanner.nextDouble();
		
		System.out.println("원의 넓이1(5.5)"+ circleArea(rad));
		System.out.printf("원의 넓이2(5.5)=%.3f\n", circleArea(rad));
		
		double returnVal = circleRound(rad);
		System.out.println("원의 둘레(5.5)="+ returnVal);
	}
}
