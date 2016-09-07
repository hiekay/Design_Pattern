package Singleton;
/**
 * 
 * @author LIn
 * ������ԭʼ�ɿ�����¯
 * Ϊ�˱������¯���˼�����ԭ�ϻ��¯���յ����,����д���൱С��
 * (���ǣ����ͬʱ�ж���һ����ChocolateBoilerʵ�����ڣ�
 *  һ̨�ɿ�����¯����"ͬʱ"�ڼ��Ⱥͷ�ԭ��)
 *  
 */
public class ChocolateBoiler {   //�ɿ�����¯
	private boolean empty;       //�Ƿ�Ϊ��
	private boolean boiled;      //ԭ���Ƿ������
	
	public ChocolateBoiler(){
		empty = true;
		boiled = false;
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
