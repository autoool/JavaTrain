package chapter16;

import java.lang.reflect.Method;

public class ReflectExample02 {
	
	public static void main(String[] args) {
		Example02 example02 = new Example02();
		Method[] declareMethods = example02.getClass().getDeclaredMethods();
		for (int i = 0; i < declareMethods.length; i++) {
			Method method = declareMethods[i];
			System.out.println("名称为"+method.getName());
			System.out.println("是否允许带有可变数量的参数："+method.isVarArgs());
			System.out.println("入口参数类型一次为：");
			Class[] parameterTypes = method.getParameterTypes();
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.println(" "+ parameterTypes[j]);
			}
			//获取方法的返回值
			System.out.println("返回值类型为："+method.getReturnType());
			System.out.println("可能抛出的异常类型有：");
			Class[] exceptionTypes = method.getExceptionTypes();
			for (int j = 0; j < exceptionTypes.length; j++) {
				System.out.println(" "+exceptionTypes[j]);
			}
			boolean isTurn = true;
			while (isTurn) {
				try {
					isTurn = false;
					if ("staticMethod".equals(method.getName())) {						
						method.invoke(example02);
					}else if ("publicMethod".equals(method.getName())) {
						System.out.println("返回值："
					+ method.invoke(example02, 168));
					}else if("protectedMethod".equals(method.getName())){
						System.out.println(method.invoke(example02, "7",5));
					}else if("privateMethod".equals(method.getName())){
						Object[] parameters = new Object[]{new String[]{
								"m","w","q"
						}};
						System.out.println(method.invoke(example02, parameters));
					}
				} catch (Exception e) {
					System.out.println("setAccessible");
					method.setAccessible(true);
					isTurn = true;
				}
			}
			System.out.println();
		}
	}
}
