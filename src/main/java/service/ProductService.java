package service;

import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{

   public static List<Product> products = new ArrayList<>();
    private static Product id;

    static {
        products.add(new Product(001, "ga chay", 200.000,"https://chaythuanviet.com/wp-content/uploads/2021/06/z2491167490247_a3e20f6368de1456402a6618730735b5-600x800.jpg", 1));
        products.add(new Product(002, "ca thu", 200.000,"https://chaythuanviet.com/wp-content/uploads/2021/06/z2491167480957_eb887bf85af20f84723408957c3de35a-600x775.jpg", 1));
        products.add(new Product(003, "ham ga", 200.000,"https://chaythuanviet.com/wp-content/uploads/2021/06/z2523013874544_53de36f4a8cefe35e6cbfbc17b3fcfb6-600x800.jpg", 1));
        products.add(new Product(004, "ba roi", 200.000,"https://chaythuanviet.com/wp-content/uploads/2021/06/z2491167465317_1698800a7f11488922e0b60f6a07b9d0-533x400.jpg", 1));
        products.add(new Product(005, "suc sich", 200.000,"https://chaythuanviet.com/wp-content/uploads/2021/06/z2491167438646_26a5be26f9f5cfa2273600729c4c430c-247x296.jpg", 1));
        products.add(new Product(006, "doi", 200.000,"https://chaythuanviet.com/wp-content/uploads/2021/06/doi-chay-1-247x296.jpg", 1));
        products.add(new Product(007, "thit nuong", 200.000,"https://chaythuanviet.com/wp-content/uploads/2021/06/thit-nuong-chay-247x296.jpg", 1));
        products.add(new Product(010, "moc", 200.000,"https://chaythuanviet.com/wp-content/uploads/2021/07/d9eea8eee30e7ec10ebea44c093eb936-e1626868742120-1-247x296.jpg", 1));
        products.add(new Product(011, "thit xien", 200.000,"https://chaythuanviet.com/wp-content/uploads/2021/07/z2523014160411_c03e951da2fbf27a34dfb1e012ac693b-247x296.jpg", 1));

    }



    public static void edit (Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(product.getId()) == id) {
                products.set(i, product);
            }
        }
    }

    public static void add (Product product) {
        products.add(product);
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public void save(Product product) {
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }

}
