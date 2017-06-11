package design_pattern.factory.carfactory;

/**
 * Created by zchao on 2017/3/31.
 */
public class NormalTire implements ITire {

    @Override
    public void tire() {
        System.out.println("NormalTire");
    }
}
