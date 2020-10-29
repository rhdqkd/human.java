package javaStartjung;


import java.util.Arrays;

import java.util.Scanner;

public class Java013 {

	public static void main(String[] args) {
		//여러사람이 이용할 수 있는 은행(배열 이용)
		//사용자 구분은 id로 보안을 위해서 password 사용자 이름 name
		//2개 제출 함수없이,함수이용
		
		
		//함수(x)
		
//		int tMoney =0;
//		int sum=0;
//	
//		java.util.Scanner sca =
//				new java.util.Scanner(System.in);
//		
//		String bank[] = {"홍길동","123f","0","홍길남","1010","0","홍길서","1111","0"};
//		for(;;) {
//			System.out.println("휴먼은행\n이름 입력:");
//			String name =sca.nextLine();
//			for(int id=0; id<9;id++) {
//				if(name.equals(bank[id])) {
//					System.out.println("비밀번호를 입력하세요:");
//					String password =sca.nextLine(); 
//						if(bank[id+1].equals(password)) {
//							System.out.println("로그인 완료");
//							for(int v=1; v>0;) {
//								System.out.println("0.종료 1.조회 2.입금 3.출금 4.관리자용 전체조회");
//								v =Integer.parseInt(sca.nextLine());
//								if(v==1) {
//									System.out.println(bank[id]+"님의 남은 잔액:"+bank[id+2]+"원");
//								}else if(v==2) {
//									System.out.println("입금금액:");
//									int money =Integer.parseInt(sca.nextLine());
//									sum = sum+money;
//									String sum1= String.valueOf(sum);
//									bank[id+2]=sum1;
//								}else if(v==3) {
//									System.out.println("출금금액:");
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
//					System.out.println("등록되지 않은 이름입니다.");
//					break;
//				}
//			
//			}
//		}	
		
		//함수(0)
		//관리자 권한 (계정추가, 계정삭제, 모든사용자 정보 확인 ,id로 특정 사용자 정보확인 ,종류(메뉴로 이동))
		//프로그램 종료시 id에 exit 입력.
		
	
		
		
		int userNum=2;
		
		java.util.Scanner sca =
				new java.util.Scanner(System.in);
		
		String id[] = new String[10];        //아이디 비밀번호  돈 배열 생성
		String passWord[] = new String[10];
		String money[] = new String[10];
			
		id[0] = "admin";    //어드민 추가
		passWord[0]="1111";
		
		id[1]="홍길동";		//임의로 사용자 추가
		passWord[1]="1234";
		
		
		for(;;) {
			System.out.println("휴먼은행\n-로그인-\n종료시 아이디에 exit를 입력해주세요."); //로그인후 아이디,비번 입력
			System.out.print("id>>");
			String idIn =sca.nextLine();
				if(idIn.equals("exit")) {
					return;
				}
			System.out.print("password>>");
			String passIn =sca.nextLine();
			
			   //로그인 확인	
			
			if(idIn.equals("admin")&&passIn.equals("1111")) { //관리자 로그인
				for(;;) {
				System.out.println("1.계정추가 2.계정삭제  3.모든사용자 정보 확인 4.사용자 정보확인 5.메뉴로\n>>");
				int number = Integer.parseInt(sca.nextLine());
					if(number==1) {
						System.out.println("추가할 계정 정보를 입력하세요 >> \n 아이디>>");
						String idAdd = sca.nextLine();
						System.out.println("비밀번호>>");
						String passAdd = sca.nextLine();
						userAdd(id,passWord,idAdd,passAdd,userNum);  //계정추가 함수
						userNum++;
					}else if(number==2) {
						System.out.println(Arrays.toString(id));
						System.out.println("삭제할 계정을 입력하세요>>");
						String idSub = sca.nextLine();
						userSub(id,passWord,idSub);   //계정 삭제 함수
					}else if(number==3) {
						System.out.println("모든 사용자 정보 확인>>");
						System.out.println("사용자 아이디:"+Arrays.toString(id));
						System.out.println("사용자 비밀번호:"+Arrays.toString(passWord));
					}else if(number==4) {
						System.out.println("사용자 정보 확인\n 검색할 아이디 입력>>");
						String idCheck = sca.nextLine();
						usCheck(id,passWord,idCheck);		//특정 사용자 정보확인 함수
					}else if(number==5) {
						System.out.println("시작지점으로 이동>>");
						break;
					}
			
				}
			}else {
				userFunc(id,passWord,idIn,passIn);
				if() {
					System.out.println(idIn+"님이 로그인하셨습니다.");
					for(int i=1; i>0;){
						System.out.println("1.조회 2.입금 3.출금 4.메인메뉴로");
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
		// 로그인 확인
		for(int i=1;i>0; i++ ) {
			if(id[i].equals(idIn)||passWord[i].equals(passIn)){
				return true;
			}else {
				System.out.println("로그인 실패\n(아이디나 비밀번호가 일치하지 않습니다.)");
				return false;
			}
		} 
		
	}

	private static void usCheck(String[] id, String[] passWord, String idCheck) {
		// 특정 계정 검색
		for(int i=1;i>0; i++ ) {
			if(id[i].equals(idCheck)){
				System.out.println("검색완료\n아이디:"+id[i]+"\n비밀번호:"+passWord[i]);
				break;
			}
		}
		
		
		
	}

	private static void userSub(String[] id, String[] passWord, String idSub) {
		// 계정 삭제
		for(int i=1;i>0; i++ ) {
			if(id[i].equals(idSub)){
				id[i]="0";
				passWord[i]="0";
				System.out.println(idSub+"계정이 삭제되었습니다.");
				break;
			}
		}
		
	}

	private static void userAdd(String[] id, String[] passWord, String idAdd, String passAdd,int userNum) {
		// 계정추가
			id[userNum]=idAdd;
			passWord[userNum]=passAdd;
	}

	

	
			
		
			
		
		
	

	

	

	

	
}

