package it.bank.day29;

import java.awt.Frame;

public class Note extends Frame {
	 public Note( ){
		 	this.setTitle( "aa" ); //â����
		 	this.setVisible( true );//��¥ â�����ִ� ��ɾ�
	 }//�⺻������
			
	public static void main(String[] args) { 
		Note  pad = new  Note( );//�͸��ǰ�üanonymous
		pad.bank( "��������");
	}//end
	
	public void bank(String kb){ }
	
	public String book( ){
		String title="�����";
		return title;
	}//end
	
	public class MyExit{ 
		//MyExit.java �����
		//MyExit.class���  Note$MyExit.class ������
	}//MyExit����Ŭ���� end
	
}//Note Class END







