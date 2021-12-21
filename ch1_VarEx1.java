package ch1;

public class ch1_VarEx1 {
/*
 * 2021.12.21
 * 책 = 자바의 정석
 * 변수 저장값 불러오는 예제
 */
	public static void main(String[] args) {
		int year = 0;
		//변수 year 값 0으로 초기화
		int age = 14;
		//변수 age 값 14로 초기화
		
		System.out.println(year);
		System.out.println(age);
		//출력
		
		System.out.println();
		
		year = age+2000;
		//변수 age 값에 2000을 더해 변수 year에 저장
		age = age+1;
		//변수 age에 저장된 값을 1 증가
		System.out.println(year);
		System.out.println(age);
	}

}
