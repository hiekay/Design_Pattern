package Factory;
/**
 * �򵥹���
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
		/*����*/
		return vcd;
	}
	
	public Video getDVD(){
		/*����*/
		return dvd;
	}
}

