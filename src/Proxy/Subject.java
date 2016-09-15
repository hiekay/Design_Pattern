package Proxy;
/**
 * Subject�࣬�����ɫ��������RealSubject��Proxy�Ĺ��ýӿڣ�
 * ���������κ�ʹ��RealSubject�ĵط�������ʹ��Proxy��
 * @author LIn
 *
 */
public interface Subject {
	public abstract void request();
}

/**
 * RealSubject�࣬��ʵʵ�壬����Proxy���������ʵʵ�塣
 * @author LIn
 *
 */
class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("��ʵ������");
		
	}
	
}

/**
 * Proxy�࣬����һ������ʹ�ô�����Է���ʵ�壬
 * ��ʵ��һ����Subject�Ľӿڣ���������Ϳ����������ʵ�塣
 * @author LIn
 *
 */
class SProxy implements Subject{

	RealSubject realSubject;
	
	//ί�д���
	public SProxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	
	@Override
	public void request() {
		realSubject.request();
	}
	
}
