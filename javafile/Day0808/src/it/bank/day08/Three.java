package it.bank.day08;

public class Three {
	public static void main(String[] args) {
		//int[] su = {78, 36, 27};
		
		int[] su = new int[3];//ũ�� ��������� �Ѵ�.
		su[0] = 78; su[1] = 36; su[2] = 27;
		//�迭�� ���� Ÿ��, ũ������, �迭�� ũ��� length
		for(int i = 0; i < su.length; i++) {
			System.out.print(su[i] + "         ");
		}
		
		System.out.println("\n");//�ܼ� ����
		
		//String[] city = {"��û", "����", "�Ⱦ�"};//ù��° ���
		
		String[] city = new String[3];//ũ�� ��������� �Ѵ�.
		city[0] = "��û"; city[1] = "����"; city[2] = "�Ⱦ�";//�ι�°���
		
		for(int i = 0; i < city.length; i++) {
			System.out.print(city[i] + "         ");
		}
		
		System.out.println("\n");
		
		
	}//main END
}//class END
