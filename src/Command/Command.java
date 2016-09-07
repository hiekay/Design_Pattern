package Command;

/**
 * ����ģʽ
 * @author LIn
 *
 */
public abstract class Command {  //��������࣬�������������Ľӿ�(interface���ܻ����)
	protected Receiver receiver;
	
	public Command(Receiver receiver){
		this.receiver = receiver;
	}
	
	abstract public void Execute();

}
/*���������࣬��һ�������߰���һ�����������ý�������Ӧ�Ĳ�������ʵ��Execute*/
class ConcreteCommand extends Command{
	public ConcreteCommand(Receiver receiver){
		super(receiver);
	}
	
	@Override
	public void Execute(){
		receiver.Action();
	}
}

/*�����ߡ�Ҫ�������ִ�������һϵ������*/
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

/*�����ߣ�֪�����ʵʩ��ִ��һ����������صĲ���*/
class Receiver{
	public void Action(){
		/*ִ������*/
		System.out.println("ִ������");
	}
}





