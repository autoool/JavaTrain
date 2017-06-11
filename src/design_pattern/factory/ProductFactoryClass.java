package design_pattern.factory;

/**
 * Created by zchao on 2017/3/31.
 */
public class ProductFactoryClass extends FactoryClass {

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
