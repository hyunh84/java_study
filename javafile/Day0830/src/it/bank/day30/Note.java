package it.bank.day30;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Note extends Frame {
	private TextArea ta = new TextArea();//��������
	
	private Font font = new Font("�ü�ü", Font.BOLD, 34);
	
	public Note() {
		this.setTitle("�ʹ̴� �޸��� �����");
		this.setBackground(Color.GREEN);
		this.setBounds(200, 200, 400, 500);
		this.add(ta);
		ta.setFont(font);
		this.setVisible(true);
		
		//MyExit me = new MyExit();
		this.addWindowListener(
			new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.out.println("MyExit.java ������ ����");
					System.exit(1);
				}
			}
		);
	}//�⺻������ end
		
	public static void main(String[] args) {
		Note pad = new Note();
	}//main End
	
//	public class MyExit extends WindowAdapter{
//		//������ ��ư => source => Override/implement Method..
//		@Override
//		public void windowClosing(WindowEvent e) {
//			System.out.println("MyExit.java ������ ����");
//			System.exit(1);//��¥����
//		}//end
//	}//����Ŭ���� End
	
}//class End
