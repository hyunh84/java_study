package it.bank.day01;

public class Three {
	public static void main(String[] args) {
		int kor=90, eng=85, sum=0;
		double avg=0.0; // 8Byte �Ǽ� => �Ҽ���
		String msg="�޼���";
		
		sum=kor+eng;
		avg=(double)sum/2;
		//������� 90�����ʹ� �հ� �� ���ʽ� ����
		//60�� �հ�, 59~0 �����
		
		if(avg >= 90) {
			msg = "�հ� �� ���ʽ� ����";			
		}else if(avg >= 60) {
			msg = "�հ�";
		}else{
			msg = "�����";
		}
		
		System.out.println("���� = " + kor);
		System.out.println("���� = " + eng);
		System.out.println("���� = " + sum);
		System.out.println("��� = " + avg);
		System.out.println(msg);
		
	}//main end
}//class END
