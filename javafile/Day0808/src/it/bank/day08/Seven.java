package it.bank.day08;

public class Seven {
	public static void main(String[] args) {
		Seven info = new Seven();
		info.note();
	}//main END
	
	//book Start
	public String book() {
		String  title = "�����";
		return title;
	}
	//book End
	
	//price Start
	public int price() {
		int m = 23000;
		return m;
	}
	//price End
	
	//save Start
	public double save() {
		double point = 34.5;
		return point;
	}
	//save End
	
	//note Start
	public void note() { // main�Լ� ȣ��
		String title = book();
		int m = price();
		System.out.println("���� = " + title);
		System.out.println("���� = " + m);
		System.out.println("���� = " + book());
		System.out.println("���� = " + price());
	}
	//note End
	
}//class END
