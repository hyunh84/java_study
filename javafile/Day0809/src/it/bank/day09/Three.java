package it.bank.day09;

public class Three {
	public static void main(String[] args) {
		int kor = 90;//������ 4Byte
		double avg = 78.9;//�Ǽ��� 8Byte
		String data = "1200";//Ŭ����
		
		int a = (int)avg;
		int b = Integer.parseInt(data);
		//java.lang��Ű�� IntegerŬ����
		//staticŰ���尡 �ִ� �Լ��� Ŭ����.�޼ҵ�() �������� ��밡��
		
		System.out.println(b + 98);
		System.out.println(data + 98);
	}//main END
}//class END
