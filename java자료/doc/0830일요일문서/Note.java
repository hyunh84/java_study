package it.bank.day30;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Note extends Frame {
	private  TextArea  ta = new TextArea( ); //��������
	private  Font  font = new Font("�ü�ü", Font.BOLD, 34);     
	
	public Note( ){
		ta.setFont(font);
		this.add(ta);
		
		this.setTitle( "�ʹ̴ϸ޸��常���" );
		this.setBackground(Color.GREEN);
		this.setBounds(200, 200, 400, 550);
		this.setVisible( true  );
		
		MyExit me = new MyExit( );
		this.addWindowListener( me );
	}//�⺻������end
	
	public static void main(String[] args) {
		 Note  pad = new Note( );
	}//end 
	
	public class MyExit extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.out.println("MyExit.java ����������");
			System.exit(1);//��¥����
		}//end
	}//����Ŭ���� end==========================

}//Noteclass END=============================




