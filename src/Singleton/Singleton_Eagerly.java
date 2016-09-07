package Singleton;
/**
 * 
 * @author LIn
 * 急切实例化(饿汉式)同步的单例模式
 */
public class Singleton_Eagerly {
	/*在静态初始化器中创建单例，保证了线程安全*/
	private static Singleton_Eagerly instance = new Singleton_Eagerly(); 
	
	private Singleton_Eagerly(){}  //把构造器声明为私有
	
	public static synchronized Singleton_Eagerly getInstance(){
		return instance;
	}

}
