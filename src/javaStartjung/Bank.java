package javaStartjung;

import java.util.Scanner;

public class Bank {
//����� ��
	public static void main(String[] args) {
		//���� Ǯ��
		//�迭 ���� (�Լ�(x))
		Scanner sc=new Scanner(System.in);
		int listCount=3;
		String id[]=new String[100];
		String pw[]=new String[100];
		double account[]=new double[100];
		
		id[0]="a1"; id[1]="a2"; id[2]="a3"; 
		pw[0]="a1"; pw[1]="a2"; pw[2]="a3";
		account[0]=1;account[1]=2;account[2]=3;
		
		String inputId=null;
		String inputPw=null;
		int indexCount=0;
		
		while(true) {
			System.out.println("���̵�� pw�� �Է��ϼ���");
			System.out.println("���̵�>>");
			inputId=sc.nextLine();
			System.out.println("pw>>");
			inputPw=sc.nextLine();
			
			if(inputId==null) {
				
			}else if(inputId.equals("exit")) {
				break;
			}else if(inputId.equals("admin")&&inputPw.equals("admin")) {
				//������ ����
//				1.���� �߰� 2.���� ���� 3.��� ����� ���� Ȯ��
//				4.id�� Ư�� ����� ���� Ȯ�� 5.����
				//�ǹ��� �������� ����ó���� ��ư� ����
				boolean isAdminLogin=true;
				while(isAdminLogin) {
				System.out.println("������ ����");
				System.out.println("1.���� �߰� 2.���� ���� 3.��� ����� ���� Ȯ��	"
						+ "\n4.id�� Ư�� ����� ���� Ȯ�� 5.����");
				System.out.println("�޴��Է�>>");
				
				int selectNum=Integer.parseInt(sc.nextLine());
				switch(selectNum) {
				case 1:
					System.out.println("�߰��� ����� �����Է�");
					System.out.println("���̵�>>");
					id[listCount]=sc.nextLine();
					System.out.println("pw>>");
					pw[listCount]=sc.nextLine();
					account[listCount]=0;
					listCount++;
					break;
				case 2:
					System.out.println("������ ����� �����Է�");
					System.out.println("���̵�>>");
					id[listCount]=sc.nextLine();
					String deleteId=sc.nextLine();
					int findIndex=-1;
					for(int i=0;i<listCount;i++) {
						if(id[i].equals(deleteId)) {
							findIndex=i;
							break;
						}
					}
					if(findIndex<0) {
						System.out.println("���� ���̵��Դϴ�.");
					}else {
						for(int i=findIndex;i<id.length-1;i++) {
							id[i]=id[i+1];
							pw[i]=pw[i+1];
							account[i]=account[i+1];
						}
						listCount--;
						System.out.println("�����Ǿ����ϴ�. ");
					}
					
					break;
				case 3:
					System.out.println("��� ����� ���� ���:");
					for(int i=0;i<listCount;i++) {
						System.out.println(i+"��-----------------\n���̵�>>"+id[i]);
						System.out.println("pw>>"+id[i]);
						System.out.println("acccount>>"+id[i]);
					}
					if(listCount==0) {
						System.out.println("�����Ͱ� �����ϴ�.");
					}
					break;
				case 4:
					System.out.println("ã�� ���̵� �Է��ϼ���");
					System.out.println("���̵�>>");
					String findId=sc.nextLine();
					boolean isFind=false;  //boolean �ڷ����� is�� �־��ִ°� �������� ����̴�.
					for(int i=0; i<listCount;i++) {
						if(id[i].equals(findId)) {
							System.out.println("���̵�>>"+id[i]);
							System.out.println("pw>>"+pw[i]);
							System.out.println("acccount>>"+account[i]);
							isFind=true;
						}
					}
					if(!isFind) {
//					if(i==listCount)   //�÷��׸� ����ϴ°� �� ����.
						System.out.println("���� ���̵� �Դϴ�.");
						
					}
					
					break;
				case 5:
					isAdminLogin=false;
					inputId=null;
					break;
				default:
					System.out.println("�߸��� �Է� �Դϴ�.");
				}
			}// isAdminLogin while�� ���� //������ �ڵ带 �ۼ��Ҷ� ����ǥ���ϴ°� �����̵�
				
				//����Ʈ�� �迭�� ������
				//����Ʈ�� ���ӵ� ������(������ ������ ���ڸ��� ä��)
			}else { //�Ϲ� ����� �α���
				//�����ϴ� ������ΰ�?
				//�����ϴ� ����� indexCount�� �����ΰ�?
				//�����ϴ� ������ΰ�?
				boolean isLogin=false;
				for(int i=0;i<id.length;i++) {
					if(id[i]!=null&&id[i].equals(inputId)&&pw[i].equals(inputPw)) {
//					if(id[i].equals(inputId)&&id[i]!=null)  //�߸����ڵ�, �պκ��� false�� �Ǽ� ������ �ȵȴ�. 
//																null point exception�����߻��� ������������ ���� ���� ����
						isLogin=true;
						indexCount=i;
						break;
					}
				}
				System.out.println(indexCount+":"+inputId+":"+id[indexCount]);
				
				if(isLogin) {
					//�α��� ����
					while(isLogin) {
					System.out.println(inputId+"���� �α��� �Ͽ����ϴ�.");
					System.out.println("1.�Ա� 2.��� 3.Ȯ�� 4.����\n>>");
					int selectNum=Integer.parseInt(sc.nextLine());
					switch(selectNum) {
					case 1:
						System.out.println("1.�Ա� \n�Ա��� �ݾ��� �Է�>>");
						account[indexCount]+=Integer.parseInt(sc.nextLine());
					System.out.println(inputId+"���� ���� �Աݾ� :"+account[indexCount]);
						
						break;
					case 2:
						System.out.println("2.��� \n����� �ݾ��� �Է�>>");
						account[indexCount]-=Double.parseDouble(sc.nextLine());
					System.out.println(inputId+"���� ���� �Աݾ� :"+account[indexCount]);
						
						break;
					case 3:
						System.out.println("3.Ȯ�� >>");
						System.out.println(inputId+"���� ���� �Աݾ� :"+account[indexCount]);
						break;
					case 4:
						System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
						inputId=null;
						isLogin=false;
						break;
					default:
						System.out.println("�߸��� �Է��Դϴ�.");
					}
				}
				
				}else {
					//�α��� ����
					inputId=null;
				}
				
				//�����ϴ� ����� indexCount�� �����ΰ�?
				
				
				
				
				
			}
		}
		

		
		
		
//		
//		//String loginId="
//		String loginId=null;
//		//loginId.equals(null)
//		//loginId.equals("null")
//		//loginId==null
//		
//		System.out.println(loginId.toString());
//		
//		
		
			

	}
}
	
