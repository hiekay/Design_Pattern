package Proxy;

public class Test {

	public static void main(String[] args) {
		Proxy p = new Proxy(new RealSubject());
		p.request();

	}

}
