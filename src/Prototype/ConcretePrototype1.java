package Prototype;

public class ConcretePrototype1 implements Prototype {
	//简易克隆,新建一个克隆对象
	public Object clone(){
		Prototype prototype = new ConcretePrototype1();
        return prototype;
	}

}
