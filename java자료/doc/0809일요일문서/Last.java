package it.bank.day09;

import java.util.Scanner;

public class Last {	
	public void getDan( ){ //Non-static�Ϲ��Լ�
		int dan=3;
		Scanner stdin = new Scanner(System.in);
		System.out.print("�� �Է�? ");
		try{
			dan = stdin.nextInt();//�����߿� �����̸� try~catch
		}catch(Exception ex){ }
		
		for(int i=1; i<10; i++){
		  System.out.println(dan+"*"+i+"="+(dan*i));
		  if(i==5)break;
		}
		stdin.close();//��ü�ݱ�
	}//end
	
	public static void test( ){ //static�����Լ�
		//staticŰ���尡 ������ Ŭ�����̸�.�޼ҵ�( )
		System.out.println("����=90");
		System.out.println("����=85");
		System.out.println("����=175");
	}//end
}//class END







