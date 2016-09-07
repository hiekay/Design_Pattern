package Singleton;
/**
 * 
 * @author LIn
 * 延迟实例化(懒汉式)同步的单例模式
 */
public class Singleton_Lazy {
	private static Singleton_Lazy instance = null;
	
	private Singleton_Lazy(){}  //把构造器声明为私有
	
	public static synchronized Singleton_Lazy getInstance(){
		if(instance == null){
			instance = new Singleton_Lazy();
		}
		return instance;
	}

}
