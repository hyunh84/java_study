package it.bank.day02;

import java.util.Scanner;

public class Last{
	public static void main(String[] args) {
		int kor = 100, eng = 100, sum = 0;
		double avg = 0.0;
		String ret = "�޼���";
		char grade = 'F';
		
		sum = kor + eng;
		avg = (double)sum/2.0;
		//if(����){}else if(����){}else if(����){}else{}
		//90���� A, 80~89 B, 70~79 C, 60~69 D, ������ F
		
		switch((int)avg / 10) {
			case 10 : //grade = 'A' ; break;
			case 9 : grade = 'A';  break;
			case 8 : grade = 'B';  break;
			case 7 : grade = 'C';  break;
			case 6 : grade = 'D';  break;
			default :  grade = 'F';  break;
		}
		
		System.out.println("���� " + sum);
		System.out.println("��� " + avg);
		System.out.println("���� " + grade);
		
	}//main END
}//class END
