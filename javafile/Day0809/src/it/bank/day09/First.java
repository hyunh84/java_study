package it.bank.day09;

public class First {
	public static void main(String[] args) {
		First ob = new First();
		
		ob.bank("KB��������", 7.8);
	}//main END
	
	//�Լ��̸��� �����Ѱ�츦 overLoading - PDF10�� 20P
	//��ӽ� �θ�Ŭ���� �޼ҵ带 �ڽ��� ������ = overRiding
	
	/*bank Start*/
	public void bank() {
		System.out.println("bank(X)");
	}
	/*bank End*/
	
	/*bank Start*/
	public void bank(String name) {
		System.out.println("�����̸� = " + name);
	}
	/*bank End*/
	
	/*bank Start*/
	public void bank(String name, double rate) {
		System.out.println(name + "�� ���� = " + rate + "%" );
	}
	/*bank End*/
	
}//class END
