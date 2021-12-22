package ch1;

public class ch1_PrintfEx2 {
/*
 * 2021.12.22
 * 책 = 자바의 정석
 * printf 사용 2
 */
	public static void main(String[] args) {
		String url = "www.naver.com";
		//문자열 url 선언
		float f1 = .10f; //0.10, 1.0e-1(지수)
		float f2 = 1e1f; //10.0, 1.0e1. 1.0e+1(지수)
		float f3 = 3.14e3f; 
		double d = 1.23456789; //실수 선언
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		//실수 지정자 %f, 지수 지정자 %e, 값 간략하게 표현 지정자 %g
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		//실수 지정자 %f
		System.out.printf("d=%14.10f%n", d);
		//실수 지정자 %f, 전체 14자리중 소수점 10자리
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		//문자열 지정자 %s
		System.out.printf("[%20s]%n", url);
		//문자열 지정자 %s 20자리, (우측정렬)
		System.out.printf("[%-20s]%n", url);
		//문자열 지정자 %s 20자리, (좌측정렬)
		System.out.printf("[%.8s]%n", url);
		//왼쪽에서 8글자만 출력
			}
}
