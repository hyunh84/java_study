package it.bank.day29;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
	  //File, PrintWriter=> java.io��Ű��
	 try{
	   String path="C:\\Mtest\\my0230\\LG";
	   File file=new File( path );
	   file.mkdir();
	   System.out.println( path  +" ��������");
	   
	   PrintWriter pw=null; //JSP2���� out.println("<h2>~~
	   pw = new PrintWriter( path +"\\gugudan.txt");
	   
	   Scanner  stdin = new Scanner(System.in);
	   int dan=1;
	   System.out.print("\n������ �Է�? ");
	   dan=stdin.nextInt();
	   
	   for(int i=1; i<10; i++){
		 System.out.println(dan+"*"+i+"="+(dan*i));
		 pw.println(dan+"*"+i+"="+(dan*i));
	   }
	   
	   pw.close();
	   System.out.println("\ngugudan����ó�� ��������");
	   stdin.close();
	 }catch(Exception ex){ }
	 
	}//end
}//class END







