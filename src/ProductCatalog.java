import java.util.ArrayList;

public class ProductCatalog {
    ArrayList<Product> listProduct = new ArrayList<>();

    public ArrayList<Product> getAllProducts() {
        return listProduct;

    }

    public void createProduct(Product product) {
        try{
            for (int i=0; i<listProduct.size();i++) {
                if (listProduct.get(i).name == product.name) {
                    throw new ProductAlreadyExists();
                }
            }

        }
        catch (ProductAlreadyExists e) {
            listProduct.add(product);
        }
    }
    public void updateProduct(Product product) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).id == product.id) {
            }
        }
    }

    public void deleteProduct(int id) {

    }
}
