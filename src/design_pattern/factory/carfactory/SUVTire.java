package design_pattern.factory.carfactory;

/**
 * Created by zchao on 2017/3/31.
 */
public class SUVTire implements ITire {

    @Override
    public void tire() {
        System.out.println("SUVTire");
    }
}
