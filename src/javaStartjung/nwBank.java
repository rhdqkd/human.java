package javaStartjung;

public class nwBank {

	public static void main(String[] args) {
		// ���� ���ۼ�
		
		//id,passWord �ۼ�â
		//������ ���̵� ���Ӱ��� 1.id�߰�2.id����3.id��ü��ȸ4.Ư��id��ȸ5.��������
		//���� ���ӽ� �����̿밡�� 1.�Ա�2.���3.Ȯ��4.����
		//id�� exit �Է½� ���α׷� ���� 
		
		//�Լ�(x)
		
		java.util.Scanner sca =
				new java.util.Scanner(System.in);
		
		String id[] = new String[50];
		String pw[] = new String[50];
		String money[] = new String[50];
		
		id[0]= "admin"; pw[0]= "admin"; money[0]="0";
		id[1]= "a"; pw[1]= "111"; money[1]="100";
		int count =2;
		
		System.out.println("-�޸� ����-\n[����� idâ�� exit�� �Է��� �ּ���]");
		
		while(true) {
			System.out.println("id �Է�:");
			String idIn =sca.nextLine();
			if(idIn.equals("exit")) {    //����
				return;
			}
			System.out.println("pw �Է�:");
			String pwIn =sca.nextLine();
			
			for(int i=0; i<50;i++) {	
				if(id[i].equals(idIn)&&pw[i].equals(pwIn)) {
					System.out.println("���� �α��� �ϼ̽��ϴ�.");
					if(idIn.equals("admin")&&idIn.equals("admin")) {
						for(;;) {
							System.out.println("1.id�߰� 2.id���� 3.id��ü��ȸ 4.Ư��id��ȸ 5.��������");
							int adminNum =Integer.parseInt(sca.nextLine());
							switch(adminNum) {
							case 1:
								System.out.println("�߰��� id�� �Է��ϼ���");
								String idAdd =sca.nextLine();
								System.out.println("�߰��� pw�� �Է��ϼ���");
								String pwAdd =sca.nextLine();
								id[count]=idAdd; pw[count]=pwAdd;
								System.out.println("id�� ���������� �߰��Ǿ����ϴ�.\nid:"+id[count]+", pw:"+pw[count]);
								count++;
								break;
							case 2:
								System.out.println("������ id�� �Է��ϼ���");
								String idSub =sca.nextLine();
								//
				
								break;
							case 3:
								//��ü���̵���ȸ
								
								
								
								break;
							case 4:
								//Ư�����̵���ȸ
								
								
								
								break;
							case 5:
								//����
								System.out.println("�������� ���ư��ϴ�.");
								break;
								default:
									System.out.println("�߸��� �����Դϴ�.");
								}	
							}
					
					}else {
						System.out.println("1.�Ա� 2.��� 3.Ȯ�� 4.����");
						int userNum =Integer.parseInt(sca.nextLine());
						switch(userNum) {
						case 1:
							
							
							break;
						case 2:
							
							break;
						case 3:
							
							break;
						case 4:
							
							break;
							default:
								System.out.println("�߸��� �����Դϴ�.");
						}
					}
					
					
					
					
					
					
					
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
