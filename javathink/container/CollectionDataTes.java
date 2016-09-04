package container;

import java.util.LinkedHashSet;
import java.util.Set;

import net.mindview.util.CollectionData;
import net.mindview.util.Generator;
import net.mindview.util.Print;

class Government implements Generator<String>{
	String[] foundation = ("this is a beautiful girl who am i").split(" ");
	private int index;
	public String  next() {
		return foundation[index++];
	}
}
public class CollectionDataTes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<String>(new CollectionData<>(new Government(), 8));	
		Print.print(set);
//		set.addAll(CollectionData.list(new Government(), 8));
//		Print.print(set);
	}

}
