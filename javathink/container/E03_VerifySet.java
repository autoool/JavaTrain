package container;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static net.mindview.util.Print.*;
import static net.mindview.util.Countries.*;

public class E03_VerifySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<String>();
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new TreeSet<String>();
				for (int i = 0; i < 5	; i++) {
					set.addAll(names(5));
					set1.addAll(names(5));
					set2.addAll(names(5));
				}
				print(set);
				print(set1);
				print(set2);
				
	}

}
