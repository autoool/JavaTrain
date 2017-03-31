package design_pattern.factory.carfactory;

/**
 * Created by zchao on 2017/3/31.
 */
public class Q7Factory extends CarFactory {

    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }
}
