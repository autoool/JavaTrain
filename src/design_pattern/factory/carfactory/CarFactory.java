package design_pattern.factory.carfactory;

/**
 * Created by zchao on 2017/3/31.
 */
public abstract class CarFactory {

    public abstract ITire createTire();

    public abstract IEngine createEngine();

    public abstract IBrake createBrake();
}
