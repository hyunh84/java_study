package it.bank.day30;

public class Two {
	public static void main(String[] args) {
		String msg = "�ȳ���";
		String jumin = "840620-1901909";
		//indexOf, substring, trim, toUpperCase, toLowerCase
		//����1 indexOf, substring
		int pos = jumin.indexOf("-");
		//System.out.println("pos = " + pos);
		msg = jumin.substring(pos + 1);
		System.out.println("�ֹι�ȣ �޹�ȣ = " + msg);
		System.out.println();
				
		String data = " itBankAndroid ";
		System.out.println("aa" + data + "bb");
		System.out.println("trim = " + "aa" + data.trim() + "bb");
		System.out.println();
		
		data = "itBankApple";
		System.out.println("toLowerCase = " + data.toLowerCase());
		System.out.println("toUpperCase = " + data.toUpperCase());
		System.out.println("replace = " + data.replace("Bank", "pc"));
		
	}//main End
}//class End
