package it.bank.day09;

public class Seven {
	public static void main(String[] args) {
		int a = 92, b =0;
		int sum = 0, gob = 0, mok = 0;
		
		try{
			sum = a + b;
			gob =  a * b;
			mok = a / b; //������ ��������ϸ� Ż��
		}catch(Exception ex){}
	
		System.out.println("���� = " +  a);
		System.out.println("���� = " + b);
		System.out.println(a + " + " + b + " = " + sum );
		System.out.println(a + " * " + b + " = " + gob );
		System.out.println(a + " / " + b + " = " + mok );
	}//main END
}//class END
