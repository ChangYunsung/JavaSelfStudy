package ch1;

public class ch1_PriType {
/*
 * 2022.01.12
 * å = �ڹ��� ����
 * �⺻��
 */
	public static void main(String[] args) {
		char ch = 'A';
		//������ ���� ch ���� �� 'A'�� �ʱ�ȭ
		char ch2 = 65;
		//������ ������ ������ �ʱ�ȭ
		System.out.println(ch2);
		//������ �ʱ�ȭ �ص� ���ڰ� ����� �ȴ�.
		System.out.println('A'+3);
		//'A'�� �����ڵ�� 65 �̱⿡ 'A'+3 = 68�̵ȴ�.
		
		int code = (int) ch;
		//���������� ������ ���� ��ȯ
		System.out.println(code);
	}

}
