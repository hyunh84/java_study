package it.bank.day30;

public class Last{ 
	public static void main(String[] args) {
		//jsp������������ ScannerŬ���� ��� ��ǲŸ�� �ؽ�Ʈ �����Է��ϸ� �����ν�
		//int m = request.getParameter("price");
		int kor = 90;
		double avg = 78.9;
		String data = "1200";
		
		int a = (int)avg;
		int b = Integer.parseInt(data);
		System.out.println(a + b);
		System.out.println(data + a);
		
		String c = String.valueOf(kor);
		System.out.println(c + a);
 	}//main End
}//class End
