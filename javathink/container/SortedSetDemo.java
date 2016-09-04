package container;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import net.mindview.util.Print;

public class SortedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> sortedSet = new TreeSet<String>();
		Collections.addAll(sortedSet, "one two three four five six seven eoght".split(" "));
		String low = sortedSet.first();
		String height = sortedSet.last();
		Iterator<String> it = sortedSet.iterator();
		for(int i=0;i<=6;i++){
			if (i==3) {
				low = it.next();
			}else if(i==6){
				height = it.next();
			}else{
				it.next();
			}
		}
		Print.print(sortedSet);
		Print.print(low);
		Print.print(height);
	}
	

}
