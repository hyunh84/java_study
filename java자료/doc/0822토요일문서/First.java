package it.bank.day22;

public class First  implements  Game {
  public static void main(String[ ] args ){
	  //FirstŬ���� new�����ڷ� ��ü���� ����
	  First.move( );
	  First.move("��û");
	  First.move("��û��", 20);
  }//end
  
  public static void move( ){ }
  public static void move(String subway){ }
  public static void move(String subway, int m){ }

	@Override
	public void android() {	}//end
	public int price() {return 0;}//end
	public String book() {	return null;	}//end
}//class END
