import java.util.ArrayList;

public class ProductCatalog {
    ArrayList<Product> listProduct = new ArrayList<>();

    public ArrayList<Product> getAllProducts() {
        return listProduct;
    }

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public void createProduct(Product product) throws ProductAlreadyExists {

            for (Product i: listProduct) {
                if (i.name.equals(product.name)) {
                    throw new ProductAlreadyExists("Продукт уже существует!");
                }
            }
            listProduct.add(product);

        }


    public void updateProduct(Product product) throws ProductNotFound{
        try {
            for (Product i: listProduct) {
                if (i.getName() == null) {
                    throw new ProductNotValid();
                }
                if (i.id == product.id) {
                    listProduct.add(product);
                } else {
                    throw new ProductNotFound();
                }
            }
        } catch (ProductNotValid e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteProduct(int id) throws ProductNotFound {
        
            for (int i = 0; i < listProduct.size(); i++) {
                if (listProduct.get(i).id == id) {
                    listProduct.remove(listProduct.get(i));
                }
                else {
                    throw new ProductNotFound();
                }
            }
        }
}
