package Singleton;
/**
 * 
 * @author LIn
 * 描述：原始巧克力锅炉
 * 为了避免面锅炉满了继续放原料或锅炉空烧的情况,代码写得相当小心
 * (但是，如果同时有多于一个的ChocolateBoiler实例存在，
 *  一台巧克力锅炉可能"同时"在加热和放原料)
 *  
 */
public class ChocolateBoiler {   //巧克力锅炉
	private boolean empty;       //是否为空
	private boolean boiled;      //原料是否已煮沸
	
	public ChocolateBoiler(){
		empty = true;
		boiled = false;
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
