package design_pattern.factory;

/**
 * Created by zchao on 2017/3/31.
 * 简单或静态工厂模式
 */
public class FactoryStatic {

    public static Product createProduct() {
        return new ProductA();
    }
}
