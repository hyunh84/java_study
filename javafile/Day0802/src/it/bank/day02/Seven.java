package it.bank.day02;

public class Seven {
	public static void main(String[] args) {
		int kor = 45, eng = 45, sum = 0;
		double avg = 0.0;
		char grade = 'F';
		
		sum = kor + eng;
		avg = (double)sum/2.0;
		//if(����){}else if(����){}else if(����){}else{}
		//90���� A, 80~89 B, 70~79 C, 60~69 D, ������ F
		
		if(avg >= 90) {
			grade = 'A';			
		}else if(avg >= 80) {
			grade = 'B';					
		}else if(avg >= 70) {
			grade = 'C';					
		}else if(avg >= 60) {
			grade = 'D';					
		}else {
			grade = 'F';					
		}
		
		System.out.println("���� " + sum);
		System.out.println("��� " + avg);
		System.out.println("���� " + grade);
		
	}//main END
}//class END
