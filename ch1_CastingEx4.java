package ch1;

public class ch1_CastingEx4 {
/*
 * 2021.01.21
 * å = �ڹ��� ����
 * ����ȯ - ����, �Ǽ� ����ȯ
 */
	public static void main(String[] args) {
		int i = 91234567;
		//8�ڸ� ����
		float f = (float)i;
		//int�� float���� ��ȯ
		int i2 = (int) f;
		//float���� ��ȯ�� f �ٽ� int�� ��ȯ
		
		double d = (double)i;
		//int�� double�� ��ȯ
		int i3 = (int) d;
		//double�� ��ȯ�� d �ٽ� int�� ��ȯ
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("i = %d\n", i);
		System.out.printf("f = %f i2 = %d\n", f, i2);
		System.out.printf("d = %f i3 = %d\n", f, i3);
		//i3�� i2�� ���е� ������ ���� �ٸ��� �� �� �ִ�
		System.out.printf("(int)%f = %d\n", f2, i4);
		//float�� int�� ����ȯ�Ҷ� �ݿø��� �߻����� ������ �� �� �ִ�
	}

}
