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
		
		//调用新增代码
		c=new MP4Creator();
		v=c.getVideo(); //play MP4
		v.play();
		
//		模式化
//		//调用代码
//		Video v;      
//		/*getVideo()返回的可以是DVD也可以是VCD,而且可以使用在框架的代码中*/           
//		v = c.getVideo();  
//		v.play();   
//
//		/*下面的代码写在另外的地方…*/
//		Creator c = new DVDCreator()；//或则VCDCreator

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

//功能需要拓展时，增加的代码插件
class MP4Creator extends CreatorA{
	@Override
	public Video getVideo(){
		return new MP4();
	}
}
class MP4 extends Video{
	public void play(){
		System.out.println("正在播放MP4");
	}
}


