package ex05Method;

import java.util.Scanner;

public class QuSimpleOperation {

	static void arithmetic(int n1, int n2) {
		System.out.printf("덧셈: %d+%d=%d%n", n1, n2, (n1+n2));
		System.out.printf("뻴셈: %d-%d=%d%n", n1, n2, (n1-n2));
		System.out.printf("곱셈: %d*%d=%d%n", n1, n2, (n1*n2));
		System.out.printf("나눗셈(몫): %d/%d=%d%n", n1, n2, (n1/n2));
		System.out.printf("나눗셈(나머지):%d %% %d=%d%n", n1, n2, (n1%n2));
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("정수1을 입력:");
		int num1 = scanner.nextInt();
		System.out.println("정수2를 입력:");
		int num2 = scanner.nextInt();
		arithmetic(num1, num2);
	}
}
