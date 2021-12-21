package ch1;

public class ch1_VarEx2 {
/*
 * 2021.12.21
 * 책 = 자바의 정석
 * String 사용
 */
	public static void main(String[] args) {
		String name = "Ja" + "va";
		//문자열 + 문자열
		String str = name + 8.0;
		//문자열 + 실수
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7+" ");
		//7 뒤에 문자열 공백
		System.out.println(" "+7);
		//7 앞에 문자열 공백
		System.out.println(7+"");
		//String은 빈 문자열 출력 가능
		System.out.println(""+7);
		System.out.println(""+"");
		System.out.println(7+7+"");
		//정수형 먼저 계산 후 문자열과의 계산
		System.out.println(""+7+7);
		//문자열과의 계산이 먼저 이루어졌기에 뒷 부분은 다 문자열로 처리
	}

}
