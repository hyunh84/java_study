package it.bank.day23;

public class Son  extends Father{ 
	public Son( ){ }
	public Son(String name ){ }
	
	public static void main(String[] args){
		Son  tom = new Son( "��ҿ�" );
		tom.game( );
	}//end 
	
	public void bank( ){//Non-static=�Ϲ��Լ�
		System.out.println("\nSon ���λ��¹�ũ");
	}//end
	
	public void game( ){ //Non-static�Ϲ��Լ�
		System.out.println("WOW Loading..\n");
		super.bank();
		this.bank();
	}//end
}//class END

