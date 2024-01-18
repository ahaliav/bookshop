package jsf.hello.com;

import java.util.List;

public interface IProductService {

    List<Product> getPopularProducts();

    Product getProduct(long id);
}