package Command;

/**
 * 命令模式
 * @author LIn
 *
 */
public abstract class Command {  //命令抽象类，用来声明操作的接口(interface可能会更好)
	protected Receiver receiver;
	
	public Command(Receiver receiver){
		this.receiver = receiver;
	}
	
	abstract public void Execute();

}
/*具体命令类，将一个接受者绑定于一个动作，调用接受者相应的操作，以实现Execute*/
class ConcreteCommand extends Command{
	public ConcreteCommand(Receiver receiver){
		super(receiver);
	}
	
	@Override
	public void Execute(){
		receiver.Action();
	}
}

/*传达者。要求该命令执行这个或一系列请求*/
class Invoker{
	private Command command;
//	private List<Command> l = new ArrayList<>();
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void ExecuteCommand(){
		command.Execute();
	}
}

/*接收者，知道如何实施与执行一个与请求相关的操作*/
class Receiver{
	public void Action(){
		/*执行请求*/
		System.out.println("执行请求！");
	}
}





