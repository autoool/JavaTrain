package design_pattern.factory.carfactory;

/**
 * Created by zchao on 2017/3/31.
 */
public class Q5Factory extends CarFactory {

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }

    @Override
    public ITire createTire() {
        return new NormalTire();
    }
}
