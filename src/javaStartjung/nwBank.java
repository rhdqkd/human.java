package javaStartjung;

public class nwBank {

	public static void main(String[] args) {
		// 은행 재작성
		
		//id,passWord 작성창
		//관리자 아이디 접속가능 1.id추가2.id삭제3.id전체조회4.특정id조회5.메인으로
		//유저 접속시 은행이용가능 1.입금2.출금3.확인4.종료
		//id에 exit 입력시 프로그램 종료 
		
		//함수(x)
		
		java.util.Scanner sca =
				new java.util.Scanner(System.in);
		
		String id[] = new String[50];
		String pw[] = new String[50];
		String money[] = new String[50];
		
		id[0]= "admin"; pw[0]= "admin"; money[0]="0";
		id[1]= "a"; pw[1]= "111"; money[1]="100";
		int count =2;
		
		System.out.println("-휴먼 은행-\n[종료시 id창에 exit를 입력해 주세요]");
		
		while(true) {
			System.out.println("id 입력:");
			String idIn =sca.nextLine();
			if(idIn.equals("exit")) {    //종료
				return;
			}
			System.out.println("pw 입력:");
			String pwIn =sca.nextLine();
			
			for(int i=0; i<50;i++) {	
				if(id[i].equals(idIn)&&pw[i].equals(pwIn)) {
					System.out.println("님이 로그인 하셨습니다.");
					if(idIn.equals("admin")&&idIn.equals("admin")) {
						for(;;) {
							System.out.println("1.id추가 2.id삭제 3.id전체조회 4.특정id조회 5.메인으로");
							int adminNum =Integer.parseInt(sca.nextLine());
							switch(adminNum) {
							case 1:
								System.out.println("추가할 id를 입력하세요");
								String idAdd =sca.nextLine();
								System.out.println("추가할 pw를 입력하세요");
								String pwAdd =sca.nextLine();
								id[count]=idAdd; pw[count]=pwAdd;
								System.out.println("id가 성공적으로 추가되었습니다.\nid:"+id[count]+", pw:"+pw[count]);
								count++;
								break;
							case 2:
								System.out.println("삭제할 id를 입력하세요");
								String idSub =sca.nextLine();
								//
				
								break;
							case 3:
								//전체아이디조회
								
								
								
								break;
							case 4:
								//특정아이디조회
								
								
								
								break;
							case 5:
								//종료
								System.out.println("메인으로 돌아갑니다.");
								break;
								default:
									System.out.println("잘못된 접근입니다.");
								}	
							}
					
					}else {
						System.out.println("1.입금 2.출금 3.확인 4.종료");
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
								System.out.println("잘못된 접근입니다.");
						}
					}
					
					
					
					
					
					
					
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
