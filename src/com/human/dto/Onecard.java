package com.human.dto;

public class Onecard {
	public static java.util.Scanner sca =new java.util.Scanner(System.in);
	public static int deck[]=new int[53];
	public static int p1Deck[]=new int[15];
	public static int p2Deck[]=new int[15];
	public static int deckIndex=53;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static String cardShape[] = {"스페이드","다이아","하트","클로버"};
	public static String cardNumber[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public static String cardSp[] = {"joker"};
	
	public static void newCard() {
		for(int i=0; i<deck.length;i++) {
			deck[i]=i;
		}
		deckIndex=53;
		p1DeckIndex=0;
		p2DeckIndex=0;
	}
	public static void mixCard() {
		for(int i=0;i<53;i++) {
			int randomIndex=(int)(Math.random()*53);
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
	
	public static void getP1Card() {
		//카드 옮기기
		p1Deck[p1DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p1DeckIndex++;
	}
	public static void getP2Card() {
		//카드 옮기기
		p2Deck[p2DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p2DeckIndex++;
	}
	
	public static void displayP1Card() {   
		System.out.println("p1Card : ");
		for(int i=0;i<p1DeckIndex;i++) {
			System.out.print(cardShape[p1Deck[i]/13]+" "+cardNumber[p1Deck[i]%13]+",");
		}
		//받은후 컴퓨터 차례이후 유저턴
		
	}
	public static void displayP2Card() {   
		System.out.println("p2Card : ");
		for(int i=0;i<p2DeckIndex;i++) {
			System.out.print(cardShape[p2Deck[i]/13]+" "+cardNumber[p2Deck[i]%13]+",");
		}
		//받은후 컴퓨터 차례이후 유저턴
		
	}
	
	
	
	public static void main(String[] args) {
		//카드 만들기
		newCard();
		//카드 섞기
		mixCard();
		//나눠주기
		System.out.println("카드 분배중...");
		for(int i=0;i<5;i++) {
			getP1Card(); 
			getP2Card();
		}
		
		
		displayP1Card();
		displayP2Card();
		
//		displayDeckCard();
		//게임시작
		//컴퓨터가 카드낸후 유저차례
		//카드 낼거 번호로 선택(틀리면 다시)
		//낼게 없거나 그냥 넘어가려면 카드하나 추가
		
		//카드가 없거나 상대방이 15장 이상이면 게임 종료
		
		//승패 알려주기
		
		//종료 및 다시하기 묻기
		
		//종료시 종료멘트 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
