package ch1;

public class ch1_CastingEx3 {
/*
 * 2021.01.21
 * å = �ڹ��� ����
 * ����ȯ - ũ�Ⱑ �ٸ� �Ǽ� Ÿ���� ����ȯ
 */
	public static void main(String[] args) {
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double) f;
		
		System.out.printf("f = %20.18f\n", f);
		//20�ڸ� �� 18�ڸ��� �Ҽ��� ���� �� ���
		System.out.printf("d = %20.18f\n", d);
		System.out.printf("d2 = %20.18f\n", d2);
	}

}
