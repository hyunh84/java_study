package it.bank.day22;

public class Two {  
  public void star( ){//Non-static�Ϲ��Լ�
	  for(int i=0; i<5; i++){
		  for(int J=0; J<=i ; J++){
			  System.out.print("�� ");
		  }//J end
		  System.out.println( );//���ΰ���=enter
	  }//i end
  }//end
  
  public static void nemo( ){//static�����Լ�
	//�޼ҵ忡 staticŰ���尡 ������ Ŭ�����̸�.�޼ҵ�( )
	for(int i=0; i<3; i++){
		System.out.println("# # # # #");
	}
  }//end
}//class END
