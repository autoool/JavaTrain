package design_pattern.factory.abst;

/**
 * Created by zchao on 2017/3/31.
 */
public class Factory2 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
