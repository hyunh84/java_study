package it.bank.day02;

public class Five {
	public static void main(String[] args) {
		int kor = 90, eng = 85, sum = 0;
		double avg = 0.0;
		String ret = "�޼���";
		
		sum = kor + eng;
		avg = (double)sum/2.0;
		
		//if ��� ��� 70������ �հ� , 0 ~ 69�����
		if(avg >= 70){
			ret = "pass";
		}else{
			ret = "No pass";
		}
		System.out.println("����� " + ret);
		
		//���׿���
		String msg = (avg >= 70 ) ? "�հ�" : "�����";
		System.out.println("����� " + msg);
		
	}//main END
}//class END
