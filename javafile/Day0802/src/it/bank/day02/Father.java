package it.bank.day02;

public class Father {
	private int password = 1234;//�ʵ� = ������� = ��������
	
	//main START
	public static void main(String[] args) {//static ���� �Լ�;
		System.out.println("FatherŬ������ main�Լ�");
		Father john = new Father();
		john.bank();
	}
	//main END
	
	// bank Start
	public void bank() { //Non-static = �Ϲ��Լ�;
		int password = 7800;//��������
		int m = 300;
		System.out.println(m + "�� �־��");
	}
	// bank End
}//class END
