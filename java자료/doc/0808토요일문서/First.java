package it.bank.day08;

public class First {
	public static void main(String[] args){//static�����Լ�
		System.out.println("First.java main�Լ�");
		First ff = new First( );
		ff.star( );
	}//main end
	
	public void star( ){ //Non-static�Ϲ��Լ�
		for(int i=0; i<5; i++){
			for(int J=0 ; J <= i ; J++){
				System.out.print( "�� ");
			}//J end
			System.out.println( ); //Enter����
		}//i end
	}//star end
}//class END
