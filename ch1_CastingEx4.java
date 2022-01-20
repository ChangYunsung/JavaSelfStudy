package ch1;

public class ch1_CastingEx4 {
/*
 * 2021.01.21
 * 책 = 자바의 정석
 * 형변환 - 정수, 실수 형변환
 */
	public static void main(String[] args) {
		int i = 91234567;
		//8자리 정수
		float f = (float)i;
		//int를 float으로 변환
		int i2 = (int) f;
		//float으로 변환한 f 다시 int로 변환
		
		double d = (double)i;
		//int를 double로 변환
		int i3 = (int) d;
		//double로 변환한 d 다시 int로 변환
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("i = %d\n", i);
		System.out.printf("f = %f i2 = %d\n", f, i2);
		System.out.printf("d = %f i3 = %d\n", f, i3);
		//i3과 i2는 정밀도 때문에 값이 다름을 알 수 있다
		System.out.printf("(int)%f = %d\n", f2, i4);
		//float을 int로 형변환할때 반올림이 발생하지 않음을 알 수 있다
	}

}
