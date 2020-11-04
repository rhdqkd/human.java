package com.human.dto;

public class JavaStart000 {
	public static double height = 20;
	public static double width = 40;
	public static double periphery() {
		return 2*height+2*width;
	}
	public static double area() {
		return height*width;
	}
	public static double height2 = 20;
	public static double width2 = 40;
	public static double periphery2() {
		return 2*height2+2*width2;
	}
	public static double area2() {
		return height2*width2;
	}
	public static void main(String[] args) {
		//직사각형 넓이 둘레를 구하는 프로그램을 만들어보자.
		height=80;
		width=60;
		
		System.out.println(area());
		System.out.println(periphery());
		height2=80;
		width2=60;
		
		System.out.println(area2());
		System.out.println(periphery2());
		

	}

}
