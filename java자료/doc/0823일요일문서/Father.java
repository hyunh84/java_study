package it.bank.day23;

public class Father {
	private  String SM="�ƹ�";//�ʵ�=field=�Ӽ� 
	private  int m=7800;//�ʵ�=field=�Ӽ� 
	
	public Father( ){  } //�⺻������ ����������
	public Father(String name){ }//�����ڵ� �ߺ�����
		
	public void bank( ){//Non-static=�Ϲ��Լ�
		System.out.println("Father bank( ) -300��");
		int m=2300;//��������
		System.out.println("��������m=" + m); //2300
		System.out.println("��������m=" + this.m); //7800
	}//end
	
	public String house( ){//Non-static=�Ϲ��Լ�
		System.out.println("Father house( )�Լ�");
		String type="����Ʈ";
		return type ;
	}//end

	//PDF10�� 21������ �Լ����ߺ�=OverLoading
	//�������ߺ�=������ OverLoading
	public void move(String city){ }
	public void move(String city, int m){ }
	public void move(String city, int m, String sub){ }
}//Father class END





