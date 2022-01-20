package ch1;

public class ch1_CastingEx3 {
/*
 * 2021.01.21
 * 책 = 자바의 정석
 * 형변환 - 크기가 다른 실수 타입의 형변환
 */
	public static void main(String[] args) {
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double) f;
		
		System.out.printf("f = %20.18f\n", f);
		//20자리 중 18자리는 소수점 이하 수 출력
		System.out.printf("d = %20.18f\n", d);
		System.out.printf("d2 = %20.18f\n", d2);
	}

}
