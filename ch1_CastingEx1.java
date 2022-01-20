package ch1;

public class ch1_CastingEx1 {
/*
 * 2021.01.21
 * 책 = 자바의 정석
 * 형변환 - 형변환 방법
 */
	public static void main(String[] args) {
		double d = 85.4;
		//실수형 변수 d 선언
		int score = (int) d;
		//실수 double형 변수를 정수 int형으로 형변환
		
		System.out.println("score="+score);
		//정수형으로 형 변환한 score 출력
		System.out.println("d=" + d );
	}

}
