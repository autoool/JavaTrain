package chapter06;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SeriealSingleton implements Serializable{

	private static final long serialVersionUID = -4994911035515393248L;

	private static class SingletonObject{
		private static final SeriealSingleton Instance = new SeriealSingleton();
	}
	private SeriealSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static SeriealSingleton getInstance(){
		return SingletonObject.Instance;
	}
	
	//如果这段代码注释掉，则还是多例 ，书中代码是用protected 修饰这个代码，还是多例模式
	//网上搜到这边文章http://www.cnblogs.com/kakafra/archive/2012/10/26/2740436.html
	//改为private 就是单例了。
	private Object readResolve() throws ObjectStreamException{
		System.out.println("调用了readResolve方法");
		return SingletonObject.Instance;
	}
	
}
