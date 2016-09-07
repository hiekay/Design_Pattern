package Singleton;
/**
 * @author LIn
 * �����������ɿ�����¯
 * (���⣺�ڶ��̵߳�����»ᵼ�¹�¯����ʱҲ�ܼ�������ԭ�ϣ���Ϊ�����в�û��
 *  ͬ��,�����������߳�ͬʱ���뵽ʵ����(getInstance)�ķ�����)
 */
public class ChocolateBoiler_S {   //�����ɿ�����¯
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler_S instance = null;
	//�����췽����Ϊ˽��
	private ChocolateBoiler_S(){
		empty = true;
		boiled = false;
	}
	//���ص�����¯
	public static synchronized ChocolateBoiler_S getInstance(){
		if(instance == null){
			instance = new ChocolateBoiler_S();
		}
		return instance;
	}
	
	public void fill(){  
		if(isEmpty()){
			empty = false;
			boiled = false;
			/*�ڹ�¯�������ɿ�����ţ�̵Ļ����*/
		}
	}

	public void drain(){
		if(!isEmpty() && isBoiled()){
			/*�ų���е��ɿ�����ţ��*/
			empty = true;
		}
	}
	
	public void boil(){
		if(!isEmpty() && !isBoiled()){
			/*�����ɿ�����ţ��*/
			boiled = true;
		}
	}
	
	public boolean isEmpty(){
		return empty;
	}
	
	public boolean isBoiled(){
		return boiled;
	}
	

}
