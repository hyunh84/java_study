package it.bank.day22;

public class My implements Game  {
  public static void main(String[ ] args ){
	  My kb = new My( );
	  kb.bank("��������");
	  kb.bank("��������", 7.8);
	  kb.bank("��������", 7.8, "����������");
  }//end
  
  //PDF10��  20������ => OverLoading& OverRiding(������)
  //�޼ҵ�=�Լ��̸�����=OverLoading=�Լ����ߺ�
  public void bank( String name){ }
  public void bank( String name,double rate){ }
  public void bank( String name,double r,String pos){ }

	@Override
	public void android() {  }
	public int price() { return 0;	}

	@Override
	public String book() {	return null;	}//end
}//class END


