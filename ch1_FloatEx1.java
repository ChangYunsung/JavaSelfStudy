package ch1;

public class ch1_FloatEx1 {
/*
 * 2021.01.20
 * 책 = 자바의 정석
 * 기본형 - 실수 정밀도
 */
	public static void main(String[] args) {
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.printf("       123456789012345678901234%n");
		System.out.printf("f  : %f%n", f);
		//소숫점 이하 6째 자리까지 출력하고 7자리에서 반올림함
		System.out.printf("f  : %24.20f%n", f);
		//%24.20f = 24자리 중 20자리는 소수점 이하 수를 출력하라
		//원래 저장한 값과 오차가 생겨서 출력된다
		System.out.printf("f2 : %24.20f%n", f2);
		//원래 저장한 값과 오차가 생겨서 출력된다
		System.out.printf("d  : %24.20f%n", d);
		//소숫점 이하 14째 자리까지 출력하고 15자리에서 반올림함
	}

}
