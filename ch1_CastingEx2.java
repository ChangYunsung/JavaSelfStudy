package ch1;

public class ch1_CastingEx2 {
/*
 * 2021.01.21
 * 책 = 자바의 정석
 * 형변환 - 크기가 다른 정수 타입의 형변환
 */
	public static void main(String[] args) {
		//큰 타입에서 작은타입으로의 변환 (값손실)
		int i = 10;
		byte b = (byte) i;
		System.out.println("int 10->byte = " + b);
		
		i = 300;
		b = (byte) i;
		System.out.println("int 300 -> byte = " + b);
		
		//작은 타입에서 큰 타입으로 변환
		b = 10;
		i = (int)b;
		System.out.println("byte 10 -> int = " + i);
		
		b = -2;
		i = (int)b;
		System.out.println("byte -2 -> int = " + i);
		
		System.out.println("i = " + Integer.toBinaryString(i));
		//byte -2를 int형으로 형변환 한 것을 2진수로 표현
		//(2의 보수법 때문에 앞은 1로 표현된다)
	}

}
