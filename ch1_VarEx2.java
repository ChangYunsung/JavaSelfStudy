package ch1;

public class ch1_VarEx2 {
/*
 * 2021.12.21
 * å = �ڹ��� ����
 * String ���
 */
	public static void main(String[] args) {
		String name = "Ja" + "va";
		//���ڿ� + ���ڿ�
		String str = name + 8.0;
		//���ڿ� + �Ǽ�
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7+" ");
		//7 �ڿ� ���ڿ� ����
		System.out.println(" "+7);
		//7 �տ� ���ڿ� ����
		System.out.println(7+"");
		//String�� �� ���ڿ� ��� ����
		System.out.println(""+7);
		System.out.println(""+"");
		System.out.println(7+7+"");
		//������ ���� ��� �� ���ڿ����� ���
		System.out.println(""+7+7);
		//���ڿ����� ����� ���� �̷�����⿡ �� �κ��� �� ���ڿ��� ó��
	}

}
