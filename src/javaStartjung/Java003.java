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
//		//�����Ǽ� 10�� ���´�.
//		//a 0,  1,2,3
//		//c 0,10,2,3
//		
//		int c[] =new int[4];
//		//���ο�heap�����Ǿ� c�� ��Ե�
//		for(int i=0;i<a.length;i++) {
//			c[i]=a[i];
//		}	
//		//for�� �̿��� c�ȿ� a�� �־���, a��c�� ������������.
//		c[1]=20;
//		System.out.println(a[1]); //10
//		System.out.println(c[1]); //10
		
		Human arr1[]= new Human[2];
		arr1[0]=new Human("ȫ�浿",10,155.5);
		arr1[1]=new Human("ȫ�泲",10,155.5);
		Human arr2[]= arr1;
		Human arr3[]= new Human[2];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=arr1[i];
		}
		//ȫ�泲 ����10�� 20���� �����غ���.
		arr1[1].age=20;
		System.out.println(arr1[1].age);//20
		System.out.println(arr2[1].age);//20
		System.out.println(arr3[1].age);//20
		
		
		//(2) arr1�� arr3�� �ٸ� ���� ���� �� �ֵ��� �����غ���.
		
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
		//arr1[1}.age arr3[1].age �� �ٸ����� ������ �ȴ�.
		
		System.out.println(arr3[1].age);//20
		
		//1.����(x) , 2. ����������(x)
		
		//2.f(a,b)= a*b
		
		//
		

	}

}
