package ch1;

public class ch1_OverFlowEx {
/*
 * 2021.01.20
 * 책 = 자바의 정석
 * 기본형 - 오버플로우
 */
	public static void main(String[] args) {
		short sMin = -32768;
		//short범위에서 최소값
		short sMax = 32767;
		//short범위에서 최대값
		char cMin = 0;
		//char 범위에서 최소값
		char cMax = 65535;
		//char 범위에서 최대값
		
		//최소값 - 1 = 최대값
		//최대값 + 1 = 최소값
		System.out.println("sMin =" + sMin);
		System.out.println("sMin-1=" + (short)(sMin-1));
		System.out.println("sMax =" + sMax);
		System.out.println("sMax+1 =" + (short)(sMax+1));
		System.out.println("cMin =" + (int)cMin);
		System.out.println("cMin-1 =" + (int)--cMin);
		System.out.println("cMax =" + (int)cMax);
		System.out.println("cMax+1 =" + (int)cMax);
	}

}
