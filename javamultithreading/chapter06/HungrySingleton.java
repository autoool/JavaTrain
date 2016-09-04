package chapter06;

import java.io.Serializable;

public class HungrySingleton implements Serializable{
	/**
	 * 不能有其他实例变量
	 * getInstance()没有同步 非线程安全问题
	 */
	private static HungrySingleton Instance = new HungrySingleton();
	public static HungrySingleton getInstance() {
		return Instance;
	}

}
