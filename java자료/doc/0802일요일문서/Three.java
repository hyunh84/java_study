package it.bank.day02;

public class Three {
	public static void main(String[] args) {
		int a=0;
		a=a+1; 
		System.out.print(a + "  " );
		a++; //���׿��� 
		System.out.print(a + "  " );
		++a; //���׿���
		System.out.print(a + "  " );
		
		System.out.println( ); //enter���
		int dan=7;
		System.out.println(dan+"*"+1+"="+(dan*1));
		System.out.println(dan+"*"+2+"="+(dan*2));
		System.out.println(dan+"*"+3+"="+(dan*3));
		System.out.println(dan+"*"+4+"="+(dan*4));
		System.out.println(dan+"*"+5+"="+(dan*5));
		System.out.println(dan+"*"+6+"="+(dan*6));
		System.out.println(dan+"*"+7+"="+(dan*7));
		System.out.println(dan+"*"+8+"="+(dan*8));
		System.out.println(dan+"*"+9+"="+(dan*9));
		//7*9=63
		
		dan=6; //for�ݺ��������� 
		//�ݺ�Ƚ���� ��Ȯ�� �˰� ������ for(�ʱ�; ��������;����)
		System.out.println( ); //enter���
		for(int i=1; i<10; ++i){
		  System.out.println(dan+"*"+i+"="+(dan*i) );	
		}
	}//main end
}//class END






