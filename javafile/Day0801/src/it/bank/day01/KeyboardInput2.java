package it.bank.day01;

import java.util.Scanner;

public class KeyboardInput2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�̸�, ����, �����Ը� ����(space)���� �����Ͽ� �Է� : ");
		
		String name = stdIn.next();//�̸� ���ڿ�
		int i = stdIn.nextInt();//���� ������
		double d = stdIn.nextDouble();//������ �Ǽ���

		System.out.println();//�ܼ�����
		System.out.println(name + "���� ���̴� " + i + " ���̰�");
		System.out.println("�����Դ� " + d + "kg�Դϴ�.");
		
		stdIn.close();

	}//main end
}//class END
