package javaStartjung;

public class Java002 {

	public static void main(String[] args) {
		String str1="ȫ�浿"; //0X01
		String str2="ȫ�浿"; //0X01
		//string�� equals �޼ҵ�� ����ִ� ���ڿ������͸� ���Ѵ�.
		//����� �������� ���λ����ȴ�. ������ ����� ����
		String str3 = new String("ȫ�浿");
		String str4 = new String("ȫ�浿");
		//new�� ���� ���Ӱ� �� �����.��
		if(str1==str2) { 	//�ּҰ� �����Ƿ� true�̴�.
			System.out.println("str1==2�� ����");
		}
		if(str1==str3) { 	//false
			System.out.println("str1==3�� ����");
		}
		if(str1.equals(str2)) { 	//true
			System.out.println("str1==2�� ����");
		}
		if(str1.equals(str2)) { 	//
			System.out.println("str1==2�� ����");
		}

	}

}
