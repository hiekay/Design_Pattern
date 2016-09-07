package Singleton;
/**
 * 
 * @author LIn
 * 双重检查加锁同步的单例模式
 */
public class Singleton_DCL {
	private volatile static Singleton_DCL instance;  //volatile保证多个线程不缓存此变量
	
	private Singleton_DCL(){}  //把构造器声明为私有
	
	public static Singleton_DCL getInstance(){
		if(instance == null){
			synchronized(Singleton_DCL.class){
				if(instance == null){    //进入区块后，再检查一次。仍是null才创建实例
					instance = new Singleton_DCL();
				}
			}
		}
		return instance;
	}
}
