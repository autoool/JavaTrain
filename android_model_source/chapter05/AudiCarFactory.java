package chapter05;

public class AudiCarFactory extends AudiFactory{
	
	@Override
	public <T extends AudiCar> T createAudiCar(java.lang.Class<T> clz) {
		AudiCar audiCar = null;
		try {
			audiCar = (AudiCar)Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T)audiCar;
	};
}
