package it.bank.day29;

public class Two {
  public static void main(String[] args) {
	String msg="�ȳ���";
	String jumin="841224-1528913"; 
	//����1  char  charAt(����) =>����� �����Դϴ�
	char gender = jumin.charAt(7);
	if(gender=='1'){ msg="����� �����Դϴ�"; }
	else if(gender=='2'){ msg="����� �����Դϴ�"; }
	else { msg="����Ȯ�� �Ͻñ� �ٶ��ϴ�"; }
	System.out.println(msg);
	
	//����2  String  substring(����, ��+1)
	String m = jumin.substring(2, 4);
	String d = jumin.substring(4, 6);
	System.out.println(m+"�� " + d +"�� �����Դϴ�" );
	
	String ju1 = "84124"; //6�ڸ���
	String ju2 = "15289136"; //7�ڸ���
	int size1 = ju1.length();
	int size2 = ju2.length();
	if(size1 !=6 || size2 != 7){
	 System.out.println("�ֹ� �ڸ����� Ʋ�Ƚ��ϴ�");
	}
	
	System.out.println();
	String data="HSBbankTest";
	System.out.println(data.toLowerCase());//�ҹ���
	System.out.println(data.toUpperCase());//�빮��
	System.out.println(data.replace("bank", "my"));
  }//main end
}//Twoclass END





