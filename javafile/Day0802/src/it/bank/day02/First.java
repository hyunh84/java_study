package it.bank.day02;

public class First {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		//�ݺ��� - for() {}, while(����), do{~}while(����);
		
		//for Start
		for(int i = 0; i  < 10; i++) {
			a++;
			System.out.print(a + " ");
		}
		//for End
		
		System.out.println();
		
		//while Start
		while(true) {
			b++;
			System.out.print(b + " ");
			if(b == 10) break;
		}
		//while End
		
		System.out.println();
		
		//do~while Start
		do{
			c++;
			System.out.print(c + " ");
		}while(c < 10);
		//do~while End
		
		System.out.println();
		
		int kor = 90, eng = 85, sum = 0;
		sum = kor + eng;
		System.out.println("���� = " + kor);
		System.out.println("���� = " + eng);
		

	}//main END
}//class END
