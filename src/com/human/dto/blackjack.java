package com.human.dto;

public class blackjack {
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static int deck[]=new int[52];
	public static int p1Deck[]=new int[10];
	public static int p2Deck[]=new int[10];
	public static int deckIndex=52;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static boolean isP1GEnd=false;
	public static boolean isP2GEnd=false;
	public static String cardShape[] = {"스페이드","다이아","하트","클로버"};
	public static String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public static void newCard() {
		for(int i=0;i<deck.length;i++) {
			deck[i]=i;
		}
		deckIndex=52;
		p1DeckIndex=0;
		p2DeckIndex=0;
		isP1GEnd=isP2GEnd=false;
		
	}
	
	public static void mixCard() {
		for(int i=0; i<52; i++) {
//			int ranCard = (int)(Math.random()*51);  //random 카드 뽑기
//			int j=0;
//			j=deck[i];
//			deck[i]=deck[ranCard];
//			deck[ranCard]=j;
			
			int randomIndex=(int)(Math.random()*52);
			int temp=deck[0];
			deck[0]=deck[randomIndex];
			deck[randomIndex]=temp;
		}
	}
	
	public static void displayDeckCard() {
		
		for(int i=0;i<deckIndex;i++) {
			System.out.println(cardShape[deck[i]/13]+" "+cardNumber[deck[i]%13]);
		}
	}
	public static void displayP1Card() {
		System.out.println("p1Card : ");
		for(int i=0;i< p1DeckIndex;i++) {
			System.out.println(cardShape[p1Deck[i]/13]+" "+cardNumber[p1Deck[i]%13]+",");
		}
		System.out.println("   현재점수 : "+p1Scoure());
	}
	public static void displayP2Card() {
		System.out.println("p1Card : ");
		for(int i=0;i< p1DeckIndex;i++) {
			System.out.println(cardShape[p1Deck[i]/13]+" "+cardNumber[p1Deck[i]%13]+",");
		}
		System.out.println("   현재점수 : "+p2Scoure());
	}
	public static void getP1Card() {
		//deck배열에서 p1Deck으로 카드 옮기기
		//deck이 가지고 있는 카드수는 deckIndex
		//p1Deck이 가지고 있는 카드수는 p1DeckIndex
		p1Deck[p1DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p1DeckIndex++;
	}
	public static void getP2Card() {
		//deck배열에서 p2Deck으로 카드 옮기기
		p2Deck[p2DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p2DeckIndex++;
		
	}
	
	public static int p1Scoure() {
		int returnValue=0;
		//A 1 or 11
		//J Q K =10		11,12,13--> 10
		//나머지는 그대로
		for(int i=0;i<p1DeckIndex;i++) {
			int countNum=p1Deck[i]%13+1;
			if(countNum>10) {
				countNum=10;
			}
			returnValue+=countNum;
		}	
		for(int i=0;i< p1DeckIndex;i++) {
			if(p1Deck[i]%13==0) {	//A가 있으면 
				if((returnValue+10)>=21){ //A를 11로 변경해서 21보다 크면
					
				}else {
					returnValue=returnValue+10;
				}
				
			}
		}
		return returnValue;
	}
	public static int p2Scoure() {
		int returnValue=0;
		for(int i=0;i<p2DeckIndex;i++) {
			int countNum=p2Deck[i]%13+1;
			if(countNum>10) {
				countNum=10;
			}
			returnValue+=countNum;
		}	
		for(int i=0;i< p2DeckIndex;i++) {
			if(p2Deck[i]%13==0) {	//A가 있으면 
				if((returnValue+10)>=21){ //A를 11로 변경해서 21보다 크면
					
				}else {
					returnValue=returnValue+10;
				}
				
			}
		}
		return returnValue;
	}
	
	public static void displayGEnd() {
		String result="";
		displayP1Card();
		displayP2Card();
		if(p1Scoure()>21) {
			result="p2가 승리하였습니다.";
		}else if(p2Scoure()>21) {
			result="p1가 승리하였습니다.";
		}else if(p1Scoure()<p2Scoure()) {
			result="p2가 승리하였습니다.";
		}else if(p1Scoure()==p2Scoure()) {
			result="무승부 입니다.";
		}else {
			result="p1이 승리하였습니다.";
		}
		System.out.println("게임 결과는 : "+result);
	}
	
	public static void play() {
		for(int i=0;i<10;i++) {
			System.out.println(i+1+"번째 card 수령중...");
			if(!isP1GEnd) {
				System.out.println("p1님 카드를 받으시겠습니까? 1.Yes 2.No");
				
			if(1==Integer.parseInt(sc.nextLine())){
				getP1Card();  //
				if(p1Scoure()>21) {
					break;
				}
			}else {
				isP1GEnd=true;
			}
			
			}
		if(!isP2GEnd) {
			System.out.println("p2님 카드를 받으시겠습니까? 1.Yes 2.No");
			if(1==Integer.parseInt(sc.nextLine())){
				getP2Card();  //
				if(p2Scoure()>21) {
					break;
				}
			}else {
				isP1GEnd=true;
			}
			if(isP1GEnd&&isP1GEnd) {
				break;
			}
		}
			displayP1Card();
			displayP2Card();
		}
		displayGEnd();
		
	}	
	
	
	// 프로그램에서 52장의 카드를 사용하려면 어떻게 해야하는가?
	//반복문을 이용해  문양마다 13개의 숫자를 넣어준다.
	
	//52장의 카드를 식별하는 방법
	//카드도 번호로 구분
	
	//카드 52장을 사용하려면 숫자를 저장할 수 있는 배열을 선언해서 0부터 51까지 만들어 사용하면 됨.
	
	
	public static void main(String[] args) {
		
		
		while(true) {
		//새로운 카드 1벌 세팅하기
		newCard();
		//다 만든 카드 섞기, 랜덤하게 카드 배열의 인덱스를 뽑아서 0번째 데이터와 교환한다.
		
		mixCard();
		//카드를 문양별로 나누려면 13으로 나눠줌
		//displayDeckCard();
			
		play();
		
		int i=0;
		if(i==0) {
			break;
		}
		
		}
		
	}
		//deck
		//BlackJack.deck
		
}

	

	


