package design_pattern.factory.abst;

/**
 * Created by zchao on 2017/3/31.
 */
public class Factory1 extends AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
