package it.bank.day09;

public class Three {
	public static void main(String[] args) {
		int kor=85; //int=������=4Byte=�����
		double avg=78.9; //double=�Ǽ���=8Byte=�ڳ���
		String data="1200"; //StringŬ����
		
		int  a = (int)avg ;
		int  b = Integer.parseInt(data) ;
		System.out.println( b + 98); //1298
		System.out.println( data + 98); //120098
		//java.lang��Ű�� IntegerŬ����  
		//staticŰ���� �ִ� �Լ��� Ŭ�����̸�.�޼ҵ�( )
	}//main end
}//class END









