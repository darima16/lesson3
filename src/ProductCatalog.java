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


    public void updateProduct(Product product) throws ProductNotFound, ProductNotValid{
        if (product.getName().equals("")) {
            throw new ProductNotValid("Нет наименования продукта!");
        }
        boolean bool = false;
        for (Product i: listProduct) {
            if (i.id == product.id) {
                bool = true;
                listProduct.remove(i);
                listProduct.add(product);
            }
        }
        if (!bool) {
            throw new ProductNotFound("Продукт не найден");
        }
    }

    public void deleteProduct(int id) throws ProductNotFound {
            boolean bool = false;
            for (Product i: listProduct) {
                if (i.id == id ) {
                    bool = true;
                    listProduct.remove(i);
                }
            }
            if (!bool) {
                throw new ProductNotFound("Продукт не существует");
            }
        }
    public void printInfo() {
        for (Product x : listProduct) {
                x.printInfo();
            }
        }


}
