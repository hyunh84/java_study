package it.bank.day09;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		int dan;
		Scanner stdin = new Scanner(System.in);
		String msg = "����� ���� �Է��ϼ��� - ";
		
		System.out.print(msg);
		try{
			dan = stdin.nextInt();
		}catch(Exception ex){dan = 2;}
		System.out.print("\n");
		
		for(int k = 1; k < 10; k++) {
			System.out.println(dan + " * " + k + " = " + dan*k );
			if(k == 5) break;
		}
		
		stdin.close();
		
		
		System.out.println();
		System.out.println("���� = 90");
		System.out.println("���� = 85");
		System.out.println("���� = 175");
		System.out.println("������ ���� = ������ ����");
	}//main END
}//class END
