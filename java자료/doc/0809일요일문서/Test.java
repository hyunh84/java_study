package it.bank.day09;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String[ ] city = new String[3];
		city[0]="����"; city[1]="����"; city[2]="�θ�";
		//�迭�� �����ϴ� Ŭ���� Arrays
		Arrays.sort(city);
		
		for(int i=0; i<3; i++){
		  System.out.print(city[i] +"\t");
		}System.out.println( );
		
		//city�迭�� forEach=�⼧��for
		for(String data : city){
		  System.out.print(data +"\t");
		}
		
		System.out.println( );
		int[ ] inum = { 33, 77, 12, 47, 5, 26 } ;
		//�迭�� �����ϴ� Ŭ���� Arrays
		Arrays.sort(inum); //�ڵ����� ������������ ��Ʈ
		for(int i=0; i<inum.length; i++){
		  System.out.print(inum[i] + "  " );
		}
		
		System.out.println( );
		//PDF6�� 13������
		for(int temp: inum){ //�ӵ��� �����
			System.out.print(temp + "  " );	
		}
		
	}//main end
}//class END
