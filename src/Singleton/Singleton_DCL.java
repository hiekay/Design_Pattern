package Singleton;
/**
 * 
 * @author LIn
 * ˫�ؼ�����ͬ���ĵ���ģʽ
 */
public class Singleton_DCL {
	private volatile static Singleton_DCL instance;  //volatile��֤����̲߳�����˱���
	
	private Singleton_DCL(){}  //�ѹ���������Ϊ˽��
	
	public static Singleton_DCL getInstance(){
		if(instance == null){
			synchronized(Singleton_DCL.class){
				if(instance == null){    //����������ټ��һ�Ρ�����null�Ŵ���ʵ��
					instance = new Singleton_DCL();
				}
			}
		}
		return instance;
	}
}
