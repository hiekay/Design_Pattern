package Singleton;
/**
 * 经典的单例模式的实现(未同步)
 * @author LIn
 *
 */
public class Singleton {
	private static Singleton instance = null;
	
	private Singleton(){}  //把构造器声明为私有
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}

