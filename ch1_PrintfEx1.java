package ch1;

public class ch1_PrintfEx1 {
/*
 * 2021.12.22
 * 책 = 자바의 정석
 * printf 사용
 */
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		//정수형 변수 선언
		char c = 'A';
		//문자형 변수 선언
		
		int i = 10;
		//정수형 변수 선언
		long l = 100_000_000_000L;
		//정수형 변수 선언
		long h = 0xFFFF_FFFF_FFFF_FFFFL;
		//정수형 16진수 선언
		
		int oct = 010;
		//8진수 10, 10진수 8
		int hex = 0x10;
		//16진수 10, 10진수 16
		int bin = 0b10;
		//2진수 10, 10진수 2
		
		System.out.printf("b=%d%n", b); //정수 b 지정자 %d로 출력
		System.out.printf("s=%d%n", s); //정수 s 지정자 %d로 출력
		System.out.printf("c=%c, %d %n", c, (int)c); //문자 c 지정자 %c로 출력, 
													//정수형도 %d로 출력
		System.out.printf("i=[%5d]%n", i); //정수 i, 뒤에서 5자리만 출력 (없으면 공백)
		System.out.printf("i=[-%5d]%n", i);//정수 i, 앞에서 5자리만 출력 (없으면 공백)
		System.out.printf("i=[%05d]%n", i);//정수 i, 뒤에서 5자리만 출력 (없으면 0으로 채운다.)
		System.out.printf("l=%d%n", l); //정수 l, 지정자 %d로 출력
		System.out.printf("h=%#x%n", h); // 16진수, 지정자 %h로 출력(#은 접두사)
		System.out.printf("oct=%o, %d%n", oct, oct); // 8진수 oct, 지정자 %o로 8진수 값 출력
													// %d로 10진수 값 출력
		System.out.printf("hex=%h, %d%n", hex, hex);//16진수 hex, 지정자 %h로 16진수 값 출력
													// %d로 10진수 값 출력
		System.out.printf("bin=%s, %d%n", Integer.toBinaryString(bin), bin);
		//10진수를 2진수로 출력해주는 지시자가 없기에 2진수로 변환 해 주는 
		//Integer.toBinaryString()을 사용해야한다.
		//위의 메소드는 정수를 2진수로 변환해서 문자열로 반환하기에 %s를 사용
			}
}
