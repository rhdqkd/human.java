package javaStartjung;


import java.util.Arrays;

import java.util.Scanner;

public class Java013 {

	public static void main(String[] args) {
		//��������� �̿��� �� �ִ� ����(�迭 �̿�)
		//����� ������ id�� ������ ���ؼ� password ����� �̸� name
		//2�� ���� �Լ�����,�Լ��̿�
		
		
		//�Լ�(x)
		
//		int tMoney =0;
//		int sum=0;
//	
//		java.util.Scanner sca =
//				new java.util.Scanner(System.in);
//		
//		String bank[] = {"ȫ�浿","123f","0","ȫ�泲","1010","0","ȫ�漭","1111","0"};
//		for(;;) {
//			System.out.println("�޸�����\n�̸� �Է�:");
//			String name =sca.nextLine();
//			for(int id=0; id<9;id++) {
//				if(name.equals(bank[id])) {
//					System.out.println("��й�ȣ�� �Է��ϼ���:");
//					String password =sca.nextLine(); 
//						if(bank[id+1].equals(password)) {
//							System.out.println("�α��� �Ϸ�");
//							for(int v=1; v>0;) {
//								System.out.println("0.���� 1.��ȸ 2.�Ա� 3.��� 4.�����ڿ� ��ü��ȸ");
//								v =Integer.parseInt(sca.nextLine());
//								if(v==1) {
//									System.out.println(bank[id]+"���� ���� �ܾ�:"+bank[id+2]+"��");
//								}else if(v==2) {
//									System.out.println("�Աݱݾ�:");
//									int money =Integer.parseInt(sca.nextLine());
//									sum = sum+money;
//									String sum1= String.valueOf(sum);
//									bank[id+2]=sum1;
//								}else if(v==3) {
//									System.out.println("��ݱݾ�:");
//									int money =Integer.parseInt(sca.nextLine());
//									sum = sum-money;
//									String sum1= String.valueOf(sum);
//									bank[id+2]=sum1;
//								}else if(v==4) {
//									System.out.println(Arrays.toString(bank));
//								}
//							}
//						}
//					
//				}else {
//					System.out.println("��ϵ��� ���� �̸��Դϴ�.");
//					break;
//				}
//			
//			}
//		}	
		
		//�Լ�(0)
		//������ ���� (�����߰�, ��������, ������� ���� Ȯ�� ,id�� Ư�� ����� ����Ȯ�� ,����(�޴��� �̵�))
		//���α׷� ����� id�� exit �Է�.
		
	
		
		
		int userNum=2;
		
		java.util.Scanner sca =
				new java.util.Scanner(System.in);
		
		String id[] = new String[10];        //���̵� ��й�ȣ  �� �迭 ����
		String passWord[] = new String[10];
		String money[] = new String[10];
			
		id[0] = "admin";    //���� �߰�
		passWord[0]="1111";
		
		id[1]="ȫ�浿";		//���Ƿ� ����� �߰�
		passWord[1]="1234";
		
		
		for(;;) {
			System.out.println("�޸�����\n-�α���-\n����� ���̵� exit�� �Է����ּ���."); //�α����� ���̵�,��� �Է�
			System.out.print("id>>");
			String idIn =sca.nextLine();
				if(idIn.equals("exit")) {
					return;
				}
			System.out.print("password>>");
			String passIn =sca.nextLine();
			
			   //�α��� Ȯ��	
			
			if(idIn.equals("admin")&&passIn.equals("1111")) { //������ �α���
				for(;;) {
				System.out.println("1.�����߰� 2.��������  3.������� ���� Ȯ�� 4.����� ����Ȯ�� 5.�޴���\n>>");
				int number = Integer.parseInt(sca.nextLine());
					if(number==1) {
						System.out.println("�߰��� ���� ������ �Է��ϼ��� >> \n ���̵�>>");
						String idAdd = sca.nextLine();
						System.out.println("��й�ȣ>>");
						String passAdd = sca.nextLine();
						userAdd(id,passWord,idAdd,passAdd,userNum);  //�����߰� �Լ�
						userNum++;
					}else if(number==2) {
						System.out.println(Arrays.toString(id));
						System.out.println("������ ������ �Է��ϼ���>>");
						String idSub = sca.nextLine();
						userSub(id,passWord,idSub);   //���� ���� �Լ�
					}else if(number==3) {
						System.out.println("��� ����� ���� Ȯ��>>");
						System.out.println("����� ���̵�:"+Arrays.toString(id));
						System.out.println("����� ��й�ȣ:"+Arrays.toString(passWord));
					}else if(number==4) {
						System.out.println("����� ���� Ȯ��\n �˻��� ���̵� �Է�>>");
						String idCheck = sca.nextLine();
						usCheck(id,passWord,idCheck);		//Ư�� ����� ����Ȯ�� �Լ�
					}else if(number==5) {
						System.out.println("������������ �̵�>>");
						break;
					}
			
				}
			}else {
				userFunc(id,passWord,idIn,passIn);
				if() {
					System.out.println(idIn+"���� �α����ϼ̽��ϴ�.");
					for(int i=1; i>0;){
						System.out.println("1.��ȸ 2.�Ա� 3.��� 4.���θ޴���");
						i =Integer.parseInt(sca.nextLine());
						if(i==1) {
							System.out.println(5);
						}else if(i==2) {
							
						}else if(i==3) {
							
						}else {
							break;
						}
					}
					
				}
				
			}
		}
			
			
			
			
			
			
				
		
	}

	private static void userFunc(String[] id, String[] passWord, String idIn, String passIn) {
		// �α��� Ȯ��
		for(int i=1;i>0; i++ ) {
			if(id[i].equals(idIn)||passWord[i].equals(passIn)){
				return true;
			}else {
				System.out.println("�α��� ����\n(���̵� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.)");
				return false;
			}
		} 
		
	}

	private static void usCheck(String[] id, String[] passWord, String idCheck) {
		// Ư�� ���� �˻�
		for(int i=1;i>0; i++ ) {
			if(id[i].equals(idCheck)){
				System.out.println("�˻��Ϸ�\n���̵�:"+id[i]+"\n��й�ȣ:"+passWord[i]);
				break;
			}
		}
		
		
		
	}

	private static void userSub(String[] id, String[] passWord, String idSub) {
		// ���� ����
		for(int i=1;i>0; i++ ) {
			if(id[i].equals(idSub)){
				id[i]="0";
				passWord[i]="0";
				System.out.println(idSub+"������ �����Ǿ����ϴ�.");
				break;
			}
		}
		
	}

	private static void userAdd(String[] id, String[] passWord, String idAdd, String passAdd,int userNum) {
		// �����߰�
			id[userNum]=idAdd;
			passWord[userNum]=passAdd;
	}

	

	
			
		
			
		
		
	

	

	

	

	
}

