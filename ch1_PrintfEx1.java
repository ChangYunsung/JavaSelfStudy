package ch1;

public class ch1_PrintfEx1 {
/*
 * 2021.12.22
 * å = �ڹ��� ����
 * printf ���
 */
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		//������ ���� ����
		char c = 'A';
		//������ ���� ����
		
		int i = 10;
		//������ ���� ����
		long l = 100_000_000_000L;
		//������ ���� ����
		long h = 0xFFFF_FFFF_FFFF_FFFFL;
		//������ 16���� ����
		
		int oct = 010;
		//8���� 10, 10���� 8
		int hex = 0x10;
		//16���� 10, 10���� 16
		int bin = 0b10;
		//2���� 10, 10���� 2
		
		System.out.printf("b=%d%n", b); //���� b ������ %d�� ���
		System.out.printf("s=%d%n", s); //���� s ������ %d�� ���
		System.out.printf("c=%c, %d %n", c, (int)c); //���� c ������ %c�� ���, 
													//�������� %d�� ���
		System.out.printf("i=[%5d]%n", i); //���� i, �ڿ��� 5�ڸ��� ��� (������ ����)
		System.out.printf("i=[-%5d]%n", i);//���� i, �տ��� 5�ڸ��� ��� (������ ����)
		System.out.printf("i=[%05d]%n", i);//���� i, �ڿ��� 5�ڸ��� ��� (������ 0���� ä���.)
		System.out.printf("l=%d%n", l); //���� l, ������ %d�� ���
		System.out.printf("h=%#x%n", h); // 16����, ������ %h�� ���(#�� ���λ�)
		System.out.printf("oct=%o, %d%n", oct, oct); // 8���� oct, ������ %o�� 8���� �� ���
													// %d�� 10���� �� ���
		System.out.printf("hex=%h, %d%n", hex, hex);//16���� hex, ������ %h�� 16���� �� ���
													// %d�� 10���� �� ���
		System.out.printf("bin=%s, %d%n", Integer.toBinaryString(bin), bin);
		//10������ 2������ ������ִ� �����ڰ� ���⿡ 2������ ��ȯ �� �ִ� 
		//Integer.toBinaryString()�� ����ؾ��Ѵ�.
		//���� �޼ҵ�� ������ 2������ ��ȯ�ؼ� ���ڿ��� ��ȯ�ϱ⿡ %s�� ���
			}
}
