package it.bank.day02;

import java.util.Scanner;

//PDF���� 4�� 28������ 
public class SwitchTest1 {
	public static void main(String[] args) {
		Scanner  stdin = new Scanner(System.in);
		System.out.print("�� �Է�? ");
		int month = stdin.nextInt();//int�Է�
		String MtoS="�ȳ���"; 
		switch(month){
			case 12: 
			case 1:
			case 2:
				MtoS="�߿�ܿ��Դϴ�"; break;
			case 3: 
			case 4:
			case 5:
				MtoS="������ �����Դϴ�"; break;
			case 6: 
			case 7:
			case 8:
				MtoS="���� �������Դϴ�"; break;
			case 9: 
				MtoS="���� 9���� �����Դϴ�"; break;
			case 10: 
				MtoS="�Ƹ��ٿ� 10���� �����Դϴ�"; break;
			case 11: 
				MtoS="������ 11���� �����Դϴ�"; break;
			default:
				MtoS="1~12�� ��� �����Դϴ�"; break;
		}//switch end
		System.out.println( MtoS);
	}//main end
}//class END



