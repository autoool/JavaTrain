package container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static net.mindview.util.Print.*;
import static net.mindview.util.Countries.*;
public class E01_CountryList {

	private static Random rnd = new Random(47);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<String>(names(8));
		Collections.sort(l);
		print(l);
		for(int i=1;i<5;i++){
			Collections.shuffle(l,rnd);
			print("shuffle " + l);
		}
	}

}
