package Factory;
/**
 * 简单工厂
 * @author LIn
 *
 */
public class Simple_Factory {
	public static void main(String[] args) {
		Creator c = new Creator();
		Video v;
		v=c.getVCD();
		v. play();
		v=c.getDVD();
		v. play();
	}
}

class Creator{
	VCD vcd;
	DVD dvd;
	
	public Video getVCD(){
		/*代码*/
		return vcd;
	}
	
	public Video getDVD(){
		/*代码*/
		return dvd;
	}
}

