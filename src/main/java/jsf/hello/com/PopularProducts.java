package jsf.hello.com;

import javax.annotation.PostConstruct;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class PopularProducts {

    @Inject
    private IProductService productService;

    private List<Product> products;

    @PostConstruct
    public void initialize() {
        products = productService.getPopularProducts();
    }

    public List<Product> getProducts() {
        return products;
    }

}
