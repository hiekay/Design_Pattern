package Adapter;

public class Shape {
	public void display(){}
	
	public static void main(String[] args){
		//显示图形
		Shape a = new Circle();
		a.display();      //显示一个圆
		a = new Rectangle();
		a.display();     //显示一个矩形

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
