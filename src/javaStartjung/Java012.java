//package javaStartjung;
//import java.util.ArrayList;
//import java.util.Collections;
//public class Java012 {
//
//	public static void main(String[] args) {
//		
//
//		// 1.�迭�� 5���� ���ڸ� �Է¹޾� ���� ���� ���� �ϳ��� �Է¹޾� �ش� ���ڰ� ���° �ε����� ��� �ִ��� ����ϴ� ���α׷�
//		
////		int arr[]=new int[5];
////		
////		for(int i=0;i<5;i++) {
////			System.out.println("�迭�� ���� �����Է�("+i+"):");
////			int j= Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
////			arr[i]=j;
////			System.out.println(arr[i]);
////		}
////		System.out.println("ã�� ���ڸ� �Է��ϼ���.");
////		int num1= Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
////		for(int i=0; i<5; i++) {
////			if(arr[i]==num1) {
////				System.out.println("�ش� ���ڴ� "+i+"��° �����̴�.");
////			}
////		}
//		
//		
//		//3.�迭 ũ�⸦ �Է¹޾� �迭 ũ�� ��ŭ 1,2,3,1,2,3,1,2,3 �� ���ڸ� ������� �迭�ȿ� �������� �迭�� ������ ���
//		
////		System.out.println("�迭ũ�� �Է�:");
////		int i=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
////		
////		int arr1[]= new int[i];
////		
////		int a=0;
////		
////		for(int j=0; j<arr1.length; j++) {
////			if(a==0) {
////				arr1[j]=1;
////				a++;
////			}else if(a==1){
////				arr1[j]=2;
////				a++;
////			}else {
////				arr1[j]=3;
////				a=0;
////			}
////		}
////		for(int b=0;b<arr1.length; b++) {
////			System.out.println(arr1[b]);
////		}
//		
//		
//		//4.�迭�� ����ִ� ������ ������ �������� �����ϴ� ���ο� �迭�� ����� ���
//		//ex)�迭�� 1,2,3�� ��� ������ 1,2,3,3,2,1 �� ��� �ִ� �迭
//		//ex)�迭�� 7,15,23,15,23 �� ��� ������ 23,15,23,15,7,7,15,23,15,23 �� ��� �ִ� �迭
//	
////		java.util.Scanner sca =
////				new java.util.Scanner(System.in);
////		
////		ArrayList<String> arr1 = new ArrayList<>();
////		ArrayList<String> arr2 = new ArrayList<>();
////		int v=1;
////		
////		
////		for(int a=1;v>0;a++) {
////			System.out.println("�迭 ��������\n 0.����Ϸ� 1.�����߰��ϱ�");
////			v=Integer.parseInt(sca.nextLine());
////			if(v>0) {
////				System.out.println("�迭�� ���� �����Է�("+a+"):");
////				String j=sca.nextLine();
////				arr1.add(j);
////			}
////			
////		}
////		
////			
////			System.out.print(arr1);
////			
////			Collections.reverse(arr1); 
////
////			System.out.println(arr1);
////
////			
//		
//		
//		
//		//collection
//		
//		
//		//5.�迭 1,2,3,4,5,6,7,8,9 ���� �̵�����, �̵�ĭ��, ä����ڸ� �Է� �޾� �迭�� ������ ������ ���
//		//ex)�Է� ���� 3 2 			��� 4,5,6,7,8,9,2,2,2
//		//ex)�Է� ������ 3 4 		��� 4,4,4,1,2,3,4,5,6
//		
////		java.util.Scanner sca =
////				new java.util.Scanner(System.in);
////		
////		int arr1[] = {1,2,3,4,5,6,7,8,9};		
////		int l=8;
////		int r=0;
////		
////		System.out.println("�̵����� 1.���� 2.������ >>");
////		int dir1=Integer.parseInt(sca.nextLine());
////		System.out.println("�̵�ĭ��:");
////		int move=Integer.parseInt(sca.nextLine());
////		System.out.println("ä�����:");
////		int number=Integer.parseInt(sca.nextLine());
////		
////		while(move>0) {
////			if(dir1==1) {
////				arr1[l]=number;
////				l--;
////			}else {
////				arr1[r]=number;
////				r++;
////			}
////			move--;
////		}
////		
////		for(int b=0;b<arr1.length; b++) {
////			System.out.print(arr1[b]+",");
////		}
//		
//		//6.�迭 1,2,3,4,5,6,7,8,9 ���� ȸ������� ȸ���� �Է¹޾� �迭 ������ ȸ����Ű�� ���
//		//ex)�Է� ���� 2		     ��� 3,4,5,6,7,8,9,1,2
//		//ex)�Է� ������ 3		     ��� 7,8,9,1,2,3,4,5,6
//		
//		
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		int l=8;
//		int r=0;
//		java.util.Scanner sca =
//				new java.util.Scanner(System.in);
//		
//		System.out.println("ȸ������ 1.���� 2.������ >>");
//		int dir1=Integer.parseInt(sca.nextLine());
//		System.out.println("�̵� Ƚ��:");
//		int move=Integer.parseInt(sca.nextLine());
//		
//		for(move>0) {
//			if(dri==1) {
//				
//			}else {
//				
//			}
//			move--;
//		}
//		
//		
//		
//		
//		
//		
//		//7.�迭�� 100�� �����Ͽ� 0~99���� ���� ���� i=2 ���� 50���� i�� ������ i�� ����� 
//		//���� �ε����� 0�� ���� ���� �迭�� 0�� �ƴ� ���� ���,��� ����� ��� �Ҽ��ε� ������ ������ ����.
//		//ex)i�� 2�̸� 2�� ������ 2�� ����� 4,6,8,10,12,14,16�� ���� �ְ� �ش� �ε����� 0�� ������ȴ�.
//		//ex)i�� 3�̸� 3�� ������ 3�� ����� 6,9,12,15,18�� ���� �ְ� �ش� �ε����� 0�� ������ȴ�.
//		
////		int v=2;
////		System.out.println("�����Է�:");
////		int num =Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
////		
////		int arr1[]= new int[100];
////		
////		
////		for(int i=0; i<100;i++) {
////			arr1[i]=i;
////		}
////		for(int j=num; j<=50;j++) {
////			if(j%num==0) {
////				arr1[v]=0;
////			}else {
////				System.out.println(arr1[j]);
////			}
////			v++;
////		}
//		
//		
//		//8.��ǻ�Ϳ��� �ֻ��������� ���α׷��� �����Ͽ����� ������ ���¼��� ��(ȸ��)�� ���ϴ� ���α׷��� �ۼ�
//	
////		double sum=0.0;
////		int count=0;
////		
////		int a1=0;
////		int a2=0;
////		int a3=0;
////		int a4=0;
////		int a5=0;
////		int a6=0;
////		
////		
////		System.out.println("�ֻ��� ������>>");
////		for(int i=1;i>0;) {
////			System.out.println("0.���� \n1.�ֻ��� ������");
////			i=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
////			int dice = (int)(Math.random()*6+1);
////			System.out.println(dice);
////			count++;
////			switch (dice) {
////				case 1:
////					a1++;
////					sum = (double)a1/count*100;
////					System.out.println("�ֻ����� 1 Ȯ��:"+sum+"%");
////				break;
////				case 2:
////					a2++;
////					sum = (double)a2/count*100;
////					System.out.println("�ֻ����� 2 Ȯ��:"+sum+"%");
////				break;
////				case 3:
////					a3++;
////					sum = (double)a3/count*100;
////					System.out.println("�ֻ����� 3 Ȯ��:"+sum+"%");
////				break;
////				case 4:
////					a4++;
////					sum = (double)a4/count*100;
////					System.out.println("�ֻ����� 4 Ȯ��:"+sum+"%");
////				break;
////				case 5:
////					a5++;
////					sum = (double)a5/count*100;
////					System.out.println("�ֻ����� 5 Ȯ��:"+sum+"%");
////				break;
////				case 6:
////					a6++;
////					sum = (double)a6/count*100;
////					System.out.println("�ֻ����� 6 Ȯ��:"+sum+"%");
////				break;
////				}
////			
////		}
//		
//		
//		//9.50���� �л��� �⼮ ������  �����ϴ� �Ʒ��� ���� �޴��� ���� ���α׷�
//		//�޴�: 1.��ü �⼮���� 2.�Ἦ�� �߰� 3.�⼮�� �߰� 4.������ �߰� 5.������ �߰� 6.���α׷� ����
//
////		java.util.Scanner sca =
////				new java.util.Scanner(System.in);
////		
////		ArrayList<String> arr1 = new ArrayList<>();
////		int j=0;
////		
////		for(int i=0; i<6;) {
////			System.out.println("�޴� :\n1.��ü�⼮���� 2.�Ἦ�� �߰� "
////				+ "3.�⼮�� �߰� 4.������ �߰� 5.������ �߰�  6.���α׷� ����\n>>");
////			i=Integer.parseInt(sca.nextLine());
////			switch (i) {
////			case 1:
////				System.out.println("1.��ü �⼮����-");
////				System.out.println(arr1);
////			break;
////			case 2:
////				if(j<50) {
////					System.out.println("2.�Ἦ�� �߰�-");
////					arr1.add("�Ἦ�� :"+sca.nextLine());
////					j++;
////				}else {
////					System.out.println("���̻� �л��� �߰��� �� �����ϴ�.");
////				}
////				break;
////			case 3:
////				if(j<50) {
////					System.out.println("3.�⼮�� �߰�-");
////					arr1.add("�⼮�� :"+sca.nextLine());
////					j++;
////				}else {
////					System.out.println("���̻� �л��� �߰��� �� �����ϴ�.");
////				}
////				break;
////			case 4:
////				if(j<50) {
////					System.out.println("4.������ �߰�-");
////					arr1.add("������ :"+sca.nextLine());
////					j++;
////				}else {
////					System.out.println("���̻� �л��� �߰��� �� �����ϴ�.");
////				}
////				break;
////			case 5:
////				if(j<50) {
////					System.out.println("5.������ �߰�-");
////					arr1.add("������ :"+sca.nextLine());
////					j++;
////				}else {
////					System.out.println("���̻� �л��� �߰��� �� �����ϴ�.");
////				}
////				break;
////			}
////			
////		
////		}
////		
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}
