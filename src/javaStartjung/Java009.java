package javaStartjung;

public class Java009 {
	//매개변수도 있고 리턴값도 있는 함수
		public static int function4(int a,int b, int c) {
			int result=0;
			result=a+b-c;
			return result;
		}
		
		public static void main(String[] args) {
			int a=function4(1,2,3);
			System.out.println(a);
			System.out.println(function4(3,4,5));
			
			
			
	}

}
