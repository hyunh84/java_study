package it.bank.day29;

import java.util.ArrayList;
import java.util.Vector;

public class Three {
	public static void main(String[] args) {
		int[] su = new int[3]; //�迭�Ǵ��� ũ�����, ����Ÿ��
		su[0]=34;  su[1]=78;  su[2]=56;
		
    //Vector  vt = new Vector( );//�迭�ƴ�
    ArrayList list = new ArrayList( ); //�迭�ƴ�
    list.add("sky"); list.add(23); list.add(true);
    for(int i=0; i<list.size(); i++){
    	System.out.print( list.get(i) + "\t");
    }
	}//end
}//class END




