package javaStartjung;

public class Java005 {

		public static int sum(int a, int b) {
			int  sum=0;
			sum=a+b;
			return sum;
			//sum=sum+1;
		}
		public static int min(int a,int b) {
			int min=0;
			min=a-b;
			return min;
		}
		public static int mul(int a,int b) {
			int mul=0;
			mul=a*b;
			return mul;
		}
		public static int div(int a,int b) {
			int div=0;
			div=a/b;
			return div;
		}
		public static void main(String[] args) {
			int a=sum(1,2);
			int b=a+sum(2,2);
			System.out.println(a+b);
			//min mul div 함수 만들어보기.

			int sum=min(3,1);
			System.out.println(sum);
			
			int sum1=mul(4,4);
			System.out.println(sum1);	
			
			int sum2=div(6,2);
			System.out.println(sum2);
	}

}
