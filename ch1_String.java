package ch1;

public class ch1_String {
/*
 * 2021.12.21
 * å = �ڹ��� ����
 * ������ ��ȯ
 */
	public static void main(String[] args) {
		int x = 20, y = 10;
		int tmp = 0; // �ӽ� �� ������ ���� ���� ����
		
		tmp = x; //x�� �ִ� �� tmp�� ����
		x = y; //0�� �� x�� y�� ����
		y= tmp; //x�� ���� �ְ� 0�� �� y�� x���� ����ִ� tmp�� ����

		System.out.println("x =" + x +"," + "y =" + y);
		//x�� y�� �� ��ȯ Ȯ��
	}

}
