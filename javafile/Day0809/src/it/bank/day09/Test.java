package it.bank.day09;

import java.util.Arrays;



public class Test {
	public static void main(String[] args) {
		String[] city = new String[3];
		city[0] = "����"; city[1] = "����";  city[2] = "�θ�";
		
		Arrays.sort(city);
		
		for(int i = 0; i < 3; i++) {
			System.out.print(city[i] + "\t");
		}
		
		System.out.println();
		
		//forEach��
		for(String name : city) {
			System.out.print(name + "\t");
		}
		
		System.out.println();
		
		//PDF6�� 13������
		int[] inum = {33, 77, 12, 4, 5, 26};
		
		// �迭�� �����ϴ� Ŭ���� Arrays
		Arrays.sort(inum); // �ڵ����� �������� sort
		
		for(int i = 0; i < inum.length; i++) {
			System.out.print(inum[i] + "\t");
		}
		
		System.out.println();
		
		//forEach��
		for(int num : inum) {
			System.out.print(num + "\t");
		}
	}//main END
}//class END
