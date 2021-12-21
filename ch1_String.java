package ch1;

public class ch1_String {
/*
 * 2021.12.21
 * 책 = 자바의 정석
 * 변수의 교환
 */
	public static void main(String[] args) {
		int x = 20, y = 10;
		int tmp = 0; // 임시 값 저장을 위한 변수 선언
		
		tmp = x; //x에 있는 값 tmp에 저장
		x = y; //0이 된 x에 y값 저장
		y= tmp; //x에 값을 주고 0이 된 y에 x값이 들어있는 tmp값 저장

		System.out.println("x =" + x +"," + "y =" + y);
		//x와 y의 값 변환 확인
	}

}
