package it.bank.day23;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args){
		File file = null ;
		PrintWriter pw = null;
		String path="C:\\Mtest\\my0230\\LG";
		Scanner  stdin = new Scanner(System.in);
		
	int dan=1;
	try{
		file = new File(path);
		file.mkdir();
		System.out.println( path  +" ��λ���");
		
		pw = new  PrintWriter(path +"\\gugudan.txt");
		
		System.out.print("������ �Է�? ");
		dan = stdin.nextInt();
		for(int i=1; i<10; i++){
		  System.out.println(dan+"*"+i+"="+(dan*i));
		  pw.println(dan+"*"+i+"="+(dan*i));//���Ϸ�����
		}//for end
		System.out.println("gugudan.txt ���强��");
		pw.close();//�̰;��ϸ� ����ȵ˴ϴ�.
		stdin.close( ); //���������ؿ�
	}catch(Exception ex){
		System.out.println("gugudan.txt �������");
	}
		
	}//end 
}//class END
