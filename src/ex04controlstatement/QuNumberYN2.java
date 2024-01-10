package ex04controlstatement;

import java.io.IOException;

public class QuNumberYN2 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("하나의 숫자를 입력하시오");
		int a = System.in.read();
		
		if (a>='0' && a<='9') {
			System.out.println("숫자");
		}
		else {
			System.out.println("숫자 아님");
		}
		
	}
}
