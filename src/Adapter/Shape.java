package Adapter;

public class Shape {
	public void display(){}
	
	public static void main(String[] args){
		//��ʾͼ��
		Shape a = new Circle();
		a.display();      //��ʾһ��Բ
		a = new Rectangle();
		a.display();     //��ʾһ������

	}
}

class Circle extends Shape{
	public void display(){
		/*draw Circle*/
	}
}
class Rectangle extends Shape{
	public void display(){
		/*draw Rectangle*/
   }
}
