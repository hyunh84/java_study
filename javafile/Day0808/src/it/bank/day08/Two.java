package it.bank.day08;

public class Two {
	public static void main(String[] args) {
		int a = 62, b = 0, c = 0, d = 0;
		try{
			c = a + b;
			d = a / b;	//����� ���� �߻��ϸ� ���ܽ�Ŵ
		}catch(Exception ex){}
		
		System.out.println(a + " + " + b + " = " + c);
		System.out.println(a + " / " + b + " = " + d);
		System.out.println("\n������ ���� = ������ ����");
		
		

		First.nemo();
		/*First aa = new First();
		aa.star(5);*/
		new First().star(5);
		
	}//main END
}//class END
