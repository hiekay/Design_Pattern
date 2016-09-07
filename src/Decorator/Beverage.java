package Decorator;
/**
 * 装饰者模式Head First例子
 * @author LIn
 *
 */
public abstract class Beverage {   //抽象组件
	String description = "Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();

}

abstract class CondimentDecorator extends Beverage {  //抽象装饰者
	public abstract String getDescription();
}

/*具体的饮料*/
class Espresso extends Beverage {  //浓缩咖啡
	public Espresso(){
		description = "Espresso Coffee";
	}
	
	public double cost(){
		return 1.99;
	}
}

class HouseBlend extends Beverage {  //综合咖啡
	public HouseBlend(){
		description = "HouseBlend Coffee";
	}
	
	public double cost(){
		return 0.89;
	}
}


/*具体装饰者*/
class Mocha extends CondimentDecorator {  //摩卡
	Beverage beverage;      //用一个实例变量记录饮料，即被装饰者
	
	public Mocha(Beverage beverage){ //通过构造器将饮料记录在实例变量中
		this.beverage = beverage;
	}
	
	public String getDescription(){  //利用委托的做法附加描述
		return beverage.getDescription() + ",Mocha";
	}
	
	public double cost(){            //利用委托的做法计算总价
		return 0.20 + beverage.cost();
	}
}

class Whip extends CondimentDecorator {  //奶泡
	Beverage beverage;      //用一个实例变量记录饮料，即被装饰者
	
	public Whip(Beverage beverage){ //通过构造器将饮料记录在实例变量中
		this.beverage = beverage;
	}
	
	public String getDescription(){  //利用委托的做法附加描述
		return beverage.getDescription() + ",Whip";
	}
	
	public double cost(){            //利用委托的做法计算总价
		return 0.10 + beverage.cost();
	}
}

class Soy extends CondimentDecorator {  //豆浆
	Beverage beverage;      //用一个实例变量记录饮料，即被装饰者
	
	public Soy(Beverage beverage){ //通过构造器将饮料记录在实例变量中
		this.beverage = beverage;
	}
	
	public String getDescription(){  //利用委托的做法附加描述
		return beverage.getDescription() + ",Soy";
	}
	
	public double cost(){            //利用委托的做法计算总价
		return 0.15 + beverage.cost();
	}
}

