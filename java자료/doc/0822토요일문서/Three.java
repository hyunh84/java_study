package it.bank.day22;

public abstract class Three { //�߻�Ŭ����=�����޼ҵ�ȥ��
  //�߻�޼ҵ尡 �ϳ��� ������ �ڵ����� �߻�Ŭ���� 
  public abstract void  study( );//abstract�޼ҵ�=�Լ�������
	
  public String book( ){//Non-static�Ϲ��Լ�
	String title="�����";
	return title;
  }//end
  
  public void star( ){//Non-static�Ϲ��Լ�
	  for(int i=0; i<5; i++){
		  for(int J=0; J<=i ; J++){
			  System.out.print("�� ");
		  }//J end
		  System.out.println( );//���ΰ���=enter
	  }//i end
  }//end
  
  public static void nemo( ){//static�����Լ�
	for(int i=0; i<3; i++){
		System.out.println("# # # # #");
	}
  }//end
  
  
}//class END
