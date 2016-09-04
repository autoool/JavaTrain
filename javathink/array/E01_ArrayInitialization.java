package array;

import net.mindview.util.Print;

public class E01_ArrayInitialization {

	static void hide(BerylliumSphere[] s) {
		Print.print("Hiding " + s.length + " sphere(s)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hide(new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() });
//		hide({new BerylliumSphere()});//普通聚合初始化必须在数组定义的时候 而动态初始化在任何地方使用
		BerylliumSphere[] d = new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()};
		hide(d);
		BerylliumSphere[] a = {new BerylliumSphere(),new BerylliumSphere()};
		hide(a);
	}

}
