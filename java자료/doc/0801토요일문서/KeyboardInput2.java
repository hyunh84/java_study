package it.bank.day01;

import java.util.Scanner;

public class KeyboardInput2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�̸�,����,������ �Է�? ");
		String name = stdIn.next(); //���ڿ�
		int i = stdIn.nextInt(); //�����̶� ����
		double d = stdIn.nextDouble();//�Ǽ�����
		System.out.println( ); //�ܼ����ΰ���=enter
		System.out.print(name+"�� " + i +"�� ");
		System.out.println( "�����Դ� " + d+"kg " );
		stdIn.close();
	}//main end
}//class END



