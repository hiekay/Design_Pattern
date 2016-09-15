package Proxy;
/**
 * Subject类，抽象角色，定义了RealSubject和Proxy的共用接口，
 * 这样就在任何使用RealSubject的地方都可以使用Proxy。
 * @author LIn
 *
 */
public interface Subject {
	public abstract void request();
}

/**
 * RealSubject类，真实实体，定义Proxy所代表的真实实体。
 * @author LIn
 *
 */
class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("真实的请求");
		
	}
	
}

/**
 * Proxy类，保存一个引用使得代理可以访问实体，
 * 并实现一个与Subject的接口，这样代理就可以用来替代实体。
 * @author LIn
 *
 */
class SProxy implements Subject{

	RealSubject realSubject;
	
	//委托代理
	public SProxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	
	@Override
	public void request() {
		realSubject.request();
	}
	
}
