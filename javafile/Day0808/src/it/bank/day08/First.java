package it.bank.day08;

public class First {
	public static void main(String[] args) {//static �����Լ�
		//main �Լ����� star()�޼ҵ� ȣ��;
		First firstObj = new First();//Ŭ������ ��ü�� ��ȯ��Ű�°� ����....?
		firstObj.star(5);
		
		//Seven Ŭ���� �޼ҵ� ȣ��
		Seven noteInfoCall = new Seven();
		noteInfoCall.note();
				
		System.out.println(firstObj.globalAge);
	}//main END
	
	int globalAge = 32;
	
	// star Start
	public void star(int repeatNum) {//Non-static �Ϲ��Լ�
		//���� for  �ݺ���
		for(int i = 1; i < repeatNum; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print("��");
			}	
			System.out.println();
		}				
	}
	// star End
	
	//nemo Start
	public static void nemo() {//�����Լ�
		//static Ű���尡 ������ Ŭ���� �̸�.�޼ҵ�()
		System.out.println();
		
		for(int i = 0; i <=3; i++) {
			System.out.println("####");
		}
	}
	//nemo End
	
}//class END
