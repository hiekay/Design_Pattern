package Singleton;
/**
 * @author LIn
 * 描述：单例巧克力锅炉
 * (问题：在多线程的情况下会导致锅炉加热时也能继续加入原料，因为代码中并没有
 *  同步,可能有两个线程同时进入到实例化(getInstance)的方法中)
 */
public class ChocolateBoiler_S {   //单例巧克力锅炉
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler_S instance = null;
	//将构造方法改为私有
	private ChocolateBoiler_S(){
		empty = true;
		boiled = false;
	}
	//返回单例锅炉
	public static synchronized ChocolateBoiler_S getInstance(){
		if(instance == null){
			instance = new ChocolateBoiler_S();
		}
		return instance;
	}
	
	public void fill(){  
		if(isEmpty()){
			empty = false;
			boiled = false;
			/*在锅炉内填满巧克力和牛奶的混合物*/
		}
	}

	public void drain(){
		if(!isEmpty() && isBoiled()){
			/*排出煮沸的巧克力和牛奶*/
			empty = true;
		}
	}
	
	public void boil(){
		if(!isEmpty() && !isBoiled()){
			/*加热巧克力和牛奶*/
			boiled = true;
		}
	}
	
	public boolean isEmpty(){
		return empty;
	}
	
	public boolean isBoiled(){
		return boiled;
	}
	

}
