package chapter16;

import java.lang.reflect.Constructor;

import org.junit.experimental.theories.Theories;

public class ReflectTest {

	public static void main(String[] args) {
		Example01 example01 = new Example01("123", 3);

		Constructor[] declaredContructors = example01.getClass().getDeclaredConstructors();
		for (int i = 0; i < declaredContructors.length; i++) {
			Constructor constructor = declaredContructors[i];
			System.out.println("查看是否允许带有可变数量的参数：" + constructor.isVarArgs());
			System.out.println("该构造方法的入口参数类型依次是：");
			Class[] parameterTypes = constructor.getParameterTypes();
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.println("" + parameterTypes[j]);
			}
			System.out.println("该构造函数可能抛出的异常类型：");
			Class[] exceptionTypes = constructor.getExceptionTypes();
			for (int j = 0; j < exceptionTypes.length; j++) {
				System.out.println(" " + exceptionTypes[j]);
			}
			
			Example01 example012 = null;
			while (example012 == null) {
				try {
					if (i==2) {
						example012 = (Example01)constructor.newInstance();					
					}else if (i==1) {
						example012 = (Example01)constructor.newInstance("34",7);
					}else {
						Object[] parameters = new Object[]{
								new String[] {"100","200","300"}
						};
						example012 = (Example01)constructor.newInstance(parameters);
					}
				} catch (Exception e) {
					System.out.println("创建对象时抛出异常，下面执行setAccessible()方法");
					constructor.setAccessible(true);
				}
			}
			example012.print();
			System.out.println();
		}

		
	}
}
