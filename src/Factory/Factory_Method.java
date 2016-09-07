package Factory;

public class Factory_Method {
	
	public static void main(String[] args){
		Video v;                  
		CreatorA c;
		c = new DVDCreator();
		v = c.getVideo();
		v.play();         //play DVD
		c = new VCDCreator();
		v = c.getVideo(); //play VCD
		v.play();
		
		//������������
		c=new MP4Creator();
		v=c.getVideo(); //play MP4
		v.play();
		
//		ģʽ��
//		//���ô���
//		Video v;      
//		/*getVideo()���صĿ�����DVDҲ������VCD,���ҿ���ʹ���ڿ�ܵĴ�����*/           
//		v = c.getVideo();  
//		v.play();   
//
//		/*����Ĵ���д������ĵط���*/
//		Creator c = new DVDCreator()��//����VCDCreator

	}
		
}

abstract class CreatorA{
	public abstract Video getVideo();
}

class DVDCreator extends CreatorA{
	@Override
	public Video getVideo(){
		return new DVD();
	}
}

class VCDCreator extends CreatorA{
	@Override
	public Video getVideo(){
		return new VCD();
	}
}

//������Ҫ��չʱ�����ӵĴ�����
class MP4Creator extends CreatorA{
	@Override
	public Video getVideo(){
		return new MP4();
	}
}
class MP4 extends Video{
	public void play(){
		System.out.println("���ڲ���MP4");
	}
}


