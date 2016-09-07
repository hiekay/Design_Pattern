package Factory;

public class Abstract_Factory {
	public static void main(String[] args){
		CreatorB c;
        Video v,d;
        c = new TCLCreator();
        v = c.getVCD();  
        d = c.getDVD(); 
        v.play(); //输出"TCL的VCD在播放"
        d.play(); //输出"TCL的DVD在播放"
        c = new LGCreator();
        v = c.getVCD();  
        d = c.getDVD(); 
        v.play(); //输出"LG的VCD在播放"
        d.play(); //输出"LG的DVD在播放"
        
//        Video v, d;
//        /*Creator的表达比TCLCreator或LGCreator更抽象*/
//        v = c.getVCD();    
//        d = c.getDVD(); 
//        v.play(); // 输出"VCD在播放"
//        d.play(); // 输出"DVD在播放"
//        
//        /*下面的代码写在别的地方...*/
//        Creator c=new TCLCreator()；


	}
}

class LGDVD extends DVD{
	public void play(){
		System.out.println("正在播放LG的DVD");
	}
}

class TCLDVD extends DVD{
	public void play(){
		System.out.println("正在播放TCL的DVD");
	}
}

class LGVCD extends VCD{
	public void play(){
		System.out.println("正在播放LG的VCD");
	}
}

class TCLVCD extends VCD{
	public void play(){
		System.out.println("正在播放TCL的VCD");
	}
}

//创建者
abstract class CreatorB{
	public abstract Video getDVD();
	public abstract Video getVCD();
}

class LGCreator extends CreatorB{
	@Override
	public Video getDVD(){
		return new LGDVD();
	}
	@Override
	public Video getVCD(){
		return new LGVCD();
	}
}

class TCLCreator extends CreatorB{
	@Override
	public Video getDVD(){
		return new TCLDVD();
	}
	@Override
	public Video getVCD(){
		return new TCLVCD();
	}
}

