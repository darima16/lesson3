import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static  void main(String[] args) {
        Product pr1 = new Product(457856, "Утюг", "China", 1500);
        Product x = new Product(111, "Утюг", "China", 1700);
        Product b = new Product(47, "Удлинитель", "China", 1500);
        Product d = new Product(8, "Розетка", "China", 500);
        Product c = new Product(9, "Выпрямитель", "China", 2500);
        Product f = new Product(144, "", "China", 2700);
        Product q = new Product(10, "Выпрямитель", "China", 2500);
        ProductCatalog lst = new ProductCatalog();
        lst.addProduct(pr1);
        lst.addProduct(b);
        lst.addProduct(d);
        //lst.printInfo();
        try {
            lst.createProduct(q);
            lst.createProduct(d);
        } catch (ProductAlreadyExists productAlreadyExists) {
            productAlreadyExists.printStackTrace();
        }
        lst.printInfo();
        System.out.println("");

        try {
            lst.deleteProduct(10);
            lst.updateProduct(f);
        } catch (ProductNotValid productNotValid) {
            productNotValid.printStackTrace();
        }
        lst.printInfo();
    }
}
