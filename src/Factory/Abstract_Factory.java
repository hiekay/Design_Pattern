package Factory;

public class Abstract_Factory {
	public static void main(String[] args){
		CreatorB c;
        Video v,d;
        c = new TCLCreator();
        v = c.getVCD();  
        d = c.getDVD(); 
        v.play(); //���"TCL��VCD�ڲ���"
        d.play(); //���"TCL��DVD�ڲ���"
        c = new LGCreator();
        v = c.getVCD();  
        d = c.getDVD(); 
        v.play(); //���"LG��VCD�ڲ���"
        d.play(); //���"LG��DVD�ڲ���"
        
//        Video v, d;
//        /*Creator�ı���TCLCreator��LGCreator������*/
//        v = c.getVCD();    
//        d = c.getDVD(); 
//        v.play(); // ���"VCD�ڲ���"
//        d.play(); // ���"DVD�ڲ���"
//        
//        /*����Ĵ���д�ڱ�ĵط�...*/
//        Creator c=new TCLCreator()��


	}
}

class LGDVD extends DVD{
	public void play(){
		System.out.println("���ڲ���LG��DVD");
	}
}

class TCLDVD extends DVD{
	public void play(){
		System.out.println("���ڲ���TCL��DVD");
	}
}

class LGVCD extends VCD{
	public void play(){
		System.out.println("���ڲ���LG��VCD");
	}
}

class TCLVCD extends VCD{
	public void play(){
		System.out.println("���ڲ���TCL��VCD");
	}
}

//������
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

