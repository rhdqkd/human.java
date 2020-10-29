//package javaStartjung;
//import java.util.ArrayList;
//import java.util.Collections;
//public class Java012 {
//
//	public static void main(String[] args) {
//		
//
//		// 1.배열에 5개의 숫자를 입력받아 넣은 다음 숫자 하나를 입력받아 해당 숫자가 몇번째 인덱스에 들어 있는지 출력하는 프로그램
//		
////		int arr[]=new int[5];
////		
////		for(int i=0;i<5;i++) {
////			System.out.println("배열에 넣을 숫자입력("+i+"):");
////			int j= Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
////			arr[i]=j;
////			System.out.println(arr[i]);
////		}
////		System.out.println("찾을 숫자를 입력하세요.");
////		int num1= Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
////		for(int i=0; i<5; i++) {
////			if(arr[i]==num1) {
////				System.out.println("해당 숫자는 "+i+"번째 숫자이다.");
////			}
////		}
//		
//		
//		//3.배열 크기를 입력받아 배열 크기 만큼 1,2,3,1,2,3,1,2,3 … 숫자를 순서대로 배열안에 넣은다음 배열의 내용을 출력
//		
////		System.out.println("배열크기 입력:");
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
//		//4.배열에 들어있는 내용을 정순과 역순으로 저장하는 새로운 배열을 만들어 출력
//		//ex)배열에 1,2,3이 들어 있으면 1,2,3,3,2,1 이 들어 있는 배열
//		//ex)배열에 7,15,23,15,23 이 들어 있으면 23,15,23,15,7,7,15,23,15,23 이 들어 있는 배열
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
////			System.out.println("배열 숫자저장\n 0.저장완료 1.숫자추가하기");
////			v=Integer.parseInt(sca.nextLine());
////			if(v>0) {
////				System.out.println("배열에 넣을 숫자입력("+a+"):");
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
//		//5.배열 1,2,3,4,5,6,7,8,9 에서 이동방향, 이동칸수, 채울수자를 입력 받아 배열의 내용을 변경후 출력
//		//ex)입력 왼쪽 3 2 			결과 4,5,6,7,8,9,2,2,2
//		//ex)입력 오른쪽 3 4 		결과 4,4,4,1,2,3,4,5,6
//		
////		java.util.Scanner sca =
////				new java.util.Scanner(System.in);
////		
////		int arr1[] = {1,2,3,4,5,6,7,8,9};		
////		int l=8;
////		int r=0;
////		
////		System.out.println("이동방향 1.왼쪽 2.오른쪽 >>");
////		int dir1=Integer.parseInt(sca.nextLine());
////		System.out.println("이동칸수:");
////		int move=Integer.parseInt(sca.nextLine());
////		System.out.println("채울숫자:");
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
//		//6.배열 1,2,3,4,5,6,7,8,9 에서 회전방향과 회수를 입력받아 배열 내용을 회전시키고 출력
//		//ex)입력 왼쪽 2		     결과 3,4,5,6,7,8,9,1,2
//		//ex)입력 오른쪽 3		     결과 7,8,9,1,2,3,4,5,6
//		
//		
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		int l=8;
//		int r=0;
//		java.util.Scanner sca =
//				new java.util.Scanner(System.in);
//		
//		System.out.println("회전방향 1.왼쪽 2.오른쪽 >>");
//		int dir1=Integer.parseInt(sca.nextLine());
//		System.out.println("이동 횟수:");
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
//		//7.배열을 100개 선언하여 0~99까지 넣은 다음 i=2 부터 50까지 i를 제외한 i의 배수와 
//		//같은 인덱스에 0를 넣은 다음 배열에 0이 아닌 수를 출력,출력 결과가 모두 소수인데 이유를 생각해 보자.
//		//ex)i가 2이면 2를 제외한 2의 배수는 4,6,8,10,12,14,16… 등이 있고 해당 인덱스에 0를 넣으면된다.
//		//ex)i가 3이면 3를 제외한 3의 배수는 6,9,12,15,18… 등이 있고 해당 인덱스에 0를 넣으면된다.
//		
////		int v=2;
////		System.out.println("숫자입력:");
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
//		//8.컴퓨터에서 주사위던지는 프로그램을 구현하였을때 던져서 나온수의 빈도(회수)를 구하는 프로그램을 작성
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
////		System.out.println("주사위 던지기>>");
////		for(int i=1;i>0;) {
////			System.out.println("0.종료 \n1.주사위 던지기");
////			i=Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
////			int dice = (int)(Math.random()*6+1);
////			System.out.println(dice);
////			count++;
////			switch (dice) {
////				case 1:
////					a1++;
////					sum = (double)a1/count*100;
////					System.out.println("주사위눈 1 확률:"+sum+"%");
////				break;
////				case 2:
////					a2++;
////					sum = (double)a2/count*100;
////					System.out.println("주사위눈 2 확률:"+sum+"%");
////				break;
////				case 3:
////					a3++;
////					sum = (double)a3/count*100;
////					System.out.println("주사위눈 3 확률:"+sum+"%");
////				break;
////				case 4:
////					a4++;
////					sum = (double)a4/count*100;
////					System.out.println("주사위눈 4 확률:"+sum+"%");
////				break;
////				case 5:
////					a5++;
////					sum = (double)a5/count*100;
////					System.out.println("주사위눈 5 확률:"+sum+"%");
////				break;
////				case 6:
////					a6++;
////					sum = (double)a6/count*100;
////					System.out.println("주사위눈 6 확률:"+sum+"%");
////				break;
////				}
////			
////		}
//		
//		
//		//9.50명의 학생의 출석 사항을  저장하는 아래와 같은 메뉴를 가진 프로그램
//		//메뉴: 1.전체 출석사항 2.결석자 추가 3.출석자 추가 4.조퇴자 추가 5.지각자 추가 6.프로그램 종료
//
////		java.util.Scanner sca =
////				new java.util.Scanner(System.in);
////		
////		ArrayList<String> arr1 = new ArrayList<>();
////		int j=0;
////		
////		for(int i=0; i<6;) {
////			System.out.println("메뉴 :\n1.전체출석사항 2.결석자 추가 "
////				+ "3.출석자 추가 4.조퇴자 추가 5.지각자 추가  6.프로그램 종료\n>>");
////			i=Integer.parseInt(sca.nextLine());
////			switch (i) {
////			case 1:
////				System.out.println("1.전체 출석사항-");
////				System.out.println(arr1);
////			break;
////			case 2:
////				if(j<50) {
////					System.out.println("2.결석자 추가-");
////					arr1.add("결석자 :"+sca.nextLine());
////					j++;
////				}else {
////					System.out.println("더이상 학생을 추가할 수 없습니다.");
////				}
////				break;
////			case 3:
////				if(j<50) {
////					System.out.println("3.출석자 추가-");
////					arr1.add("출석자 :"+sca.nextLine());
////					j++;
////				}else {
////					System.out.println("더이상 학생을 추가할 수 없습니다.");
////				}
////				break;
////			case 4:
////				if(j<50) {
////					System.out.println("4.조퇴자 추가-");
////					arr1.add("조퇴자 :"+sca.nextLine());
////					j++;
////				}else {
////					System.out.println("더이상 학생을 추가할 수 없습니다.");
////				}
////				break;
////			case 5:
////				if(j<50) {
////					System.out.println("5.지각자 추가-");
////					arr1.add("지각자 :"+sca.nextLine());
////					j++;
////				}else {
////					System.out.println("더이상 학생을 추가할 수 없습니다.");
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
