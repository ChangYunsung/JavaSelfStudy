package ch1;
import java.util.Scanner;

public class ch1_ScannerEx {
/*
 * 2021.12.22
 * 책 = 자바의 정석
 * Scanner 사용
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner sc 선언
		
		System.out.print("두자리 정수 입력 : ");
		String input = sc.nextLine();
		//문자열로 입력받는 input 선언
		int num = Integer.parseInt(input);
		//입력받은 문자열 정수로 변환
		
		System.out.println("입력 내용 : " + input);
		//입력받은 문자열 출력
		System.out.printf("num=%d%n", num);
		//입력받은 문자열을 정수로 변환 시킨 값 출력
			}
}
