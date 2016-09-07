package Command;

import java.util.ArrayList;
import java.util.List;
/**
 * ����ģʽ��BBQ����
 * @author LIn
 *
 */
public class BBQ {
	public static void main(String[] args) {
		//����ǰ��׼��
		Barbecuer boy = new Barbecuer();
		BBQCommand a = new BakeMuttonCommand(boy);
		BBQCommand b = new BakeChickenWingCommand(boy);
		BBQCommand c = new BakeBaconCommand(boy);
		
		BBQCommand[] SetMeal = {a,b,c};
		BBQCommand d = new MacroCommand(SetMeal);  //�տ��ײ�
		
		Waiter girl = new Waiter();
		
		//����Ӫҵ  �˿͵��
		girl.setOrder(a);
		girl.setOrder(b);
		girl.setOrder(c);
		girl.setOrder(d);
		girl.setOrder(a);
		
		girl.cancelOrder(d);  //��������
		//�����ϣ�֪ͨ����
		girl.notifyExecuter();
	}

}

/*�տ��ߣ���ִ���������*/
class Barbecuer{
	public void BakeMutton(){
		/*�����⴮*/
		System.out.println("�����⴮");
	}
	
	public void BakeChickenWing(){
		/*������*/
		System.out.println("������");
	}
	
	public void BakeBacon(){
		/*�����*/
		System.out.println("�����");
	}
}

//��������
interface BBQCommand{	
	//ִ������
	abstract public void excuteCommand();
	
	@Override
	public String toString();
}

/*���������ࡣִ������ʱ��ִ�о������Ϊ*/
class BakeMuttonCommand implements BBQCommand{   //�����⴮����
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

class BakeChickenWingCommand implements BBQCommand{   //����������
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

class BakeBaconCommand implements BBQCommand{   //���������
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

//�����(�����տ��ײ�)
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

/*����Ա�������������*/
class Waiter{
	private List<BBQCommand> orders = new ArrayList<>();  //������������
	
	//���ö���
	public void setOrder(BBQCommand command){
		if(command.toString() == "Command.BakeChickenWingCommand"){   //����ȷ��
			System.out.println("�޴��:" + command.toString());
		}else{
			orders.add(command);
			System.out.println("���Ӷ���:" + command.toString());
		}
	}
	
	//ȡ������
	public void cancelOrder(BBQCommand command){
		orders.remove(command);
		System.out.println("ȡ��������" + command);
	}
	
	//֪ͨȫ��ִ��
	public void notifyExecuter(){
		for(BBQCommand c:orders){
			c.excuteCommand();
		}
	}
}


