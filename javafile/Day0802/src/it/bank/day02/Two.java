package it.bank.day02;

public class Two {
	public static void main(String[] args) {
		int kor=95; //��������  = local variable, ���̾��� ���¿��� ����ϸ� ����
		final int SIZE = 200; //����� �Ʒ����� �������� ������ �� ����.
		String SM = "�̼��� ���";
		double PI = 3.1415;	
		
		System.out.println("���� = " + kor);
		System.out.println("ũ�� = " + SIZE);
		System.out.println("��� = " + SM);
		System.out.println("���� = " + PI);
		
		kor = 40;//���������� ������ ����
		//SIZE = 70;
		SM = "���������";
		PI = 78.9;
		System.out.println("���� = " + kor);
		System.out.println("ũ�� = " + SIZE);
		System.out.println("��� = " + SM);
		System.out.println("���� = " + PI);

	}//main END
}//class END
