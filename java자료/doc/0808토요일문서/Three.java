package it.bank.day08;

public class Three {
	public static void main(String[] args) {
		int[] su = {78, 36, 27} ;
		//su[0]=78;  su[1]=36;  su[2]=27;
		//�迭�� ����Ÿ��, ũ�����, �迭�� ũ��� length
		for(int i=0; i<su.length; i++){
			System.out.print( su[i] + "\t" );
		}System.out.println(); //Enter���
		
		String[ ] city= new String[3];
		city[0]="��û";  city[1]="����"; city[2]="�Ⱦ�";  
		for(int i=0; i<city.length; i++){
			System.out.print( city[i] + "\t" );
		}
	}//main end
}//class END


