package it.bank.day09;

public class First {
	public static void main(String[] args) {
		First ob = new First( );
		ob.bank("KB��������", 7.8);
	}//main end
	
	//�Լ��̸��ߺ�=OverLoading=�����ε� => PDF10�� 20
	//��� �θ�Ŭ���� �޼ҵ带 �ڽ��� ������=> OverRiding
	public void bank( ){//Non-static�Ϲ��Լ� 
	  System.out.println("bank(X)");
	}//end
	
	public void bank(String name ){//Non-static�Ϲ��Լ� 
	  System.out.println(name);
	}//end
	
	public void bank(String name, double rate ){//Non-static�Ϲ��Լ� 
	  System.out.println(name + " " + rate +"%");
	}//end
}//class END



