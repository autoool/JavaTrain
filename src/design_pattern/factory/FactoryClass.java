package design_pattern.factory;

/**
 * Created by zchao on 2017/3/31.
 */
public abstract class FactoryClass {

    public abstract <T extends Product> T createProduct(Class<T> clz);
}
