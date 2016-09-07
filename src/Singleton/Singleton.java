package Singleton;
/**
 * ����ĵ���ģʽ��ʵ��(δͬ��)
 * @author LIn
 *
 */
public class Singleton {
	private static Singleton instance = null;
	
	private Singleton(){}  //�ѹ���������Ϊ˽��
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}

