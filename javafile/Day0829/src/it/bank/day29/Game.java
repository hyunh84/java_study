package it.bank.day29;

import java.util.Scanner;

public class Game  extends Thread {
	public static void main(String[] args) {
		Game gg = new Game( );
		gg.start();
		
		System.out.println("\n2�ʸ� ��ٸ�����" );
		try{Thread.sleep(2000);}catch(Exception e){ }
		   Scanner  stdin = new Scanner(System.in);
		   int dan=1;
		   System.out.print("\n������ �Է�? ");
		   dan=stdin.nextInt();
		 
		   for(int i=1; i<10; i++){
			 System.out.println(dan+"*"+i+"="+(dan*i));
		   }
		   
		System.out.println("\n�Ʒ������������" );
		System.out.println("����=90");
		System.out.println("����=85");
		System.out.println("����=175");
	}//main end
	
	public void run( ){//start�Լ��� ȣ�� 
		int su=0;
		while(true){
	   	  su++;
		  System.out.print(su  + "\t"); 
		  try{Thread.sleep(500);}catch(Exception e){ }
		  if(su%5==0) { System.out.println(); }
		}//while end	
	}//run end
}//class END





