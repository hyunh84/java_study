package it.bank.day22;

public class Son  extends Father{
  public static void main(String[ ] args ){
	  Son  tom = new Son( );
	  tom.game( );
	  System.out.println();//���ΰ���=enter
	  Two.nemo();//static������ ����ȣ���� �����ؿ�
  }//end
  
  public void game( ){ //Non-static�Ϲ��Լ�
	  System.out.println("Son.java");
	  System.out.println("game( )�޼ҵ� WOW...");
	  bank( );
  }//end
  
}//class END






