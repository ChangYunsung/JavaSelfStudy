package ch1;

public class ch1_CastingEx2 {
/*
 * 2021.01.21
 * å = �ڹ��� ����
 * ����ȯ - ũ�Ⱑ �ٸ� ���� Ÿ���� ����ȯ
 */
	public static void main(String[] args) {
		//ū Ÿ�Կ��� ����Ÿ�������� ��ȯ (���ս�)
		int i = 10;
		byte b = (byte) i;
		System.out.println("int 10->byte = " + b);
		
		i = 300;
		b = (byte) i;
		System.out.println("int 300 -> byte = " + b);
		
		//���� Ÿ�Կ��� ū Ÿ������ ��ȯ
		b = 10;
		i = (int)b;
		System.out.println("byte 10 -> int = " + i);
		
		b = -2;
		i = (int)b;
		System.out.println("byte -2 -> int = " + i);
		
		System.out.println("i = " + Integer.toBinaryString(i));
		//byte -2�� int������ ����ȯ �� ���� 2������ ǥ��
		//(2�� ������ ������ ���� 1�� ǥ���ȴ�)
	}

}
