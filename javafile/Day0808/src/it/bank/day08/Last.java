package it.bank.day08;

import java.util.Scanner;

public class Last {
	public static void main(String[] args) {		
		String name = "����ȣ";
		int age = 1;
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("�̸��Է�?   ");
		name = stdin.nextLine();//enter�ձ��� �ν�
		System.out.print("�̸� = " + name);
		
		System.out.println();
		System.out.println();
		
		System.out.print("�����Է�?   ");
		age = stdin.nextInt();
		System.out.print("���� = " + age);
		stdin.close(); //������ص� ���� ����
		
	}//main END
}//class END
