package Prototype;

public class ConcretePrototype1 implements Prototype {
	//���׿�¡,�½�һ����¡����
	public Object clone(){
		Prototype prototype = new ConcretePrototype1();
        return prototype;
	}

}
