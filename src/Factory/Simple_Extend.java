package Factory;
/**
 * ��ͨ�̳�
 * @author LIn
 *
 */
public class Simple_Extend {
	public static void main(String[] args) {
		Video v;
		v = new VCD();
		v.play();
		v = new DVD();
		v.play();
	}
}

abstract class Video{
	public abstract void play();
}

class VCD extends Video{
	public void play(){
		System.out.println("���ڲ���VCD");
	}
}

class DVD extends Video{
	public void play(){
		System.out.println("���ڲ���DVD");
	}
}