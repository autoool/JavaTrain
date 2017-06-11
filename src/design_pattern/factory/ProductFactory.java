package design_pattern.factory;

/**
 * Created by zchao on 2017/3/31.
 */
public class ProductFactory extends Factory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
