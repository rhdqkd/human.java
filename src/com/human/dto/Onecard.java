package com.human.dto;

public class Onecard {
	public static java.util.Scanner sca =new java.util.Scanner(System.in);
	public static int deck[]=new int[53];
	public static int p1Deck[]=new int[15];
	public static int p2Deck[]=new int[15];
	public static int deckIndex=53;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static String cardShape[] = {"�����̵�","���̾�","��Ʈ","Ŭ�ι�"};
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
		//ī�� �ű��
		p1Deck[p1DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p1DeckIndex++;
	}
	public static void getP2Card() {
		//ī�� �ű��
		p2Deck[p2DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p2DeckIndex++;
	}
	
	public static void displayP1Card() {   
		System.out.println("p1Card : ");
		for(int i=0;i<p1DeckIndex;i++) {
			System.out.print(cardShape[p1Deck[i]/13]+" "+cardNumber[p1Deck[i]%13]+",");
		}
		//������ ��ǻ�� �������� ������
		
	}
	public static void displayP2Card() {   
		System.out.println("p2Card : ");
		for(int i=0;i<p2DeckIndex;i++) {
			System.out.print(cardShape[p2Deck[i]/13]+" "+cardNumber[p2Deck[i]%13]+",");
		}
		//������ ��ǻ�� �������� ������
		
	}
	
	
	
	public static void main(String[] args) {
		//ī�� �����
		newCard();
		//ī�� ����
		mixCard();
		//�����ֱ�
		System.out.println("ī�� �й���...");
		for(int i=0;i<5;i++) {
			getP1Card(); 
			getP2Card();
		}
		
		
		displayP1Card();
		displayP2Card();
		
//		displayDeckCard();
		//���ӽ���
		//��ǻ�Ͱ� ī�峽�� ��������
		//ī�� ���� ��ȣ�� ����(Ʋ���� �ٽ�)
		//���� ���ų� �׳� �Ѿ���� ī���ϳ� �߰�
		
		//ī�尡 ���ų� ������ 15�� �̻��̸� ���� ����
		
		//���� �˷��ֱ�
		
		//���� �� �ٽ��ϱ� ����
		
		//����� �����Ʈ 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
