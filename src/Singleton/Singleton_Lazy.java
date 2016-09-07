package Singleton;
/**
 * 
 * @author LIn
 * �ӳ�ʵ����(����ʽ)ͬ���ĵ���ģʽ
 */
public class Singleton_Lazy {
	private static Singleton_Lazy instance = null;
	
	private Singleton_Lazy(){}  //�ѹ���������Ϊ˽��
	
	public static synchronized Singleton_Lazy getInstance(){
		if(instance == null){
			instance = new Singleton_Lazy();
		}
		return instance;
	}

}
