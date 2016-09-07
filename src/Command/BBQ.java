package Command;

import java.util.ArrayList;
import java.util.List;
/**
 * 命令模式：BBQ例子
 * @author LIn
 *
 */
public class BBQ {
	public static void main(String[] args) {
		//开店前的准备
		Barbecuer boy = new Barbecuer();
		BBQCommand a = new BakeMuttonCommand(boy);
		BBQCommand b = new BakeChickenWingCommand(boy);
		BBQCommand c = new BakeBaconCommand(boy);
		
		BBQCommand[] SetMeal = {a,b,c};
		BBQCommand d = new MacroCommand(SetMeal);  //烧烤套餐
		
		Waiter girl = new Waiter();
		
		//开店营业  顾客点菜
		girl.setOrder(a);
		girl.setOrder(b);
		girl.setOrder(c);
		girl.setOrder(d);
		girl.setOrder(a);
		
		girl.cancelOrder(d);  //撤销命令
		//点菜完毕，通知厨房
		girl.notifyExecuter();
	}

}

/*烧烤者，能执行命令的人*/
class Barbecuer{
	public void BakeMutton(){
		/*烤羊肉串*/
		System.out.println("烤羊肉串");
	}
	
	public void BakeChickenWing(){
		/*烤鸡翅*/
		System.out.println("烤鸡翅");
	}
	
	public void BakeBacon(){
		/*烤培根*/
		System.out.println("烤培根");
	}
}

//抽象命令
interface BBQCommand{	
	//执行命令
	abstract public void excuteCommand();
	
	@Override
	public String toString();
}

/*具体命令类。执行命令时，执行具体的行为*/
class BakeMuttonCommand implements BBQCommand{   //烤羊肉串命令
	Barbecuer barbecuer;

	public BakeMuttonCommand(Barbecuer barbecuer) {
		this.barbecuer = barbecuer;
	}

	@Override
	public void excuteCommand() {
		barbecuer.BakeMutton();
	}
	
	@Override
	public String toString() {
		return this.getClass().getName();
	}
	
}

class BakeChickenWingCommand implements BBQCommand{   //烤鸡翅命令
	Barbecuer barbecuer;

	public BakeChickenWingCommand(Barbecuer barbecuer) {
		this.barbecuer = barbecuer;
	}

	@Override
	public void excuteCommand() {
		barbecuer.BakeChickenWing();
	}
	
	@Override
	public String toString() {
		return this.getClass().getName();
	}
	
}

class BakeBaconCommand implements BBQCommand{   //烤培根命令
	Barbecuer barbecuer;

	public BakeBaconCommand(Barbecuer barbecuer) {
		this.barbecuer = barbecuer;
	}

	@Override
	public void excuteCommand() {
		barbecuer.BakeBacon();
	}
	
	@Override
	public String toString() {
		return this.getClass().getName();
	}
	
}

//宏命令。(来个烧烤套餐)
class MacroCommand implements BBQCommand{
	BBQCommand[] commands;
	
	public MacroCommand(BBQCommand[] commands){
		this.commands = commands;
	}

	@Override
	public void excuteCommand() {
		for(BBQCommand c:commands){
			c.excuteCommand();
		}
	}
	
	@Override
	public String toString() {
		return this.getClass().getName();
	}
	
}

/*服务员。传递命令的类*/
class Waiter{
	private List<BBQCommand> orders = new ArrayList<>();  //存放命令的容器
	
	//设置订单
	public void setOrder(BBQCommand command){
		if(command.toString() == "Command.BakeChickenWingCommand"){   //货存确认
			System.out.println("无存货:" + command.toString());
		}else{
			orders.add(command);
			System.out.println("增加订单:" + command.toString());
		}
	}
	
	//取消订单
	public void cancelOrder(BBQCommand command){
		orders.remove(command);
		System.out.println("取消订单：" + command);
	}
	
	//通知全部执行
	public void notifyExecuter(){
		for(BBQCommand c:orders){
			c.excuteCommand();
		}
	}
}


