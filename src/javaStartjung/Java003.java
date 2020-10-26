package javaStartjung;
import com.human.dto.*;
public class Java003 {

	public static void main(String[] args) {
		//
//		int a[] = {0,1,2,3};
//		int b[];
//		b=a;
//		b[1]=10;
//		System.out.println(a[1]); //10
//		
//		//a 0,10,2,3
//		//c  0,10,2,3,
//		
//		//공유되서 10이 나온다.
//		//a 0,  1,2,3
//		//c 0,10,2,3
//		
//		int c[] =new int[4];
//		//새로운heap생성되어 c는 비게됨
//		for(int i=0;i<a.length;i++) {
//			c[i]=a[i];
//		}	
//		//for을 이용해 c안에 a를 넣어줌, a와c는 공유되지않음.
//		c[1]=20;
//		System.out.println(a[1]); //10
//		System.out.println(c[1]); //10
		
		Human arr1[]= new Human[2];
		arr1[0]=new Human("홍길동",10,155.5);
		arr1[1]=new Human("홍길남",10,155.5);
		Human arr2[]= arr1;
		Human arr3[]= new Human[2];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=arr1[i];
		}
		//홍길남 나이10을 20으로 변경해보자.
		arr1[1].age=20;
		System.out.println(arr1[1].age);//20
		System.out.println(arr2[1].age);//20
		System.out.println(arr3[1].age);//20
		
		
		//(2) arr1과 arr3가 다른 값을 가질 수 있도록 설계해보자.
		
//		arr3[0]=new Human();
//		arr3[0].name=arr1[0].name;
//		arr3[0].age=arr1[0].age;
//		arr3[0].height=arr1[0].height;
//		
//		arr3[1]=new Human();
//		arr3[1].name=arr1[1].name;
//		arr3[1].age=arr1[1].age;
//		arr3[1].height=arr1[1].height;
		for(int i=0;i<arr1.length;i++) {
			arr3[0]=new Human();
			arr3[i].name=arr1[i].name;
			arr3[i].age=arr1[i].age;
			arr3[i].height=arr1[i].height;
		}
		arr3[1].age=99;
		//arr1[1}.age arr3[1].age 는 다른값을 가지게 된다.
		
		System.out.println(arr3[1].age);//20
		
		//1.포기(x) , 2. 쓸데없는짓(x)
		
		//2.f(a,b)= a*b
		
		//
		

	}

}
