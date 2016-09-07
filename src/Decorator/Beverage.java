package Decorator;
/**
 * װ����ģʽHead First����
 * @author LIn
 *
 */
public abstract class Beverage {   //�������
	String description = "Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();

}

abstract class CondimentDecorator extends Beverage {  //����װ����
	public abstract String getDescription();
}

/*���������*/
class Espresso extends Beverage {  //Ũ������
	public Espresso(){
		description = "Espresso Coffee";
	}
	
	public double cost(){
		return 1.99;
	}
}

class HouseBlend extends Beverage {  //�ۺϿ���
	public HouseBlend(){
		description = "HouseBlend Coffee";
	}
	
	public double cost(){
		return 0.89;
	}
}


/*����װ����*/
class Mocha extends CondimentDecorator {  //Ħ��
	Beverage beverage;      //��һ��ʵ��������¼���ϣ�����װ����
	
	public Mocha(Beverage beverage){ //ͨ�������������ϼ�¼��ʵ��������
		this.beverage = beverage;
	}
	
	public String getDescription(){  //����ί�е�������������
		return beverage.getDescription() + ",Mocha";
	}
	
	public double cost(){            //����ί�е����������ܼ�
		return 0.20 + beverage.cost();
	}
}

class Whip extends CondimentDecorator {  //����
	Beverage beverage;      //��һ��ʵ��������¼���ϣ�����װ����
	
	public Whip(Beverage beverage){ //ͨ�������������ϼ�¼��ʵ��������
		this.beverage = beverage;
	}
	
	public String getDescription(){  //����ί�е�������������
		return beverage.getDescription() + ",Whip";
	}
	
	public double cost(){            //����ί�е����������ܼ�
		return 0.10 + beverage.cost();
	}
}

class Soy extends CondimentDecorator {  //����
	Beverage beverage;      //��һ��ʵ��������¼���ϣ�����װ����
	
	public Soy(Beverage beverage){ //ͨ�������������ϼ�¼��ʵ��������
		this.beverage = beverage;
	}
	
	public String getDescription(){  //����ί�е�������������
		return beverage.getDescription() + ",Soy";
	}
	
	public double cost(){            //����ί�е����������ܼ�
		return 0.15 + beverage.cost();
	}
}

