package javaStartjung;
import java.text.Format;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;
public class Java011 {

	public static void main(String[] args) {
		//별찍기
		//1
//			for(int i=0;i<5; i++) {
//				for(int j=0; j<i;j++) {
//					System.out.print("*");
//				}
//				System.out.println("");
//			}
//		
		
		
		//2
		
//			for(int i=0;i<5; i++) {
//				for(int j=5; j>i;j--) {
//					System.out.print(" ");
//				}
//				for(int j=0;j<i;j++) {
//					System.out.print("*");
//				}
//				System.out.println("");
//			}
			
			
			
		//3
		
//		for(int i=0;i<5; i++) {
//			for(int j=5; j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//4
		
//		for(int i=0;i<5; i++) {
//			for(int j=0; j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=5; j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			
//		}
		
		
		
		
		//5
		
//	for(int i=0;i<6; i++) {
//		for(int j=0; j<i;j++) {
//			System.out.print("*");
//		}
//		System.out.println("");
//	}
//	for(int i=0;i<6; i++) {
//		for(int j=6; j>i;j--) {
//			System.out.print("*");
//		}
//		System.out.println("");
//	}
//	
		//6
//	for(int i=0;i<6; i++) {
//		for(int j=6; j>i;j--) {
//			System.out.print(" ");
//		}
//		for(int j=0;j<i;j++) {
//			System.out.print("*");
//		}
//		System.out.println("");
//	}
//		for(int i=0;i<6; i++) {
//			for(int j=0; j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=6; j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			
//		}
	
	
	
		//7
		
//		for(int i=0; i<5; i++) {
//			for(int j=5; j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=1; i<5; i++) {
//			for(int j=0; j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
		
		//8
		
//		for(int i=0;i<6; i++) {
//			for(int j=0; j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=6; j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=1;i<6; i++) {
//			for(int j=5; j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//9
		
//		for(int i=0; i<5; i++) {
//			for(int j=5; j>i;j--) {
//				System.out.print("*");
//			}
//			for(int j=-2; j<i*2-1;j++ ) {
//				System.out.print(" ");
//			}
//			for(int j=5; j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=1; i<5; i++) {
//			for(int j=0; j<=i;j++) {
//				System.out.print("*");
//			}
//			for(int j=8; j>i*2-1;j-- ) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		
		//10
		
//		for(int i=0; i<5;i++) {
//			for(int j=5; j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int j=-2; j<i*2-1;j++ ) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		
		
		
		//11
		
//		for(int i=0; i<5;i++) {
//			for(int j=0; j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=8; j>i*2-1;j-- ) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		//12
		
//		for(int i=0; i<5;i++) {
//			for(int j=0; j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=8; j>i*2-1;j-- ) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		for(int i=0; i<4;i++) {
//			for(int j=3; j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int j=-4; j<i*2-1;j++ ) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		//13
//		for(int i=0;i<6; i++) {
//			for(int j=0; j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<6;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=0;i<6; i++) {
//			for(int j=6; j>i;j--) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<6;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
		
		
		//14
//		int a=-1;
//		int j=0;
//		for(int i=0; i<6;i++) {
//			for(j=6; j>i;j--) {
//				System.out.print(" ");
//			}
//			for(j=-1; j<i*2-1;j++ ) {
//				if(j==-1) {
//					System.out.print("*");
//				}
//				System.out.print(" ");
//				if(j==a) {
//					System.out.print("*");
//					a=a+2;
//					j++;
//				}
//			}
//			if(j==-1) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=0; i<13;i++) {
//			System.out.print("*");
//			
//		}
		
		
		
		
		//15
//		int a=0;
//
//		for(int i=0; i<5;i++) {
//			for(int j=0; j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=9; j>i*2-1;j-- ) {
//				if (j==9) {
//					System.out.print("*");
//					
//				}else {
//				System.out.print(" ");
//				}
//				if(j==a) {
//					a=a+2;
//					j++;
//					System.out.print("*");
//				}
//			}
//			System.out.println(" ");
//		}
//		
//		a=-1;
//		int j=0;
//		
//		for(int i=0; i<6;i++) {
//			for(j=6; j>i;j--) {
//				System.out.print(" ");
//			}
//			for(j=-1; j<i*2-1;j++ ) {
//				if(j==-1) {
//					System.out.print("*");
//				}
//				System.out.print(" ");
//				if(j==a) {
//					System.out.print("*");
//					a=a+2;
//					j++;
//				}
//			}
//			if(j==-1) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		
		
//			1.369게임 해답지를 만들어 보자.
//		1부터 순서대로 숫자를 출력 하다가 숫자에 3,6,9중에 하나라도 들어가면박수를 치면 된다.
//		1,2,짝,4,5,짝,7,8,짝,10,11,12,짝,14.....
//		그런데 만약 33, 36같이 두개가 들어가면 박수를 두번 친다.
//		27,28,짝(29),짝(30),짝(31),짝(32),짝짝(33)
//		1000이하의 정답지를 출력하는 프로그램을 만들어 보자.
	
		
		



		
		
		
		
	
		
		
		
		
//		2. 랜덤하게 덧셈,뺄셈,곱셈,나눗셈 문제를 내서 사용자가 맞추는 프로그램을 구현해 보자.
//		레벨이 4단계로 되어 있어 처음에는 더하기 문제만 나오다가 레벨이 업되면 
//		뺄셈,곱셈,나눗셈을 차례대로 추가하여 문제가 나오도록 해보자. 2자리 이하 정수 계산만 하자.

//		int ans=0;
//		int ran1=0;
//		int ran2=0;
//		int sum=0;
//		int v =0;
//		
//		int lev2 =0;
//		int lev3 =0;
//		int lev4 =0;
//		
//		String arr[]= {"+","-","*","/"};
//		
//		System.out.println("사칙연산 게임" );
//		
//		for(int i=1; i>0;) {
//			
//		ran1 = (int)(Math.random() * 50 +50);
//		ran2 = (int)(Math.random() * 50 +0);
//		
//		lev2 = (int)(Math.random() * 2 + 0);
//		lev3 = (int)(Math.random() * 3 + 0);
//		lev4 = (int)(Math.random() * 4 + 0);
//		
//		if(i==1) {
//			sum = ran1+ran2;
//			System.out.print(ran1+"+"+ran2+"=");
//			ans = Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//		}else if(i==2) {
//			System.out.print(ran1+""+arr[lev2]+""+ran2+"=");
//			ans = Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//				if(lev2==0) {
//					sum = ran1+ran2;
//				}else {
//					sum =ran1-ran2;
//				}
//		}else if(i==3) {
//			System.out.print(ran1+""+arr[lev3]+""+ran2+"=");
//			ans = Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//				if(lev3==0) {
//					sum = ran1+ran2;
//				}else if(lev3==1){
//					sum =ran1-ran2;
//				}else {
//					sum = ran1*ran2;
//				}
//			
//		}else if(i==4) {
//			System.out.print(ran1+""+arr[lev4]+""+ran2+"=");
//			ans = Integer.parseInt((new java.util.Scanner(System.in)).nextLine());
//				if(lev4==0) {
//					sum = ran1+ran2;
//				}else if(lev4==1){
//					sum =ran1-ran2;
//				}else if(lev4==2) {
//					sum = ran1*ran2;
//				}else {
//					sum = ran1/ran2;
//				}
//		}
//		
//		
//		if(sum==ans) {
//					v++;
//					System.out.println("맞춘개수:"+v);
//				}		
//		
//		
//		if(v==5) {
//			i++;
//			System.out.println("레벨업!\n2단계----------\n0.게임종료");
//		}else if(v==10) {
//			i++;
//			System.out.println("레벨업!\n3단계----------\n0.게임종료");
//		}else if(v==15) {
//			i++;
//			System.out.println("레벨업!\n4단계----------\n0.게임종료");
//		}

//		}
		
		
		
//		3.요금 계산하는 프로그램을 구현,여러번 입력 받아 여러 사람을 계산할 수 있는 방법으로  구현해보자.

//		java.util.Scanner sca =
//				new java.util.Scanner(System.in);
//		
//		int human=0;
//		int ticket=0;
//		int mo=0;
//		int hu=0;
//		
//		List arr= new ArrayList();
//		
//		
//		for(int i=1; i>0;) {
//			System.out.println("-이용권 이용 고객 -\n1.대인 2.청소년 3.소인 \n입력:");
//			human = Integer.parseInt(sca.nextLine());
//			System.out.println("-이용권 이용권 종류-\n1.주간권(1일) 2.오후권(오후3시~) 3.윈터야간권(오후5시~) 4.이틀권\n입력:");
//			ticket = Integer.parseInt(sca.nextLine());
//			if(human==1||ticket==1) {
//				mo += 46000;
//				arr.add("주간권 ,대인 :46,000원");
//			}else if(human==2||ticket==1) {
//				mo+=39000;
//				arr.add("주간권 ,청소년 :39,000원");
//			}else if(human==3||ticket==1) {
//				mo +=36000;
//				arr.add("주간권 ,소인 :36,000원");
//			}else if(human==1||ticket==2) {
//				mo += 38000;
//				arr.add("오후권 ,대인 :38,000원");
//			}else if(human==2||ticket==2) {
//				mo+=32000;
//				arr.add("오후권 ,청소년 :32,000원");
//			}else if(human==3||ticket==2) {
//				mo +=29000;
//				arr.add("오후권 ,소인 :29,000원");
//			}else if(human==1||ticket==3) {
//				mo += 36000;
//				arr.add("윈터야간권 ,대인 :36,000원");
//			}else if(human==2||ticket==3) {
//				mo+=29000;
//				arr.add("윈터야간권 ,청소년 :29,000원");
//			}else if(human==3||ticket==3) {
//				mo +=16000;
//				arr.add("윈터야간권 ,소인 :16,000원");
//			}else if(human==1||ticket==4) {
//				mo += 74000;
//				arr.add("이틀권 ,대인 :74,000원");
//			}else if(human==2||ticket==4) {
//				mo+=62000;
//				arr.add("이틀권 ,청소년 :62,000원");
//			}else if(human==3||ticket==4) {
//				mo +=58000;
//				arr.add("이틀권 ,소인 :58,000원");
//			}
//			hu++;
//			
//			System.out.println("입력인원수 "+hu+"\n 0.총 이용권 요금계산 1.추가입력 ");
//			i = Integer.parseInt(sca.nextLine());
//		}
//		
//		for(int a=0; a<arr.size();a++) {
//			System.out.println(arr.get(a));
//		}
//		
//		Format formatter = new DecimalFormat("###,###");
//		System.out.println("총 금액"+formatter.format(mo));
		
		
		
		
		
		
		
//		4.컴퓨터가 임의로 정한 하나의 숫자를 맞추는 프로그램을 만들어 보자. 
//		사용자가 입력한 숫자가 임의의 숫자랑 같지 않다면 
//		사용자가 숫자를 맞출 수 있도록 큰지 작은지 힌트를 줘서 사용자가 맞출수 있도록 해준다.
//		정답을 맞추면 정답을 맞췄다는 메시지와 함께 총 몇회에 도전끝에 맞췄는지 출력해보자.
//		사용자가 “종료”를 입력할때 까지 무한 반복하는 프로그램을 3가지 방법으로 구현하시오.
		
		
//		(1)
//		java.util.Scanner sca =
//				new java.util.Scanner(System.in);
//		
//		int ran=0;
//		int j=0;
//		int v=0;
//		System.out.println("숫자맞히기 게임");
//		
//		
//		for(int i=1; i>0;) {
//			if(i==1) {
//				ran = (int)(Math.random()*100 +1);
//				i++;
//			}
//			
//			System.out.println("숫자입력:");
//			System.out.println(ran);
//			j=Integer.parseInt(sca.nextLine());
//			if(j==ran) {
//				v++;
//				System.out.println("컴퓨터 :"+ran+"유저:"+j+"\n-정답!-\n총"+v+"회 도전끝에 맞추셨습니다.\n0.게임종료\n1.다시하기");
//				i=Integer.parseInt(sca.nextLine());
//				v=0;
//			}else if(j>ran) {
//				System.out.println("컴퓨터가 입력한 수보다 크다.");
//				v++;
//			}else if(j<ran) {
//				System.out.println("컴퓨터가 입력한 수보다 작다.");
//				v++;
//			}
//		}
		
		//(2)
//		java.util.Scanner sca =
//				new java.util.Scanner(System.in);
//		int i=1;
//		int ran=0;
//		int j=0;
//		int v=0;
//		int a=0;
//		
//		System.out.println("숫자맞히기 게임");
//		
//		
//		while(i>0) {
//			
//			switch(i) {
//			case 1:
//				ran = (int)(Math.random()*100 +1);
//				i++;
//				break;
//			}
//			
//			System.out.println("숫자입력:");
//			System.out.println(ran);
//			j=Integer.parseInt(sca.nextLine());
//			
//			if(ran<j) {
//				a=1;
//			}else if(ran>j) {
//				a=2;
//			}else if(ran==j) {
//				a=3;
//			}
//			switch(a) {
//				case 1: 
//					System.out.println("컴퓨터가 입력한 수보다 크다.");
//					v++;
//					break;
//				case 2:
//					System.out.println("컴퓨터가 입력한 수보다 작다.");
//					v++;
//					break;
//				default:
//					v++;
//					System.out.println("컴퓨터 :"+ran+"유저:"+j+"\n-정답!-\n총"+v+"회 도전끝에 맞추셨습니다.\n0.게임종료\n1.다시하기");
//					i=Integer.parseInt(sca.nextLine());
//					v=0;
//			}
//			
//			
//		}

//		(3)
//		java.util.Scanner sca =
//				new java.util.Scanner(System.in);
		
		
		
		
		
		
		
		//1.자리수 관계없이 가능하도록 업그레이드
		//2.함수를 사용해서 아래코드 참고
	
//		int scour=0,level=0;
//		for (;;) {
//		//입력화면
//		int result=madeQuestionAndDisplay(level);
//		//level산정
//		level=madeLevel(scour);
//		//입력후 결과화면
//		resultDisplay(scour,level);
//		//게임계속진행여부결정
//		//
//		}
//		resultDisplay(scour,level);
//		System.out.println("게임종료");
		
		
		
		
		
		
//		
//		for(int count=0;count<1000;count++) {
//			if(f369(count)) {   //박수치는 함수
//				System.out.println(count); //숫자찍는 부분
//			}
//			System.out.print("\t");
//			if((count+1)%10==0) {
//				System.out.pritln("");
//			}
//		}
//		
//	
//	}
//	public static boolean f369(int count) {
//		//369 returnValue 박수안치면 true
//		boolean isReturnFlag=true;
//		
//		while(count!=0) {
//			if(count%10%3==0&&count%10!=0) {
//				System.out.println("짝");
//				isReturnFlag=false;
//			}
//			count=count/10;
//		}
//		return isReturnFlag;
		
	
	
	
	}	
}


