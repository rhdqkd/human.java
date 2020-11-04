package com.human.dto;

import java.util.Scanner;

public class Blackjack3 {
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
		System.out.println("p2Card : ");
		for(int i=0;i< p2DeckIndex;i++) {
			System.out.println(cardShape[p2Deck[i]/13]+" "+cardNumber[p2Deck[i]%13]+",");
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
	
	public static void victory() {
		//21보다 같거나 작으면서, 21에 가장 가까운 수가 승리
		int count1 = 0;
		int count2 = 0;
		count1 =21-p1Scoure();   //21-20=1 , 21-19 = 2   21-25= -4
		count2 =21-p2Scoure();
		System.out.println(count1+","+count2);
		if(count1<0&&count2<0) {
			System.out.println("player 1 패배,player 2 패배 ");
			return;
		}
		if(count1<0) {
			System.out.println("player 1 패배");
			count1=count1+100;
		}else if(count2<0) {
			System.out.println("player 2 패배");
			count2=count2+100;
		}
		
		if(count1>count2){
			System.out.println("player 2 승리");
		}else if(count1==count2) {
			System.out.println("무승부");
		}else {
			System.out.println("player 1 승리");
		}
				
	}
	
	public static void main(String[] args) {
		for(int a=1;a>0;) {
			//새로운 카드 1벌 세팅하기
			newCard();
			//다 만든 카드 섞기, 랜덤하게 카드 배열의 인덱스를 뽑아서 0번째 데이터와 교환한다.
			
			mixCard();
			//카드를 문양별로 나누려면 13으로 나눠줌
			//displayDeckCard();
			
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
					isP2GEnd=true;
				}
				
			}
				displayP1Card();
				displayP2Card();
			}
			displayP1Card();
			displayP2Card();
			
			//승패 결정
			victory();
		
			//종료묻기
			System.out.println("0.종료 1.다시하기");
			a=Integer.parseInt(sc.nextLine());
		}
			
		
		}
	

	}
	