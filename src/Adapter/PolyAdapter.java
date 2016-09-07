package Adapter;

public class PolyAdapter extends Shape{
	private Poly poly;
	public PolyAdapter(Poly p){ 
		poly = p; 
	}
	public void display(){ 
		poly.init();
		poly.draw();
	}
	
	public static void main(String[] args){
		Shape a = new PolyAdapter(new Poly());
	    a.display();  //显示一个多边形
	}
}
