package ch1;
import java.util.Scanner;

public class ch1_ScannerEx {
/*
 * 2021.12.22
 * å = �ڹ��� ����
 * Scanner ���
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner sc ����
		
		System.out.print("���ڸ� ���� �Է� : ");
		String input = sc.nextLine();
		//���ڿ��� �Է¹޴� input ����
		int num = Integer.parseInt(input);
		//�Է¹��� ���ڿ� ������ ��ȯ
		
		System.out.println("�Է� ���� : " + input);
		//�Է¹��� ���ڿ� ���
		System.out.printf("num=%d%n", num);
		//�Է¹��� ���ڿ��� ������ ��ȯ ��Ų �� ���
			}
}
