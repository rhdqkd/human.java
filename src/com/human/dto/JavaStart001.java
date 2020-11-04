package com.human.dto;
//
class Rectangle{											//�ʵ�
	private double height = 20;								
	private double width = 40;
	
	public double getHeight() {  //���� �����´�. 				//�޼ҵ�
		if(height<0) {  
			height=0;
		}
		return height;
	}
	public void setHeight(double height) { //���� ��ġ�Ѵ�.
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public static double area(double height,double width) {
		return height*width;
	}
	
	
	public double periphery() {
		return 2*height+2*width;
	}
	public Rectangle(double width) {
		super();	
		this.width = width;
		this.height = width;
	}
	@Override	//����������
	public String toString() {	//��¾���� ������ ���ִ�. 
		return "Rectangle [*height=" + height + ", width=" + width + "*]"+this.area();
	}
	@Override
	public int hashCode() {	
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area());
		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(height);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		temp = Double.doubleToLongBits(width);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) { //
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if(this.area()!=other.area()) {
			return false;
		}
//		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
//			return false;
//		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
//			return false;
		return true;
	}
	public double area() {
		return height*width;
	}
	public Rectangle() {
		
	}
	public Rectangle(double height, double width) {
		super();
		this.height = height;   
		this.width = width;
		//this.height�� Ŭ������ �����, �׳� height�� �Ű������� �ǹ�
		//+1�� ������ this�� class ��ü�� +1�̹Ƿ� �����������
		//�׳� height�� �Ű������� 1�� ���ϹǷ� �Լ��� ������� ���� �����
		//Ŭ������� �޼ҵ���� ��ġ�ؾ��Ѵ�.
		//
	
	}
}




class triangle{
	public double height2 = 40;
	public double width2 = 50;
	public double periphery() {
		return width2*3;
	}
	public double area() {
		return height2*width2/2;
	}
}

class circle{
	public double Diameter = 5;
	public double periphery() {
		return Diameter*3.14;
	}
	public double area() {
		return (periphery()/2) *(periphery()/2)*3.14;
	}
}


//�ﰢ��,�� �ѷ� ����Ŭ���� �����

//public class�� �ϳ��� ����� �� �ִ�.
public class JavaStart001 {
	
	public static void main(String[] args) {
//		System.out.println(Rectangle.area(height,width));
//		Rectangle r1=new Rectangle(30);
//		Rectangle r2=new Rectangle(30,50);
		Rectangle r1=new Rectangle(30,40);
		Rectangle r2=new Rectangle(40,30);
//		get and set ���
		System.out.println(r1.getHeight());
		System.out.println(r1);
//		r1.height=30; r1.width=40;
		System.out.println(r1.area());
		System.out.println(r1.periphery());
		
//		r2.height=30; r2.width=50;
		System.out.println(r2.area());
		System.out.println(r2.periphery());
		
		triangle t1=new triangle();
		
		t1.height2=10; t1.width2=20;
		System.out.println(t1.periphery());
		System.out.println(t1.area());
		
		circle c1 =new circle();
		
		c1.Diameter=5;
		System.out.println(c1.area());
		System.out.println(c1.periphery());
		
		//���簢�� ���� �ѷ��� ���ϴ� ���α׷��� ������.
//		height=80;
//		width=60;
//		
//		System.out.println(area());
//		System.out.println(periphery());
		

	}

}
