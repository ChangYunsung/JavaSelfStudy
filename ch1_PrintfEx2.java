package ch1;

public class ch1_PrintfEx2 {
/*
 * 2021.12.22
 * å = �ڹ��� ����
 * printf ��� 2
 */
	public static void main(String[] args) {
		String url = "www.naver.com";
		//���ڿ� url ����
		float f1 = .10f; //0.10, 1.0e-1(����)
		float f2 = 1e1f; //10.0, 1.0e1. 1.0e+1(����)
		float f3 = 3.14e3f; 
		double d = 1.23456789; //�Ǽ� ����
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		//�Ǽ� ������ %f, ���� ������ %e, �� �����ϰ� ǥ�� ������ %g
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		//�Ǽ� ������ %f
		System.out.printf("d=%14.10f%n", d);
		//�Ǽ� ������ %f, ��ü 14�ڸ��� �Ҽ��� 10�ڸ�
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		//���ڿ� ������ %s
		System.out.printf("[%20s]%n", url);
		//���ڿ� ������ %s 20�ڸ�, (��������)
		System.out.printf("[%-20s]%n", url);
		//���ڿ� ������ %s 20�ڸ�, (��������)
		System.out.printf("[%.8s]%n", url);
		//���ʿ��� 8���ڸ� ���
			}
}
