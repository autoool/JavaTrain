package chapter01;

public class FinalTest {
	
	public static void main(String[] args) {
		
		Person person01 = new Person();
		SerializationUtils.writeObject(person01);
		Person person = (Person)SerializationUtils.readObject();
		System.out.println("name="+person.getName());	
	}
	
}
