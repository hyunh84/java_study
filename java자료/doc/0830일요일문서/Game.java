package it.bank.day30;

import java.awt.Frame;

public class Game implements Runnable {
	public static void main(String[] args) {
		//�����忡���� run�Լ��� start( )�޼ҵ�ȣ��
		System.out.println("\n����=90");
		System.out.println("����=85");
		System.out.println("����=175");
	}//main end 

	public void run() { //Non-static�Ϲ��Լ�
		int su=0;
		while(true){
			su++;
			System.out.print( su + "\t");
			try{ Thread.sleep(1000); }catch(Exception ex){ }
			if(su%5==0){System.out.println(); }
		}//while end
	}//run end
}//class END



