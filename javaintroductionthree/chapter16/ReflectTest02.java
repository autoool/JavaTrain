package chapter16;

import java.lang.reflect.Field;

public class ReflectTest02 {

	public static void main(String[] args) {
		Example01 example01 = new Example01();
		Class exClass = example01.getClass();
		Field[] declareFields = exClass.getDeclaredFields();
		for (int i = 0; i < declareFields.length; i++) {
			Field field = declareFields[i];
			System.out.println("名称为： "+field.getName());
			Class fieldType = field.getType();
			System.out.println("类型为："+fieldType);
			boolean isTurn = true;
			while (isTurn) {
				try {
					isTurn = false;
					System.out.println("修改前的值："+field.get(example01));
					//判断成员变量的类型是否为int
					if (fieldType.equals(int.class)) {
						System.out.println("利用方法setInt修改成员变量的值");
						field.setInt(example01, 168);
					}else if (fieldType.equals(float.class)) {
						System.out.println("利用方法setFloat修改成员变量的值");
						field.setFloat(example01, 99.9F);
					}else if (fieldType.equals(boolean.class)) {
						System.out.println("setBoolean");
						field.setBoolean(example01, true);
					}else {
						System.out.println("set()");
						field.set(example01, "MWQ");
					}
					System.out.println("修改后的值： "+ field.get(example01));						
				} catch (Exception e) {
					System.out.println("在设置成员变量值时抛出异常");
					field.setAccessible(true);
					isTurn = true;
				}
			}
			System.out.println();
		}
	}

}
