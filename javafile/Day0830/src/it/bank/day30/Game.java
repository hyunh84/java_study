package it.bank.day30;

public class Game implements Runnable{ 
	public static void main(String[] args) {
		/*int su = 0;
		//1~20���� 0.5 �ʴ���  1~5 6~10 11~15 16~20
		while(true) {
			su++;
			System.out.print(su + "\t");
			try{Thread.sleep(500);}catch(Exception ex){}
			if(su%5 == 0) {System.out.println();}
			if(su == 20) break;//��Ÿ���� �ϲ�
		}*/
		//�����忡���� run�Լ��� start()�޼ҵ� ȣ��
		Game gg = new Game();
		//gg.run();
		
		Thread tr = new Thread(gg);
		tr.start();
		
		System.out.println("\n���� = 90");
		System.out.println("���� = 90");
		System.out.println("���� = 175");
 	}//main End
	
	public void run() {
		int su = 0;
		while(true){
			su ++;
			System.out.print(su + "\t");
			try{Thread.sleep(1000);}catch(Exception ex) {}
			if(su%5 == 0) {System.out.println();}
			if(su == 30) break;
		}
		
	}
}//class End
