package it.bank.day01;

public class Three {
	public static void main(String[] args) {
		int kor=90, eng=85, sum=0;
		double avg=0.0;  //8Byte=>�Ҽ����� �ִ� �Ǽ�
		String msg ="�޼���";
		
		sum=kor+eng;
		avg=(double)sum/2;

		if(avg >= 90){msg="�հݹ׺��ʽ����޵Ǽ̽��ϴ�"; }   
		else if( avg >= 60 ){msg="�հݵǼ̽��ϴ�"; }
		else{ msg="������� ���ž� �մϴ�"; }
		
		System.out.println("����=" + kor );
		System.out.println("����=" + eng );
		System.out.println("����=" + sum );
		System.out.println("���=" + avg );
		System.out.println(  msg );
	}//main end
}//class END




