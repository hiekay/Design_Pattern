package Singleton;
/**
 * 
 * @author LIn
 * ����ʵ����(����ʽ)ͬ���ĵ���ģʽ
 */
public class Singleton_Eagerly {
	/*�ھ�̬��ʼ�����д�����������֤���̰߳�ȫ*/
	private static Singleton_Eagerly instance = new Singleton_Eagerly(); 
	
	private Singleton_Eagerly(){}  //�ѹ���������Ϊ˽��
	
	public static synchronized Singleton_Eagerly getInstance(){
		return instance;
	}

}
