package design_pattern.factory.abst;

import design_pattern.factory.Product;
import design_pattern.factory.ProductA;
import design_pattern.factory.ProductB;

/**
 * Created by zchao on 2017/3/31.
 */
public abstract class AbstractFactory {

    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
