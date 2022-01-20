package ch1;

public class ch1_PriType {
/*
 * 2022.01.12
 * 책 = 자바의 정석
 * 기본형
 */
	public static void main(String[] args) {
		char ch = 'A';
		//문자형 변수 ch 선언 및 'A'로 초기화
		char ch2 = 65;
		//문자형 변수를 정수로 초기화
		System.out.println(ch2);
		//정수로 초기화 해도 문자가 출력이 된다.
		System.out.println('A'+3);
		//'A'는 유니코드로 65 이기에 'A'+3 = 68이된다.
		
		int code = (int) ch;
		//정수형으로 문자형 변수 변환
		System.out.println(code);
	}

}
