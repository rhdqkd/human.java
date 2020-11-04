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
	public static String cardShape[] = {"�����̵�","���̾�","��Ʈ","Ŭ�ι�"};
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
		System.out.println("   �������� : "+p1Scoure());
	}
	public static void displayP2Card() {
		System.out.println("p2Card : ");
		for(int i=0;i< p2DeckIndex;i++) {
			System.out.println(cardShape[p2Deck[i]/13]+" "+cardNumber[p2Deck[i]%13]+",");
		}
		System.out.println("   �������� : "+p2Scoure());
	}
	public static void getP1Card() {
		//deck�迭���� p1Deck���� ī�� �ű��
		//deck�� ������ �ִ� ī����� deckIndex
		//p1Deck�� ������ �ִ� ī����� p1DeckIndex
		p1Deck[p1DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p1DeckIndex++;
	}
	public static void getP2Card() {
		//deck�迭���� p2Deck���� ī�� �ű��
		p2Deck[p2DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p2DeckIndex++;
		
	}
	
	public static int p1Scoure() {
		int returnValue=0;
		//A 1 or 11
		//J Q K =10		11,12,13--> 10
		//�������� �״��
		for(int i=0;i<p1DeckIndex;i++) {
			int countNum=p1Deck[i]%13+1;
			if(countNum>10) {
				countNum=10;
			}
			returnValue+=countNum;
		}	
		for(int i=0;i< p1DeckIndex;i++) {
			if(p1Deck[i]%13==0) {	//A�� ������ 
				if((returnValue+10)>=21){ //A�� 11�� �����ؼ� 21���� ũ��
					
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
			if(p2Deck[i]%13==0) {	//A�� ������ 
				if((returnValue+10)>=21){ //A�� 11�� �����ؼ� 21���� ũ��
					
				}else {
					returnValue=returnValue+10;
				}
				
			}
		}
		return returnValue;
	}
	
	public static void victory() {
		//21���� ���ų� �����鼭, 21�� ���� ����� ���� �¸�
		int count1 = 0;
		int count2 = 0;
		count1 =21-p1Scoure();   //21-20=1 , 21-19 = 2   21-25= -4
		count2 =21-p2Scoure();
		System.out.println(count1+","+count2);
		if(count1<0&&count2<0) {
			System.out.println("player 1 �й�,player 2 �й� ");
			return;
		}
		if(count1<0) {
			System.out.println("player 1 �й�");
			count1=count1+100;
		}else if(count2<0) {
			System.out.println("player 2 �й�");
			count2=count2+100;
		}
		
		if(count1>count2){
			System.out.println("player 2 �¸�");
		}else if(count1==count2) {
			System.out.println("���º�");
		}else {
			System.out.println("player 1 �¸�");
		}
				
	}
	
	public static void main(String[] args) {
		for(int a=1;a>0;) {
			//���ο� ī�� 1�� �����ϱ�
			newCard();
			//�� ���� ī�� ����, �����ϰ� ī�� �迭�� �ε����� �̾Ƽ� 0��° �����Ϳ� ��ȯ�Ѵ�.
			
			mixCard();
			//ī�带 ���纰�� �������� 13���� ������
			//displayDeckCard();
			
			for(int i=0;i<10;i++) {
				System.out.println(i+1+"��° card ������...");
				if(!isP1GEnd) {
					System.out.println("p1�� ī�带 �����ðڽ��ϱ�? 1.Yes 2.No");
					
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
				System.out.println("p2�� ī�带 �����ðڽ��ϱ�? 1.Yes 2.No");
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
			
			//���� ����
			victory();
		
			//���ṯ��
			System.out.println("0.���� 1.�ٽ��ϱ�");
			a=Integer.parseInt(sc.nextLine());
		}
			
		
		}
	

	}
	