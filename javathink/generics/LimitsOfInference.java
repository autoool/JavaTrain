package generics;

import java.util.*;

import net.mindview.util.New;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;

public class LimitsOfInference {

	// static void f(Map<Person,List<? extends Pet>> petPeople){
	// }

	static void f(Map<Person, List<Pet>> petPeople) {
	}

	public static void main(String[] args) {
		// / f(New.<Person,List<Pet>>map());
		f(New.<Person, List<Pet>> map());

	}

}
